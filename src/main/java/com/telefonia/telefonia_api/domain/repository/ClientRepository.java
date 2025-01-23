package com.telefonia.telefonia_api.domain.repository;

import com.telefonia.telefonia_api.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {


}
