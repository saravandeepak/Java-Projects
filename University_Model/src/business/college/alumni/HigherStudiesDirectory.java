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
public class HigherStudiesDirectory {

    private ArrayList<HigherStudiesStudents> higherStudiesDirectory;

    public HigherStudiesDirectory() {

        higherStudiesDirectory = new ArrayList<HigherStudiesStudents>();
    }

    public ArrayList<HigherStudiesStudents> getHigherStudiesDirectory() {
        return higherStudiesDirectory;
    }

    public void setHigherStudiesDirectory(ArrayList<HigherStudiesStudents> higherStudiesDirectory) {
        this.higherStudiesDirectory = higherStudiesDirectory;
    }

    public HigherStudiesStudents addHigherStudies() {
        HigherStudiesStudents higherStudies = new HigherStudiesStudents();
        higherStudiesDirectory.add(higherStudies);
        return higherStudies;
    }

}
