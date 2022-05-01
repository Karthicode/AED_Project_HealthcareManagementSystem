/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.ServicesProvider;

import IntegrationSystem.ConsumerRecords;

/**
 *
 * @author karthik karthik
 */
public class ServiceProvider {
    

    private String serviceTeam_Id;
    private String serviceTeam_Name;
    
    public String getServiceTeam_Id() {
        return serviceTeam_Id;
    }
    public void setServiceTeam_Id(String serviceTeam_Id) {    
        this.serviceTeam_Id = serviceTeam_Id;
    }

    public String getServiceTeam_Name() {
        return serviceTeam_Name;
    }

    public void setServiceTeam_Name(String serviceTeam_Name) {
        this.serviceTeam_Name = serviceTeam_Name;
    }
    
    
    @Override
    public String toString(){
        return serviceTeam_Id;
    }

    
}
