/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareSystem.Directorate;

import IntegrationSystem.ConsumerRecords;

/**
 *
 * @author Rishi
 */
public class Directorate {
    
    
    String directorateId;
    String directorate_Name;

    public String getDirectorateId() {
        return directorateId;
    }

    public void setDirectorateId(String directorateId) {
        this.directorateId = directorateId;
    }

    public String getDirectorate_Name() {
        return directorate_Name;
    }

    public void setDirectorate_Name(String directorate_Name) {
        this.directorate_Name = directorate_Name;
    }
    
    
    @Override
    public String toString(){
        return directorateId;
    }

    
}
