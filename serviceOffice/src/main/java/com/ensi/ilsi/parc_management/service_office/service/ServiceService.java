
package com.ensi.ilsi.parc_management.service_office.service;


import com.ensi.ilsi.parc_management.commons.dto.ServiceDto;

import com.ensi.ilsi.parc_management.service_office.entity.Service;
import com.ensi.ilsi.parc_management.service_office.repository.ServiceRepository;
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

@org.springframework.stereotype.Service

public class ServiceService {
        
    private final ServiceRepository serviceRepository;

    
    
    private final Logger log = LoggerFactory.getLogger(ServiceService.class);

    public ServiceService(ServiceRepository serviceRepository  )
    {
     this.serviceRepository=serviceRepository;
     
     
    }

    
     public List<ServiceDto> findAll() {
          log.debug("Request to get all Services");
        return this.serviceRepository.findAll()
                .stream()
                .map(ServiceService::mapToDto)
                .collect(Collectors.toList());
        
         
     }
     


    public Optional<ServiceDto> findById(Long id) {
        
           log.debug("Request to get Category : {}", id);
        return this.serviceRepository.findById(id).map(ServiceService::mapToDto);
    
        
    }
    
    public ServiceDto create(ServiceDto serviceDto){
        
             log.debug("Request to create Service : {}", serviceDto);
        return mapToDto(this.serviceRepository.save(
                new Service(serviceDto.getName(), Collections.emptySet()) 
                      
                )
        );
    
        
    }

    public void delete(Long id) {
          log.debug("Request to delete service : {}", id);
        this.serviceRepository.deleteById(id);
    }
    
    public static ServiceDto mapToDto(Service service){
        if (service!=null){
            return new ServiceDto(service.getServiceNumber(),
                                    service.getName(),
                                  service.getOffices().stream().map(OfficeService::mapToDto).collect(Collectors.toSet()) ) ;
        
        }
           return null;
        
    }

}


