/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.alumni;

import business.college.department.student.Student;

/**
 *
 * @author nithinkartha
 */
public class EmployedStudents extends Student{
    private String employerName;
    private String employmentDescription;
    private long salary;

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmploymentDescription() {
        return employmentDescription;
    }

    public void setEmploymentDescription(String employmentDescription) {
        this.employmentDescription = employmentDescription;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    
    
    
    
}
