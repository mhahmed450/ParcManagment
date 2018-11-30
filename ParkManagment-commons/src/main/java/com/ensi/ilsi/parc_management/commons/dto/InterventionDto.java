
package com.ensi.ilsi.parc_management.commons.dto;


import java.util.Date;


/**
 *
 * @author ahmed
 */
public class InterventionDto {
    
    
    private Long numIntervention;
    private String panne;
    private Date date;  
    
    
    
    
    private Long intervenantID ;

    public InterventionDto() {
        //
    }

    public InterventionDto(Long numIntervention, String panne, Date date, Long intervenantID) {
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

  

    public Long getIntervenantID() {
        return intervenantID;
    }

    public void setIntervenantID(Long intervenantID) {
        this.intervenantID = intervenantID;
    }
    
}
