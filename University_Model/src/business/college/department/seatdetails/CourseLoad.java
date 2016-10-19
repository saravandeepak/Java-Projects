/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.seatdetails;

import business.college.department.course.CourseOffering;

/**
 *
 * @author saravandeepa
 */
public class CourseLoad {
        
    private double assignmentAggregate;
    private double midFinalAggregate;
    private double projectAggregate;
    private double totalAggregate;
    private double courseGpa;
    private String courseGrade;
    private CourseOffering courseOffering;

    CourseLoad(double ass, int mid, int fin, int project, CourseOffering courseOfferring) {
        this.courseOffering = courseOfferring;
        this.assignmentAggregate = (double)(ass*40)/100;
        this.midFinalAggregate = (double)((mid+fin)*15)/100;
        this.projectAggregate = (double)(project*30)/100;
        setTotalAggregate();
        setCourseGpa();
        setCourseGrade();
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }
    
    
    
    public double getAssignmentAggregate() {
        return assignmentAggregate;
    }

    public double getMidFinalAggregate() {
        return midFinalAggregate;
    }

    public double getProjectAggregate() {
        return projectAggregate;
    }

    public double getTotalAggregate() {
        return totalAggregate;
    }

    public void setTotalAggregate() {
      this.totalAggregate = this.getAssignmentAggregate() + this.midFinalAggregate + this.projectAggregate;
    }

    public double getCourseGpa() {
        return courseGpa;
    }

    public void setCourseGpa() {
        this.courseGpa = ((this.totalAggregate)/100)*4;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade() {
        double gpa = this.getCourseGpa();
        if(gpa >= 3.9){
            this.courseGrade = "A";
        }
        else if(gpa >= 3.7 ){
            this.courseGrade = "A-";
        }
        else if(gpa >= 3.3 ){
            this.courseGrade = "B+";
        }
        else if(gpa >= 3.0 ){
            this.courseGrade = "B";
        }
        else if(gpa >= 2.7 ){
            this.courseGrade = "B-";
        }
        else if(gpa >= 2.3 ){
            this.courseGrade = "C+";
        }
        else if(gpa >= 2.0 ){
            this.courseGrade = "C";
        }
        else{
            this.courseGrade = "F";
        }
        
    }

  
      
    
    
    
    
    
   
    
    
}
