/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySupply;

import IntegrationSystem.EnterpriseUserDirectory;
import InventorySupply.FirstAidSupply.FirstAidKitDirectory;
import InventorySupply.Dipatches.DispatchDirectory;

import java.util.HashMap;

/**
 *
 * @author Rishi
 */
public class InventorySupply {
    
    private String InventorySupply_Id;
    private String Inventory_Location_Name;
    FirstAidKitDirectory Inventory_Stock_Directory;
    EnterpriseUserDirectory UserAccountDirectory;
    DispatchDirectory orderDirectory;
    
    
    
    public InventorySupply(String medSupWarehouseId, String medSupWarehouseName){
        this.InventorySupply_Id = medSupWarehouseId;
        this.Inventory_Location_Name = medSupWarehouseName;
    }
    
    public String getInventory_Location_Name() {
        return Inventory_Location_Name;
    }

    public void setInventory_Location_Name(String Inventory_Location_Name) {
        this.Inventory_Location_Name = Inventory_Location_Name;
    }
    
    
    
     public String getInventorySupply_Id() {
        return InventorySupply_Id;
    }

    public void setInventorySupply_Id(String InventorySupply_Id) {
        this.InventorySupply_Id = InventorySupply_Id;
    }

    public FirstAidKitDirectory getInventory_Stock_Directory() {
        return Inventory_Stock_Directory;
    }

    public void setInventory_Stock_Directory(FirstAidKitDirectory Inventory_Stock_Directory) {
        this.Inventory_Stock_Directory = Inventory_Stock_Directory;
    }

    public DispatchDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(DispatchDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return Inventory_Location_Name;
    }
    
}
