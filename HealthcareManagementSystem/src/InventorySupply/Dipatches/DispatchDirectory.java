/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySupply.Dipatches;

import java.util.ArrayList;


/**
 *
 * @author Rishi
 */
public class DispatchDirectory {
    
    ArrayList<DispatchRequest> dispatch_List = new ArrayList<>();
    String last_order_id = "ORDER001";
    public String getLast_order_id() {
        return last_order_id;
    }

    public void setLast_order_id(String last_order_id) {
        this.last_order_id = last_order_id;
    }
    
    public ArrayList<DispatchRequest> getDispatch_List() {
        return dispatch_List;
    }

    public void setDispatch_List(ArrayList<DispatchRequest> dispatch_List) {
        this.dispatch_List = dispatch_List;
    }
    
    public void addOrder(DispatchRequest order){
        dispatch_List.add(order);
    }
    
   

   
    
    
}
