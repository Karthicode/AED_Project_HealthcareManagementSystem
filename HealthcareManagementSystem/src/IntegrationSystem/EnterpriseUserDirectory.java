/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegrationSystem;

import WorkerProvider.Worker;
import HealthCareMainSystem.UserRoles.RoleBasedAuthPanel;
import HealthCareMainSystem.AdminRoles.SystemAdminRole;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author karthik
 */
public class EnterpriseUserDirectory {
    
    private ArrayList<ConsumerRecords> account_Users_List;

    public EnterpriseUserDirectory() {
        account_Users_List = new ArrayList();
    }

    public ArrayList<ConsumerRecords> get_User_Details() {
        return account_Users_List;
    }
    
    public ConsumerRecords UserAuth(String emailAddress, String password){
        for (ConsumerRecords consumer_account : account_Users_List)
            
            if (consumer_account.getEmail_Id().equals(emailAddress) && consumer_account.getPassword().equals(password)){
                return consumer_account;
            }
        return null;
    }
    
    public boolean MainJFrameLoginAuth(String username,String password)
    {
        for (ConsumerRecords userAccount : account_Users_List)
            if (userAccount.getEmail_Id().equals(username) && userAccount.getPassword().equals(password)){
                return true;
            }
        return false;
    }
    
    public boolean verifyUserUnique(String user_id){
        
        for(ConsumerRecords userAccount : account_Users_List)
        {
            if(userAccount.getEmail_Id().equals(user_id))
                return false;
        }
        
       return true;
    }

    
    public void addConsumerData(ConsumerRecords userAccount){
        account_Users_List.add(userAccount);
    }
    
    public boolean user_Input_Email_CheckIsValid(String username){
        for (ConsumerRecords userAccount : account_Users_List){
            if (userAccount.getEmail_Id().equals(username))
                return false;
        }
        return true;
    }

    public ConsumerRecords getDataFromConsumer(String username) {
        for(ConsumerRecords userAccount: account_Users_List)
        {
            if(userAccount.getEmail_Id().equals(username))
            {
                return userAccount;
            }
        }
        return null;
    }

    public void updateEnterpriseUser(ConsumerRecords updated_account_details) {
        
        for(ConsumerRecords userAccount: account_Users_List)
        {
            if(userAccount.getEmail_Id().equals(updated_account_details.getEmail_Id()))
            {   
                int index = account_Users_List.indexOf(userAccount);
                account_Users_List.set(index, userAccount);
                break;
            }
        }
    }

    public void removeConsumerRecord(ConsumerRecords select_user_account_details) {
        for(ConsumerRecords userAccount: account_Users_List)
        {
            if(userAccount.getEmail_Id().equals(select_user_account_details.getEmail_Id()))
            {   
                int index = account_Users_List.indexOf(userAccount);
                account_Users_List.remove(index);
                break;
            }
        }    
    }
}
