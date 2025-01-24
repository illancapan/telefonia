package com.telefonia.telefonia_api.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientDTO {

    private Long id;
    private String name;
    private String run;
    private String address;
    private LocalDate birthDate;
    private boolean isActive;

}
