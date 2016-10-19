/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.college.College;
import business.college.department.student.Student;
import java.util.ArrayList;

/**
 *
 * @author saravandeepak
 */
public class University {
    private String universityName;
    private ArrayList<College> collegeList;
    private ArrayList<Student> universityStudentDirectory;
   
    public University(){
        collegeList = new ArrayList<College>();
        universityStudentDirectory = new ArrayList<Student>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public ArrayList<College> getCollegeList() {
        return collegeList;
    }

    public void setCollegeList(ArrayList<College> collegeList) {
        this.collegeList = collegeList;
    }

    public ArrayList<Student> getUniversityStudentDirectory() {
        return universityStudentDirectory;
    }

    public void setUniversityStudentDirectory(ArrayList<Student> universityStudentDirectory) {
        this.universityStudentDirectory = universityStudentDirectory;
    }
    
    public void getAllUniversityStudents(){
        for(College c : collegeList){
            universityStudentDirectory.addAll(c.getCollegeStudentDirectory());
        }
        
    }
    
    public College addCollege(){
        College college = new College(this);
        collegeList.add(college);
        return college;
    }
    public College searchCollege(String collegeName){
        for (int i=0; i< this.getCollegeList().size();i++){
            if(this.getCollegeList().get(i).getCollegeName().equals(collegeName)){
                return this.getCollegeList().get(i);
            }
        }
        return null;
    }
    
    public float getEmploymentRate(){
        float empRate = 0;
        int numberOfEmployed = 0;
        int numberOfUnEmployed = 0;
        
        for (int i=0; i< this.getCollegeList().size();i++){
            if (this.getCollegeList().get(i).getGraduatedStudents().getEmployedDirectory().getEmployedDirectory().isEmpty()) {
                
            } else {
                numberOfEmployed += this.getCollegeList().get(i).getGraduatedStudents().getEmployedDirectory().getEmployedDirectory().size();
                numberOfUnEmployed += this.getCollegeList().get(i).getGraduatedStudents().getUnemployedDirectory().getUnemployedDirectory().size();

            }
            

        }
        int totalNum = numberOfEmployed + numberOfUnEmployed;
        empRate = ((float)numberOfEmployed / (float)totalNum ) * 100 ;
        return empRate;
       
    }
    

    public void removeCollege(College college){
        collegeList.remove(college);
    }
    
    public long calculateUniversityRevenue(){
        long universityRevenue = 0;
        for(College c: collegeList){
            universityRevenue += c.calculateCollegeRevenue();
        }
        return universityRevenue;
    }
    public long calculateUniversitySpending(){
        long universitySpending = 0;
        for(College c : collegeList){
            universitySpending += c.calculateCollegeSpending();
        }
        return universitySpending;
    }
    
    public long calculateUniversityProfitLoss(){
        return this.calculateUniversityRevenue()-this.calculateUniversitySpending();
    }
    
    public int calculateNumberOfUniversityEmployees(){
        int numOfEmp = 0;
        for(College c : collegeList){
            numOfEmp += c.calculateNumberOfCollegeEmployees();
        }
        return numOfEmp;
    }
   
    public int calculateUniFacultyStrength(){
        int strength = 0;
        for(College c : collegeList){
            strength += c.calculateCollegeFacultyStrength();
        }
        return strength;
    }
    
    public int calculateUniStaffStrength(){
        int strength = 0;
        for(College c : collegeList){
            strength += c.calculateCollegeStaffStrength();
        }
        return strength;
    }
    
    public String toString(){
        return universityName;
    }

}
