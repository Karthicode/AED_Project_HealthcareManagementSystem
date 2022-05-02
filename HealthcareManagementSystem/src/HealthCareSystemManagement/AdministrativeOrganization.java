/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareSystemManagement;


import java.util.ArrayList;

/**
 *
 * @author karthik
 */
public abstract class AdministrativeOrganization {

    private String name;
    private int currentOrgId;
    private static int queueCounterTracker=0;
    
    
    public enum VarType{
        AdminUser("AdminUser"),
        GeneralUser("GeneralUser"),
        LastMileDelivery("LastMileDelivery"),
        SysAdmin("Sysadmin");
        
        private String varValue;
        private VarType(String val) {
            this.varValue = val;
        }
        public String getValue() {
            return varValue;
        }
    }

    public AdministrativeOrganization(String getValue) {
        this.name = getValue;
        currentOrgId = queueCounterTracker;
        ++queueCounterTracker;
    }

    public int getOrganizationID() {
        return currentOrgId;
    }


    public String getName() {
        return name;
    }

   

    public void setName(String name) {
        this.name = name;
    }

   

    @Override
    public String toString() {
        return name;
    }
    
    
}
