package com.telefonia.telefonia_api.application.dto;

import com.telefonia.telefonia_api.domain.model.Client;
import com.telefonia.telefonia_api.domain.model.Plan;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ContractDTO {

    private Long id;
    private Client client;
    private Plan plan;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isActive;

}
