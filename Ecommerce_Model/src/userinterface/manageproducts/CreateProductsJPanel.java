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
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author saravandeepak
 */
public class CreateProductsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateProductsJPanel
     */
    
    private JPanel userProcessContainer;
    private ProductMasterCatalog productCatalog;
    private Vendor vendor;
    private Image image;
    CreateProductsJPanel(JPanel userProcessContainer, ProductMasterCatalog productCatalog, Vendor vendor) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCatalog = productCatalog;
        this.vendor = vendor;
        vendorNameLabel.setText(vendor.getVendorName());
    }
    
    
    public void refreshFields(){
        categoryButtonGroup.setSelected(computerRb.getModel(), true);
        productNameText.setText("");
        modelNoText.setText("");
        descriptionText.setText("");
        featuresText.setText("");
        basePriceText.setText("");
        ceilingPriceText.setText("");
        floorPriceText.setText("");
        otherInfoText.setText("");
        pictureLabel.setIcon(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryButtonGroup = new javax.swing.ButtonGroup();
        createProduct = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        productNameText = new javax.swing.JTextField();
        modelNoLabel = new javax.swing.JLabel();
        modelNoText = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        basePriceText = new javax.swing.JTextField();
        featuresLabel = new javax.swing.JLabel();
        ceilingPriceText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        featuresText = new javax.swing.JTextArea();
        categoryLabel = new javax.swing.JLabel();
        basePriceLabel = new javax.swing.JLabel();
        ceilingPriceLabel = new javax.swing.JLabel();
        floorPriceLabel = new javax.swing.JLabel();
        floorPriceText = new javax.swing.JTextField();
        otherInfoLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        otherInfoText = new javax.swing.JTextArea();
        pictureLabel = new javax.swing.JLabel();
        uploadPicButton = new javax.swing.JButton();
        createProductButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        dollar1Label = new javax.swing.JLabel();
        dollar2Label = new javax.swing.JLabel();
        dollar3Label = new javax.swing.JLabel();
        computerRb = new javax.swing.JRadioButton();
        printerRb = new javax.swing.JRadioButton();
        hardwareRb = new javax.swing.JRadioButton();
        softwareRb = new javax.swing.JRadioButton();
        vendorNameLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 5));
        setForeground(new java.awt.Color(255, 255, 204));

        createProduct.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        createProduct.setForeground(new java.awt.Color(255, 255, 204));
        createProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createProduct.setText("Create Product");

        productNameLabel.setForeground(new java.awt.Color(255, 255, 204));
        productNameLabel.setText("Product Name:");

        modelNoLabel.setForeground(new java.awt.Color(255, 255, 204));
        modelNoLabel.setText("Model Number");

        descriptionLabel.setForeground(new java.awt.Color(255, 255, 204));
        descriptionLabel.setText("Product Description:");

        featuresLabel.setForeground(new java.awt.Color(255, 255, 204));
        featuresLabel.setText("Product Features:");

        descriptionText.setColumns(20);
        descriptionText.setRows(5);
        jScrollPane1.setViewportView(descriptionText);

        featuresText.setColumns(20);
        featuresText.setRows(5);
        jScrollPane2.setViewportView(featuresText);

        categoryLabel.setForeground(new java.awt.Color(255, 255, 204));
        categoryLabel.setText("Category:");

        basePriceLabel.setForeground(new java.awt.Color(255, 255, 204));
        basePriceLabel.setText("Base Price:");

        ceilingPriceLabel.setForeground(new java.awt.Color(255, 255, 204));
        ceilingPriceLabel.setText("Ceiling Price:");

        floorPriceLabel.setForeground(new java.awt.Color(255, 255, 204));
        floorPriceLabel.setText("Floor Price:");

        floorPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorPriceTextActionPerformed(evt);
            }
        });

        otherInfoLabel.setForeground(new java.awt.Color(255, 255, 204));
        otherInfoLabel.setText("<html>Other Information:<br>(Warranty, <br>Terms of use,<br>etc.)<html>");

        otherInfoText.setColumns(20);
        otherInfoText.setRows(5);
        jScrollPane4.setViewportView(otherInfoText);

        pictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureLabel.setText("Picture");
        pictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uploadPicButton.setBackground(new java.awt.Color(51, 51, 51));
        uploadPicButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadPicButton.setText("Upload Picture");
        uploadPicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPicButtonActionPerformed(evt);
            }
        });

        createProductButton.setBackground(new java.awt.Color(51, 51, 51));
        createProductButton.setForeground(new java.awt.Color(255, 255, 255));
        createProductButton.setText("Create Product");
        createProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProductButtonActionPerformed(evt);
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

        dollar1Label.setForeground(new java.awt.Color(255, 255, 204));
        dollar1Label.setText("$");

        dollar2Label.setForeground(new java.awt.Color(255, 255, 204));
        dollar2Label.setText("$");

        dollar3Label.setForeground(new java.awt.Color(255, 255, 204));
        dollar3Label.setText("$");

        categoryButtonGroup.add(computerRb);
        computerRb.setForeground(new java.awt.Color(255, 255, 204));
        computerRb.setSelected(true);
        computerRb.setText("Computer");

        categoryButtonGroup.add(printerRb);
        printerRb.setForeground(new java.awt.Color(255, 255, 204));
        printerRb.setText("Printer");

        categoryButtonGroup.add(hardwareRb);
        hardwareRb.setForeground(new java.awt.Color(255, 255, 204));
        hardwareRb.setText("Hardware Product");

        categoryButtonGroup.add(softwareRb);
        softwareRb.setForeground(new java.awt.Color(255, 255, 204));
        softwareRb.setText("Software Product");

        vendorNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        vendorNameLabel.setForeground(new java.awt.Color(255, 255, 204));
        vendorNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(121, 121, 121)
                        .addComponent(createProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(createProductButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(featuresLabel)
                            .addComponent(descriptionLabel)
                            .addComponent(modelNoLabel)
                            .addComponent(productNameLabel)
                            .addComponent(basePriceLabel)
                            .addComponent(otherInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uploadPicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(basePriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(dollar1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ceilingPriceLabel)
                                .addGap(0, 0, 0)
                                .addComponent(ceilingPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(dollar2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(floorPriceLabel)
                                .addGap(0, 0, 0)
                                .addComponent(floorPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(dollar3Label))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(modelNoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(computerRb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(printerRb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hardwareRb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(softwareRb))))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(vendorNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(createProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vendorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(computerRb)
                    .addComponent(printerRb)
                    .addComponent(hardwareRb)
                    .addComponent(softwareRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameLabel)
                    .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelNoLabel)
                    .addComponent(modelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(featuresLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basePriceLabel)
                    .addComponent(basePriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dollar1Label)
                    .addComponent(ceilingPriceLabel)
                    .addComponent(ceilingPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dollar2Label)
                    .addComponent(floorPriceLabel)
                    .addComponent(floorPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dollar3Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadPicButton))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createProductButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout card = (CardLayout)userProcessContainer.getLayout();
        card.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void floorPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorPriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floorPriceTextActionPerformed

    private void createProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProductButtonActionPerformed
        // TODO add your handling code here:
        if(productNameText.getText().equals("") || modelNoText.getText().equals("") || descriptionText.getText().equals("") || featuresText.getText().equals("") || basePriceText.getText().equals("") || floorPriceText.getText().equals("") || ceilingPriceText.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Fill all the fields","Warning",JOptionPane.WARNING_MESSAGE); 
        }
        else{
            ProductMaster product = new ProductMaster();
            product.setProductName(productNameText.getText());
            product.setModelNo(modelNoText.getText());
            product.setProductDescription(descriptionText.getText());
            product.setProductFeatures(featuresText.getText());
            try{
            product.setBasePrice(Double.parseDouble(basePriceText.getText()));
            product.setCeilingPrice(Double.parseDouble(ceilingPriceText.getText()));
            product.setFloorPrice(Double.parseDouble(floorPriceText.getText()));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Price can be only numbers below 999,999", "Error", JOptionPane.ERROR_MESSAGE); 
                basePriceText.grabFocus();
                return;
            }
            if(basePriceText.getText().length()>6 || ceilingPriceText.getText().length()>6 || floorPriceText.getText().length()>6){
                JOptionPane.showMessageDialog(this, "Max price can only be 999,999! We don't deal with millions worth products","Warning",JOptionPane.WARNING_MESSAGE);
                basePriceText.grabFocus();
                return;
            }
            if(Double.parseDouble(basePriceText.getText()) < Double.parseDouble(floorPriceText.getText()) || Double.parseDouble(ceilingPriceText.getText()) < Double.parseDouble(basePriceText.getText())) {
                JOptionPane.showMessageDialog(this, "Ceiling Price >= Base Price >= Floor Price","Warning",JOptionPane.WARNING_MESSAGE);
                basePriceText.grabFocus();
                return;
            }
            product.setOtherInfo(otherInfoText.getText());
            product.setVendorName(vendorNameLabel.getText());
            product.setProductImg(image);
            if(computerRb.isSelected()){
                product.setProductCategory(computerRb.getText());
            }
            else if(printerRb.isSelected()){
                product.setProductCategory(printerRb.getText());
            }
            else if(hardwareRb.isSelected()){
                product.setProductCategory(hardwareRb.getText());
            }
            else if(softwareRb.isSelected()){
                product.setProductCategory(softwareRb.getText());
            }

            productCatalog.addProduct(product);
            JOptionPane.showMessageDialog(this, "Product has been created");
            refreshFields();
            
        }
    }//GEN-LAST:event_createProductButtonActionPerformed

    private void uploadPicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPicButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser imageChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter( "JPG Images","jpg");
        imageChooser.setFileFilter(imageFilter);
        imageChooser.addChoosableFileFilter(imageFilter);
        imageChooser.setAcceptAllFileFilterUsed(false);
        imageChooser.showOpenDialog(null);
        String imgFilePath;
        imgFilePath = imageChooser.getSelectedFile().getAbsolutePath();
        Image img;
        try {
            img = ImageIO.read(new File(imgFilePath));
            image = img.getScaledInstance(110, 110, Image.SCALE_AREA_AVERAGING);

            pictureLabel.setIcon(new ImageIcon(image));

        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot Upload");

        }
    }//GEN-LAST:event_uploadPicButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel basePriceLabel;
    private javax.swing.JTextField basePriceText;
    private javax.swing.ButtonGroup categoryButtonGroup;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel ceilingPriceLabel;
    private javax.swing.JTextField ceilingPriceText;
    private javax.swing.JRadioButton computerRb;
    private javax.swing.JLabel createProduct;
    private javax.swing.JButton createProductButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JLabel dollar1Label;
    private javax.swing.JLabel dollar2Label;
    private javax.swing.JLabel dollar3Label;
    private javax.swing.JLabel featuresLabel;
    private javax.swing.JTextArea featuresText;
    private javax.swing.JLabel floorPriceLabel;
    private javax.swing.JTextField floorPriceText;
    private javax.swing.JRadioButton hardwareRb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel modelNoLabel;
    private javax.swing.JTextField modelNoText;
    private javax.swing.JLabel otherInfoLabel;
    private javax.swing.JTextArea otherInfoText;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JRadioButton printerRb;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField productNameText;
    private javax.swing.JRadioButton softwareRb;
    private javax.swing.JButton uploadPicButton;
    private javax.swing.JLabel vendorNameLabel;
    // End of variables declaration//GEN-END:variables
}
