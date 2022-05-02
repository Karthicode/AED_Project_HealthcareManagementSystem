/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareSystem.Directorate;

import java.util.HashMap;

/**
 *
 * @author Rishi
 */
public class DirectorateDirectory {
    
    HashMap<String, Directorate> directorateList = new HashMap<>();

    public HashMap<String, Directorate> getDirectorateList() {
        return directorateList;
    }

    public void setDirectorateList(HashMap<String, Directorate> directorateList) {
        this.directorateList = directorateList;
    }
    public DirectorateDirectory() {
    }

    public void addDirectorate(String user_id, Directorate accountant) {
        directorateList.put(user_id, accountant);
    }

    
    
    
    
}
