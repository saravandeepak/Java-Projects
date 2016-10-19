/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.student;

import business.college.department.course.Course;
import business.college.department.course.Degree;
import business.college.department.seatdetails.CourseLoad;
import business.college.department.seatdetails.SeatAssignment;
import java.util.ArrayList;

/**
 *
 * @author saravandeepak
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private int nuid;
    private String email;
    private String nationality;
    private int tuitionExpense = 0;
    private ArrayList<SeatAssignment> studentMarksList;
    private ArrayList<Course> courseList;
    private ArrayList<Degree> degreesHeld;
    private Transcript transcript;
    private String departmentName;
    
    public Student() {
        studentMarksList = new ArrayList<SeatAssignment>();
        courseList = new ArrayList<Course>();
        transcript = new Transcript(this);
        degreesHeld = new ArrayList<Degree>();
    }

    public ArrayList<Degree> getDegreesHeld() { 
        return degreesHeld;
    }

    public void setDegreesHeld(ArrayList<Degree> degreesHeld) {
        this.degreesHeld = degreesHeld;
    }
    
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNuid() {
        return nuid;
    }

    public void setNuid(int nuid) {
        this.nuid = nuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ArrayList<SeatAssignment> getStudentMarksList() {
        return studentMarksList;
    }

    public void setStudentMarksList(ArrayList<SeatAssignment> studentMarksList) {
        this.studentMarksList = studentMarksList;
    }

    public int getTuitionExpense() {
        return tuitionExpense;
    }

    public void addTuitionExpense(int cost) {
        this.tuitionExpense += cost;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCoursesList() {
        for(CourseLoad courseLoad: this.getTranscript().getSemesterTranscriptList()){
            courseList.add(courseLoad.getCourseOffering().getCourse());
        }
    }

    public Transcript getTranscript() {
        return transcript;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public void addDegree(Degree degree){      
        degreesHeld.add(degree);
    }
    
    public void addMarks(SeatAssignment seatAssignment){
        studentMarksList.add(seatAssignment);
    }
    

}
