/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.ERWard;

import java.util.ArrayList;

/**
 *
 * @author karthik
 */
public class ERPatientModel {

    ArrayList<ERPatient> ER_Ward_Patient_List = new ArrayList<>();

    public ArrayList<ERPatient> getER_Ward_Patient_List() {
        return ER_Ward_Patient_List;
    }

    public void setER_Ward_Patient_List(ArrayList<ERPatient> ER_Ward_Patient_List) {
        this.ER_Ward_Patient_List = ER_Ward_Patient_List;
    }
    
    public void addTest(ERPatient patient){
        ER_Ward_Patient_List.add(patient);
    }

    public void updatePatient(String patient_id){
        
        for(ERPatient patient: ER_Ward_Patient_List){
            if(patient.getPatient_id().equals(patient_id)){
                int ix = ER_Ward_Patient_List.indexOf(patient);
                ER_Ward_Patient_List.set(ix, patient);
            }
        }
    }
}
