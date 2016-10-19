/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import config.InitializationConfig;
import business.University;
import business.UniversityEcoSystem;
import business.college.College;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author nithinkartha
 */
public class EcoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EcoJPanel
     */
    private JPanel userContainerJPanel;
    private InitializationConfig initialize;

  

    EcoJPanel(JPanel userContainerJPanel, InitializationConfig initialize) {
        initComponents();
        this.initialize = initialize;
        this.userContainerJPanel = userContainerJPanel;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dTM = (DefaultTableModel) tblUniversity.getModel();
        dTM.setRowCount(0);
        for (University university : initialize.getEco().getUniversityList()) {
            Object row[] = new Object[1];
            row[0] = university;

            dTM.addRow(row);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUniversity = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnGenerate = new javax.swing.JButton();
        universityEcoLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        tblUniversity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                           University Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUniversity);
        if (tblUniversity.getColumnModel().getColumnCount() > 0) {
            tblUniversity.getColumnModel().getColumn(0).setResizable(false);
        }

        btnView.setText("View University details>>");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnGenerate.setText("Generate Ecosystem Report");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        universityEcoLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        universityEcoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        universityEcoLabel.setText("University Ecosystem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGenerate)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universityEcoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(universityEcoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        generateUniversityReport(this.initialize.getEco());
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblUniversity.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            University university = (University) tblUniversity.getValueAt(selectedRow, 0);

            UniversityJPanel panel = new UniversityJPanel(userContainerJPanel, university);
            userContainerJPanel.add("UniversityJPanel", panel);
            CardLayout layout = (CardLayout) userContainerJPanel.getLayout();
            layout.next(userContainerJPanel);

        }
    }//GEN-LAST:event_btnViewActionPerformed
    public void generateUniversityReport(UniversityEcoSystem universityEco){
        XSSFWorkbook xcel = new XSSFWorkbook();
        XSSFSheet sheet =  xcel.createSheet("University details");
        
        XSSFCellStyle headerStyle = xcel.createCellStyle();
        XSSFFont font = xcel.createFont();
        font.setBold(true);
        headerStyle.setFont(font);
        
        XSSFRow headerRow = sheet.createRow(0); 
        XSSFCell headerCell1 = headerRow.createCell(0);
        headerCell1.setCellValue("University Name");
        headerCell1.setCellStyle(headerStyle);
        XSSFCell headerCell2 = headerRow.createCell(1);
        headerCell2.setCellValue("University Revenue");
        headerCell2.setCellStyle(headerStyle);
        XSSFCell headerCell3 = headerRow.createCell(2);
        headerCell3.setCellValue("University Profit/Loss");
        headerCell3.setCellStyle(headerStyle);
        XSSFCell headerCell04 = headerRow.createCell(3);
        headerCell04.setCellValue("Faculty Strength");
        headerCell04.setCellStyle(headerStyle);
        XSSFCell headerCell05 = headerRow.createCell(4);
        headerCell05.setCellValue("Staff Strength");
        headerCell05.setCellStyle(headerStyle);
        XSSFCell headerCell06 = headerRow.createCell(5);
        headerCell06.setCellValue("No of students");
        headerCell06.setCellStyle(headerStyle);
        
        XSSFRow sizeHeaderRow = sheet.createRow(10); 
        XSSFCell sizeHeaderCell = sizeHeaderRow.createCell(0);
        sizeHeaderCell.setCellValue("Number of Universities present");
        sizeHeaderCell.setCellStyle(headerStyle);
        XSSFRow sizeRow = sheet.createRow(11); 
        XSSFCell sizeCell = sizeRow.createCell(0);
        sizeCell.setCellValue(universityEco.getUniversityList().size());
        
        for(int i=0;i<universityEco.getUniversityList().size();i++){
            XSSFRow row = sheet.createRow(i+1); 
            XSSFCell cell0 = row.createCell(0);
            cell0.setCellValue(universityEco.getUniversityList().get(i).getUniversityName());
            XSSFCell cell1 = row.createCell(1);
            cell1.setCellValue(universityEco.getUniversityList().get(i).calculateUniversityRevenue());
            XSSFCell cell2 = row.createCell(2);
            cell2.setCellValue(universityEco.getUniversityList().get(i).calculateUniversityProfitLoss());
            XSSFCell cell3 = row.createCell(3);
            cell3.setCellValue(universityEco.getUniversityList().get(i).calculateUniFacultyStrength());
            XSSFCell cell4 = row.createCell(4);
            cell4.setCellValue(universityEco.getUniversityList().get(i).calculateUniStaffStrength());
            XSSFCell cell5 = row.createCell(5);
            cell5.setCellValue(universityEco.getUniversityList().get(i).getUniversityStudentDirectory().size());
            
        }
        
        XSSFSheet sheet1 =  xcel.createSheet("University College details");
        XSSFRow headerRow1 = sheet1.createRow(0);
        XSSFCell headerCell4 = headerRow1.createCell(0);
        headerCell4.setCellValue("University Name");
        headerCell4.setCellStyle(headerStyle);
        XSSFCell headerCell5 = headerRow1.createCell(1);
        headerCell5.setCellValue("College Name");
        headerCell5.setCellStyle(headerStyle);
        XSSFCell headerCell6 = headerRow1.createCell(2);
        headerCell6.setCellValue("No of Students");
        headerCell6.setCellStyle(headerStyle);
        

        
        
        int i = 1;
        for(University u: universityEco.getUniversityList()){
            for(College c: u.getCollegeList()){
                XSSFRow row = sheet1.createRow(i); 
                XSSFCell cell = row.createCell(0);
                cell.setCellValue(u.getUniversityName());
                XSSFCell cell1 = row.createCell(1);
                cell1.setCellValue(c.getCollegeName());
                XSSFCell cell2 = row.createCell(2);
                cell2.setCellValue(c.getCollegeStudentDirectory().size());
                i++;
            }
        }
        try
        {
            try ( //Write the workbook in file system
                    FileOutputStream out = new FileOutputStream(new File("universityEco.xlsx"))) {
                    xcel.write(out);
                    JOptionPane.showMessageDialog(this, "University Ecosystem Report has been created. Check your project folder for universityEco.xlsx");
            }
            System.out.println("universityEco.xlsx written successfully on disk.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblUniversity;
    private javax.swing.JLabel universityEcoLabel;
    // End of variables declaration//GEN-END:variables
}
