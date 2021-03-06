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
public class CustomerSearchResultsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSearchResultsJPanel
     */
    private  JPanel userProcessContainer;
    private ArrayList<ProductMaster> searchProductList;
    private ProductMasterCatalog productCatalog;
    private VendorCatalog vendorCatalog;

    CustomerSearchResultsJPanel(JPanel userProcessContainer, ArrayList<ProductMaster> searchProductList, VendorCatalog vendorCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.searchProductList = searchProductList;
        this.vendorCatalog = vendorCatalog;
        populateTable();
    }
    public ArrayList<ProductMaster> searchProduct(String productName, String modelNo, String vendor, double minPrice, double maxPrice, String keyWords, String category){
        ArrayList<ProductMaster> productArray = new ArrayList<ProductMaster>();
        for (ProductMaster product: searchProductList){
            if((product.getProductName().toLowerCase().contains(productName.toLowerCase())||productName.equals("") ) && (product.getModelNo().toLowerCase().equals(modelNo.toLowerCase())||modelNo.equals("")) && (product.getVendorName().toLowerCase().equals(vendor.toLowerCase())||vendor.equals("")) && (product.getBasePrice() >= minPrice || minPrice == 0) &&  (product.getBasePrice() <= maxPrice || maxPrice == 0) && (product.getProductDescription().toLowerCase().contains(keyWords.toLowerCase()) || product.getProductFeatures().toLowerCase().contains(keyWords.toLowerCase()) || keyWords.equals("")) && (product.getProductCategory().toLowerCase().equals(category.toLowerCase()) || category.equals(""))){
                productArray.add(product);
            }
        }
        return productArray;
    }
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)searchResultTable.getModel();
        dtm.setRowCount(0);
        searchResultTable.setAutoCreateRowSorter(true);
        for (ProductMaster product: searchProductList){
            Object[] row = new Object[5];
            row[0] = product;
            row[1] = product.getModelNo();
            row[2] = product.getProductCategory();
            row[3] = product.getVendorName();
            row[4] = product.getBasePrice();
            dtm.addRow(row);        
        }
    }
    
     public void populateTable(ArrayList<ProductMaster> productArray){
        DefaultTableModel dtm = (DefaultTableModel)searchResultTable.getModel();
        dtm.setRowCount(0);
        searchResultTable.setAutoCreateRowSorter(true);
        for (ProductMaster product: productArray){
            Object[] row = new Object[5];
            row[0] = product;
            row[1] = product.getModelNo();
            row[2] = product.getProductCategory();
            row[3] = product.getVendorName();
            row[4] = product.getBasePrice();
            dtm.addRow(row);        
        }
    }
     public void populateTable(ArrayList<ProductMaster> productArray, double price){
        DefaultTableModel dtm = (DefaultTableModel)searchResultTable.getModel();
        dtm.setRowCount(0);
        searchResultTable.setAutoCreateRowSorter(true);
        for (ProductMaster product: productArray){
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
    public double maxPrice(ArrayList<ProductMaster> resultArray){
        double max = 0;
        for (ProductMaster product: resultArray){
            if(product.getBasePrice()>max){
                max = product.getBasePrice();
            }
        }
        return max;
    }
    
    public double minPrice(ArrayList<ProductMaster> resultArray){
        double min = 999999;
        for (ProductMaster product: resultArray){
            if(product.getBasePrice()<min){
                min = product.getBasePrice();
            }
        }
        return min;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        viewProductButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchProductsButton = new javax.swing.JButton();
        keyWordsText = new javax.swing.JTextField();
        keyWordsLabel = new javax.swing.JLabel();
        maxPriceText = new javax.swing.JTextField();
        categorySearchLabel = new javax.swing.JLabel();
        maxPriceLabel = new javax.swing.JLabel();
        categoryText = new javax.swing.JTextField();
        minPriceText = new javax.swing.JTextField();
        minPriceLabel = new javax.swing.JLabel();
        vendorNameText = new javax.swing.JTextField();
        vendorNameLabel = new javax.swing.JLabel();
        ModelNoText = new javax.swing.JTextField();
        modelNoLabel = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priceComboBox = new javax.swing.JComboBox<>();
        productNameText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 5));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Products Search Result");

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(searchResultTable);

        viewProductButton.setBackground(new java.awt.Color(51, 51, 51));
        viewProductButton.setForeground(new java.awt.Color(255, 255, 255));
        viewProductButton.setText("View Product Details");
        viewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchProductsButton.setBackground(new java.awt.Color(51, 51, 51));
        searchProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        searchProductsButton.setText("Search Products");
        searchProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductsButtonActionPerformed(evt);
            }
        });

        keyWordsLabel.setForeground(new java.awt.Color(255, 255, 204));
        keyWordsLabel.setText("Key words in Descricption or features:");

        categorySearchLabel.setForeground(new java.awt.Color(255, 255, 204));
        categorySearchLabel.setText("Category:");

        maxPriceLabel.setForeground(new java.awt.Color(255, 255, 204));
        maxPriceLabel.setText("Max Price");

        minPriceLabel.setForeground(new java.awt.Color(255, 255, 204));
        minPriceLabel.setText("Min Price:");

        vendorNameLabel.setForeground(new java.awt.Color(255, 255, 204));
        vendorNameLabel.setText("Vendor:");

        modelNoLabel.setForeground(new java.awt.Color(255, 255, 204));
        modelNoLabel.setText("Model No:");

        productNameLabel.setForeground(new java.awt.Color(255, 255, 204));
        productNameLabel.setText("Product Name:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Price:");

        priceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Highest", "Lowest" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(productNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(categorySearchLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(categoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addComponent(vendorNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(vendorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(priceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(minPriceLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(maxPriceLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maxPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(modelNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ModelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(keyWordsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchProductsButton)
                                    .addComponent(keyWordsText, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewProductButton)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNoLabel)
                            .addComponent(ModelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minPriceLabel)
                            .addComponent(minPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxPriceLabel)
                            .addComponent(maxPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keyWordsLabel)
                            .addComponent(keyWordsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(searchProductsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categorySearchLabel))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = searchResultTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            ProductMaster product = (ProductMaster)searchResultTable.getValueAt(selectedRow,0);
            CustomerViewProductsJPanel panel = new CustomerViewProductsJPanel(userProcessContainer, product, vendorCatalog);
            userProcessContainer.add("CustomerViewPanel", panel);
            CardLayout card = (CardLayout)userProcessContainer.getLayout();
            card.next(userProcessContainer);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select a row");
        
        }
    }//GEN-LAST:event_viewProductButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductsButtonActionPerformed
        // TODO add your handling code here:
        if(minPriceText.getText().equals("") || minPriceText.getText() == null){
            minPriceText.setText(String.valueOf(0));
        }
        if(maxPriceText.getText().equals("") || maxPriceText.getText() == null){
            maxPriceText.setText(String.valueOf(0));
        }
        if(priceComboBox.getSelectedItem().toString().equals("None")){
            
            ArrayList<ProductMaster> resultProductList = searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText() );
            populateTable(resultProductList);
            
        }
        else if(priceComboBox.getSelectedItem().toString().equals("Highest")){
            ArrayList<ProductMaster> resultProductList = searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText());
            double max = maxPrice(resultProductList);
            populateTable(resultProductList, max);
        }
        else if(priceComboBox.getSelectedItem().toString().equals("Lowest")){
            
            ArrayList<ProductMaster> resultProductList = searchProduct(productNameText.getText(), ModelNoText.getText(), vendorNameText.getText(), Double.parseDouble(minPriceText.getText()), Double.parseDouble(maxPriceText.getText()), keyWordsText.getText(), categoryText.getText());
            double min = minPrice(resultProductList);
            populateTable(resultProductList, min);
            

        }

    }//GEN-LAST:event_searchProductsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ModelNoText;
    private javax.swing.JLabel categorySearchLabel;
    private javax.swing.JTextField categoryText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keyWordsLabel;
    private javax.swing.JTextField keyWordsText;
    private javax.swing.JLabel maxPriceLabel;
    private javax.swing.JTextField maxPriceText;
    private javax.swing.JLabel minPriceLabel;
    private javax.swing.JTextField minPriceText;
    private javax.swing.JLabel modelNoLabel;
    private javax.swing.JComboBox<String> priceComboBox;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField productNameText;
    private javax.swing.JButton searchProductsButton;
    private javax.swing.JTable searchResultTable;
    private javax.swing.JLabel vendorNameLabel;
    private javax.swing.JTextField vendorNameText;
    private javax.swing.JButton viewProductButton;
    // End of variables declaration//GEN-END:variables
}
