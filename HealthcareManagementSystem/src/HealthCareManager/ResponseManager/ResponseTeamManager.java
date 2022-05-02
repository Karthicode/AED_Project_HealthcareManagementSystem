/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.ResponseManager;

import IntegrationSystem.ConsumerRecords;

/**
 *
 * @author karthik karthik
 */
public class ResponseTeamManager {
    
//    ConsumerRecords userAccount;
    private String responseTeamManager_Id;
    private String responseTeamManager_Name;
    
    public String getResponseTeamManager_Id() {
        return responseTeamManager_Id;
    }

    public void setResponseTeamManager_Id(String responseTeamManager_Id) {    
        this.responseTeamManager_Id = responseTeamManager_Id;
    }

    public String getResponseTeamManager_Name() {
        return responseTeamManager_Name;
    }

    public void setResponseTeamManager_Name(String responseTeamManager_Name) {
        this.responseTeamManager_Name = responseTeamManager_Name;
    }
    
    
    @Override
    public String toString(){
        return responseTeamManager_Id;
    }

    
}
