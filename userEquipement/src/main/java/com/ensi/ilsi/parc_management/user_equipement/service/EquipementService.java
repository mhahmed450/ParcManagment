
package com.ensi.ilsi.parc_management.user_equipement.service;


import org.springframework.stereotype.Service;


import com.ensi.ilsi.parc_management.commons.dto.EquipementDto;
import com.ensi.ilsi.parc_management.commons.dto.InterventionDto;
import com.ensi.ilsi.parc_management.commons.dto.OfficeDto;
import com.ensi.ilsi.parc_management.user_equipement.repository.EquipementRepository;
import com.ensi.ilsi.parc_management.user_equipement.entity.Equipement;
import static com.ensi.ilsi.parc_management.user_equipement.service.EquipementService.mapToDto;

import java.util.HashSet;

import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



/**
 *
 * @author samar
 */

@Service
@Transactional

public class EquipementService {
    
    private final Logger log = LoggerFactory.getLogger(EquipementService.class);


    
    
     public static EquipementDto mapToDto(Equipement equipement) {
        if (equipement != null) {
            return new EquipementDto(
                    equipement.getId(),
                    equipement.getName(),
                    equipement.getStatus(),
                    equipement.getInterventionsId(),
                    equipement.getOfficeId()) ; 
                      
                            
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
    
    
        RestTemplate r=new RestTemplate();
ResponseEntity <OfficeDto> officeResponseEntity
                = r.getForEntity(
                        "http://localhost:9991/API/offices/{id}",
                        OfficeDto.class,
                        equipementDto.getOfficeId()
                        
                );
    
    RestTemplate r1=new RestTemplate();
    
    Set<Long> list = new HashSet<>();
    equipementDto.getInterventionsId().forEach((Long item) -> {
        ResponseEntity <InterventionDto> interventionResponseEntity;
        
        interventionResponseEntity = r1.getForEntity(
                "http://localhost:9990/API/interventions/{id}",
                InterventionDto.class,
                item
                
        );
        
        list.add(interventionResponseEntity.getBody().getNumIntervention());
        });


    
        return mapToDto(this.equipementRepository.save(
                new Equipement(equipementDto.getName(),
                        equipementDto.getStatus(),
                        //Collections.emptySet(),
                        list,
                        officeResponseEntity.getBody().getOfficeNumber()
                )));
    }

    public void delete(Long id) {
        log.debug("Request to delete equipement : {}", id);
        this.equipementRepository.deleteById(id);
    }

    
    

   
     }

