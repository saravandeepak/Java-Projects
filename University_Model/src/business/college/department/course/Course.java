/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.course;

/**
 *
 * @author vaishakdinesh
 */
public class Course {
    private String courseName;
    private String courseDesc;
    private String courseCrn;
    private int courseCredit;      
    private String courseType;  //type of course, like lecture or lab

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getCourseCrn() {
        return courseCrn;
    }

    public void setCourseCrn(String courseCrn) {
        this.courseCrn = courseCrn;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
    
}
