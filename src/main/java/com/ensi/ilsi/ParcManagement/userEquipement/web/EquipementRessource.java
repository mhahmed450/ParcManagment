/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.userEquipement.web;

import com.ensi.ilsi.ParcManagement.userEquipement.web.dto.EquipementDto;
import com.ensi.ilsi.ParcManagement.userEquipement.entity.Equipement;
import com.ensi.ilsi.ParcManagement.userEquipement.service.EquipementService;
import com.ensi.ilsi.ParcManagement.userEquipement.service.EquipementService;
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
@RequestMapping("/API/equipements")
public class EquipementRessource {
    
    private final EquipementService equipementService;

    public EquipementRessource(EquipementService equipementService) {
        this.equipementService = equipementService;
    }
    
    @GetMapping
    public List<EquipementDto> findAll(){
        return this.equipementService.findAll();   }
    
    @GetMapping("/{id}")
    public EquipementDto getEquipement(@PathVariable("id") Long  id){
        return this.equipementService.findById(id);
    }
    
    @PostMapping("/{equipementDto}")
    public EquipementDto createEquipement(@RequestBody EquipementDto equipementDto){
        return this.equipementService.create(equipementDto);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.equipementService.delete(id);
        
    }
    
    
    
}
