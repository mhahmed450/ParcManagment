/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Repository.Service;

import com.ensi.ilsi.ParcManagement.Entity.Office;
import com.ensi.ilsi.ParcManagement.Entity.Service;
import com.ensi.ilsi.ParcManagement.Repository.OfficeRepository;
import com.ensi.ilsi.ParcManagement.Repository.ServiceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nouha
 */

@org.springframework.stereotype.Service
@Transactional
public class ServiceService {
        
    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository)
    {
     this.serviceRepository=serviceRepository;
    }

    
     public List<Service> findAll() {
         return serviceRepository.findAll();
         
     }
     

    @Transactional(readOnly = true)
    public Optional<Service> findById(Long id) {
         return this.serviceRepository.findById(id);
        
    }
    
    public Service create(Service service){
    
        return  this.serviceRepository.save(service);
    }

    public void delete(Long id) {
        
        this.serviceRepository.deleteById(id);
    }

}
