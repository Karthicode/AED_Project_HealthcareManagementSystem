/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole.PracticeAdminJPanel;


import HealthCareManager.Pharmacist.MedicalAdvisorDirectory;
import WorkerProvider.Worker;
import IntegrationSystem.HealthcareSystemOrganizationIntegration;

import HealthCareSystem.Directorate.DirectorateDirectory;
import HealthCareSystem.Directorate.Directorate;
import HealthCareManager.Practitioner.CertifiedPractitioner;
import HealthCareManager.Practitioner.PractitionerDirectory;
import HealthCareManager.Pharmacist.MedicalAdvisor;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiries;


import HealthCareMainSystem.UserRoles.DirectorateRole;
import HealthCareMainSystem.UserRoles.CertifiedPractitionerRole;
import HealthCareMainSystem.UserRoles.MedicalAdvisorRole;
import HealthCareMainSystem.UserRoles.Role;

import IntegrationSystem.ConsumerRecords;
import IntegrationSystem.EnterpriseUserDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *  
 * @author harshithnarahari
 */
public class FindPractitionerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel JPanelProcessContainer;
    HealthcareSystemOrganizationIntegration hospitalManagementEcoSystem;
    PractitionerDirectory doctorDirectory;
    MedicalAdvisorDirectory nurseDirectory;
    ConsumerRecords userAccount;
    EnterpriseUserDirectory UserAccountDirectory;
    PartnerInfirmiries hospital;
    public FindPractitionerJPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration hospitalManagementEcoSystem, PartnerInfirmiries hospital) {
        
        this.JPanelProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
        this.hospital = hospital;
        initComponents();
        if(hospital.getDoctorDirectory()== null)
           hospital.setDoctorDirectory(new PractitionerDirectory());
        if(hospital.getNurseDirectory()== null)
           hospital.setNurseDirectory(new MedicalAdvisorDirectory());
        
        insertRoleBasedSelectionBox();
        insertDataToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextName = new javax.swing.JTextField();
        jTextD = new javax.swing.JTextField();
        Designation = new javax.swing.JLabel();
        DesignationToggle = new javax.swing.JComboBox<>();
        jLabelID = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Accounts Search");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 706, -1));

        jButton2.setBackground(new java.awt.Color(0, 70, 169));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 40));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Department"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 787, 217));

        jButtonSearch.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButtonSearch.setText("SEARCH");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));
        add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 351, -1));

        jTextD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDActionPerformed(evt);
            }
        });
        add(jTextD, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 351, -1));

        Designation.setForeground(new java.awt.Color(255, 255, 255));
        Designation.setText("Designation:");
        add(Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 104, -1));

        DesignationToggle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse" }));
        DesignationToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesignationToggleActionPerformed(evt);
            }
        });
        add(DesignationToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("ID:");
        add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 104, -1));

        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Name:");
        add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) JPanelProcessContainer.getLayout();
            crdLyt.show(JPanelProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = validate_Undefined_Fields();
        EnterpriseUserDirectory usersList = hospitalManagementEcoSystem.getUserAccDirectory();
        
        if(usersList.verifyUserUnique(user_input.get(0))){
            
            
            if(user_input.get(2) == "Doctor"){

                userAccount = new ConsumerRecords(user_input.get(0), user_input.get(3), new CertifiedPractitionerRole());
                usersList.addConsumerData(userAccount);
                CertifiedPractitioner doctor = new CertifiedPractitioner();
                doctor.setPractitionerId(user_input.get(0));
                doctor.setPractitioner_Name(user_input.get(1));                
                doctorDirectory.addDoctor(user_input.get(0), doctor);
                hospital.setDoctorDirectory(doctorDirectory);
                userAccount.setInfirmiries(hospital);
            }
            if(user_input.get(2) == "Nurse"){

                userAccount = new ConsumerRecords(user_input.get(0), user_input.get(3), new MedicalAdvisorRole());
                usersList.addConsumerData(userAccount);
                MedicalAdvisor nurse = new MedicalAdvisor();
                nurse.setAdvisorId(user_input.get(0));
                nurse.setAdvisorName(user_input.get(1));                
                nurseDirectory.addAdvisor(user_input.get(0), nurse);
                hospital.setNurseDirectory(nurseDirectory);
                userAccount.setInfirmiries(hospital);
            }
            
            JOptionPane.showMessageDialog(this, "New Employee Information has been added.");
            model.addRow(new Object[]{userAccount,user_input.get(1),user_input.get(2),user_input.get(3)});
            clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }                 
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonSearch.setEnabled(false);
        DesignationToggle.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        jTextD.setEditable(false);
        jTextD.setText(select_user_account_details.getEmail_Id());
        
        Role role = select_user_account_details.getRole();
        System.out.println("role.toString(): "+role.toString());
        DesignationToggle.setSelectedItem(role.toString()); 
        
        
        if(role.toString().equals("Nurse")){
            PartnerInfirmiries hospital = select_user_account_details.getInfirmiries();
            nurseDirectory = hospital.getNurseDirectory();
            HashMap<String, MedicalAdvisor> nurseList = nurseDirectory.getAdvisorList();
            MedicalAdvisor nurse = nurseList.get(select_user_account_details.getEmail_Id());
            jTextName.setText(nurse.getAdvisorName());
        }
        else if(role.toString().equals("Doctor")){
            PartnerInfirmiries hospital = select_user_account_details.getInfirmiries();
            doctorDirectory = hospital.getDoctorDirectory();
            HashMap<String, CertifiedPractitioner> doctorList = doctorDirectory.getPractitioners();
            CertifiedPractitioner doctor = doctorList.get(select_user_account_details.getEmail_Id());
            jTextName.setText(doctor.getPractitioner_Name());
        }
        
//        jTextFieldPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked

    private void DesignationToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesignationToggleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesignationToggleActionPerformed
    private ConsumerRecords set_user_input_values(ConsumerRecords userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
//        userAccount.getEmployee().setEmployee_name(user_input.get(1));
        userAccount.setPassword(user_input.get(3));
        return userAccount;
    }
    private void clearFields(){
        jTextD.setText("");
        jTextName.setText("");
        DesignationToggle.setSelectedItem("");
    }
    
    public ArrayList<String> validate_Undefined_Fields(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextD.getText();
        String user_emp_name = jTextName.getText();
//        String user_password = jTextFieldPassword.getText();
        String user_role = (String) DesignationToggle.getSelectedItem();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
//        else if(user_password.isEmpty()){
//            JOptionPane.showMessageDialog(this, "Please enter a Password.");
//        }
//        else if(user_role.isEmpty()){
//            JOptionPane.showMessageDialog(this, "Please select a Role.");
//        }
//        
//        user_input.add(user_emp_id);
//        user_input.add(user_emp_name);
//        user_input.add(user_role);
//        user_input.add(user_password);
//        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Designation;
    private javax.swing.JComboBox<String> DesignationToggle;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextD;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables

    

    private void insertRoleBasedSelectionBox() {
        DesignationToggle.removeAllItems();
        DesignationToggle.addItem("");
        DesignationToggle.addItem("Nurse");
        DesignationToggle.addItem("Doctor");
    }

    private void insertDataToJTable() {
        doctorDirectory = hospital.getDoctorDirectory();
        nurseDirectory = hospital.getNurseDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
//        ArrayList<Accountant> accountantList = accountantDirectory.getAccountantList();
//        for(Accountant accountant: accountantList)
//        {
//            model.addRow(new Object[]{accountant.getUserAccount(),accountant.getUserAccount().getEmployee().getEmployee_name(),"Accountant",accountant.getUserAccount().getPassword()});
//        }
        EnterpriseUserDirectory userAccountDirectory = hospitalManagementEcoSystem.getUserAccDirectory();
        ArrayList<ConsumerRecords> usersList = userAccountDirectory.get_User_Details();
//        hospitalDirectory = hospitalManagementEcoSystem.getHospitalDirectory();
        
        model.setRowCount(0);
//        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        for(ConsumerRecords userAccount: usersList)
        {   
            if(userAccount.getRole().toString() == "Nurse" && userAccount.getInfirmiries().equals(hospital)){
                
                nurseDirectory = hospital.getNurseDirectory();
                HashMap<String, MedicalAdvisor> nurseList = nurseDirectory.getAdvisorList();
                MedicalAdvisor nurse = nurseList.get(userAccount.getEmail_Id());
                model.addRow(new Object[]{userAccount,nurse.getAdvisorName(),userAccount.getRole(),userAccount.getPassword()});
            }
            else if(userAccount.getRole().toString() == "Doctor" && userAccount.getInfirmiries().equals(hospital)){
                
                doctorDirectory = hospital.getDoctorDirectory();
                HashMap<String, CertifiedPractitioner> doctorList = doctorDirectory.getPractitioners();
                CertifiedPractitioner doctor = doctorList.get(userAccount.getEmail_Id());
                model.addRow(new Object[]{userAccount,doctor.getPractitioner_Name(),userAccount.getRole(),userAccount.getPassword()});
            }
        }

        jTableEmployee.setModel(model);
    }
    
    
}
