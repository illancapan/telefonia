package com.telefonia.telefonia_api.aplication.service;

import com.telefonia.telefonia_api.aplication.dto.ContractDTO;

import java.util.List;

public interface ContractService {

    ContractDTO createContract(ContractDTO contractDTO);

    ContractDTO getContractById(Long id);

    List<ContractDTO> getAllContracts();

    ContractDTO updateContract(Long id, ContractDTO contractDTO);

    void deleteContract(Long id);

    void deactivateContract(Long id);

}
