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
import HospitalManagement.ServiceTeam.ServiceTeamModelDirectory;

import HealthCareManager.ResponseManager.FirstResponderDirectory;
import HealthCareSystem.Directorate.DirectorateDirectory;
import HealthCareManager.ERWard.ERPatientModel;
import HealthCareManager.Consultation.ConsultationTestResults;
import HealthCareManager.Inventory.Inventory;
import HealthCareManager.SupplyStore.supplyEquipmentDispatchModel;
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
   private  PractitionerDirectory doctorDirectory;
   private MedicalAdvisorDirectory nurseDirectory;
   private EmergencyProviderDirectory radiologistDirectory;
   private SpecialistModelDirectory pathologistDirectory;
   private ServiceTeamModelDirectory technicianDirectory;
   private EnterpriseUserDirectory UserAccountDirectory;
   private ERPatientModel patientDirectory;
//    HashMap<String, String> labTests = new HashMap<>();
   private  ConsultationTestResults labTestDirectory;
    
    private  Inventory medSupEquipAdmin;
    private supplyEquipmentDispatchModel medSupEquipInternalDirectory;
    //    UserAccount userAccount;

    
    public PartnerInfirmiries(String hospitalId, String hospitalName, String hospitalpincode){
        this.infirmaryId = hospitalId;
        this.infirmary_Name = hospitalName;
        this.infirmary_postcode = hospitalpincode;
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

    public EmergencyProviderDirectory getRadiologistDirectory() {
        return radiologistDirectory;
    }

    public void setRadiologistDirectory(EmergencyProviderDirectory radiologistDirectory) {
        this.radiologistDirectory = radiologistDirectory;
    }

    public SpecialistModelDirectory getPathologistDirectory() {
        return pathologistDirectory;
    }

    public void setPathologistDirectory(SpecialistModelDirectory pathologistDirectory) {
        this.pathologistDirectory = pathologistDirectory;
    }

    public ServiceTeamModelDirectory getTechnicianDirectory() {
        return technicianDirectory;
    }

    public void setTechnicianDirectory(ServiceTeamModelDirectory technicianDirectory) {
        this.technicianDirectory = technicianDirectory;
    }

    public ConsultationTestResults getLabTestDirectory() {
        return labTestDirectory;
    }

    public void setLabTestDirectory(ConsultationTestResults labTestDirectory) {
        this.labTestDirectory = labTestDirectory;
    }

    public ERPatientModel getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ERPatientModel patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public supplyEquipmentDispatchModel getMedSupEquipInternalDirectory() {
        return medSupEquipInternalDirectory;
    }

    public void setMedSupEquipInternalDirectory(supplyEquipmentDispatchModel medSupEquipInternalDirectory) {
        this.medSupEquipInternalDirectory = medSupEquipInternalDirectory;
    }

    public Inventory getMedSupEquipAdmin() {
        return medSupEquipAdmin;
    }

    public void setMedSupEquipAdmin(Inventory medSupEquipAdmin) {
        this.medSupEquipAdmin = medSupEquipAdmin;
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
