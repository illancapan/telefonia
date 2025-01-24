package com.telefonia.telefonia_api.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_client", nullable = false, length = 100)
    private String name;

    @Column(name = "run_client", nullable = false, unique = true, length = 50)
    private String run;

    @Column(name = "address_client", length = 255)
    private String address;

    @Column(name = "birth_date_client", nullable = false)
    private LocalDate birthDate;

    @Column(name = "is_active_client", nullable = false)
    private boolean isActive;
}
