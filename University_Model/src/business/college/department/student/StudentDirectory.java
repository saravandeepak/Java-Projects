/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.student;

import java.util.ArrayList;

/**
 *
 * @author saravandeepak
 */
public class StudentDirectory {
   private ArrayList<Student> studentDirectory;

    public StudentDirectory() {
        studentDirectory = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(ArrayList<Student> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }
    
    public Student addStudent(){
        Student student = new Student();
        studentDirectory.add(student);
        return student;
    }
    
    
   
   
    
}
