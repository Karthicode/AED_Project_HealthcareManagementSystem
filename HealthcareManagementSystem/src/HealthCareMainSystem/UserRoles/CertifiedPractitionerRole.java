/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareMainSystem.UserRoles;

import IntegrationSystem.HealthcareSystemOrganizationIntegration;
import IntegrationSystem.ConsumerRecords;
import javax.swing.JPanel;
import UI.AdminRole.AdminJPanel.ManagerAccountsJPanel;

/**
 *
 * @author karthik 
 */
public class CertifiedPractitionerRole extends RoleBasedAuthPanel {

    public JPanel createWorkArea(JPanel userProcessContainer, ConsumerRecords consumerRecords, HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration) {
        return new ManagerAccountsJPanel(userProcessContainer, healthcareSystemOrganizationIntegration);
    }
    
    @Override
    public String toString(){
        return "Doctor";
    }
}
