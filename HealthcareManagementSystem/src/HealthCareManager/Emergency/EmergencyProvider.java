/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Emergency;

import IntegrationSystem.ConsumerRecords;

/**
 *
 * @author harshithnarahari
 */
public class EmergencyProvider {
    
//    CustomerAccount userAccount;
    private String emergencyProviderId;
    private String emergencyProviderName;
    
    public String getEmergencyProviderId() {
        return emergencyProviderId;
    }

    public void setEmergencyProviderId(String emergencyProviderId) {    
        this.emergencyProviderId = emergencyProviderId;
    }

    public String getEmergencyProviderName() {
        return emergencyProviderName;
    }

    public void setEmergencyProviderName(String emergencyProviderName) {
        this.emergencyProviderName = emergencyProviderName;
    }
    
    
    @Override
    public String toString(){
        return emergencyProviderId;
    } 
}
