
package com.ensi.ilsi.parc_management.commons.dto;



import java.util.Set;


/**
 *
 * @author ahmed
 */
public class EquipementDto {
    
    
    private Long id;
    private String name;
    private String status;
    private Set<Long> interventionsId ;  
    private Long officeId;

    public EquipementDto() {
        //
    }
  
    

    public EquipementDto(Long id, String name, String status, Set<Long> interventionsId, Long officeId) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.interventionsId= interventionsId;
        this.officeId=officeId;
      
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Long> getInterventionsId() {
        return interventionsId;
    }

    public void setInterventionsId(Set<Long> interventionsId) {
        this.interventionsId = interventionsId;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

   

   
    

   
    
    

    
    
}
