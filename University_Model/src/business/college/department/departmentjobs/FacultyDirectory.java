/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.departmentjobs;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nithinkartha
 */
public class FacultyDirectory {

    private Random randomGenerator;
    private ArrayList<Person> facultyDirectory;

    public FacultyDirectory() {
        facultyDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(ArrayList<Person> facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }

    public void addFaculty(Person faculty) {
        facultyDirectory.add(faculty);
    }

    public Person assignProffesor(FacultyDirectory listOfFaculty) {
        boolean gotProffesor = false;
        randomGenerator = new Random();
        int luckyProffesor = 0;
        while (!gotProffesor) {
            luckyProffesor = randomGenerator.nextInt(listOfFaculty.getFacultyDirectory().size());
            if (listOfFaculty.getFacultyDirectory().get(luckyProffesor) != null) {
                gotProffesor = true;
            }
        }
        return listOfFaculty.getFacultyDirectory().get(luckyProffesor);
    }

}
