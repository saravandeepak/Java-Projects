/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author nithinkartha
 */
public class UniversityEcoSystem {

    private ArrayList<University> universityList;

    public UniversityEcoSystem() {
        universityList = new ArrayList<University>();
    }

    public ArrayList<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(ArrayList<University> universityList) {
        this.universityList = universityList;
    }

    public University addUniversity() {
        University university = new University();
        universityList.add(university);
        return university;
    }

}
