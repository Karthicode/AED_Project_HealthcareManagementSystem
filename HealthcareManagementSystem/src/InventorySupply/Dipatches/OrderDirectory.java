/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySupply.Dipatches;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Rishi
 */


public class OrderDirectory {
    
    ArrayList<DispatchRequest> orderList = new ArrayList<>();
    String last_order_id = "ORDER001";
    public String getLast_order_id() {
        return last_order_id;
    }

    public void setLast_order_id(String last_order_id) {
        this.last_order_id = last_order_id;
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
    
   

   
    
    
}
