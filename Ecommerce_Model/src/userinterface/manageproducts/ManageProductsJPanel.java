/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.manageproducts;

import business.ProductMaster;
import business.ProductMasterCatalog;
import business.Vendor;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saravandeepak
 */
public class ManageProductsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductsJPanel
     */
  
    private JPanel userProcessContainer;
    private ProductMasterCatalog productCatalog;
    private Vendor vendor;
    ManageProductsJPanel(JPanel userProcessContainer, ProductMasterCatalog productCatalog, Vendor vendor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCatalog = productCatalog;
        this.vendor = vendor;
        vendorNameLabel.setText(vendor.getVendorName());
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)productTable.getModel();
        dtm.setRowCount(0);
        for (ProductMaster product: productCatalog.getProductMasterCatalog()){
            if(product.getVendorName().equals(vendor.getVendorName())){
                Object[] row = new Object[4];
                row[0] = product;
                row[1] = product.getModelNo();
                row[2] = product.getProductCategory();
                row[3] = product.getBasePrice();
                dtm.addRow(row);
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageProductsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        createButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        productNameSearchLabel = new javax.swing.JLabel();
        productNameSearchText = new javax.swing.JTextField();
        modelNoSearchLabel = new javax.swing.JLabel();
        modelNoSearchText = new javax.swing.JTextField();
        searchProductButton = new javax.swing.JButton();
        searchTag = new javax.swing.JLabel();
        orLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        vendorNameLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 5));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        manageProductsLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageProductsLabel.setForeground(new java.awt.Color(255, 255, 204));
        manageProductsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageProductsLabel.setText("Manage Products");

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Model Number", "Category", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        createButton.setBackground(new java.awt.Color(51, 51, 51));
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create Products");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(51, 51, 51));
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View Product");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(51, 51, 51));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update Product");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        productNameSearchLabel.setForeground(new java.awt.Color(255, 255, 204));
        productNameSearchLabel.setText("Product Name");

        modelNoSearchLabel.setForeground(new java.awt.Color(255, 255, 204));
        modelNoSearchLabel.setText("Model Number");

        searchProductButton.setBackground(new java.awt.Color(51, 51, 51));
        searchProductButton.setForeground(new java.awt.Color(255, 255, 255));
        searchProductButton.setText("Search and View");
        searchProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductButtonActionPerformed(evt);
            }
        });

        searchTag.setForeground(new java.awt.Color(255, 255, 204));
        searchTag.setText("<html>Enter Product Name or <br>Model Number to search<html>");

        orLabel.setForeground(new java.awt.Color(255, 255, 204));
        orLabel.setText("OR");

        deleteButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete Product");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Logout");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        vendorNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        vendorNameLabel.setForeground(new java.awt.Color(255, 255, 204));
        vendorNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(searchTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productNameSearchText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(productNameSearchLabel)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modelNoSearchLabel)
                        .addGap(172, 172, 172))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modelNoSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchProductButton)))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(createButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(263, 263, 263))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(manageProductsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(backButton)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(vendorNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(manageProductsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addGap(31, 31, 31)
                .addComponent(vendorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addGap(8, 8, 8)
                .addComponent(deleteButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNoSearchLabel)
                            .addComponent(productNameSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNoSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchProductButton)
                            .addComponent(orLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(searchTag, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        CreateProductsJPanel panel = new CreateProductsJPanel(userProcessContainer, productCatalog, vendor);
        userProcessContainer.add("CreateProductsPanel", panel);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.next(userProcessContainer);
    }//GEN-LAST:event_createButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            ProductMaster product = (ProductMaster)productTable.getValueAt(selectedRow,0);
            ViewProductJPanel panel = new ViewProductJPanel(userProcessContainer, product);
            userProcessContainer.add("ViewProductPanel", panel);
            CardLayout card = (CardLayout)userProcessContainer.getLayout();
            card.next(userProcessContainer);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select a row");
        
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            ProductMaster product = (ProductMaster)productTable.getValueAt(selectedRow,0);
            ViewProductJPanel panel = new ViewProductJPanel(userProcessContainer, product);
            userProcessContainer.add("ViewProductPanel", panel);
            CardLayout card = (CardLayout)userProcessContainer.getLayout();
            card.next(userProcessContainer);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select a row");
        
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_formComponentShown

    private void searchProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<ProductMaster> resultProductList = productCatalog.searchProduct(productNameSearchText.getText(), modelNoSearchText.getText());
        DefaultTableModel dtm = (DefaultTableModel) productTable.getModel();
        dtm.setRowCount(0);
        for (ProductMaster product: resultProductList){
            if(product.getVendorName().equals(vendor.getVendorName())){
                Object[] row = new Object[5];
                row[0] = product;
                row[1] = product.getModelNo();
                row[2] = product.getProductCategory();
                row[3] = product.getVendorName();
                row[4] = product.getBasePrice();
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_searchProductButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            int option;
            option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Delete Product", JOptionPane.YES_NO_OPTION);
     
            if(option==JOptionPane.YES_OPTION)
            {
                ProductMaster product = (ProductMaster)productTable.getValueAt(selectedRow,0);
                productCatalog.deleteProduct(product);
               
                populateTable();
                JOptionPane.showMessageDialog(this, "Deleted successfully");
                
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a row");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageProductsLabel;
    private javax.swing.JLabel modelNoSearchLabel;
    private javax.swing.JTextField modelNoSearchText;
    private javax.swing.JLabel orLabel;
    private javax.swing.JLabel productNameSearchLabel;
    private javax.swing.JTextField productNameSearchText;
    private javax.swing.JTable productTable;
    private javax.swing.JButton searchProductButton;
    private javax.swing.JLabel searchTag;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel vendorNameLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}