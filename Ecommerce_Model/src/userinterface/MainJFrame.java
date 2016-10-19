/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.ProductMasterCatalog;
import business.VendorCatalog;
import java.awt.CardLayout;
import userinterface.customer.CustomerWorkAreaJPanel;
import userinterface.manageproducts.VendorWorkArea;
import userinterface.managevendors.AtCorpAdminWorkArea;

/**
 *
 * @author saravandeepak
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private VendorCatalog vendorCatalog;
    private ProductMasterCatalog productCatalog;
    public MainJFrame() {
        initComponents();
        this.vendorCatalog = new VendorCatalog();
        this.productCatalog = new ProductMasterCatalog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        adminButton = new javax.swing.JButton();
        vendorButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(33, 33, 33));
        jSplitPane1.setDividerLocation(-3);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 5));

        adminButton.setBackground(new java.awt.Color(55, 71, 79));
        adminButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 255, 204));
        adminButton.setText("<html>ATCorp<br> Admin<html>");
        adminButton.setActionCommand("<html>ATCorp<br>Admin<html>");
        adminButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        vendorButton.setBackground(new java.awt.Color(55, 71, 79));
        vendorButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        vendorButton.setForeground(new java.awt.Color(255, 255, 204));
        vendorButton.setText("Vendor");
        vendorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorButtonActionPerformed(evt);
            }
        });

        customerButton.setBackground(new java.awt.Color(55, 71, 79));
        customerButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        customerButton.setForeground(new java.awt.Color(255, 255, 204));
        customerButton.setText("Customer");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(vendorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(vendorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setBackground(new java.awt.Color(33, 33, 33));
        userProcessContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 5));
        userProcessContainer.setMinimumSize(new java.awt.Dimension(684, 636));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:

        
        AtCorpAdminWorkArea panel = new AtCorpAdminWorkArea(userProcessContainer, vendorCatalog);
        userProcessContainer.add("ATCropAdminWorkAreaPanel", panel);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.next(userProcessContainer);
    }//GEN-LAST:event_adminButtonActionPerformed

    private void vendorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorButtonActionPerformed
        // TODO add your handling code here:
        VendorWorkArea panel = new VendorWorkArea(userProcessContainer, vendorCatalog, productCatalog);
        userProcessContainer.add("SupplierWorkAreaPanel", panel);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.next(userProcessContainer);
    }//GEN-LAST:event_vendorButtonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        // TODO add your handling code here:
        CustomerWorkAreaJPanel panel = new CustomerWorkAreaJPanel(userProcessContainer, productCatalog, vendorCatalog);
        userProcessContainer.add("CustomerWorkAreaPanel", panel);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.next(userProcessContainer);
    }//GEN-LAST:event_customerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JButton customerButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JButton vendorButton;
    // End of variables declaration//GEN-END:variables
}