package com.telefonia.telefonia_api.domain.repository;

import com.telefonia.telefonia_api.domain.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract,Long> {
}
