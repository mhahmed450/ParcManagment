/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.service;


import com.ensi.ilsi.ParcManagement.entity.Office;
import com.ensi.ilsi.ParcManagement.entity.User;
import com.ensi.ilsi.ParcManagement.repository.EquipementRepository;
import com.ensi.ilsi.ParcManagement.repository.OfficeRepository;

import com.ensi.ilsi.ParcManagement.repository.UserRepository;
import com.ensi.ilsi.ParcManagement.web.dto.OfficeDto;
import com.ensi.ilsi.ParcManagement.web.dto.UserDto;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 *
 * @author nouha
 */

@Service

public class OfficeService {
    
    
        
      
    private final Logger log = LoggerFactory.getLogger(OfficeService.class);

    private final OfficeRepository officeRepository;
    private final EquipementRepository equipementRepository;

    public OfficeService(OfficeRepository officeRepository,EquipementRepository equipementRepository)
    {
     this.officeRepository=officeRepository;
     this.equipementRepository=equipementRepository;
    }

    
     public List<OfficeDto> findAll() {
          log.debug("Request to get all offices");
        return this.officeRepository.findAll()
                .stream()
                .map(OfficeService::mapToDto)
                .collect(Collectors.toList());
        
        
         
     }
     

  
    public OfficeDto findById(Long id) {
        log.debug("Request to get Office : {}", id);
        return this.officeRepository.findById(id).map(OfficeService::mapToDto).orElse(null);
        
        
        
    }
    
    public UserDto create(OfficeDto officeDto){
    log.debug("Request to create Office : {}", officeDto);

        return mapToDto(this.officeRepository.save(
                new Office(officeDto.getName(),Collections.emptyList()
                        
                )));
     
    }

    public void delete(Long id) {
        log.debug("Request to delete Office : {}", id);
        this.officeRepository.deleteById(id);
    }
    
    
    
      public static OfficeDto mapToDto(Office office) {
        if (office != null) {
            return new OfficeDto(office.getName(),office.getEquipements().stream().map(EquipementService::mapToDto).collect(Collectors.toSet()) ;
                      }
              
                    
           
        
        return null;
    }

}



