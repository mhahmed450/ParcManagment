
package com.ensi.ilsi.parc_management.service_office.service;


import com.ensi.ilsi.parc_management.commons.dto.OfficeDto;

import com.ensi.ilsi.parc_management.service_office.entity.Office;
import com.ensi.ilsi.parc_management.service_office.repository.OfficeRepository;



import java.util.List;

import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 *
 * @author ahmed
 */

@Service

public class OfficeService {
    
    
        
      
    private final Logger log = LoggerFactory.getLogger(OfficeService.class);

    private final OfficeRepository officeRepository;
    

    public OfficeService(OfficeRepository officeRepository)
    {
        
     this.officeRepository=officeRepository;

    }
    
    
      public static OfficeDto mapToDto(Office office) {
        if (office != null) {
            return new OfficeDto( office.getName(),
                    office.getOfficeNumber()
                   
                    
            ) ;
             
                      }
              
                    
           
  
        return null;
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
                new Office(officeDto.getName()
                       // officeDto.getOfficeNumber()
                        
                )));
        
     
    }

    public void delete(Long id) {
        log.debug("Request to delete Office : {}", id);
        this.officeRepository.deleteById(id);
    }
    
    
    

}



