package com.telefonia.telefonia_api.aplication.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String message;
    private String errorCode;
    private HttpStatus status;
    private String stackTrace;

//    public ErrorResponse(String message, String errorCode, HttpStatus status, String stackTrace) {
//        this.message = message;
//        this.errorCode = errorCode;
//        this.status = status;
//        this.stackTrace = stackTrace;
//    }

//    // Getters y setters
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(String errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    public HttpStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(HttpStatus status) {
//        this.status = status;
//    }
//
//    public String getStackTrace() {
//        return stackTrace;
//    }
//
//    public void setStackTrace(String stackTrace) {
//        this.stackTrace = stackTrace;
//    }
}
