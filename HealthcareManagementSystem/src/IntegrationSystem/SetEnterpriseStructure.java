package IntegrationSystem;

import WorkerProvider.Worker;
import WorkerProvider.Workers;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiries;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiriesDirectory;
import HealthCareMainSystem.AdminRoles.PartnerAdminRole;
import HealthCareMainSystem.AdminRoles.SystemAdminRole;

/**
 *
 * @author harshithnarahari
 * 
 */

public class SetEnterpriseStructure {
    
    public static HealthcareSystemOrganizationIntegration setRoleData(){
        
        HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration = new HealthcareSystemOrganizationIntegration();
        EnterpriseUserDirectory userAccountDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        ConsumerRecords consumerAccount = new ConsumerRecords("admin", "Adminuser123",new SystemAdminRole());
        userAccountDirectory.addConsumerData(consumerAccount);
        
        return healthcareSystemOrganizationIntegration;
    }
    
}
