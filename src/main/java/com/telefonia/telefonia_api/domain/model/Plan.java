package com.telefonia.telefonia_api.domain.model;

import java.util.List;

public class Plan {

    private Long id;
    private String namePlan;
    private Double pricePlan;
    private boolean isActivePlan;

    private List<Contract> contracts;

}
