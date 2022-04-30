/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkerProvider;

import HealthCareMainSystem.UserRoles.Role;

/**
 *
 * @author harshithnarahari
 */
public class Worker {
    
    private String worker_Name;
    private String worker_Id;
    
    private Role role;

    public String getEmployee_name() {
        return worker_Name;
    }

    public void setEmployee_name(String worker_Name) {
        this.worker_Name = worker_Name;
    }

    public String getWorker_Id() {
        return worker_Id;
    }

    public void setWorker_Id(String worker_Id) {
        this.worker_Id = worker_Id;
    }

    public Role getRole() {
        return role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    //setting worker to bind to specific roles
    public Worker(String worker_id, String worker_Name, Role role) {
        this.worker_Name = worker_Name;
        this.worker_Id = worker_id;
        this.role = role;
    }

    
    @Override
    public String toString() {
        return worker_Id;
    }
}
