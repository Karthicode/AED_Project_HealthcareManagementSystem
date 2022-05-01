/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.SupplyStore;

import InventorySupply.Dipatches.DispatchRequest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harshithnarahari
 */
public class MedSupEquipInternalDirectory {
    
    ArrayList<EquipmentSupplyStore> medSupEquipInternalList = new ArrayList<>();
    ArrayList<DispatchRequest> orderList = new ArrayList<>();
    
    public ArrayList<EquipmentSupplyStore> getMedSupEquipInternalList() {
        return medSupEquipInternalList;
    }

    public void setMedSupEquipInternalList(ArrayList<EquipmentSupplyStore> medSupEquipInternalList) {
        this.medSupEquipInternalList = medSupEquipInternalList;
    }

    public ArrayList<DispatchRequest> getOrderList() {
        return orderList;
    }
  public void setOrderList(ArrayList<DispatchRequest> orderList) {
        this.orderList = orderList;
    }

    public void addOrder(DispatchRequest order){
        orderList.add(order);
    }
    
    
    
    public void addMedSupEquip(EquipmentSupplyStore medSupEquipInternal){
        medSupEquipInternalList.add(medSupEquipInternal);
    }
    
    public EquipmentSupplyStore findMedSupEquipByName(String medSupEquip_name){
        for(EquipmentSupplyStore medSupEquipInternal: medSupEquipInternalList){
            if(medSupEquipInternal.getSupply_Item_name().equals(medSupEquip_name))
                return medSupEquipInternal;
        }
        return null;
    }
    
}
