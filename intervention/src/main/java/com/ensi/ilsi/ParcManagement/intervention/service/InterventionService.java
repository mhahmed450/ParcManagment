/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.intervention.service;

import com.ensi.ilsi.ParcManagement.commons.dto.InterventionDto;

import com.ensi.ilsi.ParcManagement.intervention.entity.Intervention;

import com.ensi.ilsi.ParcManagement.intervention.repository.InterventionRepository;


import java.util.List;

import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 *
 * @author Ahmed
 */
@Service

public class InterventionService {
    private final Logger log = LoggerFactory.getLogger(IntervenantService.class);
    
     public static InterventionDto mapToDto(Intervention intervention) {
        if (intervention != null) {
            return new InterventionDto(
                    intervention.getNumIntervention(),
                    intervention.getPanne(),
                    intervention.getDate(),
                    intervention.getIntervenant()          
            );
        }
        return null;
    }
        

        
    private final InterventionRepository interventionRepository;

    public InterventionService(InterventionRepository interventionRepository)
    {
     this.interventionRepository=interventionRepository;
    }

    
      public List<InterventionDto> findAll() {
          log.debug("Request to get all interventions");
          
        return this.interventionRepository.findAll()
                .stream()
                .map(InterventionService::mapToDto)
                .collect(Collectors.toList());   
     }
      
     
     public InterventionDto findById(Long id) {
         
        log.debug("Request to get Intervention : {}", id);
        return this.interventionRepository.findById(id).map(InterventionService::mapToDto).orElse(null);
        
        
        
    }

    public InterventionDto create(InterventionDto interventionDto){
    log.debug("Request to create intervention : {}", interventionDto);

        return mapToDto(this.interventionRepository.save(
                new Intervention(interventionDto.getPanne(),
                        interventionDto.getDate(),
                        interventionDto.getIntervenantID()
                )));
    }

    public void delete(Long id) {
        log.debug("Request to delete intervention : {}", id);
        this.interventionRepository.deleteById(id);
    }

       

}
