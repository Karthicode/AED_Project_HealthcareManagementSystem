/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.ResponseManager;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author karthik karthik
 */
public class FirstResponderDirectory {
    
    HashMap<String, ResponseTeamManager> firstRespondersList = new HashMap<>();

    public HashMap<String, ResponseTeamManager> getFirstRespondersList() {
        return firstRespondersList;
    }

    public void setFirstRespondersList(HashMap<String, ResponseTeamManager> firstRespondersList) {
        this.firstRespondersList = firstRespondersList;
    }
    public FirstResponderDirectory() {
    }

    public void addFrontDeskOperator(String user_id, ResponseTeamManager frontDeskOperator) {
        firstRespondersList.put(user_id, frontDeskOperator);
    }

    
    
}
