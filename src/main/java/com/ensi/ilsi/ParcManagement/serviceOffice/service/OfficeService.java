/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.serviceOffice.service;


import com.ensi.ilsi.ParcManagement.serviceOffice.web.dto.OfficeDto;
import com.ensi.ilsi.ParcManagement.userEquipement.service.EquipementService;
import com.ensi.ilsi.ParcManagement.serviceOffice.entity.Office;

import com.ensi.ilsi.ParcManagement.serviceOffice.repository.OfficeRepository;

import com.ensi.ilsi.ParcManagement.userEquipement.web.dto.UserDto;
import java.util.Collections;
import java.util.List;

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
    

    public OfficeService(OfficeRepository officeRepository)
    {
     this.officeRepository=officeRepository;

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
    
    public OfficeDto create(OfficeDto officeDto){
    log.debug("Request to create Office : {}", officeDto);

        return mapToDto(this.officeRepository.save(
                new Office(officeDto.getName(),null
                        
                )));
     
    }

    public void delete(Long id) {
        log.debug("Request to delete Office : {}", id);
        this.officeRepository.deleteById(id);
    }
    
    
    
      public static OfficeDto mapToDto(Office office) {
        if (office != null) {
            return new OfficeDto(office.getName(),office.getEquipements().stream().map(EquipementService::mapToDto).collect(Collectors.toSet()) ) ;
                      }
              
                    
           
        
        return null;
    }

}



