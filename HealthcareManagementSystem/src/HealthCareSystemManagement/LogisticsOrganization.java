/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareSystemManagement;

import WorkerProvider.Workers;
import IntegrationSystem.EnterpriseUserDirectory;
import java.util.ArrayList;
/**
 *
 * @author karthik
 */
public abstract class LogisticsOrganization {

    private String name;

    private Workers employeeDirectory;
    private EnterpriseUserDirectory userAccountDirectory;
    
    private int organizationID;
    private static int counter=0;
    
    
    public enum UserType{
        AdminUser("AdminUser"),
        GeneralUser("GeneralUser"),
        LastMileDelivery("LastMileDelivery"),
        SysAdmin("Sysadmin");
        
        private String inputVal;
        private UserType(String inputVal) {
            this.inputVal = inputVal;
        }
        public String getInputVal() {
            return inputVal;
        }
    }

    public LogisticsOrganization(String name) {
        this.name = name;
        employeeDirectory = new Workers();
        userAccountDirectory = new EnterpriseUserDirectory();
        organizationID = counter;
        ++counter;
    }

//    public Organization(){
//        
//    }
//    public abstract ArrayList<Role> getSupportedRole();
    
    public EnterpriseUserDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public Workers getEmployeeDirectory() {
        return employeeDirectory;
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
