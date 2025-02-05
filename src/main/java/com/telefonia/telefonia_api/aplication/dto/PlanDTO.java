package com.telefonia.telefonia_api.aplication.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanDTO {

    private Long id;
    private String name;
    private Double price;
    private boolean isActive;

}
