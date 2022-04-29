/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Emergency;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harshithnarahari
 */
public class EmergencyProviderDirectory {
    
//    ArrayList<Radiologist> responderList = new ArrayList<>();
    HashMap<String, EmergencyProvider> responderList = new HashMap<>();

    public HashMap<String, EmergencyProvider> getResponderList() {
        return responderList;
    }   
}
