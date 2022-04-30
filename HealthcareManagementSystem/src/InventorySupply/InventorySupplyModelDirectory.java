/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySupply;

import java.util.ArrayList;

/**

 * @author karthik

 */
public class InventorySupplyModelDirectory {
    
    ArrayList<InventorySupply> Inventories_Supply_List = new ArrayList<>();

    public ArrayList<InventorySupply> getInventories_Supply_List() {
        return Inventories_Supply_List;
    }

    public void setInventories_Supply_List(ArrayList<InventorySupply> Inventories_Supply_List) {
        this.Inventories_Supply_List = Inventories_Supply_List;
    }
    public InventorySupplyModelDirectory() {
    }

    public void addMedSupWarehouse(InventorySupply medSupWarehouse) {
        Inventories_Supply_List.add(medSupWarehouse);
    }

    public void updateMedSupWarehouse(ArrayList<String> input_Var, InventorySupply new_updated_Inventories) {
        
        for(InventorySupply inventories: Inventories_Supply_List)
        {
            if(inventories.getInventorySupply_Id().equals(new_updated_Inventories.getInventorySupply_Id()))
            {   
                inventories.setInventory_Location_Name(input_Var.get(1));
                break;
            }
        }
    }

    public void deleteMedSupWarehouse(InventorySupply chosen_Inventory) {
        for(InventorySupply medSupWarehouse: Inventories_Supply_List)
        {
            if(medSupWarehouse.getInventorySupply_Id().equals(chosen_Inventory.getInventorySupply_Id()))
            {   
                Inventories_Supply_List.remove(medSupWarehouse);
                break;
            }
        }
    }
    
}
