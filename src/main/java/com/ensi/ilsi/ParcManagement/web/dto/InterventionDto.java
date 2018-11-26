/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.ParcManagement.web.dto;

import com.ensi.ilsi.ParcManagement.entity.Equipement;
import com.ensi.ilsi.ParcManagement.entity.Intervenant;
import java.util.Date;
import javax.persistence.ManyToOne;

/**
 *
 * @author ahmed
 */
public class InterventionDto {
    
    private Long numIntervention;
    private String panne;
    private Date date;  
    
    
    
    
    private IntervenantDto intervenantID ;

    public InterventionDto() {
    }

    public InterventionDto(Long numIntervention, String panne, Date date, IntervenantDto intervenantID) {
        this.numIntervention = numIntervention;
        this.panne = panne;
        this.date = date;
       
        this.intervenantID = intervenantID;
    }

    public Long getNumIntervention() {
        return numIntervention;
    }

    public void setNumIntervention(Long numIntervention) {
        this.numIntervention = numIntervention;
    }

    public String getPanne() {
        return panne;
    }

    public void setPanne(String panne) {
        this.panne = panne;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

  

    public IntervenantDto getIntervenantID() {
        return intervenantID;
    }

    public void setIntervenantID(IntervenantDto intervenantID) {
        this.intervenantID = intervenantID;
    }
    
}
