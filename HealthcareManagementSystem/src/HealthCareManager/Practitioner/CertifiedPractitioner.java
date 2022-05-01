/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Practitioner;

import IntegrationSystem.ConsumerRecords;

/**
 *
 * @author prans
 */
public class CertifiedPractitioner {
    

   private String practitionerId;
   private String practitioner_Name;
    
    public String practitionerId() {
        return practitionerId;
    }

    public void setPractitionerId(String practitionerId) {    
        this.practitionerId = practitionerId;
    }

    public String getPractitioner_Name() {
        return practitioner_Name;
    }

    public void setPractitioner_Name(String practitioner_Name) {
        this.practitioner_Name = practitioner_Name;
    }
    
    
    @Override
    public String toString(){
        return practitionerId;
    }

    
}
