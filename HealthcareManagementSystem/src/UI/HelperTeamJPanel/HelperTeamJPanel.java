/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HelperTeamJPanel;



import IntegrationSystem.HealthcareSystemOrganizationIntegration;


import model.HelperTeam.HelperTeam;
import HealthCareManager.Tickets.Tickets;
import HealthCareManager.Tickets.TicketModelDirectory;
import HealthCareMainSystem.UserRoles.Role;

import IntegrationSystem.ConsumerRecords;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshithnarahari 
 */
public class HelperTeamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel panelContainer;
    HealthcareSystemOrganizationIntegration medicalServiceCentralisationEcoSystem;
    
    HelperTeam helperTeam;
    private String request_category;
    Tickets request;
    public HelperTeamJPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration medicalServiceCentralisationEcoSystem) {
        
        this.panelContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        initComponents();
        
        insertDataintoJTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustomerRequest = new javax.swing.JTable();
        jButtonCustomerCreate = new javax.swing.JButton();
        jTextFieldCustomerPhone = new javax.swing.JTextField();
        jButtonCustomerUpdate = new javax.swing.JButton();
        jLabelCustomerPassword = new javax.swing.JLabel();
        jTextFieldCustomerNote = new javax.swing.JTextField();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jLabelEmployeeID = new javax.swing.JLabel();
        jButtonDeleteCustomer = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();
        jRadioButtonCustomerMedicalTest = new javax.swing.JRadioButton();
        jRadioButtonCustomerConsultation = new javax.swing.JRadioButton();
        jRadioButtonCustomerMedicalEquipment = new javax.swing.JRadioButton();
        jLabelCustomerName = new javax.swing.JLabel();
        jLabelCustomerEmail = new javax.swing.JLabel();
        jTextFieldCustomerEmail = new javax.swing.JTextField();
        jLabelCustomerPincode = new javax.swing.JLabel();
        jTextFieldCustomerPincode = new javax.swing.JTextField();
        jLabelCustomerDate = new javax.swing.JLabel();
        jDateChooserCustomerDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeader.setText("Customer Details");
        add(jLabelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 706, -1));

        jTableCustomerRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CaseId", "Customer Name", "CustomerPhone", "CustomerEmail", "CustomerPincode", "Request Date", "RequestCategory", "CaseDescription", "Timestamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCustomerRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomerRequestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCustomerRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 870, 100));

        jButtonCustomerCreate.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCustomerCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCustomerCreate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCustomerCreate.setText("CREATE");
        jButtonCustomerCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerCreateActionPerformed(evt);
            }
        });
        add(jButtonCustomerCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 90, 40));
        add(jTextFieldCustomerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 220, -1));

        jButtonCustomerUpdate.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCustomerUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCustomerUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCustomerUpdate.setText("UPDATE");
        jButtonCustomerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerUpdateActionPerformed(evt);
            }
        });
        add(jButtonCustomerUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 90, 40));

        jLabelCustomerPassword.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelCustomerPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCustomerPassword.setText("Notes");
        add(jLabelCustomerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 88, -1));

        jTextFieldCustomerNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerNoteActionPerformed(evt);
            }
        });
        add(jTextFieldCustomerNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 290, 65));

        jTextFieldCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerNameActionPerformed(evt);
            }
        });
        add(jTextFieldCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, -1));

        jLabelEmployeeID.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmployeeID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmployeeID.setText("Customer Name");
        add(jLabelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, -1));

        jButtonDeleteCustomer.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDeleteCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteCustomer.setText("DELETE");
        jButtonDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCustomerActionPerformed(evt);
            }
        });
        add(jButtonDeleteCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 90, 40));

        jLabelEmpName.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpName.setText("Customer Phone");
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 150, -1));

        jRadioButtonCustomerMedicalTest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonCustomerMedicalTest.setText("Medical Test");
        jRadioButtonCustomerMedicalTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCustomerMedicalTestActionPerformed(evt);
            }
        });
        add(jRadioButtonCustomerMedicalTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jRadioButtonCustomerConsultation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonCustomerConsultation.setText("Consulation");
        jRadioButtonCustomerConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCustomerConsultationActionPerformed(evt);
            }
        });
        add(jRadioButtonCustomerConsultation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jRadioButtonCustomerMedicalEquipment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonCustomerMedicalEquipment.setText("Medical equipment");
        jRadioButtonCustomerMedicalEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCustomerMedicalEquipmentActionPerformed(evt);
            }
        });
        add(jRadioButtonCustomerMedicalEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jLabelCustomerName.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCustomerName.setText("Request Category");
        add(jLabelCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, -1));

        jLabelCustomerEmail.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelCustomerEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCustomerEmail.setText("Customer Email");
        add(jLabelCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 150, -1));
        add(jTextFieldCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 220, -1));

        jLabelCustomerPincode.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelCustomerPincode.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCustomerPincode.setText("Customer Pincode");
        add(jLabelCustomerPincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 150, -1));

        jTextFieldCustomerPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerPincodeActionPerformed(evt);
            }
        });
        jTextFieldCustomerPincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCustomerPincodeKeyPressed(evt);
            }
        });
        add(jTextFieldCustomerPincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 220, -1));

        jLabelCustomerDate.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelCustomerDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCustomerDate.setText("Date ");
        add(jLabelCustomerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 150, -1));
        add(jDateChooserCustomerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 170, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCustomerNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerNoteActionPerformed

    private void jTextFieldCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerNameActionPerformed
    public void dispatch_new_req(ArrayList<String> user_input){
        
        DefaultTableModel model = (DefaultTableModel) jTableCustomerRequest.getModel();
        

        TicketModelDirectory requestList = medicalServiceCentralisationEcoSystem.getTicketDirectory();
        System.out.println(requestList.getFinal_ticket_Id());

        request = new Tickets();
        String current_timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String last_case_id = requestList.getFinal_ticket_Id();
        int last_case_id_int = Integer.parseInt(last_case_id.replaceAll("[\\D]", ""));
        last_case_id_int++;
        
       request.setTicket_Id(last_case_id);
        request.setTicket_Name(user_input.get(0));
        request.setConsumer_phone(user_input.get(1));
        request.setClient_EmailID(user_input.get(2));
        request.setClient_postcode(user_input.get(3));
        request.setTicket_Time(user_input.get(4));
        request.setTicket_Category(user_input.get(5));
        request.setTicket_description(user_input.get(6));
        request.setTicket_Type(user_input.get(7));
        request.setTimeStamp(current_timeStamp);
        request.setTicket_Status("new");
        requestList.addRequest(request);
        String last_case_id_new = "REQUEST" + String.format("%03d", last_case_id_int);
        requestList.setFinal_ticket_Id(last_case_id_new);
            
        JOptionPane.showMessageDialog(this, "New Request Information has been added.");
        model.addRow(new Object[]{request,request.getTicket_Name(),request.getConsumer_phone(),request.getClient_EmailID(),request.getClient_postcode(),request.getTicket_Time(),request.getTicket_Category(),request.getTicket_description(),current_timeStamp});
        removeEmptyFields();
        
    }
    private void jButtonCustomerCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomerCreateActionPerformed
        // TODO add your handling code here:
        
        ArrayList<String> user_input = validate_null_undefined_Fields();
        dispatch_new_req(user_input);
        
    }//GEN-LAST:event_jButtonCustomerCreateActionPerformed

    private void jButtonCustomerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomerUpdateActionPerformed
        int selected_row_ix = jTableCustomerRequest.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableCustomerRequest.getModel();
        ConsumerRecords select_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);        
        JOptionPane.showMessageDialog(this, "Values updated");

        
    }//GEN-LAST:event_jButtonCustomerUpdateActionPerformed

    private void jButtonDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCustomerActionPerformed
        int selected_row_ix = jTableCustomerRequest.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableCustomerRequest.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);

        model.removeRow(selected_row_ix);
        insertDataintoJTable();
        removeEmptyFields();
    }//GEN-LAST:event_jButtonDeleteCustomerActionPerformed

    private void jTableCustomerRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerRequestMouseClicked
        // TODO add your handling code here:
        jButtonCustomerCreate.setEnabled(false);
        int selected_row_ix = jTableCustomerRequest.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableCustomerRequest.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        jTextFieldCustomerName.setEditable(false);
        jTextFieldCustomerName.setText(select_user_account_details.getEmail_Id());
        
        Role role = select_user_account_details.getRole();
        System.out.println("role.toString(): "+role.toString());

        
        jTextFieldCustomerNote.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableCustomerRequestMouseClicked

    private void jRadioButtonCustomerMedicalTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCustomerMedicalTestActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonCustomerMedicalTest.isSelected()){
            jRadioButtonCustomerConsultation.setSelected(false);
            jRadioButtonCustomerMedicalEquipment.setSelected(false);
            request_category = "MedicalTest";
        }
    }//GEN-LAST:event_jRadioButtonCustomerMedicalTestActionPerformed

    private void jRadioButtonCustomerConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCustomerConsultationActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonCustomerConsultation.isSelected()){
            jRadioButtonCustomerMedicalTest.setSelected(false);
            jRadioButtonCustomerMedicalEquipment.setSelected(false);
            request_category = "Consultation";
        }
    }//GEN-LAST:event_jRadioButtonCustomerConsultationActionPerformed

    private void jRadioButtonCustomerMedicalEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCustomerMedicalEquipmentActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonCustomerMedicalEquipment.isSelected()){
            jRadioButtonCustomerMedicalTest.setSelected(false);
            jRadioButtonCustomerConsultation.setSelected(false);
            request_category = "MedicalEquipment";
        }
    }//GEN-LAST:event_jRadioButtonCustomerMedicalEquipmentActionPerformed

    private void jTextFieldCustomerPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerPincodeActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextFieldCustomerPincodeActionPerformed

    private void jTextFieldCustomerPincodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCustomerPincodeKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCustomerPincodeKeyPressed
    private ConsumerRecords set_Input_Data_User(ConsumerRecords userAccount, ArrayList<String> user_input) {

        userAccount.setPassword(user_input.get(2));
        return userAccount;
    }
    private void removeEmptyFields(){
        jTextFieldCustomerName.setText("");
        jTextFieldCustomerPhone.setText("");
        jTextFieldCustomerNote.setText("");
    }
    public ArrayList<String> validate_null_undefined_Fields(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_cust_name = jTextFieldCustomerName.getText();
        String user_cust_phone = jTextFieldCustomerPhone.getText();
        String user_cust_email = jTextFieldCustomerEmail.getText();

        String user_pincode = jTextFieldCustomerPincode.getText();
        Date date = jDateChooserCustomerDate.getDate();
        String user_request_date = new SimpleDateFormat("MM.dd.yyyy").format(date);

        String user_cust_notes = jTextFieldCustomerNote.getText();
        
        
        if(user_cust_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "UserName or Email cannot be empty");
        }
        else if(user_cust_phone.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill phone number");
        }
        else if(user_cust_email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill Email ID");
        }
        else if(user_pincode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter the pincode");
        }
        else if(user_request_date.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a dispatch request date");
        }
        else if(request_category.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select a relevant category");
        }
        else if(user_cust_notes.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter the request details.");
        }
        
        user_input.add(user_cust_name);
        user_input.add(user_cust_phone);
        user_input.add(user_cust_email);
        user_input.add(user_pincode);
        user_input.add(user_request_date);
        user_input.add(request_category);
        user_input.add(user_cust_notes);
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCustomerCreate;
    private javax.swing.JButton jButtonCustomerUpdate;
    private javax.swing.JButton jButtonDeleteCustomer;
    private com.toedter.calendar.JDateChooser jDateChooserCustomerDate;
    private javax.swing.JLabel jLabelCustomerDate;
    private javax.swing.JLabel jLabelCustomerEmail;
    private javax.swing.JLabel jLabelCustomerName;
    private javax.swing.JLabel jLabelCustomerPassword;
    private javax.swing.JLabel jLabelCustomerPincode;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JRadioButton jRadioButtonCustomerConsultation;
    private javax.swing.JRadioButton jRadioButtonCustomerMedicalEquipment;
    private javax.swing.JRadioButton jRadioButtonCustomerMedicalTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustomerRequest;
    private javax.swing.JTextField jTextFieldCustomerEmail;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldCustomerNote;
    private javax.swing.JTextField jTextFieldCustomerPhone;
    private javax.swing.JTextField jTextFieldCustomerPincode;
    // End of variables declaration//GEN-END:variables

    

    private void insertDataintoJTable() {
    
        DefaultTableModel model = (DefaultTableModel) jTableCustomerRequest.getModel();
        model.setRowCount(0);
        TicketModelDirectory ticketModelDirectory = medicalServiceCentralisationEcoSystem.getTicketDirectory();
        if(ticketModelDirectory!=null){
            ArrayList<Tickets> requestList = ticketModelDirectory.getTickets_List();
            for(Tickets request: requestList)
            {   
                model.addRow(new Object[]{request,request.getTicket_Name(),request.getConsumer_phone(),request.getClient_EmailID(),request.getClient_postcode(),request.getTicket_Time(),request.getTicket_Category(),request.getTicket_description(), request.getTimeStamp()});

            }

            jTableCustomerRequest.setModel(model);
        }
        
    }
    
    
}
