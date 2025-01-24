package com.telefonia.telefonia_api.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlanDTO {

    private Long id;

    private String name;
    private Double price;
    private boolean isActive;

}
