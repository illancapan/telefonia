package com.telefonia.telefonia_api.application.service.contract;

import com.telefonia.telefonia_api.application.dto.ContractDTO;
import com.telefonia.telefonia_api.domain.model.Contract;

import java.time.LocalDate;
import java.util.List;

public interface ContractService {

    ContractDTO contractPlan(Long clientId, Long planId, LocalDate startDate, LocalDate endDate);
    List<ContractDTO> getContractsByClientId(Long clientId);
    void deactivateContract(Long contractId);
    void deleteContract(Long contractId);

    Contract createContract(Long id, Long id1);
}
