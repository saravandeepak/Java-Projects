/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.managevendors;

import business.Vendor;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;

/**
 *
 * @author saravandeepak
 */
public class ViewVendorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVendorJPanel
     */
    private JPanel userProcessContainer;
    private Vendor vendor;
    ViewVendorJPanel(JPanel userProcessContainer, Vendor vendor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vendor = vendor;
        populateFields();
    }
    
    public void populateFields(){
        vendorNameText.setText(vendor.getVendorName());
        vendorEmailText.setText(vendor.getVendorEmail());
        descriptionText.setText(vendor.getVendorDescription());
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-mm-yyyy"); 
        String date = DATE_FORMAT.format(vendor.getVendorCreatedDate());
        venderCreatedOnText.setText(String.valueOf(date));
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewVendorLabel = new javax.swing.JLabel();
        vendorDescLabel = new javax.swing.JLabel();
        vendorNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        vendorNameText = new javax.swing.JTextField();
        createdOnLabel = new javax.swing.JLabel();
        venderCreatedOnText = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        vendorEmailLabel = new javax.swing.JLabel();
        vendorEmailText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 5));

        viewVendorLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewVendorLabel.setForeground(new java.awt.Color(255, 255, 204));
        viewVendorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewVendorLabel.setText("View Vendor Details");

        vendorDescLabel.setForeground(new java.awt.Color(255, 255, 204));
        vendorDescLabel.setText("Vendor Description:");

        vendorNameLabel.setForeground(new java.awt.Color(255, 255, 204));
        vendorNameLabel.setText("Vendor Name:");

        descriptionText.setColumns(20);
        descriptionText.setRows(5);
        descriptionText.setEnabled(false);
        jScrollPane1.setViewportView(descriptionText);

        vendorNameText.setEnabled(false);

        createdOnLabel.setForeground(new java.awt.Color(255, 255, 204));
        createdOnLabel.setText("Vendor Created on:");

        venderCreatedOnText.setEnabled(false);

        saveButton.setBackground(new java.awt.Color(51, 51, 51));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(51, 51, 51));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        vendorEmailLabel.setForeground(new java.awt.Color(255, 255, 204));
        vendorEmailLabel.setText("Vendor Email:");

        vendorEmailText.setEnabled(false);

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(98, 98, 98)
                        .addComponent(viewVendorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vendorNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vendorEmailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vendorDescLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createdOnLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vendorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(venderCreatedOnText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(39, 39, 39)
                .addComponent(updateButton)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(viewVendorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorNameLabel)
                    .addComponent(vendorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorEmailLabel)
                    .addComponent(vendorEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vendorDescLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venderCreatedOnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createdOnLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(updateButton))
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        vendorNameText.setEnabled(true);
        vendorEmailText.setEnabled(true);
        descriptionText.setEnabled(true);
        saveButton.setEnabled(true);
        updateButton.setEnabled(false);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        vendor.setVendorName(vendorNameText.getText());
        vendor.setVendorEmail(vendorEmailText.getText());
        vendor.setVendorDescription(descriptionText.getText());
        vendorNameText.setEnabled(false);
        vendorEmailText.setEnabled(false);
        descriptionText.setEnabled(false);
        saveButton.setEnabled(false);
        updateButton.setEnabled(true);
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel createdOnLabel;
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField venderCreatedOnText;
    private javax.swing.JLabel vendorDescLabel;
    private javax.swing.JLabel vendorEmailLabel;
    private javax.swing.JTextField vendorEmailText;
    private javax.swing.JLabel vendorNameLabel;
    private javax.swing.JTextField vendorNameText;
    private javax.swing.JLabel viewVendorLabel;
    // End of variables declaration//GEN-END:variables
}
