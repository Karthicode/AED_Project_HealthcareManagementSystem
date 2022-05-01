/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.ERWard;

/**
 *
 * @author karthik
 */
public class ERPatientDispatches {
    
    private String dispatchER_Date;
    
    private String dispatch_Id;
    private String dispatch_Item;
    private String dispatch_ER_Count;

    public String getDispatch_ER_Count() {
        return dispatch_ER_Count;
    }

    public void setDispatch_ER_Count(String dispatch_ER_Count) {
        this.dispatch_ER_Count = dispatch_ER_Count;
    }
    
    public String getDispatchER_Date() {
        return dispatchER_Date;
    }

    public void setDispatchER_Date(String dispatchER_Date) {
        this.dispatchER_Date = dispatchER_Date;
    }
    
    public String getDispatch_Item() {
        return dispatch_Item;
    }

    public void setDispatch_Item(String dispatch_Item) {
        this.dispatch_Item = dispatch_Item;
    }


    

    public String getDispatch_Id() {
        return dispatch_Id;
    }

    public void setDispatch_Id(String dispatch_Id) {
        this.dispatch_Id = dispatch_Id;
    }

   

    
}
