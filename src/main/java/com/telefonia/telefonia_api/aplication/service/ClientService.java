package com.telefonia.telefonia_api.aplication.service;

import com.telefonia.telefonia_api.aplication.dto.ClientDTO;

import java.util.List;

public interface ClientService {

    ClientDTO createClient(ClientDTO clientDTO);

    ClientDTO getClientById(Long id);

    List<ClientDTO> getAllClients();

    ClientDTO updateClient(Long id, ClientDTO clientDTO);

    void deleteClient(Long id);

    void deactivateClient(Long id);
}
