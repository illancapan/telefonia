package com.telefonia.telefonia_api.aplication.dto;

import com.telefonia.telefonia_api.domain.model.Client;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ContractDTO {
    private Long id;
    private Long clientId;
    private Long planId;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isActive;
}
