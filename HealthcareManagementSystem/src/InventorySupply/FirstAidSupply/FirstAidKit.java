/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySupply.FirstAidSupply;


/**
 *
 * @author Rishi
 */
public class FirstAidKit {
 
    private String first_Aid_Type_Id;
    private String first_Aid_Name;
    private String first_Aid_Cost;
    private String first_Aid_Number;
    
    
    public String getFirst_Aid_Name() {
        return first_Aid_Name;
    }

    public void setFirst_Aid_Name(String first_Aid_Name) {
        this.first_Aid_Name = first_Aid_Name;
    }

    public String getFirst_Aid_Cost() {
        return first_Aid_Cost;
    }

    public void setFirst_Aid_Cost(String first_Aid_Cost) {
        this.first_Aid_Cost = first_Aid_Cost;
    }

    public String getFirst_Aid_Number() {
        return first_Aid_Number;
    }

    public void setFirst_Aid_Number(String first_Aid_Number) {
        this.first_Aid_Number = first_Aid_Number;
    }

    public String getFirst_Aid_Type_Id() {
        return first_Aid_Type_Id;
    }

    public void setFirst_Aid_Type_Id(String first_Aid_Type_Id) {
        this.first_Aid_Type_Id = first_Aid_Type_Id;
    }
    
    @Override
    public String toString(){
        return first_Aid_Name;
    }
}
