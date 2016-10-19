/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.departmentjobs;

import java.util.ArrayList;

/**
 *
 * @author nithinkartha
 */
public class StaffDirectory {
    private ArrayList<Person> staffDirectory;

    public StaffDirectory() {
        staffDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getStaffDirectory() {
        return staffDirectory;
    }

    public void setStaffDirectory(ArrayList<Person> staffDirectory) {
        this.staffDirectory = staffDirectory;
    }

    public void addStaff(Person staff) {
        staffDirectory.add(staff);
    }

}
