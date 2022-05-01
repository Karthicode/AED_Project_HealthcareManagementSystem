/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HelperTeamJPanel;




import IntegrationSystem.HealthcareSystemOrganizationIntegration;

import HeathcareProviderHelp.Model.HealthCareProviderDirectory;
import HeathcareProviderHelp.Model.RegisteredMember;
import model.HelperTeam.HelperTeam;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiries;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiriesDirectory;
import HealthCareManager.Consultation.Consultation;
import IntegrationSystem.ConsumerRecords;
import IntegrationSystem.EnterpriseUserDirectory;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik 
 */
public class HelperGroupSearchConsultationReports extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel jPanelSession;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    HealthCareProviderDirectory accountantDirectory;
    
    ConsumerRecords userAccount;
    EnterpriseUserDirectory EnterpriseUserDirectory;
    HelperTeam helperTeam;
    ArrayList<Consultation> finallabTestList = new ArrayList<>();
    String customer_pincode;
    public HelperGroupSearchConsultationReports(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration, String pincode) {
        
        this.jPanelSession = userProcessContainer;
        this.healthcareSystemOrganizationIntegration = healthcareSystemOrganizationIntegration;
        this.customer_pincode = pincode;
        initComponents();
        fillAllPratitionerDetails(pincode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHeader = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jScrollPaneSearchResults = new javax.swing.JScrollPane();
        jRequestTable = new javax.swing.JTable();
        jButtonLabSearch = new javax.swing.JButton();
        jTextFieldTestingName = new javax.swing.JTextField();
        jLabelEmployeeID = new javax.swing.JLabel();
        jLabelPincode = new javax.swing.JLabel();
        jTextFieldLabPincode = new javax.swing.JTextField();
        jButtonRefreshTable = new javax.swing.JButton();
        jComboBoxListOfHospital = new javax.swing.JComboBox<>();
        jLabelHospital = new javax.swing.JLabel();
        jButtonAddToCart = new javax.swing.JButton();
        jScrollPaneCart = new javax.swing.JScrollPane();
        jTableRequests2 = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jLabelCart = new javax.swing.JLabel();
        jLabelEmpName8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeader.setText("Lab Test Directory");
        add(jLabelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 750, 90));

        jButtonExit.setBackground(new java.awt.Color(0, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 110, 40));

        jRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Name", "Pincode", "Hospital ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jRequestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRequestTableMouseClicked(evt);
            }
        });
        jScrollPaneSearchResults.setViewportView(jRequestTable);

        add(jScrollPaneSearchResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 331, 122));

        jButtonLabSearch.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLabSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLabSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLabSearch.setText("SEARCH");
        jButtonLabSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLabSearchActionPerformed(evt);
            }
        });
        add(jButtonLabSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 110, 60));

        jTextFieldTestingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTestingNameActionPerformed(evt);
            }
        });
        add(jTextFieldTestingName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 220, -1));

        jLabelEmployeeID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmployeeID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmployeeID.setText("Test Name :");
        add(jLabelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, -1));

        jLabelPincode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPincode.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPincode.setText("Pincode :");
        add(jLabelPincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 110, -1));

        jTextFieldLabPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLabPincodeActionPerformed(evt);
            }
        });
        jTextFieldLabPincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLabPincodeKeyPressed(evt);
            }
        });
        add(jTextFieldLabPincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 220, -1));

        jButtonRefreshTable.setBackground(new java.awt.Color(0, 0, 0));
        jButtonRefreshTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRefreshTable.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefreshTable.setText("REFRESH");
        jButtonRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshTableActionPerformed(evt);
            }
        });
        add(jButtonRefreshTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 110, 60));

        jComboBoxListOfHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBoxListOfHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 190, -1, -1));

        jLabelHospital.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelHospital.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelHospital.setText("Hospital :");
        add(jLabelHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 100, -1));

        jButtonAddToCart.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAddToCart.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddToCart.setText("ADD TO CART");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });
        add(jButtonAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 130, 50));

        jTableRequests2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Test Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRequests2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRequests2MouseClicked(evt);
            }
        });
        jScrollPaneCart.setViewportView(jTableRequests2);

        add(jScrollPaneCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 291, 158));

        jButtonDelete.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 500, 120, 40));

        jButtonSubmit.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSubmit.setText("SUBMIT");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 620, 120, 40));

        jLabelCart.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCart.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabelCart.setText("CART");
        add(jLabelCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, -1, -1));

        jLabelEmpName8.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabelEmpName8.setText("TEST SEARCH RESULTS");
        add(jLabelEmpName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) jPanelSession.getLayout();
            crdLyt.show(jPanelSession,"Sysadmin");
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldTestingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTestingNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTestingNameActionPerformed

    private void jButtonLabSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLabSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jRequestTable.getModel();
        model.setRowCount(0);
        ArrayList<String> user_input = validate_empty_values();
        PartnerInfirmiriesDirectory hospitalDirectory = healthcareSystemOrganizationIntegration.getInfirmaryDirectory();
        ArrayList<PartnerInfirmiries> infirmiries = hospitalDirectory.getHospitalList();
        
        for(PartnerInfirmiries infirmiry: infirmiries){
            if(infirmiry.getInfirmary_postcode().equals(user_input.get(1))){
                ArrayList<Consultation> labTestList = infirmiry.getLabTestDirectory().getTest_results_List();
                for(Consultation labTest: labTestList){
                    if(labTest.getTest_name().equals(user_input.get(0))){
                        if(!finallabTestList.contains(labTest)){
                            finallabTestList.add(labTest);
                            model.addRow(new Object[]{user_input.get(0), user_input.get(1), infirmiry});
                        }
                        
                    }
                }
            }
        }
        
    }//GEN-LAST:event_jButtonLabSearchActionPerformed

    private void jRequestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRequestTableMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRequestTableMouseClicked

    private void jTextFieldLabPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLabPincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLabPincodeActionPerformed

    private void jButtonRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jRequestTable.getModel();
        model.setRowCount(0);
        jRequestTable.setModel(model);
        jTextFieldLabPincode.setText("");
        jTextFieldTestingName.setText("");
        finallabTestList.clear();
    }//GEN-LAST:event_jButtonRefreshTableActionPerformed

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jTableRequests2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRequests2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableRequests2MouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jTextFieldLabPincodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLabPincodeKeyPressed
        // TODO add your handling code here:
        jComboBoxListOfHospital.removeAllItems();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){  
            fillAllPratitionerDetails(jTextFieldLabPincode.getText());
        }
        
    }//GEN-LAST:event_jTextFieldLabPincodeKeyPressed
    
    
    public ArrayList<String> validate_empty_values(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_test_name = jTextFieldTestingName.getText();
        String user_pincode = jTextFieldLabPincode.getText();

        if(user_test_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Consultation Name");
        }
        if(user_pincode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter a valid pincode");
        }

        user_input.add(user_test_name);
        user_input.add(user_pincode);
   
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLabSearch;
    private javax.swing.JButton jButtonRefreshTable;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxListOfHospital;
    private javax.swing.JLabel jLabelCart;
    private javax.swing.JLabel jLabelEmpName8;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelHospital;
    private javax.swing.JLabel jLabelPincode;
    private javax.swing.JTable jRequestTable;
    private javax.swing.JScrollPane jScrollPaneCart;
    private javax.swing.JScrollPane jScrollPaneSearchResults;
    private javax.swing.JTable jTableRequests2;
    private javax.swing.JTextField jTextFieldLabPincode;
    private javax.swing.JTextField jTextFieldTestingName;
    // End of variables declaration//GEN-END:variables

    

    private void insertDataInJTable() {
        accountantDirectory = helperTeam.getCustomerSupportMemberDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jRequestTable.getModel();
        model.setRowCount(0);
        EnterpriseUserDirectory userAccountDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        ArrayList<ConsumerRecords> record_list = userAccountDirectory.get_User_Details();
        
        model.setRowCount(0);
        for(ConsumerRecords consumerData: record_list)
        {   
            System.out.println("userAccount.getRole().toString(): "+consumerData.getRole().toString());
            if(consumerData.getRole().toString() == "CustomerSupportMember" && consumerData.getRole().equals(helperTeam)){
                
                accountantDirectory = helperTeam.getCustomerSupportMemberDirectory();
                HashMap<String, RegisteredMember> accountantList = accountantDirectory.getRegisteredSupportMemberList();
                RegisteredMember members = accountantList.get(consumerData.getEmail_Id());
                model.addRow(new Object[]{consumerData,members.getQualifiedMemberName(),consumerData.getPassword()});
            }
        }

        jRequestTable.setModel(model);
    }

    private void fillAllPratitionerDetails(String pincode) {
        jTextFieldLabPincode.setText(pincode);
        jComboBoxListOfHospital.removeAllItems();
        PartnerInfirmiriesDirectory partnerInfirmiriesDirectory = healthcareSystemOrganizationIntegration.getInfirmaryDirectory();
            ArrayList<PartnerInfirmiries> hospitalList = partnerInfirmiriesDirectory.getHospitalList();

            for(PartnerInfirmiries infirmary: hospitalList){
                if(infirmary.getInfirmary_postcode().equals(pincode)){
                    jComboBoxListOfHospital.addItem(infirmary.getInfirmaryId());

                }
    }
    
    }
}