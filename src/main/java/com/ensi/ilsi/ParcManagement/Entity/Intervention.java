/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.Entity;

import com.ensi.ilsi.ParcManagement.*;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ahmed
 */
@Entity
public class Intervention  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numIntervention;
    private String panne;
    private Date date;  
    
    @ManyToOne
    private Equipement equipement ;
    
    @ManyToOne
    private Intervenant intervenant ;

    public Intervention() {
        //intervention 
    }

    public Intervention( String panne, Date date, Equipement equipement, Intervenant intervenant) {
        
        this.panne = panne;
        this.date = date;
        this.equipement = equipement;
        this.intervenant = intervenant;
    }

    

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

   

    public Equipement getEquipement() {
        return equipement;
    }

    public void setEquipement(Equipement equipement) {
        this.equipement = equipement;
    }

    
    public Long getNumIntervention() {
        return numIntervention;
    }

    public String getPanne() {
        return panne;
    }

    public Date getDate() {
        return date;
    }

    public void setNumIntervention(Long numIntervention) {
        this.numIntervention = numIntervention;
    }

    public void setPanne(String panne) {
        this.panne = panne;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.numIntervention);
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
        final Intervention other = (Intervention) obj;
        if (!Objects.equals(this.numIntervention, other.numIntervention)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Intervention{" + "panne=" + panne + ", date=" + date + '}';
    }
    
}
