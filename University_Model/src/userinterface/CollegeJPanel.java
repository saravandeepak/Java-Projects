/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.college.College;
import business.college.alumni.Alumni;
import business.college.alumni.EmployedStudents;
import business.college.alumni.HigherStudiesStudents;
import business.college.alumni.UnemployedStudents;
import business.college.department.Department;
import business.college.department.student.Student;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Font;
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
public class CollegeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CollegeJPanel
     */
    private JPanel userContainerJPanel;
    private College college;
    public CollegeJPanel(JPanel userContainerJPanel, College college) {
        initComponents();
        this.college= college;
        this.userContainerJPanel = userContainerJPanel;
        populateTable();
        collgeNameLabel.setText(college.getCollegeName());
   }

    private void populateTable() {
        DefaultTableModel dTM = (DefaultTableModel) tblDepartment.getModel();
        dTM.setRowCount(0);
        for (Department department : college.getDepartmentDirectory()) {
            Object row[] = new Object[1];
            row[0] = department;

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
        tblDepartment = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        collgeNameLabel = new javax.swing.JLabel();
        collegeReportButton = new javax.swing.JButton();
        alumniReport = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        tblDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                           Department Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDepartment);

        btnView.setText("View Department Details>>");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        collgeNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        collgeNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collgeNameLabel.setText("jLabel1");

        collegeReportButton.setText("Generate College Report");
        collegeReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeReportButtonActionPerformed(evt);
            }
        });

        alumniReport.setText("Generate College Alumni Report");
        alumniReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumniReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(collgeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnView))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(collegeReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alumniReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(collgeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collegeReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alumniReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userContainerJPanel.remove(this);
        CardLayout layout = (CardLayout)userContainerJPanel.getLayout();
        layout.previous(userContainerJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
                int selectedRow = tblDepartment.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Department department = (Department) tblDepartment.getValueAt(selectedRow, 0);

            DepartmentJPanel panel = new DepartmentJPanel(userContainerJPanel, department);
            userContainerJPanel.add("DepartmentJPanel", panel);
            CardLayout layout = (CardLayout) userContainerJPanel.getLayout();
            layout.next(userContainerJPanel);

        }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void alumniReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumniReportActionPerformed
        // TODO add your handling code here:
        generateAlumniReport(college.getGraduatedStudents());
        
    }//GEN-LAST:event_alumniReportActionPerformed

    private void collegeReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeReportButtonActionPerformed
        generateCollegeReport(college);
    }//GEN-LAST:event_collegeReportButtonActionPerformed

    public void generateAlumniReport(Alumni alumni){
        XSSFWorkbook xcel = new XSSFWorkbook();
        XSSFCellStyle headerStyle = xcel.createCellStyle();
        XSSFCellStyle tableStyle = xcel.createCellStyle();
        
        tableStyle.setBorderBottom(BorderStyle.THICK);
        tableStyle.setBorderRight(BorderStyle.THICK);
        
        Font font = xcel.createFont();
        font.setBold(true);
        headerStyle.setFont(font);
        
        NumberFormat formatter = NumberFormat.getInstance(Locale.US);
        formatter.setMaximumFractionDigits(1);
        formatter.setMinimumFractionDigits(1);
        formatter.setRoundingMode(RoundingMode.HALF_UP); 
        
        XSSFSheet alumniSheet =  xcel.createSheet("Alumni Details");
        XSSFRow headerRow = alumniSheet.createRow(0); 
        XSSFCell hcell1 = headerRow.createCell(1);
        hcell1.setCellValue("Number of Students");
        hcell1.setCellStyle(headerStyle);
        
        XSSFCell hcell2 = headerRow.createCell(2);
        hcell2.setCellValue("% of Students");
        hcell2.setCellStyle(headerStyle);
        
        
        
        XSSFRow row1 = alumniSheet.createRow(1); 
        XSSFCell cell1 = row1.createCell(0);
        cell1.setCellValue("Employed Students");
        cell1.setCellStyle(headerStyle);
        XSSFCell cell2 = row1.createCell(1);
        cell2.setCellValue(alumni.getEmployedDirectory().getEmployedDirectory().size());
        XSSFCell cell3 = row1.createCell(2);
        cell3.setCellValue(formatter.format(alumni.employedPercentage()));
        XSSFCell cell10 = row1.createCell(3);
        cell10.setCellValue("Avg Salary");
        XSSFCell cell11 = row1.createCell(4);
        cell11.setCellValue(alumni.getEmployedDirectory().avgSalary());
        
        
        XSSFRow row2 = alumniSheet.createRow(2); 
        XSSFCell cell4 = row2.createCell(0);
        cell4.setCellValue("Higher Studies Students");
        cell4.setCellStyle(headerStyle);
        XSSFCell cell5 = row2.createCell(1);
        cell5.setCellValue(alumni.getHigherStudiesDirectory().getHigherStudiesDirectory().size());
        XSSFCell cell6 = row2.createCell(2);
        cell6.setCellValue(formatter.format(alumni.higherPercentage()));
           
        XSSFRow row3 = alumniSheet.createRow(3); 
        XSSFCell cell7 = row3.createCell(0);
        cell7.setCellValue("Unemployed Students");
        cell7.setCellStyle(headerStyle);
        XSSFCell cell8 = row3.createCell(1);
        cell8.setCellValue(alumni.getUnemployedDirectory().getUnemployedDirectory().size());
        XSSFCell cell9 = row3.createCell(2);
        cell9.setCellValue(formatter.format(alumni.unemployedPercentage()));
        
        
        XSSFSheet employedSheet =  xcel.createSheet("Employed Details");
        XSSFRow empheaderRow = employedSheet.createRow(0); 
        XSSFCell empHCell1 = empheaderRow.createCell(0);
        empHCell1.setCellValue("First Name");
        empHCell1.setCellStyle(headerStyle);
        XSSFCell empHCell2 = empheaderRow.createCell(1);
        empHCell2.setCellValue("Last Name");
        empHCell2.setCellStyle(headerStyle);
        XSSFCell empHCell3 = empheaderRow.createCell(2);
        empHCell3.setCellValue("Department");
        empHCell3.setCellStyle(headerStyle);
        XSSFCell empHCell4 = empheaderRow.createCell(3);
        empHCell4.setCellValue("Degree");
        empHCell4.setCellStyle(headerStyle);
        XSSFCell empHCell5 = empheaderRow.createCell(4);
        empHCell5.setCellValue("Employer");
        empHCell5.setCellStyle(headerStyle);
        XSSFCell empHCell6 = empheaderRow.createCell(5);
        empHCell6.setCellValue("Designation");
        empHCell6.setCellStyle(headerStyle);
        XSSFCell empHCell7 = empheaderRow.createCell(6);
        empHCell7.setCellValue("Salary");
        empHCell7.setCellStyle(headerStyle);
        
        int i = 1;
        for (EmployedStudents emp: alumni.getEmployedDirectory().getEmployedDirectory()){
            
            XSSFRow empRow = employedSheet.createRow(i); 
            XSSFCell empCell1 = empRow.createCell(0);
            empCell1.setCellValue(emp.getFirstName());
            
            XSSFCell empCell2 = empRow.createCell(1);
            empCell2.setCellValue(emp.getLastName());
            
            XSSFCell empCell3 = empRow.createCell(2);
            empCell3.setCellValue(emp.getDepartmentName());
            
            XSSFCell empCell4 = empRow.createCell(3);
            empCell4.setCellValue("");
            
            XSSFCell empCell5 = empRow.createCell(4);
            empCell5.setCellValue(emp.getEmployerName());
            
            XSSFCell empCell6 = empRow.createCell(5);
            empCell6.setCellValue(emp.getEmploymentDescription());
            
            XSSFCell empCell7 = empRow.createCell(6);
            empCell7.setCellValue(emp.getSalary());
            i++;
            
        }
        
        XSSFSheet higherSheet =  xcel.createSheet("Higher Studies Details");
        XSSFRow highheaderRow = higherSheet.createRow(0);
        XSSFCell highHCell1 = highheaderRow.createCell(0);
        highHCell1.setCellValue("First Name");
        highHCell1.setCellStyle(headerStyle);
        XSSFCell highHCell2 = highheaderRow.createCell(1);
        highHCell2.setCellValue("Last Name");
        highHCell2.setCellStyle(headerStyle);
        XSSFCell highHCell3 = highheaderRow.createCell(2);
        highHCell3.setCellValue("Department");
        highHCell3.setCellStyle(headerStyle);
        XSSFCell highHCell4 = highheaderRow.createCell(3);
        highHCell4.setCellValue("Degree");
        highHCell4.setCellStyle(headerStyle);
        XSSFCell highHCell5 = highheaderRow.createCell(5);
        highHCell5.setCellValue("PG University");
        highHCell5.setCellStyle(headerStyle);
        XSSFCell highHCell6 = highheaderRow.createCell(6);
        highHCell6.setCellValue("Major");
        highHCell6.setCellStyle(headerStyle);
        
        int j=1;
        for(HigherStudiesStudents hs: alumni.getHigherStudiesDirectory().getHigherStudiesDirectory()){
            
        
        XSSFRow highRow = higherSheet.createRow(j);
        XSSFCell highCell1 = highRow.createCell(0);
        highCell1.setCellValue(hs.getFirstName());
        
        XSSFCell highCell2 = highRow.createCell(1);
        highCell2.setCellValue(hs.getLastName());
        
        XSSFCell highCell3 = highRow.createCell(2);
        highCell3.setCellValue(hs.getDepartmentName());
        
        XSSFCell highCell4 = highRow.createCell(3);
        highCell4.setCellValue("");
        
        XSSFCell highCell5 = highRow.createCell(5);
        highCell5.setCellValue(hs.getUniversityName());
        
        XSSFCell highCell6 = highRow.createCell(6);
        highCell6.setCellValue(hs.getMajorName());
        
        j++;
        
        }
        
        XSSFSheet unEmpSheet =  xcel.createSheet("Unemployed Details");
        XSSFRow ueheaderRow = unEmpSheet.createRow(0);
        XSSFCell ueHCell1 = ueheaderRow.createCell(0);
        ueHCell1.setCellValue("First Name");
        ueHCell1.setCellStyle(headerStyle);
        XSSFCell ueHCell2 = ueheaderRow.createCell(1);
        ueHCell2.setCellValue("Last Name");
        ueHCell2.setCellStyle(headerStyle);
        XSSFCell ueHCell3 = ueheaderRow.createCell(2);
        ueHCell3.setCellValue("Department");
        ueHCell3.setCellStyle(headerStyle);
        XSSFCell ueHCell4 = ueheaderRow.createCell(3);
        ueHCell4.setCellValue("Degree");
        ueHCell4.setCellStyle(headerStyle);
        XSSFCell ueHCell5 = ueheaderRow.createCell(4);
        ueHCell5.setCellValue("Reason for Unemployment");
        ueHCell5.setCellStyle(headerStyle);
        
        
        int k=1;
        for(UnemployedStudents ue: alumni.getUnemployedDirectory().getUnemployedDirectory()){
            
        
        XSSFRow ueRow = unEmpSheet.createRow(k);
        XSSFCell ueCell1 = ueRow.createCell(0);
        ueCell1.setCellValue(ue.getFirstName());
        
        XSSFCell ueCell2 = ueRow.createCell(1);
        ueCell2.setCellValue(ue.getLastName());
        
        XSSFCell ueCell3 = ueRow.createCell(2);
        ueCell3.setCellValue(ue.getDepartmentName());
        
        XSSFCell ueCell4 = ueRow.createCell(3);
        ueCell4.setCellValue("");
        
        XSSFCell ueCell5 = ueRow.createCell(4);
        ueCell5.setCellValue(ue.getReasonForUnemp());
        
        
        k++;
        
        }
        
        
        try
        {
            try ( //Write the workbook in file system
                    FileOutputStream out = new FileOutputStream(new File(college.getCollegeName() + " Alumni.xlsx"))) {
                    xcel.write(out);
                    JOptionPane.showMessageDialog(this, "Alumni report has been created. Check your project folder for '" + college.getCollegeName() + " Alumni.xlsx'");
            }
            
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Could not create report");
        } 
        
    }
    
    private void generateCollegeReport(College college){
        XSSFWorkbook xcel = new XSSFWorkbook();
        XSSFSheet sheet =  xcel.createSheet("College details");
        
        XSSFCellStyle headerStyle = xcel.createCellStyle();
        XSSFFont font = xcel.createFont();
        font.setBold(true);
        headerStyle.setFont(font);
        {
            XSSFRow headerRow = sheet.createRow(0); 
            XSSFCell headerCell1 = headerRow.createCell(0);
            headerCell1.setCellValue("College Name");
            headerCell1.setCellStyle(headerStyle);
            XSSFCell headerCell2 = headerRow.createCell(1);
            headerCell2.setCellValue("College Revenue");
            headerCell2.setCellStyle(headerStyle);
            XSSFCell headerCell3 = headerRow.createCell(3);
            headerCell3.setCellValue("Number of Departments present");
            headerCell3.setCellStyle(headerStyle);
            XSSFCell headerCell4 = headerRow.createCell(4);
            headerCell4.setCellValue("university");
            headerCell4.setCellStyle(headerStyle);
            XSSFCell headerCell5 = headerRow.createCell(5);
            headerCell5.setCellValue("Number of students");
            headerCell5.setCellStyle(headerStyle);
            XSSFCell headerCell6 = headerRow.createCell(6);
            headerCell6.setCellValue("Employment rate %");
            headerCell6.setCellStyle(headerStyle);
            XSSFCell headerCell7 = headerRow.createCell(2);
            headerCell7.setCellValue("College Profit/Loss");
            headerCell7.setCellStyle(headerStyle);
            XSSFCell headerCell8 = headerRow.createCell(7);
            headerCell8.setCellValue("College Faculty Strength");
            headerCell8.setCellStyle(headerStyle);
            XSSFCell headerCell9 = headerRow.createCell(8);
            headerCell9.setCellValue("College Staff Strength");
            headerCell9.setCellStyle(headerStyle);
            XSSFCell headerCell10 = headerRow.createCell(9);
            headerCell10.setCellValue("Employed Students");
            headerCell10.setCellStyle(headerStyle);
            XSSFCell headerCell11 = headerRow.createCell(10);
            headerCell11.setCellValue("Unemployed Students");
            headerCell11.setCellStyle(headerStyle);
            XSSFCell headerCell12 = headerRow.createCell(11);
            headerCell12.setCellValue("Higher Studies Students");
            headerCell12.setCellStyle(headerStyle);
        }
        {
            XSSFRow row = sheet.createRow(1); 
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(college.getCollegeName());
            XSSFCell cell1 = row.createCell(1);
            cell1.setCellValue(college.calculateCollegeRevenue());
            XSSFCell cell2 = row.createCell(3);
            cell2.setCellValue(college.getDepartmentDirectory().size());
            XSSFCell cell3 = row.createCell(4);
            cell3.setCellValue(college.getUniversity().getUniversityName());
            XSSFCell cell4 = row.createCell(5);
            cell4.setCellValue(college.getCollegeStudentDirectory().size());
            XSSFCell cell5 = row.createCell(6);
            cell5.setCellValue(college.getGraduatedStudents().employmentRate());
            XSSFCell cell6 = row.createCell(2);
            cell6.setCellValue(college.calculateCollegeProfitLoss());
            XSSFCell cell7 = row.createCell(7);
            cell7.setCellValue(college.calculateCollegeFacultyStrength());
            XSSFCell cell8 = row.createCell(8);
            cell8.setCellValue(college.calculateCollegeStaffStrength());
            XSSFCell cell9 = row.createCell(9);
            cell9.setCellValue(college.getGraduatedStudents().getEmployedDirectory().getEmployedDirectory().size());
            XSSFCell cell10 = row.createCell(10);
            cell10.setCellValue(college.getGraduatedStudents().getUnemployedDirectory().getUnemployedDirectory().size());
            XSSFCell cell11 = row.createCell(11);
            cell11.setCellValue(college.getGraduatedStudents().getHigherStudiesDirectory().getHigherStudiesDirectory().size());
        }
        
        XSSFRow ratioHeaderRow = sheet.createRow(15);
        XSSFCell deptHeaderCell = ratioHeaderRow.createCell(0);
        deptHeaderCell.setCellValue("Department");
        deptHeaderCell.setCellStyle(headerStyle);
        XSSFCell ratioHeaderCell = ratioHeaderRow.createCell(1);
        ratioHeaderCell.setCellValue("Student to Faculty Ratio");
        ratioHeaderCell.setCellStyle(headerStyle);
        XSSFCell ratioHeaderCell1 = ratioHeaderRow.createCell(2);
        ratioHeaderCell1.setCellValue("Faculty to Staff Ratio");
        ratioHeaderCell1.setCellStyle(headerStyle);
        XSSFCell ratioHeaderCell2 = ratioHeaderRow.createCell(3);
        ratioHeaderCell2.setCellValue("Department Faculty Strength");
        ratioHeaderCell2.setCellStyle(headerStyle);
        XSSFCell ratioHeaderCell3 = ratioHeaderRow.createCell(4);
        ratioHeaderCell3.setCellValue("Department Staff Strength");
        ratioHeaderCell3.setCellStyle(headerStyle);
        XSSFCell ratioHeaderCell4 = ratioHeaderRow.createCell(5);
        ratioHeaderCell4.setCellValue("Department Revenue");
        ratioHeaderCell4.setCellStyle(headerStyle);
        XSSFCell ratioHeaderCell5 = ratioHeaderRow.createCell(6);
        ratioHeaderCell5.setCellValue("Department Spending");
        ratioHeaderCell5.setCellStyle(headerStyle);
        XSSFCell ratioHeaderCell6 = ratioHeaderRow.createCell(7);
        ratioHeaderCell6.setCellValue("Department Profit/Loss");
        ratioHeaderCell6.setCellStyle(headerStyle);
        
        
        int ratioRowCount = 16;
        for(int i=0;i<college.getDepartmentDirectory().size();i++){
            XSSFRow row1 = sheet.createRow(ratioRowCount); 
            XSSFCell ratioCell = row1.createCell(0);
            ratioCell.setCellValue(college.getDepartmentDirectory().get(i).getDepartmentName());
            XSSFCell ratioCell1 = row1.createCell(1);
            ratioCell1.setCellValue(college.getDepartmentDirectory().get(i).calculateStudentFacultyRatio());
            XSSFCell ratioCell2 = row1.createCell(2);
            ratioCell2.setCellValue(college.getDepartmentDirectory().get(i).calculateFacultyStaffRatio());
            XSSFCell ratioCell3 = row1.createCell(3);
            ratioCell3.setCellValue(college.getDepartmentDirectory().get(i).getFacultyDirectory().getFacultyDirectory().size());
            XSSFCell ratioCell4 = row1.createCell(4);
            ratioCell4.setCellValue(college.getDepartmentDirectory().get(i).getStaffDirectory().getStaffDirectory().size());
            XSSFCell ratioCell5 = row1.createCell(5);
            ratioCell5.setCellValue(college.getDepartmentDirectory().get(i).calculateDepartmentRevenue());
            XSSFCell ratioCell6 = row1.createCell(6);
            ratioCell6.setCellValue(college.getDepartmentDirectory().get(i).calculateDepartmentSpending());
            XSSFCell ratioCell7 = row1.createCell(7);
            ratioCell7.setCellValue(college.getDepartmentDirectory().get(i).calculateDepartmentProfitLoss());
            ratioRowCount++;
        }
        
        XSSFSheet sheet1 =  xcel.createSheet("Department details");
        XSSFRow headerRow1 = sheet1.createRow(0); 
        XSSFCell headerCell11 = headerRow1.createCell(0);
        headerCell11.setCellValue("Department Name");
        headerCell11.setCellStyle(headerStyle);
        XSSFCell headerCell12 = headerRow1.createCell(1);
        headerCell12.setCellValue("Courses");
        headerCell12.setCellStyle(headerStyle);
        XSSFCell headerCell13 = headerRow1.createCell(2);
        headerCell13.setCellValue("Course CRN");
        headerCell13.setCellStyle(headerStyle);
        XSSFCell headerCell14 = headerRow1.createCell(3);
        headerCell14.setCellValue("Course Credits");
        headerCell14.setCellStyle(headerStyle);
        XSSFCell headerCell15 = headerRow1.createCell(4);
        headerCell15.setCellValue("Course Description");
        headerCell15.setCellStyle(headerStyle);
        XSSFCell headerCell16 = headerRow1.createCell(5);
        headerCell16.setCellValue("Course Type");
        headerCell16.setCellStyle(headerStyle);
        
        int rowCount=1;
        for(int i=0;i<college.getDepartmentDirectory().size();i++){
            Department department = college.getDepartmentDirectory().get(i);
            for(int j=0;j<department.getCourseCatalog().getCourseCatalog().size();j++){
                    XSSFRow row1 = sheet1.createRow(rowCount); 
                    XSSFCell cell11 = row1.createCell(0);
                    cell11.setCellValue(department.getDepartmentName());
                    XSSFCell cell12 = row1.createCell(1);
                    cell12.setCellValue(department.getCourseCatalog().getCourseCatalog().get(j).getCourseName());
                    XSSFCell cell13 = row1.createCell(2);
                    cell13.setCellValue(department.getCourseCatalog().getCourseCatalog().get(j).getCourseCrn());
                    XSSFCell cell14 = row1.createCell(3);
                    cell14.setCellValue(department.getCourseCatalog().getCourseCatalog().get(j).getCourseCredit());
                    XSSFCell cell15 = row1.createCell(4);
                    cell15.setCellValue(department.getCourseCatalog().getCourseCatalog().get(j).getCourseDesc());
                    XSSFCell cell16 = row1.createCell(5);
                    cell16.setCellValue(department.getCourseCatalog().getCourseCatalog().get(j).getCourseType());
                    rowCount++;
            }
           
        }
        
        XSSFSheet sheet2 =  xcel.createSheet("Degrees and majors");
        XSSFRow headerRow2 = sheet2.createRow(0);
        XSSFCell headerCell21 = headerRow2.createCell(0);
        headerCell21.setCellValue("Programs");
        headerCell21.setCellStyle(headerStyle);
        
        int degreeRowCount = 1;
        for(int i=0;i<college.getDepartmentDirectory().size();i++){
            Department department = college.getDepartmentDirectory().get(i);
            for(int j=0;j<department.getDegreeList().size();j++){
                    XSSFRow row1 = sheet2.createRow(degreeRowCount); 
                    XSSFCell cell21 = row1.createCell(0);
                    cell21.setCellValue(department.getDegreeList().get(j).getDegreeType()+"-"+department.getDegreeList().get(j).getMajor());
                    degreeRowCount++;
            }
        }
        
       
        
        XSSFSheet sheet4 =  xcel.createSheet("Student Details");

        XSSFRow headerRow = sheet4.createRow(0); 
        XSSFCell headerCell1 = headerRow.createCell(0);
        headerCell1.setCellValue("First Name");
        headerCell1.setCellStyle(headerStyle);
        XSSFCell headerCell2 = headerRow.createCell(1);
        headerCell2.setCellValue("Last Name");
        headerCell2.setCellStyle(headerStyle);
        XSSFCell headerCell3 = headerRow.createCell(2);
        headerCell3.setCellValue("Student Id");
        headerCell3.setCellStyle(headerStyle);
        XSSFCell headerCell4 = headerRow.createCell(3);
        headerCell4.setCellValue("Email");
        headerCell4.setCellStyle(headerStyle);
        XSSFCell headerCell5 = headerRow.createCell(4);
        headerCell5.setCellValue("Nationality");
        headerCell5.setCellStyle(headerStyle);
        XSSFCell headerCell6 = headerRow.createCell(5);
        headerCell6.setCellValue("Tuition Expense");
        headerCell6.setCellStyle(headerStyle);
        int i= 1;
        for(Student student: college.getCollegeStudentDirectory()){
       
            XSSFRow row = sheet4.createRow(i); 
            XSSFCell cell1 = row.createCell(0);
            cell1.setCellValue(student.getFirstName());
            XSSFCell cell2 = row.createCell(1);
            cell2.setCellValue(student.getLastName());
            XSSFCell cell3 = row.createCell(2);
            cell3.setCellValue(student.getNuid());
            XSSFCell cell4 = row.createCell(3);
            cell4.setCellValue(student.getEmail());
            XSSFCell cell5 = row.createCell(4);
            cell5.setCellValue(student.getNationality());
            XSSFCell cell6 = row.createCell(5);
            cell6.setCellValue(student.getTuitionExpense());
            i++;
        }
        
        try
        {
            try ( //Write the workbook in file system
                    FileOutputStream out = new FileOutputStream(new File(college.getCollegeName()+"_College.xlsx"))) {
                    xcel.write(out);
                    JOptionPane.showMessageDialog(this, "College Report has been created. Check your project folder for " + college.getCollegeName()+"_College.xlsx");
            }
            System.out.println(college.getCollegeName()+"_College.xlsx written successfully on disk.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alumniReport;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JButton collegeReportButton;
    private javax.swing.JLabel collgeNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDepartment;
    // End of variables declaration//GEN-END:variables
}
