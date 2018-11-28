/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.serviceOffice.entity;



import java.util.Objects;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Ahmed
 */
@Entity
public class Office  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long officeNumber;
    private String name;
   
   
    
    public Office( String name) {
       
        this.name = name;
        //this.officeNumber = officeNumber;
        
      
    }

    public Office() {
        
    }


 
    public Long getOfficeNumber() {
        return officeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
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
        final Office other = (Office) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Office{" + "OfficeNumber=" + officeNumber + ", name=" + name + '}';
    }
    
    
}
