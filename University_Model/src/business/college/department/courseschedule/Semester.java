/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.courseschedule;

import business.college.department.course.Course;
import business.college.department.course.CourseOffering;
import java.util.ArrayList;

/**
 *
 * @author vaishakdinesh
 */
public class Semester {
    //which semester is referenced.
    private int semNumber;
    //which year the semester belongs to. For eg. sem 2, 2015
    private int semYear;
    //Whether the sem is a fall or spring semester.
    private String semType;
    //courses offered for a particular sem 
    private ArrayList<CourseOffering> coursesOffered; 
    
    public Semester(){
        coursesOffered = new ArrayList<>();
    }
   
    public int getSemNumber() {
        return semNumber;
    }

    public void setSemNumber(int semNumber) {
        this.semNumber = semNumber;
    }

    public int getSemYear() {
        return semYear;
    }

    public void setSemYear(int semYear) {
        this.semYear = semYear;
    }

    public String getSemType() {
        return semType;
    }

    public void setSemType(String semType) {
        this.semType = semType;
    }
    
    public CourseOffering addCourseToSemester(Course course, Semester sem){
        CourseOffering semesterCourse = new CourseOffering(course, sem);
        coursesOffered.add(semesterCourse);
        return semesterCourse;
    }
    
    public void removeCourseFromSemester(CourseOffering semesterCourse){
        coursesOffered.remove(semesterCourse);
    }
    
    public ArrayList<CourseOffering> viewSemesterSchedule(){
        return coursesOffered;
    }
}
