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
public class UnemployedStudents extends Student{
    
    private String reasonForUnemp;

    public String getReasonForUnemp() {
        return reasonForUnemp;
    }

    public void setReasonForUnemp(String reasonForUnemp) {
        this.reasonForUnemp = reasonForUnemp;
    }
    
    
    
}
