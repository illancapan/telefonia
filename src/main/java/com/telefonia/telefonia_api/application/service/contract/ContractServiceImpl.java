package com.telefonia.telefonia_api.application.service.contract;

import com.telefonia.telefonia_api.application.dto.ContractDTO;
import com.telefonia.telefonia_api.domain.model.Contract;
import com.telefonia.telefonia_api.domain.repository.ClientRepository;
import com.telefonia.telefonia_api.domain.repository.ContractRepository;
import com.telefonia.telefonia_api.domain.repository.PlanRespository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Service
public class ContractServiceImpl implements ContractService {

    private final ClientRepository clientRepository;
    private final PlanRespository planRespository;
    private final ContractRepository contractRepository;

    @Override
    public ContractDTO contractPlan(Long clientId, Long planId, LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public List<ContractDTO> getContractsByClientId(Long clientId) {
        return List.of();
    }

    @Override
    public void deactivateContract(Long contractId) {

    }

    @Override
    public void deleteContract(Long contractId) {

    }

    @Override
    public Contract createContract(Long id, Long id1) {
        return null;
    }
}
