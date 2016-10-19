/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.customer;

import business.ProductMaster;
import business.ProductMasterCatalog;
import business.VendorCatalog;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saravandeepak
 */
public class CustomerBrowseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomeBrowseJPanel
     */
    private JPanel userProcessContainer;
    private ProductMasterCatalog productCatalog;
    private String catalogType;
    private VendorCatalog vendorCatalog;

    CustomerBrowseJPanel(JPanel userProcessContainer, ProductMasterCatalog productCatalog, String catalog, VendorCatalog vendorCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCatalog = productCatalog;
        this.vendorCatalog = vendorCatalog;
        this.catalogType = catalog;
        catalogTable.setAutoCreateRowSorter(true);
        if(catalogType.equals("All"))
        {
            populateAllTable();
        }
        else{
            populateTable();
            categoryText.setEnabled(false);
            headingLabel.setText(catalogType +" Catalog");
        }
        
    }

    public void populateAllTable(){
        DefaultTableModel dtm = (DefaultTableModel)catalogTable.getModel();
        dtm.setRowCount(0);
        catalogTable.setAutoCreateRowSorter(true);
        for (ProductMaster product: productCatalog.getProductMasterCatalog()){
            Object[] row = new Object[5];
            row[0] = product;
            row[1] = product.getModelNo();
            row[2] = product.getProductCategory();
            row[3] = product.getVendorName();
            row[4] = product.getBasePrice();
            dtm.addRow(row);        
        }
    }
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)catalogTable.getModel();
        dtm.setRowCount(0);
        catalogTable.setAutoCreateRowSorter(true);
        for (ProductMaster product: productCatalog.getProductMasterCatalog()){
            if(product.getProductCategory().equals(catalogType)){
                Object[] row = new Object[5];
                row[0] = product;
                row[1] = product.getModelNo();
                row[2] = product.getProductCategory();
                row[3] = product.getVendorName();
                row[4] = product.getBasePrice();
                dtm.addRow(row);
            }
            
        }
        
    }
    

    
    
    public void populateAllTable(ArrayList<ProductMaster> resultProductList){
        DefaultTableModel dtm = (DefaultTableModel) catalogTable.getModel();
        dtm.setRowCount(0);
        for (ProductMaster product: resultProductList){
            
            Object[] row = new Object[5];
            row[0] = product;
            row[1] = product.getModelNo();
            row[2] = product.getProductCategory();
            row[3] = product.getVendorName();
            row[4] = product.getBasePrice();
            dtm.addRow(row);
        }
    }
    
    public void populateTable(ArrayList<ProductMaster> resultProductList){
        DefaultTableModel dtm = (DefaultTableModel) catalogTable.getModel();
        dtm.setRowCount(0);
        for (ProductMaster product: resultProductList){
            if(product.getProductCategory().equals(catalogType)){
                Object[] row = new Object[5];
                row[0] = product;
                row[1] = product.getModelNo();
                row[2] = product.getProductCategory();
                row[3] = product.getVendorName();
                row[4] = product.getBasePrice();
                dtm.addRow(row);
            }
        }
    }
    
     public void populateAllTable(ArrayList<ProductMaster> resultProductList, double price){
        DefaultTableModel dtm = (DefaultTableModel) catalogTable.getModel();
        dtm.setRowCount(0);
        for (ProductMaster product: resultProductList){
            if(product.getBasePrice() == price){
                Object[] row = new Object[5];
                row[0] = product;
                row[1] = product.getModelNo();
                row[2] = product.getProductCategory();
                row[3] = product.getVendorName();
                row[4] = product.getBasePrice();
                dtm.addRow(row);
            }
        }
    }
    
    public void populateTable(ArrayList<ProductMaster> resultProductList, double price){
        DefaultTableModel dtm = (DefaultTableModel) catalogTable.getModel();
        dtm.setRowCount(0);
        for (ProductMaster product: resultProductList){
            if(product.getProductCategory().equals(catalogType) && product.getBasePrice() == price){
                Object[] row = new Object[5];
                row[0] = product;
                row[1] = product.getModelNo();
                row[2] = product.getProductCategory();
                row[3] = product.getVendorName();
                row[4] = product.getBasePrice();
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

        vendorFilterLabel = new javax.swing.JLabel();
        filterLabel = new javax.swing.JLabel();
        priceSortComboBox = new javax.swing.JComboBox<>();
        priceSortLabel = new javax.swing.JLabel();
        sortLabel = new javax.swing.JLabel();
        categoryFilterComboBox = new javax.swing.JComboBox<>();
        categoryFilterLabel = new javax.swing.JLabel();
        vendorFilterComboBox = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        headingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        catalogTable = new javax.swing.JTable();
        productNameText = new javax.swing.JTextField();
        productNameLabel = new javax.swing.JLabel();
        modelNoLabel = new javax.swing.JLabel();
        ModelNoText = new javax.swing.JTextField();
        vendorNameLabel = new javax.swing.JLabel();
        vendorNameText = new javax.swing.JTextField();
        minPriceLabel = new javax.swing.JLabel();
        minPriceText = new javax.swing.JTextField();
        maxPriceLabel = new javax.swing.JLabel();
        maxPriceText = new javax.swing.JTextField();
        keyWordsLabel = new javax.swing.JLabel();
        keyWordsText = new javax.swing.JTextField();
        searchProductsButton = new javax.swing.JButton();
        viewProductsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        priceComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        categoryText = new javax.swing.JTextField();
        categorySearchLabel = new javax.swing.JLabel();

        vendorFilterLabel.setText("Vendor:");

        filterLabel.setText("Filter by:");

        priceSortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low to High", "High to Low" }));

        priceSortLabel.setText("Price:");

        sortLabel.setText("Sort by:");

        categoryFilterLabel.setText("Category:");

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 5));
        setForeground(new java.awt.Color(255, 255, 204));

        headingLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 204));
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("Catalog");

        catalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Model No", "Category", "Vendor", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(catalogTable);

        productNameLabel.setForeground(new java.awt.Color(255, 255, 204));
        productNameLabel.setText("Product Name:");

        modelNoLabel.setForeground(new java.awt.Color(255, 255, 204));
        modelNoLabel.setText("Model No:");

        vendorNameLabel.setForeground(new java.awt.Color(255, 255, 204));
        vendorNameLabel.setText("Vendor:");

        minPriceLabel.setForeground(new java.awt.Color(255, 255, 204));
        minPriceLabel.setText("Min Price:");

        maxPriceLabel.setForeground(new java.awt.Color(255, 255, 204));
        maxPriceLabel.setText("Max Price");

        keyWordsLabel.setForeground(new java.awt.Color(255, 255, 204));
        keyWordsLabel.setText("Key words in Descricption or features:");

        searchProductsButton.setBackground(new java.awt.Color(51, 51, 51));
        searchProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        searchProductsButton.setText("Search Products");
        searchProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductsButtonActionPerformed(evt);
            }
        });

        viewProductsButton.setBackground(new java.awt.Color(51, 51, 51));
        viewProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewProductsButton.setText("View Product Details");
        viewProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductsButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        priceComboBox.setBackground(new java.awt.Color(255, 255, 255));
        priceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Highest", "Lowest" }));

        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Price:");

        categorySearchLabel.setForeground(new java.awt.Color(255, 255, 204));
        categorySearchLabel.setText("Category:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(productNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(modelNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searchProductsButton)
                                .addGap(238, 238, 238))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(vendorNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vendorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(maxPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(categorySearchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(viewProductsButton)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(categoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(priceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)))))
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(keyWordsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keyWordsText, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addGap(20, 20, 20)
                .addComponent(viewProductsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameLabel)
                    .addComponent(modelNoLabel)
                    .addComponent(ModelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorNameLabel)
                    .addComponent(minPriceLabel)
                    .addComponent(minPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxPriceLabel)
                    .addComponent(maxPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(categoryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categorySearchLabel))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyWordsLabel)
                    .addComponent(keyWordsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(searchProductsButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductsButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = catalogTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            ProductMaster product = (ProductMaster)catalogTable.getValueAt(selectedRow,0);
            CustomerViewProductsJPanel panel = new CustomerViewProductsJPanel(userProcessContainer, product, vendorCatalog);
            userProcessContainer.add("CustomerViewPanel", panel);
            CardLayout card = (CardLayout)userProcessContainer.getLayout();
            card.next(userProcessContainer);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select a row");
        
        }
        
       
    }//GEN-LAST:event_viewProductsButtonActionPerformed

    private void searchProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductsButtonActionPerformed
        // TODO add your handling code here:
        if(minPriceText.getText().equals("") || minPriceText.getText() == null){
            minPriceText.setText(String.valueOf(0));
        }
        if(maxPriceText.getText().equals("") || maxPriceText.getText() == null){
            maxPriceText.setText(String.valueOf(0));
        }
        if(priceComboBox.getSelectedItem().toString().equals("None")){
            if(catalogType.equals("All"))
            {

                ArrayList<ProductMaster> resultProductList = productCatalog.searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText() );
                
                populateAllTable(resultProductList);
            }   
            else{

                ArrayList<ProductMaster> resultProductList = productCatalog.searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText());
                
                populateTable(resultProductList);

                }
        }
        else if(priceComboBox.getSelectedItem().toString().equals("Highest")){  
        
          
            if(catalogType.equals("All"))
            {

                ArrayList<ProductMaster> resultProductList = productCatalog.searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText());
                double max = productCatalog.maxPrice(resultProductList);
                populateAllTable(resultProductList, max);
            }   
            else{

                ArrayList<ProductMaster> resultProductList = productCatalog.searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText());
                double max = productCatalog.maxPrice(resultProductList, catalogType);
                populateTable(resultProductList, max);

                }
            
        }
        else if(priceComboBox.getSelectedItem().toString().equals("Lowest")){
            if(catalogType.equals("All"))
            {

                ArrayList<ProductMaster> resultProductList = productCatalog.searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText());
                double min = productCatalog.minPrice(resultProductList);
                populateAllTable(resultProductList, min);
            }   
            else{

                ArrayList<ProductMaster> resultProductList = productCatalog.searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText());
                double min = productCatalog.minPrice(resultProductList, catalogType);
                populateTable(resultProductList, min);

                }
            
        }
        
                
       
    }//GEN-LAST:event_searchProductsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ModelNoText;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable catalogTable;
    private javax.swing.JComboBox<String> categoryFilterComboBox;
    private javax.swing.JLabel categoryFilterLabel;
    private javax.swing.JLabel categorySearchLabel;
    private javax.swing.JTextField categoryText;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keyWordsLabel;
    private javax.swing.JTextField keyWordsText;
    private javax.swing.JLabel maxPriceLabel;
    private javax.swing.JTextField maxPriceText;
    private javax.swing.JLabel minPriceLabel;
    private javax.swing.JTextField minPriceText;
    private javax.swing.JLabel modelNoLabel;
    private javax.swing.JComboBox<String> priceComboBox;
    private javax.swing.JComboBox<String> priceSortComboBox;
    private javax.swing.JLabel priceSortLabel;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField productNameText;
    private javax.swing.JButton searchProductsButton;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JComboBox<String> vendorFilterComboBox;
    private javax.swing.JLabel vendorFilterLabel;
    private javax.swing.JLabel vendorNameLabel;
    private javax.swing.JTextField vendorNameText;
    private javax.swing.JButton viewProductsButton;
    // End of variables declaration//GEN-END:variables
}
