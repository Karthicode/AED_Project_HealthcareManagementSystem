/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeathcareProviderHelp.Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Rishi
 */
public class HealthCareProviderDirectory {
    
    HashMap<String, RegisteredMember> registeredSupportMemberList = new HashMap<>();

    public HashMap<String, RegisteredMember> getRegisteredSupportMemberList() {
        return registeredSupportMemberList;
    }

    public void setRegisteredSupportMemberList(HashMap<String, RegisteredMember> registeredSupportMemberList) {
        this.registeredSupportMemberList = registeredSupportMemberList;
    }
    public HealthCareProviderDirectory() {
    }

    public void addHealtcareProvider(String user_id, RegisteredMember supportstaff) {
        registeredSupportMemberList.put(user_id, supportstaff);
    }
    
    public void removeHealthCareProvider(String user_id, RegisteredMember supportstaff) {
        registeredSupportMemberList.remove(user_id);
    }
        
    public void searchHealthCareProvider(String user_id, RegisteredMember supportstaff) {
        registeredSupportMemberList.get(user_id);
        
       
 
    }
    

    
    
}
