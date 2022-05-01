/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Practitioner;


import java.util.HashMap;

/**
 *
 * @author karthik
 * 
 */
public class PractitionerDirectory {
    
    HashMap<String, CertifiedPractitioner> practitioners = new HashMap<>();

    public HashMap<String, CertifiedPractitioner> getPractitioners() {
        return practitioners;
    }

    public void setPractitioners(HashMap<String, CertifiedPractitioner> practitioners) {
        this.practitioners = practitioners;
    }
    public PractitionerDirectory() {
    }

    public void addDoctor(String user_id, CertifiedPractitioner practitioner) {
        practitioners.put(user_id, practitioner);
    }

    
    
}
