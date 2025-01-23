package com.telefonia.telefonia_api.domain.repository;

import com.telefonia.telefonia_api.domain.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRespository extends JpaRepository<Plan, Long> {
}
