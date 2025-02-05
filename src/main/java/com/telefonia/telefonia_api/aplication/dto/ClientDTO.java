package com.telefonia.telefonia_api.aplication.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDTO {

    private Long id;
    private String name;
    private String run;
    private String address;
    private LocalDate birthDate;
    private boolean isActive;
}
