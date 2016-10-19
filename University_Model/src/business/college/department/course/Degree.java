/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.course;

import java.util.ArrayList;

/**
 *
 * @author vaishakdinesh
 */
public class Degree {
    private String degreeType;
    private int degreeLength;
    private ArrayList<Course> requiredCourseList;
    private ArrayList<Course> electiveCourseList;
    private String major;
    
    public Degree(){
        requiredCourseList = new ArrayList<>();
        electiveCourseList = new ArrayList<>();
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public int getDegreeLength() {
        return degreeLength;
    }

    public void setDegreeLength(int degreeLength) {
        this.degreeLength = degreeLength;
    }

    public Degree addDegree(){
        Degree degree = new Degree();
        return degree;
    }
    
    public ArrayList<Course> getRequiredCourseList() {
        return requiredCourseList;
    }

    public void setRequiredCourseList(ArrayList<Course> requiredCourseList) {
        this.requiredCourseList = requiredCourseList;
    }

    public ArrayList<Course> getElectiveCourseList() {
        return electiveCourseList;
    }

    public void setElectiveCourseList(ArrayList<Course> electiveCourseList) {
        this.electiveCourseList = electiveCourseList;
    }
    
    public void addRequiredCourse(Course addedCourse){
        requiredCourseList.add(addedCourse);
    }
    
    public void removeRequiredCourse(Course removedCourse){
        requiredCourseList.remove(removedCourse);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void addElectiveCourse(Course addedCourse){
        electiveCourseList.add(addedCourse);
    }
    
    public void removeElectiveCourse(Course removedCourse){
        electiveCourseList.remove(removedCourse);
    }
    
    public boolean isEligibleForDegree(ArrayList<Course> takenCourses){
        int coreCount = 0;
        int electiveCount = 0;
       
        for(Course courseTaken : takenCourses){
            for(Course courseRequired : requiredCourseList){
                if(courseTaken == courseRequired)
                    coreCount++;
                break;
            }
        }
        for (Course elective: takenCourses){
            for (Course electiveReq: electiveCourseList){
                if(elective == electiveReq)
                    electiveCount++;
                break;
            }
        }
        if(coreCount == requiredCourseList.size() && electiveCount >= 1){
            return true;
        }
        else {
            return false;
        }
    }
}
