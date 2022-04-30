/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Pharmacist;

import HospitalManagement.Doctor.*;
import IntegrationSystem.ConsumerRecords;

/**
 *
 * @author karthik
 */
public class MedicalAdvisor {
    

   private String advisorId;
   private String advisorName;
   private String adviosorQualification;
   private String adviosorExpertise;

    public String getAdviosorQualification() {
        return adviosorQualification;
    }

    public void setAdviosorQualification(String adviosorQualification) {
        this.adviosorQualification = adviosorQualification;
    }

    public String getAdviosorExpertise() {
        return adviosorExpertise;
    }

    public void setAdviosorExpertise(String adviosorExpertise) {
        this.adviosorExpertise = adviosorExpertise;
    }
    
    public String getAdvisorId() {
        return advisorId;
    }
    public void setAdvisorId(String advisorId) {    
        this.advisorId = advisorId;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }
    
    @Override
    public String toString(){
        return advisorId;
    }

    
}
