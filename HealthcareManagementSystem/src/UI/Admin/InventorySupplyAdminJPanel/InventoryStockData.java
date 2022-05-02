/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.InventorySupplyAdminJPanel;



import InventorySupply.FirstAidSupply.FirstAidKit;
import InventorySupply.FirstAidSupply.FirstAidKitDirectory;
import IntegrationSystem.HealthcareSystemOrganizationIntegration;
import IntegrationSystem.ConsumerRecords;
import IntegrationSystem.EnterpriseUserDirectory;
import InventorySupply.InventorySupply;
import InventorySupply.InventorySupplyModelDirectory;
import InventorySupply.Dipatches.OrderDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Rishi
 */
public class InventoryStockData extends javax.swing.JPanel {

    /**
     *
     */
    JPanel userProcessContainer;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    ConsumerRecords consumers;
    EnterpriseUserDirectory enterpriseDirectory;

    FirstAidKitDirectory firstAidKitDirectory;
    InventorySupply inventorySupply;
    public InventoryStockData(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration, InventorySupply inventorySupply) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.healthcareSystemOrganizationIntegration = healthcareSystemOrganizationIntegration;
        this.inventorySupply = inventorySupply;
        if(inventorySupply.getInventory_Stock_Directory()== null){
            inventorySupply.setInventory_Stock_Directory(new FirstAidKitDirectory());
        }
        if(inventorySupply.getOrderDirectory()== null){
            inventorySupply.setOrderDirectory(new OrderDirectory());
        }
        insertFirstAidData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelInstrumentPrice = new javax.swing.JLabel();
        jLabelTitle2 = new javax.swing.JLabel();
        jTextInstrumentPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedSupEquipDB = new javax.swing.JTable();
        jLabelQuantity = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 706, -1));

        jButtonHome.setBackground(new java.awt.Color(0, 70, 169));
        jButtonHome.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        CreateButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        CreateButton.setText("CREATE");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 110, 40));

        UpdateButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 110, 40));

        DeleteButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 100, 40));

        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelName.setText(" Instrument Name :");
        add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 170, 20));

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 270, -1));

        jLabelInstrumentPrice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelInstrumentPrice.setText(" Instrument Price :");
        add(jLabelInstrumentPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 180, 20));

        jLabelTitle2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle2.setText("Medical Supplies Warehouse");
        add(jLabelTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 940, -1));

        jTextInstrumentPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInstrumentPriceActionPerformed(evt);
            }
        });
        add(jTextInstrumentPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 270, -1));

        jTableMedSupEquipDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medical Equipment Name", "Medical Equipment Price", "Medical Equipment Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMedSupEquipDB);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 490, 110));

        jLabelQuantity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelQuantity.setText("Quantitiy :");
        add(jLabelQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 200, -1));

        jTextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityActionPerformed(evt);
            }
        });
        add(jTextFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HealthcareManagementBGImages/COVID-ICU-illustration (1) (1) (1).jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 840));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextInstrumentPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInstrumentPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInstrumentPriceActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableMedSupEquipDB.getModel();
        InventorySupplyModelDirectory inventorySupplyModelDirectory = healthcareSystemOrganizationIntegration.getInventoryDirectory();
        ArrayList<InventorySupply> medSupWarehouseList = inventorySupplyModelDirectory.getInventories_Supply_List();
        for(InventorySupply invSupply: medSupWarehouseList){
            if(invSupply.getInventorySupply_Id().equals(invSupply.getInventorySupply_Id())){
                FirstAidKitDirectory medSupEquipDirectory = invSupply.getInventory_Stock_Directory();
                FirstAidKit equipments = new FirstAidKit();
                String medSupEquip_name = jTextFieldName.getText();
                String medSupEquip_price = jTextInstrumentPrice.getText();
                String medSupEquip_quantity = jTextFieldQuantity.getText();
                equipments.setFirst_Aid_Name(medSupEquip_name);
                equipments.setFirst_Aid_Cost(medSupEquip_price);
                equipments.setFirst_Aid_Number(medSupEquip_quantity);
                equipments.setFirst_Aid_Type_Id(invSupply.getInventorySupply_Id());
                medSupEquipDirectory.addFirstAidKits(equipments);
                invSupply.setInventory_Stock_Directory(medSupEquipDirectory);
                JOptionPane.showMessageDialog(this, "New MedSupEquip Information has been added.");
                model.addRow(new Object[]{equipments,equipments.getFirst_Aid_Cost(),equipments.getFirst_Aid_Number()});
                reset_input_Values();
                
            }
        }
        
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void jTextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInstrumentPrice;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedSupEquipDB;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextInstrumentPrice;
    // End of variables declaration//GEN-END:variables

    private void reset_input_Values() {
        jTextFieldName.setText("");
        jTextInstrumentPrice.setText("");
        jTextFieldQuantity.setText("");
    }

    private void insertFirstAidData() {
        
        firstAidKitDirectory = inventorySupply.getInventory_Stock_Directory();
        ArrayList<FirstAidKit> medSupEquipList = firstAidKitDirectory.getFirstAidKits();
        DefaultTableModel model = (DefaultTableModel) jTableMedSupEquipDB.getModel();
        
        for(FirstAidKit medSupEquip: medSupEquipList)
        {
            model.addRow(new Object[]{medSupEquip, medSupEquip.getFirst_Aid_Cost(), medSupEquip.getFirst_Aid_Number()});

        }
        jTableMedSupEquipDB.setModel(model);
    }
}
