
package com.ensi.ilsi.parc_management.user_equipement.web;

import com.ensi.ilsi.parc_management.commons.dto.EquipementDto;

import com.ensi.ilsi.parc_management.user_equipement.service.EquipementService;
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
