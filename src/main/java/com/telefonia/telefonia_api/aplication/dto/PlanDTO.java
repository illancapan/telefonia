package com.telefonia.telefonia_api.aplication.dto;

import lombok.Data;

@Data
public class PlanDTO {

    private Long id;
    private String name;
    private Double price;
    private boolean isActive;

}
