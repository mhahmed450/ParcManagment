
package com.ensi.ilsi.parc_management.service_office.web;
import com.ensi.ilsi.parc_management.commons.dto.OfficeDto;
import com.ensi.ilsi.parc_management.service_office.service.OfficeService;
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


