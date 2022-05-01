/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.ERWard;

import HealthCareManager.Consultation.Consultation;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author karthik
 */
public class ERPatient {
 
    
    private String patient_id;
    private String patient_name;
    private String patient_phone_number;
    private String patient_email;

    ArrayList<ERPatientWardTest> patientTestList = new ArrayList<>();
    ArrayList<ERPatientDispatches> patientOrderList = new ArrayList<>();
    
    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_phone_number() {
        return patient_phone_number;
    }

    public void setPatient_phone_number(String patient_phone_number) {
        this.patient_phone_number = patient_phone_number;
    }

    public String getPatient_email() {
        return patient_email;
    }

    public void setPatient_email(String patient_email) {
        this.patient_email = patient_email;
    }

    public ArrayList<ERPatientWardTest> getPatientTestList() {
        return patientTestList;
    }

    public void setPatientTestList(ArrayList<ERPatientWardTest> patientTestList) {
        this.patientTestList = patientTestList;
    }

    public ArrayList<ERPatientDispatches> getPatientOrderList() {
        return patientOrderList;
    }

    public void setPatientOrderList(ArrayList<ERPatientDispatches> patientOrderList) {
        this.patientOrderList = patientOrderList;
    }
    
    @Override
    public String toString(){
        return patient_id;
    }
    
    public void updateReportStatus(String test_id){
        for(ERPatientWardTest patientTest: patientTestList){
                if(patientTest.getReport_id().equals(test_id)){
                    patientTest.setTest_success_report("yes");
                    int ix = patientTestList.indexOf(patientTest);
                    patientTestList.set(ix, patientTest);
                    
                }
            }
    }
    
}
