/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web;

import com.ensi.ilsi.ParcManagement.Entity.Equipement;
import com.ensi.ilsi.ParcManagement.Entity.Intervention;
import com.ensi.ilsi.ParcManagement.Service.EquipementService;
import com.ensi.ilsi.ParcManagement.Service.InterventionService;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    public List<Intervention> findAll(){
        return this.interventionService.findAll();   }
    
    @GetMapping("/intervention/{id}")
    public Optional<Intervention> getIntervention(@PathParam("id") Long  id){
        return this.interventionService.findById(id);
    }
     @GetMapping("/intervention/{date}")
    public Optional<Intervention> getInterventionByDate(@PathParam("date") Date date){
        return this.interventionService.findByDate(date);
    }
    
      @GetMapping("/intervention/{panne}")
    public Optional<Intervention> getInterventionByPanne(@PathParam("panne") String panne){
        return this.interventionService.findByPanne(panne);
    }
    @PostMapping("/intervention/{intervention}")
    public Intervention createIntervention(@PathParam("intervention") Intervention intervention){
        return this.interventionService.create(intervention);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.interventionService.delete(id);
        
    }
    
    
    
}
