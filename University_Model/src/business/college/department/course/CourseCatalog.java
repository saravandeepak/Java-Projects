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
public class CourseCatalog {
    private ArrayList<Course> courseCatalog;

    public CourseCatalog() {
        courseCatalog = new ArrayList<>();
    }

    public ArrayList<Course> getCourseCatalog() {
        return courseCatalog;
    }
    public Course addCourse(){
        Course c = new Course();
        courseCatalog.add(c);
        return c;
    }
    
    public void removeCourse(Course c){
        courseCatalog.remove(c);
    }
    
    public Course findCourseByName(String searchCrit){
        for(Course c : courseCatalog){
            if(c.getCourseName().equalsIgnoreCase(searchCrit))
                return c;
        }
        return null;
    }
    
    public Course findCourseByCrn(String searchCrit){
        for(Course c : courseCatalog){
            if(c.getCourseCrn().equalsIgnoreCase(searchCrit))
                return c;
        }
        return null;
    }
    
}
    

