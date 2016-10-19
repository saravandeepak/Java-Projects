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
public class AcceptedStudentsDirectory {

    private ArrayList<InterviewedStudents> acceptedStudentsDirectory;

    public AcceptedStudentsDirectory() {
        acceptedStudentsDirectory = new ArrayList<InterviewedStudents>();

    }

    public ArrayList<InterviewedStudents> getAcceptedStudentsDirectory() {
        return acceptedStudentsDirectory;
    }

    public void setAcceptedStudentsDirectory(ArrayList<InterviewedStudents> acceptedStudentsDirectory) {
        this.acceptedStudentsDirectory = acceptedStudentsDirectory;
    }

    public InterviewedStudents addAccepted() {
        InterviewedStudents accepted = new InterviewedStudents();
        acceptedStudentsDirectory.add(accepted);
        return accepted;
    }

}
