/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCareManager.PartnerInfirmaries;

import IntegrationSystem.EnterpriseUserDirectory;
import HealthCareManager.Practitioner.PractitionerDirectory;
import HealthCareManager.Pharmacist.MedicalAdvisorDirectory;
import HealthCareManager.Emergency.EmergencyProviderDirectory;
import HealthCareManager.Specialist.SpecialistModelDirectory;
import HealthCareManager.ServicesProvider.ServiceProviderDirectory;

import HealthCareManager.ResponseManager.FirstResponderDirectory;
import HealthCareSystem.Directorate.DirectorateDirectory;
import HealthCareManager.ERWard.ERPatientModel;
import HealthCareManager.Consultation.ConsultationTestResults;
import HealthCareManager.Inventory.Inventory;
import HealthCareManager.SupplyStore.EquipmentSupplyStore;
import java.util.HashMap;

/**
 *
 * @author karthik 
 */
public class PartnerInfirmiries {
    
   private String infirmaryId;
   private String infirmary_Name;
   private String infirmary_postcode;
   private FirstResponderDirectory frontDeskOperatorDirectory;
   private DirectorateDirectory accountantDirectory;
   private PractitionerDirectory doctorDirectory;
   private MedicalAdvisorDirectory nurseDirectory;
   private EmergencyProviderDirectory emergencyProviderDirectory;
   private SpecialistModelDirectory specialistModelDirectory;
   private ServiceProviderDirectory technicianDirectory;
   private EnterpriseUserDirectory UserAccountDirectory;
   private ERPatientModel patientDirectory;

   private  ConsultationTestResults labTestDirectory;  
   private  Inventory inventory;
   private MedSupEquipInternalDirectory medSupEquipInternalDirectory;

    
    public PartnerInfirmiries(String infirmiryid, String infirmiry_name, String hospital_postcode){
        this.infirmaryId = infirmiryid;
        this.infirmary_Name = infirmiry_name;
        this.infirmary_postcode = hospital_postcode;
    }
    
    public String getInfirmary_Name() {
        return infirmary_Name;
    }

    public void setInfirmary_Name(String infirmary_Name) {
        this.infirmary_Name = infirmary_Name;
    }

    public String getInfirmary_postcode() {
        return infirmary_postcode;
    }

    public void setInfirmary_postcode(String infirmary_postcode) {
        this.infirmary_postcode = infirmary_postcode;
    }

    public FirstResponderDirectory getFrontDeskOperatorDirectory() {
        return frontDeskOperatorDirectory;
    }

    public void setFrontDeskOperatorDirectory(FirstResponderDirectory frontDeskOperatorDirectory) {
        this.frontDeskOperatorDirectory = frontDeskOperatorDirectory;
    }

    public DirectorateDirectory getAccountantDirectory() {
        return accountantDirectory;
    }

    public void setAccountantDirectory(DirectorateDirectory accountantDirectory) {
        this.accountantDirectory = accountantDirectory;
    }

    public PractitionerDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(PractitionerDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public MedicalAdvisorDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(MedicalAdvisorDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public EmergencyProviderDirectory getEmergencyProviderDirectory() {
        return emergencyProviderDirectory;
    }

    public void setEmergencyProviderDirectory(EmergencyProviderDirectory emergencyProviderDirectory) {
        this.emergencyProviderDirectory = emergencyProviderDirectory;
    }

    public SpecialistModelDirectory getSpecialistModelDirectory() {
        return specialistModelDirectory;
    }

    public void setSpecialistModelDirectory(SpecialistModelDirectory specialistModelDirectory) {
        this.specialistModelDirectory = specialistModelDirectory;
    }

    public ServiceProviderDirectory getTechnicianDirectory() {
        return technicianDirectory;
    }

    public void setTechnicianDirectory(ServiceProviderDirectory technicianDirectory) {
        this.technicianDirectory = technicianDirectory;
    }

    public ConsultationTestResults getLabTestDirectory() {
        return labTestDirectory;
    }

    public void setLabTestDirectory(ConsultationTestResults labTestDirectory) {
        this.labTestDirectory = labTestDirectory;
    }

    public ERWardDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ERWardDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public MedSupEquipInternalDirectory getMedSupEquipInternalDirectory() {
        return medSupEquipInternalDirectory;
    }

    public void setMedSupEquipInternalDirectory(MedSupEquipInternalDirectory medSupEquipInternalDirectory) {
        this.medSupEquipInternalDirectory = medSupEquipInternalDirectory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
      
     public String getInfirmaryId() {
        return infirmaryId;
    }

    public void setInfirmaryId(String infirmaryId) {
        this.infirmaryId = infirmaryId;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return infirmaryId;
    }
    
}
