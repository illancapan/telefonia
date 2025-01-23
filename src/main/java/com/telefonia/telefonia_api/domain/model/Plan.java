package com.telefonia.telefonia_api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plan {

    private Long id;
    private String namePlan;
    private Double pricePlan;
    private boolean isActivePlan;
    private List<Contract> contracts;

}
