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
public class UnemployedDirectory {

    private ArrayList<UnemployedStudents> unemployedDirectory;

    public UnemployedDirectory() {

        unemployedDirectory = new ArrayList<UnemployedStudents>();
    }

    public ArrayList<UnemployedStudents> getUnemployedDirectory() {
        return unemployedDirectory;
    }

    public void setUnemployedDirectory(ArrayList<UnemployedStudents> unemployedDirectory) {
        this.unemployedDirectory = unemployedDirectory;
    }

    public UnemployedStudents addUnemployed() {
        UnemployedStudents unemployed = new UnemployedStudents();
        unemployedDirectory.add(unemployed);
        return unemployed;
    }

}
