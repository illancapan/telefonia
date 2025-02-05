package com.telefonia.telefonia_api.aplication.service;

import com.telefonia.telefonia_api.aplication.dto.PlanDTO;

import java.util.List;

public interface PlanService {

    PlanDTO createPlan(PlanDTO planDTO);

    PlanDTO getPlanById(Long id);

    List<PlanDTO> getAllPlans();

    PlanDTO updatePlan(Long id, PlanDTO planDTO);

    void deletePlan(Long id);

    void deactivatePlan(Long id);
}
