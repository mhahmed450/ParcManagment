
package com.ensi.ilsi.parc_management.intervention.web;

import com.ensi.ilsi.parc_management.commons.dto.IntervenantDto;


import com.ensi.ilsi.parc_management.intervention.service.IntervenantService;
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
 * @author Ahmed
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/API/intervenants")
public class IntervenantRessource {
    
    
    private final IntervenantService intervenantService;

    public IntervenantRessource(IntervenantService intervenantService) {
        this.intervenantService = intervenantService;
    }
    
    @GetMapping
    public List<IntervenantDto> findAll(){
        return this.intervenantService.findAll();   }
    
    @GetMapping("/{id}")
    public IntervenantDto getIntervenant(@PathVariable("id") Long  id){
        return this.intervenantService.findById(id);
    }
    
    @PostMapping("/{intervenantDto}")
    public IntervenantDto addIntervenant(@RequestBody IntervenantDto intervenantDto){
        return this.intervenantService.create(intervenantDto);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.intervenantService.delete(id);
        
    }
    
    
    
}
