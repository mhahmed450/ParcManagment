
package com.ensi.ilsi.parc_management.service_office.web;


import com.ensi.ilsi.parc_management.commons.dto.ServiceDto;


import com.ensi.ilsi.parc_management.service_office.service.ServiceService;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author samar
 */
 @CrossOrigin("*")
@RestController
@RequestMapping("/API/services")
public class ServiceRessource {
     private final ServiceService serviceService;
     
     

    public ServiceRessource(ServiceService serviceService) {
        this.serviceService = serviceService;
    }
    
    @GetMapping
    public List<ServiceDto> findAll(){
        return this.serviceService.findAll();   }
    
    @GetMapping("/{id}")
    public Optional<ServiceDto> getService(@PathVariable("id") Long  id){
        return this.serviceService.findById(id);
    }
    
    @PostMapping("/{serviceDto}")
    public ServiceDto addService(@RequestBody ServiceDto serviceDto){
        return this.serviceService.create(serviceDto);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.serviceService.delete(id);
        
    }
    
}
