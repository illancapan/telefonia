package com.telefonia.telefonia_api.domain.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    private Long id;

    private String nameClient;
    private String runClient;
    private String addressClient;
    private LocalDate birthDateClient;
    private boolean isActiveClient;


}
