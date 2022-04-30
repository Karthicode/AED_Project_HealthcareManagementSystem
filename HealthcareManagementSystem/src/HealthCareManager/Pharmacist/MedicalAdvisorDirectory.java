/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Pharmacist;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author karthik
 */
public class MedicalAdvisorDirectory {
    
    HashMap<String, MedicalAdvisor> advisorList = new HashMap<>();

    public HashMap<String, MedicalAdvisor> getAdvisorList() {
        return advisorList;
    }

    public void setAdvisorList(HashMap<String, MedicalAdvisor> advisorList) {
        this.advisorList = advisorList;
    }
    public MedicalAdvisorDirectory() {
    }

    public void addAdvisor(String user_id, MedicalAdvisor advisor) {
        advisorList.put(user_id, advisor);
    }

    
    
}
