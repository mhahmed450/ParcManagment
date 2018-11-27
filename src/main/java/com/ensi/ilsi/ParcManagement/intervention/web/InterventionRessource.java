/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.intervention.web;


import com.ensi.ilsi.ParcManagement.intervention.web.dto.InterventionDto;
import com.ensi.ilsi.ParcManagement.intervention.entity.Intervention;

import com.ensi.ilsi.ParcManagement.intervention.service.InterventionService;
import java.util.Date;
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
@RequestMapping("/API/intervention")
public class InterventionRessource {


    
    private final InterventionService interventionService;

    public InterventionRessource(InterventionService interventionService) {
        this.interventionService = interventionService;
    }
    
    @GetMapping
    public List<InterventionDto> findAll(){
        return this.interventionService.findAll();   }
    
    @GetMapping("/{id}")
    public InterventionDto getIntervention(@PathVariable("id") Long  id){
        return this.interventionService.findById(id);
    }
    
    @PostMapping("/{interventionDto}")
    public InterventionDto createIntervention(@RequestBody InterventionDto interventionDto){
        return this.interventionService.create(interventionDto);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.interventionService.delete(id);
        
    }
    
    
    
}
