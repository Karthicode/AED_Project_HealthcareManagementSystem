/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.SupplyStore;


/**
 *
 * @author harshithnarahari
 * 
 */

public class EquipmentSupplyStore {
 
    private String supply_Item_name;
    private String supply_quantity;
    private String supply_item_price;
    private String supply_category;

    public String getSupply_item_price() {
        return supply_item_price;
    }

    public void setSupply_item_price(String supply_item_price) {
        this.supply_item_price = supply_item_price;
    }

    public String getSupply_category() {
        return supply_category;
    }

    public void setSupply_category(String supply_category) {
        this.supply_category = supply_category;
    }
      public String getSupply_Item_name() {
        return supply_Item_name;
    }

    public void setSupply_Item_name(String supply_Item_name) {
        this.supply_Item_name = supply_Item_name;
    }

    public String getSupply_quantity() {
        return supply_quantity;
    }

    public void setSupply_quantity(String supply_quantity) {
        this.supply_quantity = supply_quantity;
    } 
    
    @Override
    public String toString(){
        return supply_Item_name;
    }
}
