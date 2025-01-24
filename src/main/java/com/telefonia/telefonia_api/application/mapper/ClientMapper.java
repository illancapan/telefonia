package com.telefonia.telefonia_api.application.mapper;

import com.telefonia.telefonia_api.application.dto.ClientDTO;
import com.telefonia.telefonia_api.domain.model.Client;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    private final ModelMapper modelMapper;

    public ClientMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ClientDTO toDto(Client client){
        return modelMapper.map(client, ClientDTO.class);
    }

    public Client toEntity(ClientDTO clientDTO){
        return modelMapper.map(clientDTO, Client.class);
    }
}
