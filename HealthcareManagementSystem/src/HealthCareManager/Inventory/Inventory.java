/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Inventory;

import IntegrationSystem.ConsumerRecords;

/**
 *
 * @author karthik karthik
 */
public class Inventory {
    
   private String inventory_Id;
   private String inventory_Admin_Name;
    
    public String getInventory_Id() {
        return inventory_Id;
    }


    public void setInventory_Id(String inventory_Id) {    
        this.inventory_Id = inventory_Id;
    }

    public String getInventory_Admin_Name() {
        return inventory_Admin_Name;
    }

    public void setInventory_Admin_Name(String inventory_Admin_Name) {
        this.inventory_Admin_Name = inventory_Admin_Name;
    }
    
    
    @Override
    public String toString(){
        return inventory_Id;
    }

    
}
