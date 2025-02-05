package com.telefonia.telefonia_api.aplication.exception;

import org.hibernate.boot.MappingException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // Manejo de excepciones generales
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        logger.error("Ha ocurrido un error inesperado: {}", e.getMessage(), e);
        ErrorResponse errorResponse = new ErrorResponse(
                "Ha ocurrido un error inesperado.",
                "ERR_GENERIC",
                HttpStatus.INTERNAL_SERVER_ERROR,
                e.getStackTrace().toString()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Manejo de excepciones específicas de acceso a datos
    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<ErrorResponse> handleDataAccessException(DataAccessException e) {
        logger.error("Error de acceso a datos: {}", e.getMessage(), e);
        ErrorResponse errorResponse = new ErrorResponse(
                "Error de acceso a datos.",
                "ERR_DB",
                HttpStatus.BAD_REQUEST,
                e.getStackTrace().toString()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    // Manejo de excepciones de mapeo
    @ExceptionHandler(MappingException.class)
    public ResponseEntity<ErrorResponse> handleMappingException(MappingException e) {
        logger.error("Error al mapear la entidad: {}", e.getMessage(), e);
        ErrorResponse errorResponse = new ErrorResponse(
                "Error al mapear la entidad.",
                "ERR_MAPPING",
                HttpStatus.BAD_REQUEST,
                e.getStackTrace().toString()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    // Manejo de excepciones de validación (si usas @Valid o @Validated)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException e) {
        String errorMessage = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
                .collect(Collectors.joining(", "));
        logger.error("Error de validación: {}", errorMessage);
        ErrorResponse errorResponse = new ErrorResponse(
                "Error de validación de datos.",
                "ERR_VALIDATION",
                HttpStatus.BAD_REQUEST,
                errorMessage
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
