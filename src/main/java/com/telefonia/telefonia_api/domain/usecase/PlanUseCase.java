package com.telefonia.telefonia_api.domain.usecase;

import com.telefonia.telefonia_api.domain.repository.PlanRespository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlanUseCase {

    private final PlanRespository planRespository;

}
