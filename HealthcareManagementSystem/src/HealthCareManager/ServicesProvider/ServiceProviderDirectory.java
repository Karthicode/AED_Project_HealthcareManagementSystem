/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.ServicesProvider;


import java.util.HashMap;

/**
 *
 * @author karthik karthik
 */
public class ServiceProviderDirectory {
    

    HashMap<String, ServiceProvider> technicianList = new HashMap<>();

    public HashMap<String, ServiceProvider> getTechnicianList() {
        return technicianList;
    }

    public void setTechnicianList(HashMap<String, ServiceProvider> technicianList) {
        this.technicianList = technicianList;
    }
    public ServiceProviderDirectory() {
    }

    public void addTechnician(String user_id, ServiceProvider technician) {
        technicianList.put(user_id, technician);
    }
    
}
