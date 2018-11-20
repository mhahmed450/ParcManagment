/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Web;

import com.ensi.ilsi.ParcManagement.Entity.Equipement;
import com.ensi.ilsi.ParcManagement.Service.EquipementService;
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
 * @author ahmed
 */

@RestController
@RequestMapping("/API/equipements")
public class EquipementRessource {
    
    private final EquipementService equipementService;

    public EquipementRessource(EquipementService equipementService) {
        this.equipementService = equipementService;
    }
    
    @GetMapping
    public List<Equipement> findAll(){
        return this.equipementService.findAll();   }
    
    @GetMapping("/equipement/{id}")
    public Optional<Equipement> getEquipement(@PathParam("id") Long  id){
        return this.equipementService.findById(id);
    }
    
    @PostMapping("/equipement/{name}")
    public Equipement createEquipement(@PathParam("name") String name){
        return this.equipementService.create(name);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.equipementService.delete(id);
        
    }
    
    
    
}
