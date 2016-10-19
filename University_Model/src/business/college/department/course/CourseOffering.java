/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.course;

import business.college.department.courseschedule.Semester;
import business.college.department.departmentjobs.FacultyDirectory;
import business.college.department.departmentjobs.Person;
import business.college.department.seatdetails.Seat;
import business.college.department.student.Student;
import java.util.ArrayList;



/**
 *
 * @author vaishakdinesh
 */
public class CourseOffering {
    private Course course;
    private Person professor;
    private String day;
    private String lectureStartTime;
    private String lectureEndTime;
    private CourseOfferingRoom courseRoom;
    private ArrayList<Seat> seatList;
    private Semester semester;
    
    public CourseOffering(Course course, Semester sem){
        this.course = course;
        this.semester = sem;
        seatList = new ArrayList<Seat>();
    }

    public Person getProfessor() {
        return professor;
    }

    public void setProfessor(Person professor) {
        this.professor = professor;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLectureStartTime() {
        return lectureStartTime;
    }

    public void setLectureStartTime(String lectureStartTime) {
        this.lectureStartTime = lectureStartTime;
    }

    public String getLectureEndTime() {
        return lectureEndTime;
    }

    public void setLectureEndTime(String lectureEndTime) {
        this.lectureEndTime = lectureEndTime;
    }

    public Course getCourse() {
        return course;
    }

    public CourseOfferingRoom getCourseRoom() {
        return courseRoom;
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
    
    public void assignClassRoom(String building, int roomNumber, FacultyDirectory listOfFaculty){
        courseRoom = new CourseOfferingRoom();
        courseRoom.setBuilding(building);
        courseRoom.setRoomNum(roomNumber);
        setProfessor(listOfFaculty.assignProffesor(listOfFaculty));
    }
    
    public void addSeats(int cost, ArrayList<Student> studentDirectory){
        for (Student student: studentDirectory){
            Seat seat = new Seat(student,this, semester);
            seat.setSeatStatus("Occupied");
            seat.setSeatCost(cost);
            student.addTuitionExpense(cost);
            
            seatList.add(seat);
         
        }
    }
    
    public int calculateVacancy(){
        int takenSeats = seatList.size();
        if(this.courseRoom.getRoomCapacity() == 0){
            return 0;
        }
        if(takenSeats == this.courseRoom.getRoomCapacity()){
            return 0;
        }else{
            return this.getCourseRoom().getRoomCapacity()-takenSeats;
        }
    }
}
