package business.college;

import business.University;
import business.college.alumni.Alumni;
import business.college.department.Department;
import business.college.department.student.Student;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saravandeepak
 */
public class College {
    private String collegeName;
    private University university;
    private ArrayList<Department> departmentDirectory;
    private Alumni graduatedStudents;
    private ArrayList<Student> collegeStudentDirectory;
    private long collegeRevenue;

    public College(University uni){
        this.university = uni;
        departmentDirectory = new ArrayList<>();
        collegeStudentDirectory = new ArrayList<>();
        graduatedStudents = new Alumni();
    }
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public ArrayList<Department> getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(ArrayList<Department> departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }

    public Alumni getGraduatedStudents() {
        return graduatedStudents;
    }

    public void setGraduatedStudents(Alumni graduatedStudents) {
        this.graduatedStudents = graduatedStudents;
    }

    public ArrayList<Student> getCollegeStudentDirectory() {
        return collegeStudentDirectory;
    }

    public void setCollegeStudentDirectory(ArrayList<Student> collegeStudentDirectory) {
        this.collegeStudentDirectory = collegeStudentDirectory;
    }
    
    public void getAllStudents(){
        for(Department d : departmentDirectory){
            collegeStudentDirectory.addAll(d.getDeptStudentDirectory().getStudentDirectory());
        }
        
    }
    
    public Department addDepartment(){
        Department d = new Department(this);
        departmentDirectory.add(d);
        return d;
    }
    
    public Department searchDepartment(String searchCrit){
        for(Department d : departmentDirectory){
            if(d.getDepartmentName().equalsIgnoreCase(searchCrit)){
                return d;
            }
        }
        return null;
    }
    
    public void removeDepartment(Department removedDept){
        departmentDirectory.remove(removedDept);
    }

    public int calculateCollegeRevenue(){
        int revenue =0;
        for(Department d :departmentDirectory){
            revenue += d.calculateDepartmentRevenue();

        }        
        return revenue;
        
    }

    
    


    public int calculateCollegeSpending(){
        int collegeSpending = 0;
        for(Department d: departmentDirectory){
            collegeSpending += d.calculateDepartmentSpending();
        }
        return collegeSpending;
    }


    public int calculateCollegeProfitLoss(){
        return this.calculateCollegeRevenue()-this.calculateCollegeSpending();
    }
    
    public int calculateNumberOfCollegeEmployees(){
        int numOfEmp = 0;
        for(Department d : departmentDirectory){
            numOfEmp += d.calculateNumberOfDepartmentEmployees();
        }
        return numOfEmp;
    }
    
    public int calculateCollegeFacultyStrength(){
        int strength = 0;
        for(Department d : departmentDirectory){
            strength += d.getFacultyDirectory().getFacultyDirectory().size();
        }
        return strength;
    }
    
    public int calculateCollegeStaffStrength(){
        int strength = 0;
        for(Department d : departmentDirectory){
            strength += d.getStaffDirectory().getStaffDirectory().size();
        }
        return strength;
    }
    
    public String toString(){
        return collegeName;
    }
}

