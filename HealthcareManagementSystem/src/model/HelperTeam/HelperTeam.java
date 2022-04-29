/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.HelperTeam;

import HeathcareProviderHelp.Model.HealthCareProviderDirectory;
import IntegrationSystem.EnterpriseUserDirectory;


/**
 *
 * @author Rishi
 */
public class HelperTeam {
    
    String helperTeamId;
    String name_Helper_Team;
    
    EnterpriseUserDirectory UserAccountDirectory;
    
    HealthCareProviderDirectory customerSupportMemberDirectory;
    
    public HelperTeam(String helperTeamId, String name_Helper_Team){
        this.helperTeamId = helperTeamId;
        this.name_Helper_Team = name_Helper_Team;
    }
    
    public String getName_Helper_Team() {
        return name_Helper_Team;
    }

    public void setName_Helper_Team(String name_Helper_Team) {
        this.name_Helper_Team = name_Helper_Team;
    }

    public HealthCareProviderDirectory getCustomerSupportMemberDirectory() {
        return customerSupportMemberDirectory;
    }

    public void setCustomerSupportMemberDirectory(HealthCareProviderDirectory customerSupportMemberDirectory) {
        this.customerSupportMemberDirectory = customerSupportMemberDirectory;
    }

    public EnterpriseUserDirectory getUserAccountDirectory() {
        return UserAccountDirectory;
    }

    public void setUserAccountDirectory(EnterpriseUserDirectory UserAccountDirectory) {
        this.UserAccountDirectory = UserAccountDirectory;
    }
    
    
    
     public String getHelperTeamId() {
        return helperTeamId;
    }

    public void setHelperTeamId(String helperTeamId) {
        this.helperTeamId = helperTeamId;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return name_Helper_Team;
    }
    
}
