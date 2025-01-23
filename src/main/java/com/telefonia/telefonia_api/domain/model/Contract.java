package com.telefonia.telefonia_api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contract {

    private Long id;
    private Client clientContract;
    private Plan planContract;
    private LocalDate startDateContract;
    private LocalDate endDateContract;
    private boolean isActiveContract;
}
