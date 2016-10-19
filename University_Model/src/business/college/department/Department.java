/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department;

import business.college.College;
import business.college.department.course.CourseCatalog;
import business.college.department.course.Degree;
import business.college.department.courseschedule.CourseSchedule;
import business.college.department.departmentjobs.FacultyDirectory;
import business.college.department.departmentjobs.JobPosition;
import business.college.department.departmentjobs.Person;
import business.college.department.departmentjobs.StaffDirectory;
import business.college.department.student.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author saravandeepak
 */
public class Department {

    private String departmentName;
    private ArrayList<Degree> degreeList;
    private CourseCatalog courseCatalog;
    private CourseSchedule courseSchedule;
    private StudentDirectory deptStudentDirectory;
    private FacultyDirectory facultyDirectory;
    private StaffDirectory staffDirectory;
    private JobPosition jobPosition;
    private College college;

    public Department(College college) {

        degreeList = new ArrayList<Degree>();
        courseCatalog = new CourseCatalog();
        courseSchedule = new CourseSchedule();
        deptStudentDirectory = new StudentDirectory();
        facultyDirectory = new FacultyDirectory();
        staffDirectory = new StaffDirectory();
        jobPosition = new JobPosition();
        this.college = college;

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Degree> getDegreeList() {
        return degreeList;
    }

    public void setDegreeList(ArrayList<Degree> degreeList) {
        this.degreeList = degreeList;
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public CourseSchedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(CourseSchedule courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public StudentDirectory getDeptStudentDirectory() {
        return deptStudentDirectory;
    }

    public void setDeptStudentDirectory(StudentDirectory deptStudentDirectory) {
        this.deptStudentDirectory = deptStudentDirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }

    public StaffDirectory getStaffDirectory() {
        return staffDirectory;
    }

    public void setStaffDirectory(StaffDirectory staffDirectory) {
        this.staffDirectory = staffDirectory;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
    

    public Degree addDegreeToDepartment(){
        Degree d = new Degree();
        degreeList.add(d);
        return d;
    }

    public int calculateDepartmentRevenue(){
        int revenue =0;
        for(int i=0; i<deptStudentDirectory.getStudentDirectory().size(); i++)
        {
           revenue += deptStudentDirectory.getStudentDirectory().get(i).getTuitionExpense();
        }
        return revenue;
    }
    
    public int calculateDepartmentSpending(){
        int departmentFacultySpending = 0;
        int departmentStaffSpending = 0;
        int i = 0;
        for(Person p : facultyDirectory.getFacultyDirectory()){
            departmentFacultySpending += p.getRole().getSalary();
        }
        for(Person p : staffDirectory.getStaffDirectory()){
            departmentStaffSpending += p.getRole().getSalary();
        }
        return departmentFacultySpending+departmentStaffSpending;
    }
    
    public int calculateDepartmentProfitLoss(){
        return (this.calculateDepartmentRevenue()-this.calculateDepartmentSpending());
    }
    
    public String calculateStudentFacultyRatio(){
        int student = deptStudentDirectory.getStudentDirectory().size();
        int faculty = facultyDirectory.getFacultyDirectory().size();
        if(student != 0 && faculty !=0){
            if(student%faculty == 0){
                student = student/faculty;
                faculty = faculty/faculty;
            }else if(faculty % student == 0){
                student = student/student;
                faculty = faculty/student;
            }
        }
        return student+":"+faculty;
    }
    
    public String calculateFacultyStaffRatio(){
        int faculty = facultyDirectory.getFacultyDirectory().size();
        int staff = staffDirectory.getStaffDirectory().size();
        if(faculty != 0 && staff != 0){
            if(faculty%staff == 0){
                faculty = faculty/staff;
                staff = staff/staff;
            }else if(staff%faculty == 0){
                staff = staff/faculty;
                faculty = faculty/faculty;
            }
        }
        
        return faculty+":"+staff;
    }
    
    public int calculateNumberOfDepartmentEmployees(){
        return (facultyDirectory.getFacultyDirectory().size()+staffDirectory.getStaffDirectory().size());
    }
    
    public String toString(){
        return departmentName;
    }
}
