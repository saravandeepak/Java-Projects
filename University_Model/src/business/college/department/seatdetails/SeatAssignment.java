/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.seatdetails;

import business.college.department.course.CourseOffering;
import business.college.department.courseschedule.Semester;

/**
 *
 * @author saravandeepak
 */
public class SeatAssignment {
    private int assignment1Marks;
    private int assignment2Marks;
    private int assignment3Marks;
    private int midTermMarks;
    private int assignment4Marks;
    private int assignment5Marks;
    private int finalExamMarks;
    private int projectMarks;
    private CourseLoad courseLoad;
    private CourseOffering courseOffering;
    private Semester semester;

    SeatAssignment(int ass1, int ass2, int ass3, int ass4, int ass5, int mid, int fin, int project, CourseOffering courseOffering, Semester semester) {
        this.assignment1Marks = ass1;
        this.assignment2Marks = ass2;
        this.assignment3Marks = ass3;
        this.assignment4Marks = ass4;
        this.assignment5Marks = ass5;
        this.midTermMarks = mid;
        this.finalExamMarks = fin;
        this.projectMarks = project;
        this.courseOffering = courseOffering;
        this.semester = semester;
        this.courseLoad = new CourseLoad((double)(ass1+ass2+ass3+ass4+ass5)/5, mid, fin, project, courseOffering);
        
    }
    

    public int getAssignment1Marks() {
        return assignment1Marks;
    }

    public int getAssignment2Marks() {
        return assignment2Marks;
    }

    public int getAssignment3Marks() {
        return assignment3Marks;
    }

    public int getMidTermMarks() {
        return midTermMarks;
    }

    public int getAssignment4Marks() {
        return assignment4Marks;
    }

    public int getAssignment5Marks() {
        return assignment5Marks;
    }

    public int getFinalExamMarks() {
        return finalExamMarks;
    }


    public int getProjectMarks() {
        return projectMarks;
    }

    public CourseLoad getCourseLoad() {
        return courseLoad;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    
    
    
    
    
}
