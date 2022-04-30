/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegrationSystem;

import model.HelperTeam.HelperTeamModel;
import Model.DispatcherServiceProvider.DispatcherServiceDirectory;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiriesDirectory;
import HealthCareManager.Tickets.TicketModelDirectory;

import HealthCareMainSystem.UserRoles.Role;
import HealthCareMainSystem.AdminRoles.SystemAdminRole;
import InventorySupply.InventorySupplyModelDirectory;

import java.util.ArrayList;

/**
 *
 * @author harshithnarahari
 * 
 */

public class HealthcareSystemOrganizationIntegration extends HealthCareSystemEnterprise{
    
    private PartnerInfirmiriesDirectory infirmaryDirectory;
    private HelperTeamModel helperTeamDirectory;
    private InventorySupplyModelDirectory inventoryDirectory;
    private DispatcherServiceDirectory dispatcherServiceDirectory;
    private EnterpriseUserDirectory userAccDirectory;
    private TicketModelDirectory ticketDirectory;
    
    public HealthcareSystemOrganizationIntegration(){
        userAccDirectory = new EnterpriseUserDirectory();
        ticketDirectory = new TicketModelDirectory();
        infirmaryDirectory = new PartnerInfirmiriesDirectory();
        helperTeamDirectory = new HelperTeamModel();
        inventoryDirectory =  new InventorySupplyModelDirectory();
        dispatcherServiceDirectory = new DispatcherServiceDirectory();
    }

    public PartnerInfirmiriesDirectory getInfirmaryDirectory() {
        return infirmaryDirectory;
    }

    public void setInfirmaryDirectory(PartnerInfirmiriesDirectory infirmaryDirectory) {
        this.infirmaryDirectory = infirmaryDirectory;
    }

    public EnterpriseUserDirectory getUserAccDirectory() {
        return userAccDirectory;
    }

    public void setUserAccDirectory(EnterpriseUserDirectory userAccDirectory) {
        this.userAccDirectory = userAccDirectory;
    }

    public TicketModelDirectory getTicketDirectory() {
        return ticketDirectory;
    }

    public void setTicketDirectory(TicketModelDirectory ticketDirectory) {
        this.ticketDirectory = ticketDirectory;
    }

    public InventorySupplyModelDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventorySupplyModelDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
    
    public HelperTeamModel getHelperTeamDirectory() {
        return helperTeamDirectory;
    }

    public void setHelperTeamDirectory(HelperTeamModel helperTeamDirectory) {
        this.helperTeamDirectory = helperTeamDirectory;
    }

    public DispatcherServiceDirectory getDispatcherServiceDirectory() {
        return dispatcherServiceDirectory;
    }

    public void setDispatcherServiceDirectory(DispatcherServiceDirectory dispatcherServiceDirectory) {
        this.dispatcherServiceDirectory = dispatcherServiceDirectory;
    }
    
}
