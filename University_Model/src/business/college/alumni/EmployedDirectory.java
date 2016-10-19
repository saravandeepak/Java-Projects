/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.alumni;

import java.util.ArrayList;


/**
 *
 * @author nithinkartha
 */
public class EmployedDirectory {

    private ArrayList<EmployedStudents> employedDirectory;

    public EmployedDirectory() {

        employedDirectory = new ArrayList<EmployedStudents>();
    }

    public ArrayList<EmployedStudents> getEmployedDirectory() {
        return employedDirectory;
    }

    public void setEmployedDirectory(ArrayList<EmployedStudents> employedDirectory) {
        this.employedDirectory = employedDirectory;
    }

    public EmployedStudents addEmployed() {
        EmployedStudents employed = new EmployedStudents();
        employedDirectory.add(employed);
        return employed;
    }
    
    public long avgSalary(){
        long sum=0;
        if(employedDirectory.isEmpty()){
            return sum;
        }
        else{
            for(EmployedStudents emp:employedDirectory)
                sum= sum+ emp.getSalary();
        }
       
        return (long) (sum/employedDirectory.size());
    }
}
