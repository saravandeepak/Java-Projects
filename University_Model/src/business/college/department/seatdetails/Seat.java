/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.seatdetails;

import business.college.department.course.CourseOffering;
import business.college.department.courseschedule.Semester;
import business.college.department.student.Student;

/**
 *
 * @author saravandeepak
 */
public class Seat {
    private String seatStatus;
    private int seatCost;
    private Student student;
    private SeatAssignment seatAssignment;
    private CourseOffering courseOffering;
    private Semester semester;
    
    
    public Seat(Student student, CourseOffering courseOffering, Semester semester){
        this.student = student;
        this.courseOffering = courseOffering;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }    


    public String getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }

    public int getSeatCost() {
        return seatCost;
    }

    public void setSeatCost(int seatCost) {
        this.seatCost = seatCost;
    }

    public SeatAssignment getSeatAssignment() {
        return seatAssignment;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }
    
    public void addMarks(int ass1, int ass2, int ass3, int ass4, int ass5, int mid, int fin, int project){
        seatAssignment = new SeatAssignment(ass1, ass2, ass3, ass4, ass5, mid, fin, project, courseOffering, semester);
        student.addMarks(seatAssignment);
    }
    
    
    public void dropSeat(Student student){
        this.setSeatStatus("Dropped");
        this.setSeatCost(0);
        
    }
    
    
    
}
