/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySupply.Dipatches;

import InventorySupply.FirstAidSupply.FirstAidKit;
import InventorySupply.InventorySupply;
import java.util.HashMap;

/**
 *
 * @author Rishi
 */
public class DispatchRequest {
    
    private String request_Id;
    private HashMap<FirstAidKit, String> FirstAidKitsTotalQuantity = new HashMap<>();
    private String request_processing_status;
    private String inventory_Id;
    private String institution_Id;
    private String requested_supply_Amount;
    private String transporter_Id;
    
    public String getInstitution_Id() {
        return institution_Id;
    }

    public void setInstitution_Id(String institution_Id) {
        this.institution_Id = institution_Id;
    }
    
    public String getInventory_Id() {
        return inventory_Id;
    }

    public void setInventory_Id(String inventory_Id) {
        this.inventory_Id = inventory_Id;
    }

    public String getRequested_supply_Amount() {
        return requested_supply_Amount;
    }

    public void setRequested_supply_Amount(String requested_supply_Amount) {
        this.requested_supply_Amount = requested_supply_Amount;
    }

    public String getTransporter_Id() {
        return transporter_Id;
    }

    public void setTransporter_Id(String transporter_Id) {
        this.transporter_Id = transporter_Id;
    }
    
    public HashMap<FirstAidKit, String> getFirstAidKitsTotalQuantity() {
        return FirstAidKitsTotalQuantity;
    }

    public String getOrder_id() {
        return request_Id;
    }

    public void setOrder_id(String request_Id) {
        this.request_Id = request_Id;
    }

    public void setFirstAidKitsTotalQuantity(HashMap<FirstAidKit, String> FirstAidKitsTotalQuantity) {
        this.FirstAidKitsTotalQuantity = FirstAidKitsTotalQuantity;
    }

    public String getRequest_processing_status() {
        return request_processing_status;
    }

    public void setRequest_processing_status(String request_processing_status) {
        this.request_processing_status = request_processing_status;
    }
    
    
     public void addItemToOrder(FirstAidKit medSupEquip, String quantity){
         FirstAidKitsTotalQuantity.put(medSupEquip, quantity);
     }
    
     public void total_request_Amount(){
         int current_request_Amount = 0;
         for(HashMap.Entry<FirstAidKit, String> set: FirstAidKitsTotalQuantity.entrySet()){
             
             current_request_Amount += Integer.parseInt(set.getKey().getFirst_Aid_Cost())*Integer.parseInt(set.getValue());
         }
         requested_supply_Amount = String.valueOf(current_request_Amount);
     }
     
    @Override
     public String toString(){
         return request_Id;
     }
}
