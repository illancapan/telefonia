package com.telefonia.telefonia_api.infrastructure.controllers;


import com.telefonia.telefonia_api.aplication.dto.ClientDTO;
import com.telefonia.telefonia_api.aplication.service.ClientService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    public ResponseEntity<ClientDTO> addClient(@RequestBody ClientDTO clientDTO){
        ClientDTO createdClient = clientService.createClient(clientDTO);
        return ResponseEntity.status(201).body(createdClient);
    }
}
