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
public class RejectedStudentsDirectory {

    private ArrayList<InterviewedStudents> rejectedStudentsDirectory;

    public RejectedStudentsDirectory() {
        rejectedStudentsDirectory = new ArrayList<InterviewedStudents>();

    }

    public ArrayList<InterviewedStudents> getRejectedStudentsDirectory() {
        return rejectedStudentsDirectory;
    }

    public void setRejectedStudentsDirectory(ArrayList<InterviewedStudents> rejectedStudentsDirectory) {
        this.rejectedStudentsDirectory = rejectedStudentsDirectory;
    }

    public InterviewedStudents addRejected() {
        InterviewedStudents rejected = new InterviewedStudents();
        rejectedStudentsDirectory.add(rejected);
        return rejected;
    }

}
