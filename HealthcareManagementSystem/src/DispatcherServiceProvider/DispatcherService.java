/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DispatcherServiceProvider;
/**
 *
 * @author harshithnarahari
 */
public class DispatcherService {
    
    String dispatchManagerID;
    String dispatcherName;
    
    public DispatcherService(String dispatchManagerID, String dispatcherName){
        this.dispatchManagerID = dispatchManagerID;
        this.dispatcherName = dispatcherName;
    }
    
    public String getDeliveryAgencyName() {
        return dispatcherName;
    }

    public void setDeliveryAgencyName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }
    
    
    
     public String getDeliveryAgencyId() {
        return dispatchManagerID;
    }

    public void setDeliveryAgencyId(String dispatchManagerID) {
        this.dispatchManagerID = dispatchManagerID;
    }

    @Override
    public String toString(){
        return dispatcherName;
    }
    
}
