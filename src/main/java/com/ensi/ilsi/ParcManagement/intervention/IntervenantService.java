/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.intervention;


import com.ensi.ilsi.ParcManagement.intervention.Intervenant;

import com.ensi.ilsi.ParcManagement.intervention.IntervenantRepository;
import com.ensi.ilsi.ParcManagement.userEquipement.UserDto;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Samar
 */

@Service

public class IntervenantService {
    private final Logger log = LoggerFactory.getLogger(IntervenantService.class);
    
    public static IntervenantDto mapToDto(Intervenant intervenant) {
        if (intervenant != null) {
            return new IntervenantDto  (
                    intervenant.getId(),
                    intervenant.getName(),
                    intervenant.getEmail(),
                    intervenant.getPhone()
            );
        }
        return null;
    }
    
    
    private final IntervenantRepository intervenantRepository ;
  

    public IntervenantService(IntervenantRepository intervenantRepository) {
        this.intervenantRepository = intervenantRepository;
       
    }

     public List<IntervenantDto> findAll() {
          log.debug("Request to get all intervenants");
          
        return this.intervenantRepository.findAll()
                .stream()
                .map(IntervenantService::mapToDto)
                .collect(Collectors.toList());   
     }
      
     
     public IntervenantDto findById(Long id) {
         
        log.debug("Request to get Intervenant : {}", id);
        return this.intervenantRepository.findById(id).map(IntervenantService::mapToDto).orElse(null);
        
        
        
    }

    public IntervenantDto create(IntervenantDto intervenantDto){
    log.debug("Request to create intervenant : {}", intervenantDto);

        return mapToDto(this.intervenantRepository.save(
                new Intervenant(intervenantDto.getName(),
                        intervenantDto.getEmail(),
                        intervenantDto.getPhone()        
                )));
     
        
    }

    public void delete(Long id) {
        log.debug("Request to delete intervenant : {}", id);
        this.intervenantRepository.deleteById(id);
    }
    
    
    
}
