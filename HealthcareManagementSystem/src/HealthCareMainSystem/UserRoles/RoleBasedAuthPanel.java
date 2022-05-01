/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareMainSystem.UserRoles;

import IntegrationSystem.HealthcareSystemOrganizationIntegration;
import IntegrationSystem.ConsumerRecords;
import javax.swing.JPanel;

/**
 *
 * @author karthik 
 */
public abstract class RoleBasedAuthPanel {
    
    String user_Type_JPanel_Role;

    public String getUser_Type_JPanel_Role() {
        return user_Type_JPanel_Role;
    }

    public void Role(String role) {
        this.user_Type_JPanel_Role = role;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            ConsumerRecords consumerRecords,  
            HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
