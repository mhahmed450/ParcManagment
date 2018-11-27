/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.userEquipement.service;

import com.ensi.ilsi.ParcManagement.intervention.service.IntervenantService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ensi.ilsi.ParcManagement.userEquipement.repository.EquipementRepository;
import com.ensi.ilsi.ParcManagement.intervention.service.InterventionService;
import com.ensi.ilsi.ParcManagement.intervention.service.InterventionService;
import com.ensi.ilsi.ParcManagement.userEquipement.web.dto.EquipementDto;
import com.ensi.ilsi.ParcManagement.userEquipement.repository.EquipementRepository;

import com.ensi.ilsi.ParcManagement.userEquipement.entity.Equipement;
import static com.ensi.ilsi.ParcManagement.userEquipement.service.EquipementService.mapToDto;
import java.util.Collections;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 * @author ahmed
 */
@Service

public class EquipementService {
    
    private final Logger log = LoggerFactory.getLogger(IntervenantService.class);

     public static EquipementDto mapToDto(Equipement equipement) {
        if (equipement != null) {
            return new EquipementDto(
                    equipement.getId(),
                    equipement.getName(),
                    equipement.getStatus(),
                    equipement.getInterventions().stream().map(InterventionService::mapToDto).collect(Collectors.toSet()) 
                      
                            );
        }
       
        return null;
    }

    
    private final EquipementRepository equipementRepository ;
  

    public EquipementService(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
       
    }

    
    public List<EquipementDto> findAll() {
          log.debug("Request to get all equipements");
          
        return this.equipementRepository.findAll()
                .stream()
                .map(EquipementService::mapToDto)
                .collect(Collectors.toList());   
     }
      
     
     public EquipementDto findById(Long id) {
         
        log.debug("Request to get equipement : {}", id);
        return this.equipementRepository.findById(id).map(EquipementService::mapToDto).orElse(null);
        
        
        
    }

    public EquipementDto create(EquipementDto equipementDto){
    log.debug("Request to create equiement : {}", equipementDto);

        return mapToDto(this.equipementRepository.save(
                new Equipement(equipementDto.getName(),
                        equipementDto.getStatus(),
                      
                         Collections.emptySet()
                )));
    }

    public void delete(Long id) {
        log.debug("Request to delete equipement : {}", id);
        this.equipementRepository.deleteById(id);
    }

   
     }

