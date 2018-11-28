/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.serviceOffice.web;
import com.ensi.ilsi.ParcManagement.commons.dto.OfficeDto;
import com.ensi.ilsi.ParcManagement.serviceOffice.service.OfficeService;
import java.util.List;
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
@RequestMapping("/API/offices")
public class OfficeRessource {
  
private final OfficeService officeService;

    public OfficeRessource(OfficeService officeService) {
        this.officeService = officeService;
    }
    
    @GetMapping
    public List<OfficeDto> findAll(){
        return this.officeService.findAll();   }
    
    @GetMapping("/{id}")
    public OfficeDto getOffice(@PathVariable("id") Long  id){
        return this.officeService.findById(id);
    }
    
    @PostMapping("/{officeDto}")
    public OfficeDto addOffice(@RequestBody OfficeDto officeDto){
        return this.officeService.create(officeDto);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.officeService.delete(id);
        
    }
    
}


