package com.telefonia.telefonia_api.domain.model;

import java.time.LocalDate;

public class Contract {

    private Long id;
    private Client clientContract;
    private Plan planContract;
    private LocalDate startDateContract;
    private LocalDate endDateContract;
    private boolean isActiveContract;
}
