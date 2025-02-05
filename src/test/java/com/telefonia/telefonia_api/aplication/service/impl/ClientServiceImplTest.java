package com.telefonia.telefonia_api.aplication.service.impl;

import com.telefonia.telefonia_api.aplication.dto.ClientDTO;
import com.telefonia.telefonia_api.aplication.mapper.ClientMapper;
import com.telefonia.telefonia_api.domain.model.Client;
import com.telefonia.telefonia_api.domain.repository.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClientServiceImplTest {

    ClientRepository clientRepository;
    ClientMapper clientMapper;
    ClientServiceImpl clientService;
    ClientDTO clientDTO;
    Client client;

    @BeforeEach
    void setUp() {

        // Crear los mocks manualmente
        clientRepository = mock(ClientRepository.class);
        clientMapper = mock(ClientMapper.class);

        // Crear el servicio e inyectar los mocks manualmente
        clientService = new ClientServiceImpl(clientRepository, clientMapper);

        // Inicializo el DTO de prueba
        clientDTO = ClientDTO.builder()
                .id(1L)
                .name("Juanito Doe")
                .run("12345678-9")
                .birthDate(LocalDate.of(1990, 1, 1))
                .isActive(true)
                .build();

        // Inicializo la entidad Client de prueba
        client = new Client();
        client.setId(1L);
        client.setName("Juanito Doe");
        client.setRun("12345678-9");
        client.setBirthDate(LocalDate.of(1990, 1, 1));
        client.setActive(true);
    }

    @Test
    void should_create_client_successfully() {

        // Configurar comportamiento de los mocks
        Mockito.when(clientMapper.toEntity(clientDTO)).thenReturn(client);
        Mockito.when(clientRepository.save(client)).thenReturn(client);
        Mockito.when(clientMapper.toDTO(client)).thenReturn(clientDTO);

        // Llamar al método del servicio
        ClientDTO result = clientService.createClient(clientDTO);

        // Verificar las interacciones esperadas
        verify(clientMapper).toEntity(clientDTO); // Verificar que se llamó a toEntity con clientDTO
        verify(clientRepository).save(client); // Verificar que se llamó a save con client
        verify(clientMapper).toDTO(client); // Verificar que se llamó a toDTO con client

        // Verificar que el resultado es el esperado
        assertEquals(clientDTO, result);
    }
}
