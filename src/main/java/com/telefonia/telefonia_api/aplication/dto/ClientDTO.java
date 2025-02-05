package com.telefonia.telefonia_api.aplication.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClientDTO {

    private Long id;
    private String name;
    private String run;
    private String address;
    private LocalDate birthDate;
    private boolean isActive;
}
