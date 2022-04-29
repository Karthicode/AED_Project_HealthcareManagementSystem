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
    private JobQueue jobQueue;
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
        jobQueue = new JobQueue();
        currentOrgId = queueCounterTracker;
        ++queueCounterTracker;
    }

    public int getOrganizationID() {
        return currentOrgId;
    }

//    public EmployeeDirectory getEmployeeDirectory() {
//        return employeeDirectory;
//    }
    
    public String getName() {
        return name;
    }

    public JobQueue getJobQueue() {
        return jobQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(JobQueue workQueue) {
        this.jobQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
