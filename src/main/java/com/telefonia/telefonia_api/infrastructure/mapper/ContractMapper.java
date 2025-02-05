package com.telefonia.telefonia_api.infrastructure.mapper;

import com.telefonia.telefonia_api.aplication.dto.ContractDTO;
import com.telefonia.telefonia_api.domain.model.Contract;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ContractMapper {

    private final ModelMapper modelMapper;

    public ContractMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ContractDTO toDTO(Contract contract) {
        return modelMapper.map(contract, ContractDTO.class);
    }

    public Contract toEntity(ContractDTO contractDTO) {
        return modelMapper.map(contractDTO, Contract.class);
    }
}
