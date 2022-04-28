/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DispatcherServiceProvider;

import java.util.ArrayList;

/**
 *
 * @author harshithnarahari
 */
public class DispatcherServiceDirectory {
    
    ArrayList<DispatcherService> dispatcherAgencyList = new ArrayList<>();

    public ArrayList<DispatcherService> getDeliveryAgencyList() {
        return dispatcherAgencyList;
    }

    public void setDeliveryAgencyList(ArrayList<DispatcherService> deliveryAgencyList) {
        this.dispatcherAgencyList = deliveryAgencyList;
    }
    public DispatcherServiceDirectory() {
    }

    public void addDeliveryAgency(DispatcherService deliveryAgency) {
        dispatcherAgencyList.add(deliveryAgency);
    }

    public void updateDeliveryAgency(ArrayList<String> initial_user_value, DispatcherService updated_deliveryAgency) {
        
        for(DispatcherService deliveryAgency: dispatcherAgencyList)
        {
            if(deliveryAgency.getDeliveryAgencyId().equals(updated_deliveryAgency.getDeliveryAgencyId()))
            {   
                deliveryAgency.setDeliveryAgencyName(initial_user_value.get(1));
                break;
            }
        }
    }

    public void deleteDeliveryAgency(DispatcherService selected_deliveryAgency) {
        for(DispatcherService service: dispatcherAgencyList)
        {
            if(service.getDeliveryAgencyId().equals(selected_deliveryAgency.getDeliveryAgencyId()))
            {   
                dispatcherAgencyList.remove(service);
                break;
            }
        }
    }
    
}
