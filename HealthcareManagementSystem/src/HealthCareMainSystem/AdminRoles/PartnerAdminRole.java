/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareMainSystem.AdminRoles;

import HealthCareMainSystem.UserRoles.RoleBasedAuthPanel;
import IntegrationSystem.HealthcareSystemOrganizationIntegration;
import IntegrationSystem.ConsumerRecords;
import javax.swing.JPanel;
import UI.AdminRole.AdminJPanel.ManagerAccountsJPanel;

/**
 *
 * @author karthik 
 */
public class PartnerAdminRole extends RoleBasedAuthPanel {

    public JPanel createWorkArea(JPanel PanelRenderer, ConsumerRecords consumerRecords, HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration) {
        return new ManagerAccountsJPanel(PanelRenderer, healthcareSystemOrganizationIntegration);
    }
    
    @Override
    public String toString(){
        return "HospitalAdmin";
    }
}
