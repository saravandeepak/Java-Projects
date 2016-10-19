/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.student;

import business.college.department.courseschedule.Semester;
import business.college.department.seatdetails.CourseLoad;
import java.util.ArrayList;

/**
 *
 * @author saravandeepak
 */
public class Transcript {

    
    private Student student;  
    private ArrayList <CourseLoad> semesterTranscriptList;
    private double gpa;


    


    public Transcript(Student student) {
        this.student = student;
        this.semesterTranscriptList = new ArrayList<CourseLoad>();
    }

    public double getGpa() {
        return gpa;
    }

    
    public ArrayList<CourseLoad> getSemesterTranscriptList() {
        return semesterTranscriptList;
    }

    public void addTranscripts(ArrayList<Semester> semesterList) {
        int semListNum = semesterList.size();
        for(int i=0;i<semListNum;i++){
            int courseOffNum = semesterList.get(i).viewSemesterSchedule().size();
            for(int j=0;j<courseOffNum;j++)
            {
                int seatListNum = semesterList.get(i).viewSemesterSchedule().get(j).getSeatList().size();
                for(int k=0;k<seatListNum;k++){
                    if(student == semesterList.get(i).viewSemesterSchedule().get(j).getSeatList().get(k).getStudent()){
                        
                        semesterTranscriptList.add(semesterList.get(i).viewSemesterSchedule().get(j).getSeatList().get(k).getSeatAssignment().getCourseLoad());
                        
                    }
                }
            }   
        }
    }

    public void calculateStudentGpa() {
        double totalGpa = 0;
        int totalCredits = 0;
        int semListNum = semesterTranscriptList.size();
        for (int i = 0; i < semListNum; i++) {
            double courseGpa = semesterTranscriptList.get(i).getCourseGpa();
            double credits = semesterTranscriptList.get(i).getCourseOffering().getCourse().getCourseCredit();
            totalGpa += courseGpa * credits;
            totalCredits += credits;
        }
//        for (int i = 0; i < semListNum; i++) {
//            int courseOffNum = semesterList.get(i).viewSemesterSchedule().size();
//            for (int j = 0; j < courseOffNum; j++) {
//                int seatListNum = semesterList.get(i).viewSemesterSchedule().get(j).getSeatList().size();
//                for (int k = 0; k < seatListNum; k++) {
//                    if (student == semesterList.get(i).viewSemesterSchedule().get(j).getSeatList().get(k).getStudent()) {
//                        double courseGpa = semesterList.get(i).viewSemesterSchedule().get(j).getSeatList().get(k).getSeatAssignment().getCourseLoad().getCourseGpa();
//                        double credits = semesterList.get(i).viewSemesterSchedule().get(j).getCourse().getCourseCredit();
//                        totalGpa += courseGpa * credits;
//                        totalCredits += credits;
//                    }
//                }
//            }
//        }
        double num = totalGpa / totalCredits;
        this.gpa = num;
    }

}
