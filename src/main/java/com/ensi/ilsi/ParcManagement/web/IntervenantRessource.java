/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.web;

import com.ensi.ilsi.ParcManagement.entity.Intervenant;

import com.ensi.ilsi.ParcManagement.service.IntervenantService;
import com.ensi.ilsi.ParcManagement.web.dto.IntervenantDto;
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
 * @author ahmed
 */

@RestController
@RequestMapping("/API/intervenant")
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
