/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegrationSystem;


import WorkerProvider.Workers;
import HealthCareMainSystem.UserRoles.Role;
import java.util.ArrayList;

public abstract class HealthCareSystemEnterprise {

    private String enterprise_Name;
//    private WorkQueue workQueue;
    private Workers employees_Directory;
    private EnterpriseUserDirectory userAccountDirectory;
    


    public HealthCareSystemEnterprise(){
        
    }
    

    @Override
    public String toString() {
        return enterprise_Name;
    }
    
    
}
