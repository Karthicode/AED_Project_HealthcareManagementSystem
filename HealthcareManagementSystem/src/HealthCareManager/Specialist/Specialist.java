/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Specialist;

import IntegrationSystem.ConsumerRecords;

/**
 *
 * @author karthik
 */
public class Specialist {
    
//    ConsumerRecords userAccount;
    private String specialistId;
    private String specialist_type;
    private String specialist_Name;

    public String getSpecialist_type() {
        return specialist_type;
    }

    public void setSpecialist_type(String specialist_type) {
        this.specialist_type = specialist_type;
    }
    
    
    public String getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(String specialistId) {    
        this.specialistId = specialistId;
    }

    public String getSpecialist_Name() {
        return specialist_Name;
    }

    public void setSpecialist_Name(String specialist_Name) {
        this.specialist_Name = specialist_Name;
    }
    
    
    @Override
    public String toString(){
        return specialistId;
    }

    
}
