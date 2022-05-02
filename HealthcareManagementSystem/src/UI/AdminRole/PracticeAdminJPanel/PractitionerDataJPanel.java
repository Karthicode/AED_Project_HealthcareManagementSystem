/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole.PracticeAdminJPanel;


import HealthCareManager.ResponseManager.FirstResponderDirectory;
import WorkerProvider.Worker;
import IntegrationSystem.HealthcareSystemOrganizationIntegration;

import HealthCareSystem.Directorate.DirectorateDirectory;
import HealthCareSystem.Directorate.Directorate;
import HealthCareManager.ResponseManager.FirstResponderDirectory;
import HealthCareManager.ResponseManager.ResponseTeamManager;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiries;


import HealthCareMainSystem.UserRoles.DirectorateRole;
import HealthCareMainSystem.UserRoles.FirstAidAgencyRole;
import HealthCareMainSystem.UserRoles.FirstResponderRole;
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
public class PractitionerDataJPanel extends javax.swing.JPanel {

    /**
     * 
     */
    JPanel userProcessContainer;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    DirectorateDirectory directorateDirectory;
    FirstResponderDirectory firstResponderDirectory;
    ConsumerRecords consumerRecords;
    EnterpriseUserDirectory UserAccountDirectory;
    PartnerInfirmiries infirmiries;
    public PractitionerDataJPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration medicalServiceCentralisationEcoSystem, PartnerInfirmiries infirmiries) {
        
        this.userProcessContainer = userProcessContainer;
        this.healthcareSystemOrganizationIntegration = medicalServiceCentralisationEcoSystem;
        this.infirmiries = infirmiries;
        initComponents();
        if(infirmiries.getAccountantDirectory()== null)
           infirmiries.setAccountantDirectory(new DirectorateDirectory());
        if(infirmiries.getFrontDeskOperatorDirectory()== null)
           infirmiries.setFrontDeskOperatorDirectory(new FirstResponderDirectory());
        
        insertRoleBasedSelectionBox();
        insertDataJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jTextFieldEmpName = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        Password = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jTextFieldEmpID = new javax.swing.JTextField();
        jLabelDesignation = new javax.swing.JLabel();
        DesignationToggle = new javax.swing.JComboBox<>();
        jLabelUniqueID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        bgdimg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setPreferredSize(new java.awt.Dimension(1920, 1183));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Hospital Admin");
        add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 810, 100));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Designation", "Password"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 760, 90));

        jButtonCreate.setBackground(new java.awt.Color(22, 81, 129));
        jButtonCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, 120, 30));
        add(jTextFieldEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 351, -1));

        jButtonUpdate.setBackground(new java.awt.Color(22, 81, 129));
        jButtonUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 670, -1, -1));

        Password.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Password.setText("Password:");
        add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 130, -1));

        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });
        add(jTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 351, 26));

        jTextFieldEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpIDActionPerformed(evt);
            }
        });
        add(jTextFieldEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 351, -1));

        jLabelDesignation.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelDesignation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelDesignation.setText("Designation :");
        add(jLabelDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 130, -1));

        DesignationToggle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DesignationToggle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse" }));
        add(DesignationToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 130, -1));

        jLabelUniqueID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelUniqueID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelUniqueID.setText("Unique ID: ");
        add(jLabelUniqueID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 140, -1));

        jButtonDelete.setBackground(new java.awt.Color(22, 81, 129));
        jButtonDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, -1, -1));

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelName.setText("Name :");
        add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/_115891627739whel2jtx7___1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 990));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"hospitalAdminWorkAreaJPanel");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jTextFieldEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpIDActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = field_Validation();
        EnterpriseUserDirectory usersList = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        if(usersList.verifyUserUnique(user_input.get(0))){
            
            
            if(user_input.get(2) == "FrontDeskOperator"){

                consumerRecords = new ConsumerRecords(user_input.get(0), user_input.get(3), new FirstAidAgencyRole());
                usersList.addConsumerData(consumerRecords);
                ResponseTeamManager frontDeskOperator = new ResponseTeamManager();
                frontDeskOperator.setResponseTeamManager_Id(user_input.get(0));
                frontDeskOperator.setResponseTeamManager_Name(user_input.get(1));                
                firstResponderDirectory.addFrontDeskOperator(user_input.get(0), frontDeskOperator);
                infirmiries.setFrontDeskOperatorDirectory(firstResponderDirectory);
                consumerRecords.setInfirmiries(infirmiries);
            }
            if(user_input.get(2) == "Accountant"){

                consumerRecords = new ConsumerRecords(user_input.get(0), user_input.get(3),new DirectorateRole());
                usersList.addConsumerData(consumerRecords);
                Directorate accountant = new Directorate();
                accountant.setDirectorateId(user_input.get(0));
                accountant.setDirectorate_Name(user_input.get(1));  
                directorateDirectory.addDirectorate(user_input.get(0), accountant);
                infirmiries.setAccountantDirectory(directorateDirectory);
                consumerRecords.setInfirmiries(infirmiries);
            }
            
            JOptionPane.showMessageDialog(this, "New Employee Information has been added.");
            model.addRow(new Object[]{consumerRecords,user_input.get(1),user_input.get(2),user_input.get(3)});
            clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);        
        UserAccountDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        ArrayList<ConsumerRecords> userAccountList = UserAccountDirectory.get_User_Details();
        for(ConsumerRecords userAccount: userAccountList)
        {
            if(userAccount.getEmail_Id().equals(select_account_details.getEmail_Id()))
            {
                PartnerInfirmiries infirmiries = userAccount.getInfirmiries();
                ArrayList<String> user_input = field_Validation();
//                model.setValueAt(user_input.get(1), selected_row_ix, 0);
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
//                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                model.setValueAt(user_input.get(3), selected_row_ix, 3);
                UserAccountDirectory.updateEnterpriseUser(configure_input_data(userAccount, user_input));
                break;
            }
        }   
        
//        healthcareSystemOrganizationIntegration.setRestaurantDirectory(restaurantDirectory);
        JOptionPane.showMessageDialog(this, "Values updated");
//        insertDataJTable();
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        UserAccountDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        UserAccountDirectory.removeConsumerRecord(select_user_account_details);
//        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        insertDataJTable();
        clearFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        DesignationToggle.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        jTextFieldEmpID.setEditable(false);
        jTextFieldEmpID.setText(select_user_account_details.getEmail_Id());
        
        Role role = select_user_account_details.getRole();
        System.out.println("role.toString(): "+role.toString());
        DesignationToggle.setSelectedItem(role.toString()); 
        
        
        if(role.toString().equals("FrontDeskOperator")){
            PartnerInfirmiries hospital = select_user_account_details.getInfirmiries();
            firstResponderDirectory = hospital.getFrontDeskOperatorDirectory();
            HashMap<String, ResponseTeamManager> frontDeskOperatorList = firstResponderDirectory.getFirstRespondersList();
            ResponseTeamManager frontDeskOperator = frontDeskOperatorList.get(select_user_account_details.getEmail_Id());
            jTextFieldEmpName.setText(frontDeskOperator.getResponseTeamManager_Name());
        }
        else if(role.toString().equals("Accountant")){
            PartnerInfirmiries infirmaries = select_user_account_details.getInfirmiries();
            directorateDirectory = infirmaries.getAccountantDirectory();
            HashMap<String, Directorate> accountantList = directorateDirectory.getDirectorateList();
            Directorate accountant = accountantList.get(select_user_account_details.getEmail_Id());
            jTextFieldEmpName.setText(accountant.getDirectorate_Name());
        }
        
        jTextPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private ConsumerRecords configure_input_data(ConsumerRecords userAccount, ArrayList<String> user_input) {
//        consumerRecords.getEmployee().setEmployee_id(user_input.get(0));
//        consumerRecords.getEmployee().setEmployee_name(user_input.get(1));
        userAccount.setPassword(user_input.get(3));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldEmpID.setText("");
        jTextFieldEmpName.setText("");
        jTextPassword.setText("");
        DesignationToggle.setSelectedItem("");
    }
    
    public ArrayList<String> field_Validation(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextFieldEmpID.getText();
        String user_emp_name = jTextFieldEmpName.getText();
        String user_password = jTextPassword.getText();
        String user_role = (String) DesignationToggle.getSelectedItem();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        else if(user_role.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select a Role.");
        }
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_role);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DesignationToggle;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDesignation;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUniqueID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldEmpID;
    private javax.swing.JTextField jTextFieldEmpName;
    private javax.swing.JTextField jTextPassword;
    // End of variables declaration//GEN-END:variables

    

    private void insertRoleBasedSelectionBox() {
        DesignationToggle.removeAllItems();
        DesignationToggle.addItem("");
        DesignationToggle.addItem("FrontDeskOperator");
        DesignationToggle.addItem("Accountant");
    }

    private void insertDataJTable() {
        directorateDirectory = infirmiries.getAccountantDirectory();
        firstResponderDirectory = infirmiries.getFrontDeskOperatorDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
//        ArrayList<Accountant> accountantList = directorateDirectory.getAccountantList();
//        for(Accountant accountant: accountantList)
//        {
//            model.addRow(new Object[]{accountant.getUserAccount(),accountant.getUserAccount().getEmployee().getEmployee_name(),"Accountant",accountant.getUserAccount().getPassword()});
//        }
        EnterpriseUserDirectory userAccountDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        ArrayList<ConsumerRecords> usersList = userAccountDirectory.get_User_Details();
//        hospitalDirectory = healthcareSystemOrganizationIntegration.getHospitalDirectory();
        
        model.setRowCount(0);
//        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        for(ConsumerRecords userAccount: usersList)
        {   
            System.out.println("userAccount.getRole().toString(): "+userAccount.getRole().toString());
            if(userAccount.getRole().toString() == "FrontDeskOperator" && userAccount.getInfirmiries().equals(infirmiries)){
                
                firstResponderDirectory = infirmiries.getFrontDeskOperatorDirectory();
                HashMap<String, ResponseTeamManager> frontDeskOperatorList = firstResponderDirectory.getFirstRespondersList();
                ResponseTeamManager frontDeskOperator = frontDeskOperatorList.get(userAccount.getEmail_Id());
                model.addRow(new Object[]{userAccount,frontDeskOperator.getResponseTeamManager_Name(),userAccount.getRole(),userAccount.getPassword()});
            }
            else if(userAccount.getRole().toString() == "Accountant" && userAccount.getInfirmiries().equals(infirmiries)){
                
                directorateDirectory = infirmiries.getAccountantDirectory();
                HashMap<String, Directorate> accountantList = directorateDirectory.getDirectorateList();
                Directorate accountant = accountantList.get(userAccount.getEmail_Id());
                model.addRow(new Object[]{userAccount,accountant.getDirectorate_Name(),userAccount.getRole(),userAccount.getPassword()});
            }
        }
        jTableEmployee.setModel(model);
    }
    
    
}
