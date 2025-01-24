package com.telefonia.telefonia_api.application.mapper;

import com.telefonia.telefonia_api.application.dto.PlanDTO;
import com.telefonia.telefonia_api.domain.model.Plan;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PlanMapper {

    private final ModelMapper modelMapper;

    public PlanMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PlanDTO toDto(Plan plan){
        return modelMapper.map(plan, PlanDTO.class);
    }

    public Plan toEntity(PlanDTO planDTO){
        return modelMapper.map(planDTO, Plan.class);
    }
}
