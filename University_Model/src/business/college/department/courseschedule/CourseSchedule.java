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
public class CourseSchedule {
    private ArrayList<Semester> semesterList;
    private ArrayList<CourseOffering> semesterSchedule;
    private ArrayList<CourseOffering> allCourseList;
    
    
    public CourseSchedule(){
        semesterList = new ArrayList<>();
        semesterSchedule = new ArrayList<>();
        allCourseList = new ArrayList<>();
    }

    public ArrayList<Semester> getSemesterList() {
        return semesterList;
    }
    
    
    
    public Semester addSemesterToSchedule(){
        Semester sem = new Semester();
        semesterList.add(sem);
        return sem;
    }
            
    public ArrayList<CourseOffering>getCourseOffering(){
        for(Semester s : semesterList){
            for(CourseOffering co : s.viewSemesterSchedule()){
                allCourseList.add(co);
            }
        }
        return allCourseList;
    }
    
    public ArrayList<CourseOffering> getSemesterSchedule(int semNum, int year){
        for(Semester s : semesterList){
            if(s.getSemNumber() == semNum && s.getSemYear() == year){
                return s.viewSemesterSchedule();
            }
      }
        return null;
    }
    public ArrayList<CourseOffering> isThisCourseOfferedInSem(Course course, Semester sem){
        ArrayList<CourseOffering> coursesPresent = new ArrayList<>();
        for(CourseOffering co : sem.viewSemesterSchedule()){
            if(co.getCourse().getCourseName().equalsIgnoreCase(course.getCourseName())){
                coursesPresent.add(co);
            }
        }
        if(coursesPresent.isEmpty()){
            return null;
        }else{
            return coursesPresent;
        }
    }
    
    public ArrayList<CourseOffering> isThisCourseOfferedInYear(Course course, int year){
        ArrayList<CourseOffering> coursesPresent = new ArrayList<>();
        for(Semester s : semesterList){
            if(s.getSemYear() == year){
                for(CourseOffering co : s.viewSemesterSchedule()){
                   if(co.getCourse().getCourseName().equalsIgnoreCase(course.getCourseName())){
                        coursesPresent.add(co);
                    }
                }
            }
        }
        if(coursesPresent.isEmpty()){
            return null;
        }else{
            return coursesPresent;
        }
    }
}
