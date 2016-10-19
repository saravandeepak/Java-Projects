/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import business.Resume;
import business.ResumeHistory;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author saravandeepak
 */

public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    private ResumeHistory resumeHistory;
    public DisplayJPanel(ResumeHistory resumeHistory) {
        initComponents();
        this.resumeHistory = resumeHistory;
        populateTable();
        refreshfields();
        /*try{
        displayResume(resume);
        }
        catch (NullPointerException Ne){
        JOptionPane.showMessageDialog(null, "Image has not been uploaded");
        return;
        }*/
    }
    
public void populateTable()
{
    DefaultTableModel dtm = (DefaultTableModel) resumeTable.getModel();
    dtm.setRowCount(0);
    
    resumeHistory.getResumeHistory().stream().map((rs) -> {
        Object row[] = new Object[3];
        row[0] = rs;
        row[1] = rs.getEmail();
        row[2] = rs.getPhoneNo();
            return row;
        }).forEach((row) -> {
            dtm.addRow(row);
        }); //for (Resume res: 
}
public void displayResume(Resume resume){
        
        try{
            if(resume.getSex().equals("Male")){
                salutationLabel.setText("Mr");
            }
            else if (resume.getSex().equals("Female")){
                salutationLabel.setText("Ms");
            }
            }
        catch(Exception e)
        {
            salutationLabel.setText("");
        }         

        nameLabel.setText(resume.getName());
        emailLabel.setText(resume.getEmail());
        phoneNoLabel.setText(String.valueOf(resume.getPhoneNo()));
        try{
        dispPic.setIcon(new ImageIcon(resume.getImg()));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Pic was not uploaded");
        }
        streetLineLabel.setText(resume.getStreet());
        cityStateCountryLabel.setText(resume.getCityStateCountry());
        zipCodeLabel.setText(String.valueOf(resume.getZipCode()));
        cosTextArea.setText(resume.getCarrierObjStmt());
        comp1NameLabel.setText(resume.getComp1Name());
        comp1RoleLabel.setText(resume.getComp1Role());
        comp2NameLabel.setText(resume.getComp2Name());
        comp2RoleLabel.setText(resume.getComp2Role());
        pgCourseLabel.setText(resume.getPgCourse());
        pgcollegeNameLabel.setText(resume.getPgCollegeName());
        pgDateLabel.setText(resume.getPgDate());
        pgPercLabel.setText(String.valueOf(resume.getPgPerc()));
        ugNameLabel.setText(resume.getUgCollegeName());
        ugCourseLabel.setText(resume.getUgCourse());
        ugDateLabel.setText(resume.getUgDate());
        ugPercLabel.setText(String.valueOf(resume.getUgPerc()));
        affiliationsTextArea.setText(resume.getAffiliation());
        skillsTextArea.setText(resume.getSkills());
        projectsText.setText(resume.getProjects());
        extraCurTextArea.setText(resume.getExtraCurricular());
        comp1DateLabel.setText(resume.getComp1Date());
        comp2DateLabel.setText(resume.getComp2Date());
}
    public void refreshfields(){
        salutationLabel.setText("");
        nameLabel.setText("");
        streetLineLabel.setText("");
        cityStateCountryLabel.setText("");
        zipCodeLabel.setText("");
        emailLabel.setText("");
        phoneNoLabel.setText("");
        cosTextArea.setText("");
        comp1NameLabel.setText("");
        comp1RoleLabel.setText("");
        comp1DateLabel.setText("");
        comp2NameLabel.setText("");
        comp2RoleLabel.setText("");
        comp2DateLabel.setText("");
        pgcollegeNameLabel.setText("");
        pgCourseLabel.setText("");
        pgDateLabel.setText("");
        pgPercLabel.setText("");
        ugNameLabel.setText("");
        ugCourseLabel.setText("");
        ugDateLabel.setText("");
        ugPercLabel.setText("");
        projectsText.setText("");
        affiliationsTextArea.setText("");
        skillsTextArea.setText("");
        extraCurTextArea.setText("");
        dispPic.setIcon(new ImageIcon(getClass().getResource("/userinterface/userpicdefault.jpeg")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayScrollPane = new javax.swing.JScrollPane();
        displayInnerPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        streetLineLabel = new javax.swing.JLabel();
        cityStateCountryLabel = new javax.swing.JLabel();
        zipCodeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneNoLabel = new javax.swing.JLabel();
        dispPic = new javax.swing.JLabel();
        resumeSeparator = new javax.swing.JSeparator();
        cosTag = new javax.swing.JLabel();
        workExTag = new javax.swing.JLabel();
        comp1NameLabel = new javax.swing.JLabel();
        comp1RoleLabel = new javax.swing.JLabel();
        comp1DateLabel = new javax.swing.JLabel();
        comp2NameLabel = new javax.swing.JLabel();
        comp2RoleLabel = new javax.swing.JLabel();
        comp2DateLabel = new javax.swing.JLabel();
        eductaionTag = new javax.swing.JLabel();
        pgCourseLabel = new javax.swing.JLabel();
        pgcollegeNameLabel = new javax.swing.JLabel();
        pgPercLabel = new javax.swing.JLabel();
        pgDateLabel = new javax.swing.JLabel();
        ugCourseLabel = new javax.swing.JLabel();
        ugPercLabel = new javax.swing.JLabel();
        ugDateLabel = new javax.swing.JLabel();
        ugNameLabel = new javax.swing.JLabel();
        affiliationTag = new javax.swing.JLabel();
        cosScrollPane = new javax.swing.JScrollPane();
        cosTextArea = new javax.swing.JTextArea();
        affiliationsScrollPane = new javax.swing.JScrollPane();
        affiliationsTextArea = new javax.swing.JTextArea();
        skillTag = new javax.swing.JLabel();
        skillsScrollPane = new javax.swing.JScrollPane();
        skillsTextArea = new javax.swing.JTextArea();
        extraCurTag = new javax.swing.JLabel();
        extraCurScrollPane = new javax.swing.JScrollPane();
        extraCurTextArea = new javax.swing.JTextArea();
        tableScrollPane = new javax.swing.JScrollPane();
        resumeTable = new javax.swing.JTable();
        tableResumeSeparator = new javax.swing.JSeparator();
        viewResumeButton = new javax.swing.JButton();
        deleteResumeButton = new javax.swing.JButton();
        buttonLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        projectsText = new javax.swing.JTextArea();
        salutationLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(665, 1100));
        setLayout(new java.awt.BorderLayout());

        displayScrollPane.setMinimumSize(new java.awt.Dimension(665, 1100));

        displayInnerPanel.setBackground(new java.awt.Color(255, 255, 255));
        displayInnerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        displayInnerPanel.setMinimumSize(new java.awt.Dimension(665, 1100));
        displayInnerPanel.setPreferredSize(new java.awt.Dimension(665, 1149));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        nameLabel.setText("Name");

        streetLineLabel.setForeground(new java.awt.Color(51, 51, 51));
        streetLineLabel.setText("Street line");

        cityStateCountryLabel.setForeground(new java.awt.Color(51, 51, 51));
        cityStateCountryLabel.setText("City, State, Country");

        zipCodeLabel.setForeground(new java.awt.Color(51, 51, 51));
        zipCodeLabel.setText("ZipCode");

        emailLabel.setForeground(new java.awt.Color(51, 51, 255));
        emailLabel.setText("email");

        phoneNoLabel.setForeground(new java.awt.Color(51, 51, 51));
        phoneNoLabel.setText("Cell");

        dispPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/userpicdefault.jpeg"))); // NOI18N

        resumeSeparator.setBackground(new java.awt.Color(0, 0, 0));

        cosTag.setText("<html><u>Career Objective:</u></html>");

        workExTag.setText("<html><u>Work Experience:</u></html>");

        comp1NameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        comp1NameLabel.setText("Comp1Name");

        comp1RoleLabel.setFont(new java.awt.Font("Lucida Grande", 2, 12)); // NOI18N
        comp1RoleLabel.setForeground(new java.awt.Color(51, 51, 51));
        comp1RoleLabel.setText("Comp1Role");

        comp1DateLabel.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        comp1DateLabel.setForeground(new java.awt.Color(51, 51, 51));
        comp1DateLabel.setText("Start - End");

        comp2NameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        comp2NameLabel.setText("Comp2Name");

        comp2RoleLabel.setFont(new java.awt.Font("Lucida Grande", 2, 12)); // NOI18N
        comp2RoleLabel.setForeground(new java.awt.Color(51, 51, 51));
        comp2RoleLabel.setText("Comp2Role");

        comp2DateLabel.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        comp2DateLabel.setForeground(new java.awt.Color(51, 51, 51));
        comp2DateLabel.setText("Start - End");

        eductaionTag.setText("<html><u>Education:</u></html>");

        pgCourseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pgCourseLabel.setText("PG Degree/Course");

        pgcollegeNameLabel.setFont(new java.awt.Font("Lucida Grande", 2, 12)); // NOI18N
        pgcollegeNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        pgcollegeNameLabel.setText("PG College Name");

        pgPercLabel.setForeground(new java.awt.Color(51, 51, 51));
        pgPercLabel.setText("%");

        pgDateLabel.setForeground(new java.awt.Color(51, 51, 51));
        pgDateLabel.setText("End Date");

        ugCourseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ugCourseLabel.setText("UG Degree/Course");

        ugPercLabel.setForeground(new java.awt.Color(51, 51, 51));
        ugPercLabel.setText("%");

        ugDateLabel.setForeground(new java.awt.Color(51, 51, 51));
        ugDateLabel.setText("End Date");

        ugNameLabel.setFont(new java.awt.Font("Lucida Grande", 2, 12)); // NOI18N
        ugNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        ugNameLabel.setText("UG College Name");

        affiliationTag.setText("<html><u>Affiliations:</u><html>");

        cosTextArea.setEditable(false);
        cosTextArea.setColumns(20);
        cosTextArea.setLineWrap(true);
        cosTextArea.setRows(5);
        cosTextArea.setBorder(null);
        cosScrollPane.setViewportView(cosTextArea);

        affiliationsTextArea.setEditable(false);
        affiliationsTextArea.setColumns(20);
        affiliationsTextArea.setLineWrap(true);
        affiliationsTextArea.setRows(5);
        affiliationsScrollPane.setViewportView(affiliationsTextArea);

        skillTag.setText("<html><u>Skills:</u><html>");

        skillsTextArea.setEditable(false);
        skillsTextArea.setColumns(20);
        skillsTextArea.setLineWrap(true);
        skillsTextArea.setRows(5);
        skillsScrollPane.setViewportView(skillsTextArea);

        extraCurTag.setText("<html><u>Extra<br>Curricular<br>Activities:</u></html>");

        extraCurTextArea.setEditable(false);
        extraCurTextArea.setColumns(20);
        extraCurTextArea.setLineWrap(true);
        extraCurTextArea.setRows(5);
        extraCurScrollPane.setViewportView(extraCurTextArea);

        resumeTable.setBackground(new java.awt.Color(204, 255, 204));
        resumeTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resumeTable.setForeground(new java.awt.Color(0, 51, 51));
        resumeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Phone No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(resumeTable);
        if (resumeTable.getColumnModel().getColumnCount() > 0) {
            resumeTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        viewResumeButton.setBackground(new java.awt.Color(204, 255, 204));
        viewResumeButton.setForeground(new java.awt.Color(0, 51, 51));
        viewResumeButton.setText("View Resume");
        viewResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResumeButtonActionPerformed(evt);
            }
        });

        deleteResumeButton.setBackground(new java.awt.Color(204, 255, 204));
        deleteResumeButton.setForeground(new java.awt.Color(0, 51, 51));
        deleteResumeButton.setText("Delete Resume");
        deleteResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResumeButtonActionPerformed(evt);
            }
        });

        buttonLabel.setText("<html><u>Project/<br>Research<u><html>");

        projectsText.setEditable(false);
        projectsText.setColumns(20);
        projectsText.setRows(5);
        jScrollPane7.setViewportView(projectsText);

        salutationLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        salutationLabel.setText("Mr");

        javax.swing.GroupLayout displayInnerPanelLayout = new javax.swing.GroupLayout(displayInnerPanel);
        displayInnerPanel.setLayout(displayInnerPanelLayout);
        displayInnerPanelLayout.setHorizontalGroup(
            displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayInnerPanelLayout.createSequentialGroup()
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                .addComponent(comp2NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comp2DateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ugNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                    .addComponent(comp1NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(comp1DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(displayInnerPanelLayout.createSequentialGroup()
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comp2RoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comp1RoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pgcollegeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                .addComponent(ugCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ugPercLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ugDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                .addComponent(pgCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pgPercLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pgDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayInnerPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityStateCountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(streetLineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zipCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(dispPic, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                .addComponent(salutationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(displayInnerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(affiliationTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eductaionTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cosTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(workExTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(skillTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(extraCurTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(affiliationsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                    .addComponent(skillsScrollPane)
                                    .addComponent(extraCurScrollPane)
                                    .addComponent(jScrollPane7)))
                            .addComponent(cosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(displayInnerPanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(viewResumeButton)
                        .addGap(137, 137, 137)
                        .addComponent(deleteResumeButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resumeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(displayInnerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableResumeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        displayInnerPanelLayout.setVerticalGroup(
            displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewResumeButton)
                    .addComponent(deleteResumeButton))
                .addGap(16, 16, 16)
                .addComponent(tableResumeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayInnerPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dispPic, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                .addComponent(streetLineLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cityStateCountryLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zipCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNoLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resumeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cosTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(workExTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comp1NameLabel)
                            .addComponent(comp1DateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comp1RoleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comp2NameLabel)
                            .addComponent(comp2DateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comp2RoleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eductaionTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pgCourseLabel)
                            .addComponent(pgPercLabel)
                            .addComponent(pgDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pgcollegeNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ugCourseLabel)
                            .addComponent(ugPercLabel)
                            .addComponent(ugDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ugNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displayInnerPanelLayout.createSequentialGroup()
                                .addComponent(affiliationTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(skillTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(skillsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(affiliationsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extraCurTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extraCurScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(displayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salutationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        displayScrollPane.setViewportView(displayInnerPanel);

        add(displayScrollPane, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResumeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = resumeTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            int option;
            option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Delete Resume", JOptionPane.YES_NO_OPTION);
     
            if(option==JOptionPane.YES_OPTION)
            {
                Resume res = (Resume)resumeTable.getValueAt(selectedRow,0);
                resumeHistory.deleteResume(res);
                populateTable();
                JOptionPane.showMessageDialog(this, "Deleted successfully");
                refreshfields();

            }
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You have to select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteResumeButtonActionPerformed

    private void viewResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResumeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = resumeTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            Resume resume = (Resume)resumeTable.getValueAt(selectedRow, 0);
            refreshfields();
            displayResume(resume);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You have to select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_viewResumeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel affiliationTag;
    private javax.swing.JScrollPane affiliationsScrollPane;
    private javax.swing.JTextArea affiliationsTextArea;
    private javax.swing.JLabel buttonLabel;
    private javax.swing.JLabel cityStateCountryLabel;
    private javax.swing.JLabel comp1DateLabel;
    private javax.swing.JLabel comp1NameLabel;
    private javax.swing.JLabel comp1RoleLabel;
    private javax.swing.JLabel comp2DateLabel;
    private javax.swing.JLabel comp2NameLabel;
    private javax.swing.JLabel comp2RoleLabel;
    private javax.swing.JScrollPane cosScrollPane;
    private javax.swing.JLabel cosTag;
    private javax.swing.JTextArea cosTextArea;
    private javax.swing.JButton deleteResumeButton;
    private javax.swing.JLabel dispPic;
    private javax.swing.JPanel displayInnerPanel;
    private javax.swing.JScrollPane displayScrollPane;
    private javax.swing.JLabel eductaionTag;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JScrollPane extraCurScrollPane;
    private javax.swing.JLabel extraCurTag;
    private javax.swing.JTextArea extraCurTextArea;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel pgCourseLabel;
    private javax.swing.JLabel pgDateLabel;
    private javax.swing.JLabel pgPercLabel;
    private javax.swing.JLabel pgcollegeNameLabel;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JTextArea projectsText;
    private javax.swing.JSeparator resumeSeparator;
    private javax.swing.JTable resumeTable;
    private javax.swing.JLabel salutationLabel;
    private javax.swing.JLabel skillTag;
    private javax.swing.JScrollPane skillsScrollPane;
    private javax.swing.JTextArea skillsTextArea;
    private javax.swing.JLabel streetLineLabel;
    private javax.swing.JSeparator tableResumeSeparator;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel ugCourseLabel;
    private javax.swing.JLabel ugDateLabel;
    private javax.swing.JLabel ugNameLabel;
    private javax.swing.JLabel ugPercLabel;
    private javax.swing.JButton viewResumeButton;
    private javax.swing.JLabel workExTag;
    private javax.swing.JLabel zipCodeLabel;
    // End of variables declaration//GEN-END:variables
}