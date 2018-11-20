/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Entity;

import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ahmed
 */
@Entity
public class Service extends AbstractEntity{
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ServiceNumber;
    private String name;
    
    @OneToMany
    private Set<Office> offices;

    public Service() {
    }

    public Service(Long ServiceNumber, String name) {
        this.ServiceNumber = ServiceNumber;
        this.name = name;
    }

    public Set<Office> getOffices() {
        return offices;
    }

    public void setOffices(Set<Office> offices) {
        this.offices = offices;
    }

    
    public Long getServiceNumber() {
        return ServiceNumber;
    }

    public String getName() {
        return name;
    }

    public void setServiceNumber(Long ServiceNumber) {
        this.ServiceNumber = ServiceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
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
        final Service other = (Service) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Service{" + "ServiceNumber=" + ServiceNumber + ", name=" + name + '}';
    }
    
    
}
