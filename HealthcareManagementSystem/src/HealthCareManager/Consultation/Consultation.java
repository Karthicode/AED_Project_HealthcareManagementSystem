/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Consultation;

/**
 *
 * @author harshithnarahari
 */
public class Consultation {
 
    String test_name;
    String test_price;

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public String getTest_price() {
        return test_price;
    }

    public void setTest_price(String test_price) {
        this.test_price = test_price;
    }
    
    @Override
    public String toString(){
        return test_name;
    }
}
