package com.telefonia.telefonia_api.aplication.service.impl;

import com.telefonia.telefonia_api.aplication.dto.ClientDTO;
import com.telefonia.telefonia_api.aplication.mapper.ClientMapper;
import com.telefonia.telefonia_api.aplication.service.ClientService;
import com.telefonia.telefonia_api.domain.model.Client;
import com.telefonia.telefonia_api.domain.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RequiredArgsConstructor
//@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

//    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper) {
//        this.clientRepository = clientRepository;
//        this.clientMapper = clientMapper;
//    }

    private static final Logger logger = LoggerFactory.getLogger(ClientServiceImpl.class);


    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        try {
            Client client = clientMapper.toEntity(clientDTO);
            client = clientRepository.save(client);
            logger.info("Cliente cread exitosamente con ID: {}",client.getId());
            return clientMapper.toDTO(client);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo crear el cliente");
        }
    }

    @Override
    public ClientDTO getClientById(Long id) {
        return null;
    }

    @Override
    public List<ClientDTO> getAllClients() {
        return List.of();
    }

    @Override
    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        return null;
    }

    @Override
    public void deleteClient(Long id) {

    }

    @Override
    public void deactivateClient(Long id) {

    }
}
