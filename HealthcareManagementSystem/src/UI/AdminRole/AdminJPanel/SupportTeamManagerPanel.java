/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole.AdminJPanel;



import IntegrationSystem.HealthcareSystemOrganizationIntegration;


import HealthCareMainSystem.AdminRoles.EmergencyResponseTeamAdminRole;
import HealthCareMainSystem.UserRoles.RoleBasedAuthPanel;

import model.HelperTeam.HelperTeam;
import model.HelperTeam.HelperTeamModel;
import IntegrationSystem.ConsumerRecords;
import IntegrationSystem.EnterpriseUserDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik 
 * 
 */
public class SupportTeamManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    HealthcareSystemOrganizationIntegration medicalServiceCentralisationEcoSystem;
    HelperTeamModel helperTeamModel;

    ConsumerRecords consumers;
    EnterpriseUserDirectory enterpriseUserDirectory;

    public SupportTeamManagerPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration medicalServiceCentralisationEcoSystem) {
        
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        initComponents();
        if(medicalServiceCentralisationEcoSystem.getHelperTeamDirectory()== null)
           medicalServiceCentralisationEcoSystem.setHelperTeamDirectory(new HelperTeamModel());
        

        addDBDefaultUsers();
        InsertDataToJTable();
        
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
        CreateButton = new javax.swing.JButton();
        jTextTeamName = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jTextTeamID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Support Accounts");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 832, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 50));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Team ID", "Team Name", "Password"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 787, 110));

        CreateButton.setBackground(new java.awt.Color(0, 0, 0));
        CreateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CreateButton.setText("CREATE");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 100, 40));
        add(jTextTeamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 351, 30));

        UpdateButton.setBackground(new java.awt.Color(0, 0, 0));
        UpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 100, 40));

        jLabelPassword.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabelPassword.setText("Password:");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 104, -1));

        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });
        add(jTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 351, 26));

        jTextTeamID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTeamIDActionPerformed(evt);
            }
        });
        add(jTextTeamID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 351, 30));

        jLabelID.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabelID.setText("Team ID:");
        add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 104, -1));

        DeleteButton.setBackground(new java.awt.Color(0, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 100, 40));

        jLabelName.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabelName.setText("Team Name:");
        add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\noopu\\OneDrive\\Desktop\\Rishi\\AED\\Final project Images\\istockphoto-1242457489-612x612 (1).jpg")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jTextTeamIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTeamIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTeamIDActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        helperTeamModel = medicalServiceCentralisationEcoSystem.getHelperTeamDirectory();
        EnterpriseUserDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccDirectory();
        if(usersList.verifyUserUnique(user_input.get(0))){
            

            
            
            consumers = new ConsumerRecords(user_input.get(0), user_input.get(2), new EmergencyResponseTeamAdminRole());
            
            HelperTeam helperTeam = new HelperTeam(user_input.get(0), user_input.get(1));
            consumers.setHelperTeamDir(helperTeam);
            helperTeamModel.addCustomerSupportTeam(helperTeam);
            
            usersList.addConsumerData(consumers);
            
            JOptionPane.showMessageDialog(this, "New CustomerSupportTeam Information has been added.");
            model.addRow(new Object[]{consumers,user_input.get(1),user_input.get(2)});
            remove_empty_input_Values();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);        
        enterpriseUserDirectory = medicalServiceCentralisationEcoSystem.getUserAccDirectory();
        helperTeamModel = medicalServiceCentralisationEcoSystem.getHelperTeamDirectory();
        ArrayList<ConsumerRecords> userAccountList = enterpriseUserDirectory.get_User_Details();
        for(ConsumerRecords userAccount: userAccountList)
        {
            if(userAccount.getEmail_Id().equals(select_account_details.getEmail_Id()))
            {
                HelperTeam helperTeam = userAccount.getHelperTeamDir();
                ArrayList<String> user_input = check_empty_field();
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                helperTeamModel.updateCustomerSupportTeam(user_input, helperTeam);
                enterpriseUserDirectory.updateEnterpriseUser(set_user_input_values(userAccount, user_input));
                break;
            }
        }
        

        JOptionPane.showMessageDialog(this, "Values updated");

        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        enterpriseUserDirectory = medicalServiceCentralisationEcoSystem.getUserAccDirectory();
        HelperTeam helperTeam = select_user_account_details.getHelperTeamDir();
        helperTeamModel.deleteCustomerSupportTeam(helperTeam);
        enterpriseUserDirectory.removeConsumerRecord(select_user_account_details);
        model.removeRow(selected_row_ix);
        InsertDataToJTable();
        remove_empty_input_Values();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        CreateButton.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_consumer_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        jTextTeamID.setEditable(false);
        jTextTeamID.setText(select_consumer_details.getEmail_Id());
        jTextTeamName.setText(select_consumer_details.getHelperTeamDir().getName_Helper_Team());
        jTextPassword.setText(select_consumer_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private ConsumerRecords set_user_input_values(ConsumerRecords consumerRecords, ArrayList<String> user_input) {

        consumerRecords.getHelperTeamDir().setName_Helper_Team(user_input.get(1));
        consumerRecords.setPassword(user_input.get(2));
        return consumerRecords;
    }
    private void remove_empty_input_Values(){
        jTextTeamID.setText("");
        jTextTeamName.setText("");
        jTextPassword.setText("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextTeamID.getText();
        String user_emp_name = jTextTeamName.getText();
        String user_password = jTextPassword.getText();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Email/Username cannot be left empty");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextTeamID;
    private javax.swing.JTextField jTextTeamName;
    // End of variables declaration//GEN-END:variables

    
    private void InsertDataToJTable() {
        EnterpriseUserDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccDirectory();
        ArrayList<ConsumerRecords> usersList = userAccountDirectory.get_User_Details();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);

        for(ConsumerRecords userAccount: usersList)
        {   
            if(userAccount.getRole().toString() == "CustomerSupportTeamAdmin"){
                model.addRow(new Object[]{userAccount,userAccount.getHelperTeamDir().getName_Helper_Team(),userAccount.getPassword()});
            }
            
        }
        
        jTableEmployee.setModel(model);
    }

    private void addDBDefaultUsers() {
        
        EnterpriseUserDirectory enterpriseUserDirectory = medicalServiceCentralisationEcoSystem.getUserAccDirectory();
        consumers = new ConsumerRecords("helperteam", "pass",new EmergencyResponseTeamAdminRole());
        HelperTeam helperTeam = new HelperTeam("helperteam","helperteam");
        helperTeamModel = medicalServiceCentralisationEcoSystem.getHelperTeamDirectory();
        helperTeamModel.addCustomerSupportTeam(helperTeam);
        consumers.setHelperTeamDir(helperTeam);
        if(enterpriseUserDirectory.verifyUserUnique("helperteam")){
            enterpriseUserDirectory.addConsumerData(consumers);
        }
        
   
    }
    
}
