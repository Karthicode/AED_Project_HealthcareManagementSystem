/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.PartnerInfirmaries;

import IntegrationSystem.ConsumerRecords;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */
public class PartnerInfirmiriesDirectory {
    
    ArrayList<PartnerInfirmiries> hospitalList = new ArrayList<>();

    public ArrayList<PartnerInfirmiries> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<PartnerInfirmiries> hospitalList) {
        this.hospitalList = hospitalList;
    }
    public PartnerInfirmiriesDirectory() {
    }

    public void addHospital(PartnerInfirmiries hospital) {
        hospitalList.add(hospital);
    }

    public void updateHospital(ArrayList<String> user_input, PartnerInfirmiries updated_hospital) {
        
        for(PartnerInfirmiries hospital: hospitalList)
        {
            if(hospital.getInfirmaryId().equals(updated_hospital.getInfirmaryId()))
            {   
                hospital.setInfirmary_Name(user_input.get(1));
                hospital.setInfirmary_postcode(user_input.get(2));
                break;
            }
        }
    }

    public void deleteHospital(PartnerInfirmiries selected_hospital) {
        for(PartnerInfirmiries hospital: hospitalList)
        {
            if(hospital.getInfirmaryId().equals(selected_hospital.getInfirmaryId()))
            {   
                hospitalList.remove(hospital);
                break;
            }
        }
    }
    
}
