/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareSystemManagement;

import WorkerProvider.Workers;
import IntegrationSystem.UserAccountDirectory;
import java.util.ArrayList;
/**
 *
 * @author karthik
 */
public abstract class LogisticsOrganization {

    private String name;
    private JobQueue jobQueue;
    private Workers employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
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
        jobQueue = new JobQueue();
        employeeDirectory = new Workers();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

//    public Organization(){
//        
//    }
//    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
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

    public JobQueue getJobQueue() {
        return jobQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
