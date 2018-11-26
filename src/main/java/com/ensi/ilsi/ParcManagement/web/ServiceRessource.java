/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.web;


import com.ensi.ilsi.ParcManagement.entity.Service;

import com.ensi.ilsi.ParcManagement.service.ServiceService;
import java.util.List;
import java.util.Optional;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nouha
 */
@RestController
@RequestMapping("/API/service")
public class ServiceRessource {
     private final ServiceService serviceService;

    public ServiceRessource(ServiceService serviceService) {
        this.serviceService = serviceService;
    }
    
    @GetMapping
    public List<Service> findAll(){
        return this.serviceService.findAll();   }
    
    @GetMapping("/{id}")
    public Optional<Service> getService(@PathVariable("id") Long  id){
        return this.serviceService.findById(id);
    }
    
    @PostMapping("/{service}")
    public Service addService(@RequestBody Service service){
        return this.serviceService.create(service);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.serviceService.delete(id);
        
    }
    
}
