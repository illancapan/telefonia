package com.telefonia.telefonia_api.aplication.mapper;

import com.telefonia.telefonia_api.aplication.dto.PlanDTO;
import com.telefonia.telefonia_api.domain.model.Plan;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PlanMapper {

    private final ModelMapper modelMapper;

    public PlanMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PlanDTO toDTO(Plan plan) {
        return modelMapper.map(plan, PlanDTO.class);
    }

    public Plan toEntity(PlanDTO planDTO) {
        return modelMapper.map(planDTO, Plan.class);
    }
}
