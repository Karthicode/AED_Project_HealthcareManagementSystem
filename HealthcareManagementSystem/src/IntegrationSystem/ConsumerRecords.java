/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegrationSystem;

import model.HelperTeam.HelperTeam;
import Model.DispatcherServiceProvider.DispatcherService;
import WorkerProvider.Worker;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiries;
import HealthCareMainSystem.UserRoles.Role;
import InventorySupply.InventorySupply;

/**
 *
 * @author karthik
 */

public class ConsumerRecords {
    
    private String email_Id;
    private String password;
    private PartnerInfirmiries hospital;
    private HelperTeam helperTeamDir;
    private InventorySupply inventory_Supply;
    private DispatcherService dispatcher_Service;
    private Role role;

    public ConsumerRecords(String username, String password, Role role) {
        this.email_Id = username;
        this.password = password;
        this.role = role;
    }
    
    public String getEmail_Id() {
        return email_Id;
    }

    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public Role getRole() {
        return role;
    }

    public DispatcherService getDispatcher_Service() {
        return dispatcher_Service;
    }

    public void setDispatcher_Service(DispatcherService dispatcher_Service) {
        this.dispatcher_Service = dispatcher_Service;
    }

    public PartnerInfirmiries getInfirmiries() {
        return hospital;
    }

    public void setInfirmiries(PartnerInfirmiries hospital) {
        this.hospital = hospital;
    }

    public HelperTeam getHelperTeamDir() {
        return helperTeamDir;
    }

    public void setHelperTeamDir(HelperTeam helperTeamDir) {
        this.helperTeamDir = helperTeamDir;
    }

    public InventorySupply getInventory_Supply() {
        return inventory_Supply;
    }

    public void setInventory_Supply(InventorySupply inventory_Supply) {
        this.inventory_Supply = inventory_Supply;
    }
    
    @Override
    public String toString() {
        return email_Id;
    }
}
