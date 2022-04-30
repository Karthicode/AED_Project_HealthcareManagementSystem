/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.Consultation;

import java.util.ArrayList;

/**
 *
 * @author harshithnarahari
 */
public class ConsultationTestResults {
    
    ArrayList<Consultation> test_results_List = new ArrayList<>();

    public ArrayList<Consultation> getTest_results_List() {
        return test_results_List;
    }

    public void setTest_results_List(ArrayList<Consultation> test_results_List) {
        this.test_results_List = test_results_List;
    }
     
    public void addTest(Consultation specialilzed_tests){
        test_results_List.add(specialilzed_tests);
    }
    
    public Consultation findLabTestByName(String test_name){
        for(Consultation test: test_results_List){
            if(test.test_name.equals(test_name))
                return test;
        }
        return null;
    }
    
   
}
