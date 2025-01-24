package com.telefonia.telefonia_api.domain.usecase;

import com.telefonia.telefonia_api.domain.repository.ContractRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContractUseCase {

    private final ContractRepository contractRepository;
}
