
package com.ensi.ilsi.parc_management.intervention.web;


import com.ensi.ilsi.parc_management.commons.dto.InterventionDto;


import com.ensi.ilsi.parc_management.intervention.service.InterventionService;

import java.util.List;


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
@RequestMapping("/API/interventions")
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
