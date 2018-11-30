/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.userEquipement.entity;



import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "Equipement")
public class Equipement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String status;
    
    @ElementCollection
    private Set<Long> interventionsId ;
    
    private Long officeId;
    
   
    
  

    
    public Equipement() {
        //Equipement
    }

    public Equipement( String name, String status, Set<Long> interventionsId,Long officeId) {
      
        this.name = name;
        this.status = status;
        this.interventionsId = interventionsId;
        this.officeId=officeId;
        
     
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.interventionsId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipement other = (Equipement) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.interventionsId, other.interventionsId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipement{" + "name=" + name + ", status=" + status + ", interventionsId=" + interventionsId + ", officeId=" + officeId + '}';
    }
    


   

    public Long getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    
    
    
}
