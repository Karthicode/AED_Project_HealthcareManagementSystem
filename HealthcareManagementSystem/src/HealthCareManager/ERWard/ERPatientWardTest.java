/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.ERWard;

import HealthCareManager.Consultation.Consultation;
import java.util.HashMap;

/**
 *
 * @author karthik
 */
public class ERPatientWardTest {
    
    private String test_date;
    private String test_success_report;
    private String feedback_presence_duration;
    private String report_id;
    Consultation consultation;
    HashMap<String, Consultation> er_ward_List = new HashMap<>();

    public String getTest_date() {
        return test_date;
    }

    public void setTest_date(String test_date) {
        this.test_date = test_date;
    }

    public HashMap<String, Consultation> getEr_ward_List() {
        return er_ward_List;
    }

    public void setEr_ward_List(HashMap<String, Consultation> er_ward_List) {
        this.er_ward_List = er_ward_List;
    }

    public String getTest_success_report() {
        return test_success_report;
    }

    public void setTest_success_report(String test_success_report) {
        this.test_success_report = test_success_report;
    }

    public String getReport_id() {
        return report_id;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public String getFeedback_presence_duration() {
        return feedback_presence_duration;
    }

    public void setFeedback_presence_duration(String feedback_presence_duration) {
        this.feedback_presence_duration = feedback_presence_duration;
    }
    
    
}
