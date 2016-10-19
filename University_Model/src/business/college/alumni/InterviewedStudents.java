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
public class InterviewedStudents extends Student {

    private String interviewingCompanyName;
    private String interviewDate;
    private String reasonForRejection;

    public String getInterviewingCompanyName() {
        return interviewingCompanyName;
    }

    public void setInterviewingCompanyName(String interviewingCompanyName) {
        this.interviewingCompanyName = interviewingCompanyName;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getResonForRejection() {
        return reasonForRejection;
    }

    public void setResonForRejection(String resonForRejection) {
        this.reasonForRejection = resonForRejection;
    }

}
