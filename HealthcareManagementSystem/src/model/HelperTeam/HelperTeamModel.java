/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.HelperTeam;

import java.util.ArrayList;

/**
 *
 * @author Rishi
 */

public class HelperTeamModel {
    
    ArrayList<HelperTeam> customerSupportTeamList = new ArrayList<>();

    public ArrayList<HelperTeam> getCustomerSupportTeamList() {
        return customerSupportTeamList;
    }

    public void setCustomerSupportTeamList(ArrayList<HelperTeam> customerSupportTeamList) {
        this.customerSupportTeamList = customerSupportTeamList;
    }
    public HelperTeamModel() {
    }

    public void addCustomerSupportTeam(HelperTeam customerSupportTeam) {
        customerSupportTeamList.add(customerSupportTeam);
    }

    public void updateCustomerSupportTeam(ArrayList<String> user_input, HelperTeam updated_customerSupportTeam) {
        
        for(HelperTeam customerSupportTeam: customerSupportTeamList)
        {
            if(customerSupportTeam.getHelperTeamId().equals(updated_customerSupportTeam.getHelperTeamId()))
            {   
                customerSupportTeam.setName_Helper_Team(user_input.get(1));
                break;
            }
        }
    }

    public void deleteCustomerSupportTeam(HelperTeam selected_customerSupportTeam) {
        for(HelperTeam customerSupportTeam: customerSupportTeamList)
        {
            if(customerSupportTeam.getHelperTeamId().equals(selected_customerSupportTeam.getHelperTeamId()))
            {   
                customerSupportTeamList.remove(customerSupportTeam);
                break;
            }
        }
    }
    
}

