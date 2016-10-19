/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import business.University;
import business.UniversityEcoSystem;
import business.college.College;
import business.college.alumni.EmployedStudents;
import business.college.alumni.HigherStudiesStudents;
import business.college.alumni.UnemployedStudents;
import business.college.department.Department;
import business.college.department.course.Course;
import business.college.department.course.CourseOffering;
import business.college.department.course.Degree;
import business.college.department.courseschedule.Semester;
import business.college.department.departmentjobs.Role;
import business.college.department.student.Student;
import business.college.department.student.StudentDirectory;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vaishakdinesh
 */
public class InitializationConfig {

    private UniversityEcoSystem eco;

    public UniversityEcoSystem getEco() {
        return eco;
    }

    public InitializationConfig() {

        eco = new UniversityEcoSystem();

        initializeData();
        initializeData1();
    }
    public void addData(){
        University uni2;
        uni2 = eco.addUniversity();
        uni2.setUniversityName("Manchester United Medical University");

        College coll1 = uni2.addCollege();
        coll1.setCollegeName("Matt Busby College of Medicine");
        Department d1 = coll1.addDepartment();
        d1.setDepartmentName("Surgery");
        Department d2 = coll1.addDepartment();
        d2.setDepartmentName("General Medicine");
        Department d3 = coll1.addDepartment();
        d3.setDepartmentName("Cardiology");

        Role r1 = d1.getJobPosition().addRole();
        r1.setRoleDescription("Teaching/Doctor");
        r1.setRoleName("proffesor");
        r1.setSalary(23000);
        r1.addPerson("Eric", "Cantona", "360 trafford medical", "EC@gmail.com", 850230879, 2200, r1);
        d1.getFacultyDirectory().addFaculty(r1.getPerson());

        Role r3 = d1.getJobPosition().addRole();
        r3.setRoleDescription("Teaching/Doctor");
        r3.setRoleName("Asst. proffesor");
        r3.setSalary(10000);
        r3.addPerson("vishal", "chawla", "360 snell medical", "vc@gmail.com", 989539928, 2400, r3);
        d1.getFacultyDirectory().addFaculty(r3.getPerson());

        Role r4 = d1.getJobPosition().addRole();
        r4.setRoleDescription("teaching staff");
        r4.setRoleName("Assist. proffesor");
        r4.setSalary(10000);
        r4.addPerson("richard", "sherman", "360 snell medical", "rs@gmail.com", 987652896, 2500, r4);
        d1.getFacultyDirectory().addFaculty(r4.getPerson());

        Role r7 = d1.getJobPosition().addRole();
        r7.setRoleDescription("nurse");
        r7.setRoleName("nurse");
        r7.setSalary(5000);
        r7.addPerson("todd", "logan", "360 snell medical", "tl@gmail.com", 98134296, 500, r7);
        d1.getStaffDirectory().addStaff(r7.getPerson());
        
        Role r8 = d1.getJobPosition().addRole();
        r8.setRoleDescription("nurse");
        r8.setRoleName("nurse");
        r8.setSalary(5000);
        r8.addPerson("Amanda", "ziets", "360 snell medical", "az@gmail.com", 912314553, 500, r8);
        d1.getStaffDirectory().addStaff(r8.getPerson());
        
        Role r5 = d2.getJobPosition().addRole();
        r5.setRoleDescription("Teaching/Doctor");
        r5.setRoleName("proffesor");
        r5.setSalary(1000);
        r5.addPerson("alex", "ferguson", "old trafford", "saf@gmail.com", 980021321, 100000, r5);
        d2.getFacultyDirectory().addFaculty(r5.getPerson());

        Role r6 = d2.getJobPosition().addRole();
        r6.setRoleDescription("Teaching/Doctor");
        r6.setRoleName("proffesor");
        r6.setSalary(1000);
        r6.addPerson("Charles", "Xavier", "360 snell medical", "xman@gmail.com", 9898765, 2250, r6);
        d2.getFacultyDirectory().addFaculty(r6.getPerson());

        Role r9 = d2.getJobPosition().addRole();
        r9.setRoleDescription("clerk duties and accounts");
        r9.setRoleName("clerk");
        r9.setSalary(500);
        r9.addPerson("jim", "klod", "360 snell medical", "jk@gmail.com", 98134296, 500, r9);
        d2.getStaffDirectory().addStaff(r9.getPerson());
        
        Role r10 = d2.getJobPosition().addRole();
        r10.setRoleDescription("clerk duties and accounts");
        r10.setRoleName("clerks");
        r10.setSalary(500);
        r10.addPerson("Alex", "Grestel", "360 snell medical", "ag@gmail.com", 98634496, 500, r10);
        d2.getStaffDirectory().addStaff(r10.getPerson());       
        
        Role r2 = d2.getJobPosition().addRole();
        r2.setRoleDescription("Teaching/Doctor");
        r2.setRoleName("proffesor");
        r2.setSalary(1000);
        r2.addPerson("Yusuf", "Ozbek", "360 snell medical", "yo@gmail.com", 999539977, 2300, r2);
        d2.getFacultyDirectory().addFaculty(r2.getPerson());

        Role r11 = d3.getJobPosition().addRole();
        r11.setRoleDescription("Teaching/Doctor");
        r11.setRoleName("proffesor");
        r11.setSalary(1000);
        r11.addPerson("patrick", "shan", "360 snell medical", "pa@gmail.com", 850230879, 2200, r11);
        d3.getFacultyDirectory().addFaculty(r11.getPerson());

        Role r12 = d3.getJobPosition().addRole();
        r12.setRoleDescription("Teaching/Doctor");
        r12.setRoleName("Asst. proffesor");
        r12.setSalary(1000);
        r12.addPerson("juhi", "chawla", "360 snell medical", "jc@gmail.com", 989539928, 2400, r12);
        d3.getFacultyDirectory().addFaculty(r12.getPerson());

        Role r13 = d3.getJobPosition().addRole();
        r13.setRoleDescription("Teaching/Doctor");
        r13.setRoleName("Assist. proffesor");
        r13.setSalary(14000);
        r13.addPerson("sharukh", "sherman", "360 snell medical", "ss@gmail.com", 987652896, 2500, r13);
        d3.getFacultyDirectory().addFaculty(r13.getPerson());

        Role r14 = d3.getJobPosition().addRole();
        r14.setRoleDescription("human resource management");
        r14.setRoleName("HR");
        r14.setSalary(5000);
        r14.addPerson("wolfee", "logan", "360 snell medical", "rwl@gmail.com", 98134296, 500, r14);
        d3.getStaffDirectory().addStaff(r14.getPerson());
        
        Role r15 = d3.getJobPosition().addRole();
        r15.setRoleDescription("human resource management");
        r15.setRoleName("HR");
        r15.setSalary(500);
        r15.addPerson("todd", "klod", "360 snell medical", "tk@gmail.com", 98134296, 500, r15);
        d3.getStaffDirectory().addStaff(r15.getPerson());
        
        Course c1 = d1.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c1.setCourseCredit(4);
        c1.setCourseCrn("GS5100");
        c1.setCourseDesc("General Anatomy");
        c1.setCourseName("Grays Anatomy");
        c1.setCourseType("lecture");

        Course c2 = d1.getCourseCatalog().addCourse();
        c2.setCourseCredit(4);
        c2.setCourseCrn("GS2345");
        c2.setCourseDesc("Surgery design");
        c2.setCourseName("Surgery");
        c2.setCourseType("lecture");

        Course c3 = d1.getCourseCatalog().addCourse();
        c3.setCourseCredit(4);
        c3.setCourseCrn("GS6543");
        c3.setCourseDesc("best practices for surgery");
        c3.setCourseName("Surgery");
        c3.setCourseType("lecture");

        Course c4 = d1.getCourseCatalog().addCourse();
        c4.setCourseCredit(2);
        c4.setCourseCrn("GS4532");
        c4.setCourseDesc("Surgical instrument design");
        c4.setCourseName("Surgical tool design");
        c4.setCourseType("lecture");

        Course c6 = d1.getCourseCatalog().addCourse();
        c6.setCourseCredit(3);
        c6.setCourseCrn("GS6790");
        c6.setCourseDesc("upper body surgery");
        c6.setCourseName("Top body systems");
        c6.setCourseType("lecture");

        Course c7 = d2.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c7.setCourseCredit(4);
        c7.setCourseCrn("GM6100");
        c7.setCourseDesc("Diagnosing a disease");
        c7.setCourseName("Diagnostics");
        c7.setCourseType("lecture");

        Course c8 = d2.getCourseCatalog().addCourse();
        c8.setCourseCredit(4);
        c8.setCourseCrn("GM6200");
        c8.setCourseDesc("communicable diseases");
        c8.setCourseName("Disease");
        c8.setCourseType("lecture");

        Course c9 = d2.getCourseCatalog().addCourse();
        c9.setCourseCredit(4);
        c9.setCourseCrn("GM7100");
        c9.setCourseDesc("Auto-immune diseases");
        c9.setCourseName("AID");
        c9.setCourseType("lecture");

        Course c10 = d2.getCourseCatalog().addCourse();
        c10.setCourseCredit(2);
        c10.setCourseCrn("GM7600");
        c10.setCourseDesc("Viral and Bacterial Diseases");
        c10.setCourseName("V&B disease");
        c10.setCourseType("lecture");

        Course c11 = d2.getCourseCatalog().addCourse();
        c11.setCourseCredit(1);
        c11.setCourseCrn("GM8150");
        c11.setCourseDesc("prescribing medicine");
        c11.setCourseName("MED");
        c11.setCourseType("Lecture");


        Course c12 = d3.getCourseCatalog().addCourse();
        c12.setCourseCredit(3);
        c12.setCourseCrn("CAR6790");
        c12.setCourseDesc("Basics of the heart");
        c12.setCourseName("heart and the body");
        c12.setCourseType("lecture");

        Course c5 = d3.getCourseCatalog().addCourse();
        c5.setCourseCredit(1);
        c5.setCourseCrn("CAR5150");
        c5.setCourseDesc("Heart surgery fundamentals");
        c5.setCourseName("Cardio");
        c5.setCourseType("Lab");
        
        Course c13 = d3.getCourseCatalog().addCourse();
        c13.setCourseCredit(3);
        c13.setCourseCrn("CAR7790");
        c13.setCourseDesc("Diabetes : cause and cure");
        c13.setCourseName("diabetes");
        c13.setCourseType("lecture");
        
        Course c14 = d3.getCourseCatalog().addCourse();
        c14.setCourseCredit(3);
        c14.setCourseCrn("CAR8890");
        c14.setCourseDesc("Cardiac Surgery");
        c14.setCourseName("Surgery");
        c14.setCourseType("lecture");
        
        Course c15 = d3.getCourseCatalog().addCourse();
        c15.setCourseCredit(3);
        c15.setCourseCrn("CAR6790");
        c15.setCourseDesc("Heart transplant basics");
        c15.setCourseName("Transplant");
        c15.setCourseType("lab");
        
        Degree degree1 = d1.addDegreeToDepartment();
        degree1.setDegreeLength(4);
        degree1.setDegreeType("M.B.B.S");
        degree1.addRequiredCourse(c1);
        degree1.addElectiveCourse(c2);
        degree1.addElectiveCourse(c3);
        degree1.setMajor("General Surgery");

        Degree degree2 = d1.addDegreeToDepartment();
        degree2.setDegreeLength(3);
        degree2.setDegreeType("DM");
        degree2.addRequiredCourse(c1);
        degree2.addElectiveCourse(c4);
        degree2.addElectiveCourse(c3);
        degree2.setMajor("General Surgery");

        Degree degree3 = d1.addDegreeToDepartment();
        degree3.setDegreeLength(1);
        degree3.setDegreeType("MD");
        degree3.addRequiredCourse(c1);
        degree3.addElectiveCourse(c4);
        degree3.addElectiveCourse(c6);
        degree3.setMajor("General Surgery");
        

        Degree degree12 = d2.addDegreeToDepartment();
        degree12.setDegreeLength(4);
        degree12.setDegreeType("MD");
        degree12.addRequiredCourse(c1);
        degree12.addElectiveCourse(c8);
        degree12.addElectiveCourse(c9);
        degree12.setMajor("General Medicine");
        

        Degree degree22 = d2.addDegreeToDepartment();
        degree22.setDegreeLength(3);
        degree22.setDegreeType("M.B.B.S");
        degree22.addRequiredCourse(c1);
        degree22.addElectiveCourse(c10);
        degree22.addElectiveCourse(c9);
        degree22.setMajor("General Medicine");

        Degree degree32 = d2.addDegreeToDepartment();
        degree32.setDegreeLength(1);
        degree32.setDegreeType("DM");
        degree32.addRequiredCourse(c1);
        degree32.addElectiveCourse(c9);
        degree32.addElectiveCourse(c10);
        degree32.setMajor("General Medicine");
        
        Degree degree4 = d3.addDegreeToDepartment();
        degree4.setDegreeLength(3);
        degree4.setDegreeType("M.B.B.S");
        degree4.addRequiredCourse(c1);
        degree4.addElectiveCourse(c14);
        degree4.addElectiveCourse(c15);
        degree4.setMajor("cardiothoracic Surgery");
        

        Degree degree5 = d3.addDegreeToDepartment();
        degree5.setDegreeLength(1);
        degree5.setDegreeType("M.B.B.S");
        degree5.addRequiredCourse(c1);
        degree5.addElectiveCourse(c5);
        degree5.addElectiveCourse(c15);
        degree5.setMajor("cardiothoracic Surgery");

        Degree degree6 = d3.addDegreeToDepartment();
        degree6.setDegreeLength(4);
        degree6.setDegreeType("DM");
        degree6.addRequiredCourse(c1);
        degree6.addElectiveCourse(c13);
        degree6.addElectiveCourse(c12);
        degree6.setMajor("cardiothoracic Surgery");
        
        Semester s1 = d1.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1.setSemType("fall");
        s1.setSemNumber(1);
        s1.setSemYear(2016);
        CourseOffering co1 = s1.addCourseToSemester(c1, s1);
        co1.setDay("monday");
        co1.setLectureEndTime("12:00");
        co1.setLectureStartTime("08:00");
        co1.assignClassRoom("Stiker hall", 543, d1.getFacultyDirectory());

        CourseOffering co4 = s1.addCourseToSemester(c4, s1);
        co4.setDay("tuesday");
        co4.setLectureEndTime("13:00");
        co4.setLectureStartTime("10:00");
        co4.assignClassRoom("presidents hall", 765, d1.getFacultyDirectory());

        Semester s2 = d1.getCourseSchedule().addSemesterToSchedule();
        s2.setSemNumber(2);
        s2.setSemType("spring");
        s2.setSemYear(2017);
        CourseOffering co2 = s2.addCourseToSemester(c2, s2);
        co2.setDay("wednesday");
        co2.setLectureEndTime("11:00");
        co2.setLectureStartTime("08:00");
        co2.assignClassRoom("Trafford", 200, d1.getFacultyDirectory());



        Semester s3 = d1.getCourseSchedule().addSemesterToSchedule();
        s3.setSemNumber(3);
        s3.setSemType("fall");
        s3.setSemYear(2017);
        CourseOffering co3 = s3.addCourseToSemester(c3, s3);
        co3.setDay("friday");
        co3.setLectureEndTime("14:00");
        co3.setLectureStartTime("11:00");
        co3.assignClassRoom("Dr.House hall", 302, d1.getFacultyDirectory());

        CourseOffering co6 = s3.addCourseToSemester(c6, s3);
        co6.setDay("sunday");
        co6.setLectureEndTime("11:00");
        co6.setLectureStartTime("08:00");
        co6.assignClassRoom("Doctor hall", 126, d1.getFacultyDirectory());

        Semester s1d2 = d2.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1d2.setSemType("fall");
        s1d2.setSemNumber(1);
        s1d2.setSemYear(2016);
        CourseOffering co12 = s1d2.addCourseToSemester(c1, s1d2);
        co12.setDay("monday");
        co12.setLectureEndTime("10:00");
        co12.setLectureStartTime("08:00");
        co12.assignClassRoom("blackman hall", 543, d2.getFacultyDirectory());

        CourseOffering co42 = s1d2.addCourseToSemester(c8, s1d2);
        co42.setDay("tuesday");
        co42.setLectureEndTime("11:00");
        co42.setLectureStartTime("08:00");
        co42.assignClassRoom("presidents hall", 765, d2.getFacultyDirectory());

        Semester s2d2 = d2.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s2d2.setSemNumber(2);
        s2d2.setSemType("spring");
        s2d2.setSemYear(2017);
        CourseOffering co22 = s2d2.addCourseToSemester(c9, s2d2);
        co22.setDay("wednesday");
        co22.setLectureEndTime("10:00");
        co22.setLectureStartTime("08:00");
        co22.assignClassRoom("snell", 200, d2.getFacultyDirectory());

        CourseOffering co52 = s2d2.addCourseToSemester(c10, s2d2);
        co52.setDay("wednesday");
        co52.setLectureEndTime("11:00");
        co52.setLectureStartTime("08:00");
        co52.assignClassRoom("independance hall", 121, d2.getFacultyDirectory());

        Semester s3d2 = d2.getCourseSchedule().addSemesterToSchedule();
        s3d2.setSemNumber(3);
        s3d2.setSemType("fall");
        s3d2.setSemYear(2017);
        CourseOffering co32 = s3d2.addCourseToSemester(c11, s3d2);
        co32.setDay("friday");
        co32.setLectureEndTime("11:00");
        co32.setLectureStartTime("08:00");
        co32.assignClassRoom("Cuddy hall", 302, d2.getFacultyDirectory());

        Semester s1d3 = d3.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1d3.setSemType("fall");
        s1d3.setSemNumber(1);
        s1d3.setSemYear(2016);
        CourseOffering co13 = s1d3.addCourseToSemester(c12, s1d3);
        co13.setDay("monday");
        co13.setLectureEndTime("10:00");
        co13.setLectureStartTime("08:00");
        co13.assignClassRoom("Foreman hall", 543, d3.getFacultyDirectory());

        CourseOffering co23 = s1d3.addCourseToSemester(c5, s1d3);
        co23.setDay("tuesday");
        co23.setLectureEndTime("11:00");
        co23.setLectureStartTime("07:00");
        co23.assignClassRoom("Chase hall", 765, d3.getFacultyDirectory());

        Semester s2d3 = d3.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s2d3.setSemNumber(2);
        s2d3.setSemType("spring");
        s2d3.setSemYear(2017);
        CourseOffering co33 = s2d3.addCourseToSemester(c13, s2d3);
        co33.setDay("wednesday");
        co33.setLectureEndTime("11:00");
        co33.setLectureStartTime("08:00");
        co33.assignClassRoom("snell", 200, d3.getFacultyDirectory());

        CourseOffering co43 = s2d3.addCourseToSemester(c14, s2d3);
        co43.setDay("wednesday");
        co43.setLectureEndTime("11:00");
        co43.setLectureStartTime("08:00");
        co43.assignClassRoom("independance hall", 121, d3.getFacultyDirectory());

        Semester s3d3 = d3.getCourseSchedule().addSemesterToSchedule();
        s3d3.setSemNumber(3);
        s3d3.setSemType("fall");
        s3d3.setSemYear(2017);
        CourseOffering co53 = s3d3.addCourseToSemester(c15, s3d3);
        co53.setDay("friday");
        co53.setLectureEndTime("11:00");
        co53.setLectureStartTime("08:00");
        co53.assignClassRoom("Dr.House hall", 302, d3.getFacultyDirectory());


  
        StudentDirectory studentDirectory = new StudentDirectory();
        Student student = studentDirectory.addStudent();
        student.setFirstName("Saravan");
        student.setLastName("Vadivel");
        student.setEmail("saravan.deepak@gmail.com");
        student.setNuid(101);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());


        student = studentDirectory.addStudent();
        student.setFirstName("Vaishak");
        student.setLastName("Dinesh");
        student.setEmail("vaishak.dinesh@gmail.com");
        student.setNuid(102);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());


        student = studentDirectory.addStudent();
        student.setFirstName("Nithin");
        student.setLastName("Kartha");
        student.setEmail("nithin.katha@gmail.com");
        student.setNuid(103);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());


        student = studentDirectory.addStudent();
        student.setFirstName("Ashwin");
        student.setLastName("Kartha");
        student.setEmail("ashwin.katha@gmail.com");
        student.setNuid(653);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());

        
        
        d1.setDeptStudentDirectory(studentDirectory);

        StudentDirectory studentDirectory2 = new StudentDirectory();
        Student student2 = studentDirectory2.addStudent();
        student2.setFirstName("Wayne");
        student2.setLastName("Rooney");
        student2.setEmail("WR10@gmail.com");
        student2.setNuid(801);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());


        student2 = studentDirectory2.addStudent();
        student2.setFirstName("Michael");
        student2.setLastName("Carrick");
        student2.setEmail("CR16@gmail.com");
        student2.setNuid(802);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());

        

        student2 = studentDirectory2.addStudent();
        student2.setFirstName("David");
        student2.setLastName("Beckham");
        student2.setEmail("DB7a@gmail.com");
        student2.setNuid(803);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());

        
        student2 = studentDirectory2.addStudent();
        student2.setFirstName("Cris");
        student2.setLastName("Ronaldo");
        student2.setEmail("cr7@gmail.com");
        student2.setNuid(903);
        student2.setNationality("Portugal");
        student2.setDepartmentName(d2.getDepartmentName());
    
        d2.setDeptStudentDirectory(studentDirectory2);
        
        
        StudentDirectory studentDirectory3 = new StudentDirectory();
        Student student3 = studentDirectory3.addStudent();
        student3.setFirstName("Rio");
        student3.setLastName("Ferdinand");
        student3.setEmail("rf3@gmail.com");
        student3.setNuid(1801);
        student3.setNationality("England");
        student3.setDepartmentName(d3.getDepartmentName());


        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Ryan");
        student3.setLastName("Giggs");
        student3.setEmail("gig@gmail.com");
        student3.setNuid(1802);
        student3.setNationality("England");
        student3.setDepartmentName(d3.getDepartmentName());
        
        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Ajmal");
        student3.setLastName("Zaheen");
        student3.setEmail("az@gmail.com");
        student3.setNuid(1803);
        student3.setNationality("American");
        student3.setDepartmentName(d3.getDepartmentName());


        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Zlatan");
        student3.setLastName("ibrahivomic");
        student3.setEmail("god@gmail.com");
        student3.setNuid(1803);
        student3.setNationality("Sweden");

        student3.setDepartmentName(d3.getDepartmentName());

        

        d3.setDeptStudentDirectory(studentDirectory3);


        ArrayList<Student> studentList1= new ArrayList<>();
        ArrayList<Student> studentList2= new ArrayList<>();
        for(int i=0; i<2;i++){
            studentList1.add(d1.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for(int i=2; i<d1.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList2.add(d1.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        
        co1.addSeats(1500, d1.getDeptStudentDirectory().getStudentDirectory());
        co1.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co1.getSeatList().get(1).addMarks(80, 80, 90, 86, 76, 90, 80, 95);
        co1.getSeatList().get(2).addMarks(90, 95, 99, 80, 71, 93, 85, 100);
        co1.getSeatList().get(3).addMarks(99, 93, 90, 80, 75, 90, 85, 100);
        
        co2.addSeats(1100, studentList1);
        co2.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co2.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 93, 80, 95);
        

        co3.addSeats(1100, studentList2);
        co3.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co3.getSeatList().get(1).addMarks(80, 80, 92, 85, 77, 94, 82, 95);
        

        co4.addSeats(1100, studentList1);
        co4.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co4.getSeatList().get(1).addMarks(74, 86, 93, 82, 75, 90, 80, 91);
        


        co6.addSeats(1100, studentList2);
        co6.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co6.getSeatList().get(1).addMarks(88, 82, 90, 89, 89, 100, 70, 95);
        
        
        
        ArrayList<Student> studentList3= new ArrayList<>();
        ArrayList<Student> studentList4= new ArrayList<>();
        for(int i=0; i<2;i++){
            studentList3.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for(int i=2; i<d2.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList4.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        
        co12.addSeats(1500, d2.getDeptStudentDirectory().getStudentDirectory());
        co12.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co12.getSeatList().get(1).addMarks(80, 86, 90, 82, 75, 90, 86, 93);
        co12.getSeatList().get(2).addMarks(90, 99, 99, 84, 71, 90, 82, 100);
        co12.getSeatList().get(3).addMarks(94, 95, 85, 80, 73, 69, 85, 99);
        
        co22.addSeats(1100, studentList3);
        co22.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co22.getSeatList().get(1).addMarks(89, 83, 90, 68, 75, 91, 80, 95);
        

        co32.addSeats(1100, studentList4);
        co32.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co32.getSeatList().get(1).addMarks(89, 89, 99, 89, 79, 99, 89, 95);
        
        co42.addSeats(1100, studentList3);
        co42.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co42.getSeatList().get(1).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        
        co52.addSeats(1100, studentList4);
        co52.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co52.getSeatList().get(1).addMarks(60, 81, 90, 82, 73, 90, 80, 95);
        
        ArrayList<Student> studentList5= new ArrayList<>();
        ArrayList<Student> studentList6= new ArrayList<>();
        for(int i=0; i<2;i++){
            studentList5.add(d3.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for(int i=2; i<d3.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList6.add(d3.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
                
        
        
        
        co13.addSeats(1100, d3.getDeptStudentDirectory().getStudentDirectory());
        co13.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co13.getSeatList().get(1).addMarks(88, 81, 90, 89, 72, 98, 80, 95);
        co13.getSeatList().get(2).addMarks(90, 97, 93, 78, 72, 92, 85, 100);
        co13.getSeatList().get(3).addMarks(97, 95, 90, 87, 78, 89, 88, 100);

        co23.addSeats(1100, studentList5);
        co23.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co23.getSeatList().get(1).addMarks(60, 100, 90, 82, 75, 90, 100, 95);
        
        
        co33.addSeats(1100, studentList6);
        co33.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co33.getSeatList().get(1).addMarks(88, 82, 100, 89, 75, 100, 80, 95);
        

        co53.addSeats(1100, studentList5);
        co53.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co53.getSeatList().get(1).addMarks(60, 81, 100, 82, 75, 90, 80, 100);
        
        
        co43.addSeats(1100, studentList6);
        co43.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co43.getSeatList().get(1).addMarks(88, 82, 100, 89, 75, 100, 80, 100);
        
        EmployedStudents es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Nithin");
        es.setLastName("Kartha");
        es.setNuid(222);
        es.setEmail("ndk@gmail.com");
        es.setNationality("Indian");
        es.setEmployerName("Appolo Hospitals");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("Doctor");
        es.setSalary(100000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Yenchu");
        es.setLastName("kovoski");
        es.setNuid(243);
        es.setEmail("yench@gmail.com");
        es.setNationality("Chinese");
        es.setEmployerName("John Hopkins Hospital");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("House Surgeon");
        es.setSalary(110000);
        
        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Nick");
        es.setLastName("Fury");
        es.setNuid(205);
        es.setEmail("nickfur@gmail.com");
        es.setNationality("Spain");
        es.setEmployerName("John Hopkins Hospital");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("House Surgeon");
        es.setSalary(90000);
        
        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Kitchu");
        es.setLastName("Joseph");
        es.setNuid(201);
        es.setEmail("kit@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("John Hopkins Hospital");
        es.setEmploymentDescription("Doctor");
        es.setSalary(80000);



        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Amy");
        es.setLastName("Jen");
        es.setNuid(210);
        es.setEmail("amyjen@gmail.com");
        es.setNationality("American");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("John Hopkins Hospital");
        es.setEmploymentDescription("Diagnostician");
        es.setSalary(70000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Reshmi");
        es.setLastName("Joseph");
        es.setNuid(217);
        es.setEmail("resh@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("John Hopkins Hospital");
        es.setEmploymentDescription("Diagnostician");
        es.setSalary(90000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Sruthy");
        es.setLastName("Kunjumon");
        es.setNuid(201);
        es.setEmail("sk@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("John Hopkins Hospital");
        es.setEmploymentDescription("Surgeon Lead");
        es.setSalary(90000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("packman");
        es.setLastName("paul");
        es.setNuid(210);
        es.setEmail("antp@gmail.com");
        es.setNationality("American");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("United States Government");
        es.setEmploymentDescription("Surgeon General");
        es.setSalary(75400);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Arun");
        es.setLastName("Antony");
        es.setNuid(217);
        es.setEmail("Ara@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("John Hopkins Hospital");
        es.setEmploymentDescription("HOD Surgery");
        es.setSalary(90000);
        
        UnemployedStudents ue = coll1.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Jacob");
        ue.setLastName("John");
        ue.setNuid(300);
        ue.setEmail("jacjon@gmail.com");
        ue.setNationality("American");
        ue.setDepartmentName(d1.getDepartmentName());
        ue.setReasonForUnemp("Low Grades");

        ue = coll1.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Russel");
        ue.setLastName("Moore");
        ue.setNuid(330);
        ue.setEmail("j@gmail.com");
        ue.setDepartmentName(d2.getDepartmentName());
        ue.setNationality("Georgia");
        ue.setReasonForUnemp("visa");

        
        ue = coll1.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Shrikanth");
        ue.setLastName("Menon");
        ue.setNuid(330);
        ue.setEmail("mm@gmail.com");
        ue.setDepartmentName(d3.getDepartmentName());
        ue.setNationality("Texas");
        ue.setReasonForUnemp("visa");
        
        HigherStudiesStudents hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Rackson");
        hs.setLastName("Ram");
        hs.setNuid(321);
        hs.setEmail("rgv@gmail.com");
        hs.setDepartmentName(d2.getDepartmentName());
        hs.setNationality("Mexican");
        hs.setMajorName("MIS");
        hs.setUniversityName("NEU");

        hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Bruce");
        hs.setLastName("Wayne");
        hs.setNuid(777);
        hs.setEmail("bat@gmail.com");
        hs.setNationality("chinki");
        hs.setDepartmentName(d1.getDepartmentName());
        hs.setMajorName("CSE");
        hs.setUniversityName("MIT");

        hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Jose");
        hs.setLastName("Mourinho");
        hs.setNuid(321);
        hs.setEmail("anu@gmail.com");
        hs.setNationality("Indian");
        hs.setDepartmentName(d3.getDepartmentName());
        hs.setMajorName("DO");
        hs.setUniversityName("John Hopkins");
        addData2(uni2);
    }
    
    public void addData2(University uni2){
        
        College coll2 = uni2.addCollege();
        coll2.setCollegeName("Matt Busby College of Dental");
        Department d1 = coll2.addDepartment();
        d1.setDepartmentName("Dental Surgery");
        Department d2 = coll2.addDepartment();
        d2.setDepartmentName("General Dental");
        Department d3 = coll2.addDepartment();
        d3.setDepartmentName("Pediatric Dentistry");

        Role r1 = d1.getJobPosition().addRole();
        r1.setRoleDescription("Teaching/Doctor");
        r1.setRoleName("proffesor");
        r1.setSalary(43000);
        r1.addPerson("Sam", "Cantona", "360 trafford medical", "EC@gmail.com", 850230879, 2200, r1);
        d1.getFacultyDirectory().addFaculty(r1.getPerson());

        Role r3 = d1.getJobPosition().addRole();
        r3.setRoleDescription("Teaching/Doctor");
        r3.setRoleName("Asst. proffesor");
        r3.setSalary(10000);
        r3.addPerson("vishal", "chawla", "360 snell medical", "vc@gmail.com", 989539928, 2400, r3);
        d1.getFacultyDirectory().addFaculty(r3.getPerson());

        Role r4 = d1.getJobPosition().addRole();
        r4.setRoleDescription("teaching staff");
        r4.setRoleName("Assist. proffesor");
        r4.setSalary(40000);
        r4.addPerson("richard", "blackman", "360 snell medical", "rs@gmail.com", 987652896, 2500, r4);
        d1.getFacultyDirectory().addFaculty(r4.getPerson());

        Role r7 = d1.getJobPosition().addRole();
        r7.setRoleDescription("nurse");
        r7.setRoleName("nurse");
        r7.setSalary(2000);
        r7.addPerson("jeff", "bush", "360 snell medical", "tl@gmail.com", 98134296, 500, r7);
        d1.getStaffDirectory().addStaff(r7.getPerson());
        
        Role r8 = d1.getJobPosition().addRole();
        r8.setRoleDescription("nurse");
        r8.setRoleName("nurse");
        r8.setSalary(1000);
        r8.addPerson("Amanda", "cerny", "360 snell medical", "az@gmail.com", 912314553, 500, r8);
        d1.getStaffDirectory().addStaff(r8.getPerson());
        
        Role r5 = d2.getJobPosition().addRole();
        r5.setRoleDescription("Teaching/Doctor");
        r5.setRoleName("proffesor");
        r5.setSalary(11000);
        r5.addPerson("alex", "ferguson", "old trafford", "saf@gmail.com", 980021321, 100000, r5);
        d2.getFacultyDirectory().addFaculty(r5.getPerson());

        Role r6 = d2.getJobPosition().addRole();
        r6.setRoleDescription("Teaching/Doctor");
        r6.setRoleName("proffesor");
        r6.setSalary(12000);
        r6.addPerson("Charles", "Xavier", "360 snell medical", "xman@gmail.com", 9898765, 2250, r6);
        d2.getFacultyDirectory().addFaculty(r6.getPerson());

        Role r9 = d2.getJobPosition().addRole();
        r9.setRoleDescription("clerk duties and accounts");
        r9.setRoleName("clerk");
        r9.setSalary(5000);
        r9.addPerson("mark", "sawers", "360 snell medical", "jk@gmail.com", 98134296, 500, r9);
        d2.getStaffDirectory().addStaff(r9.getPerson());
        
        Role r10 = d2.getJobPosition().addRole();
        r10.setRoleDescription("clerk duties and accounts");
        r10.setRoleName("clerks");
        r10.setSalary(500);
        r10.addPerson("mark", "sugarson", "360 snell medical", "ag@gmail.com", 98634496, 500, r10);
        d2.getStaffDirectory().addStaff(r10.getPerson());       
        
        Role r2 = d2.getJobPosition().addRole();
        r2.setRoleDescription("Teaching/Doctor");
        r2.setRoleName("proffesor");
        r2.setSalary(10000);
        r2.addPerson("Yusuf", "Ozbek", "360 snell medical", "yo@gmail.com", 999539977, 2300, r2);
        d2.getFacultyDirectory().addFaculty(r2.getPerson());

        Role r11 = d3.getJobPosition().addRole();
        r11.setRoleDescription("Teaching/Doctor");
        r11.setRoleName("proffesor");
        r11.setSalary(12000);
        r11.addPerson("patrick", "gary", "360 snell medical", "pa@gmail.com", 850230879, 2200, r11);
        d3.getFacultyDirectory().addFaculty(r11.getPerson());

        Role r12 = d3.getJobPosition().addRole();
        r12.setRoleDescription("Teaching/Doctor");
        r12.setRoleName("Asst. proffesor");
        r12.setSalary(12000);
        r12.addPerson("juhi", "chawla", "360 snell medical", "jc@gmail.com", 989539928, 2400, r12);
        d3.getFacultyDirectory().addFaculty(r12.getPerson());

        Role r13 = d3.getJobPosition().addRole();
        r13.setRoleDescription("Teaching/Doctor");
        r13.setRoleName("Assist. proffesor");
        r13.setSalary(14000);
        r13.addPerson("sharukh", "khan", "360 snell medical", "ss@gmail.com", 987652896, 2500, r13);
        d3.getFacultyDirectory().addFaculty(r13.getPerson());

        Role r14 = d3.getJobPosition().addRole();
        r14.setRoleDescription("human resource management");
        r14.setRoleName("HR");
        r14.setSalary(500);
        r14.addPerson("wolfbric", "logan", "360 snell medical", "rwl@gmail.com", 98134296, 500, r14);
        d3.getStaffDirectory().addStaff(r14.getPerson());
        
        Role r15 = d3.getJobPosition().addRole();
        r15.setRoleDescription("human resource management");
        r15.setRoleName("HR");
        r15.setSalary(5000);
        r15.addPerson("albus", "klod", "360 snell medical", "tk@gmail.com", 98134296, 500, r15);
        d3.getStaffDirectory().addStaff(r15.getPerson());
        
        Course c1 = d1.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c1.setCourseCredit(4);
        c1.setCourseCrn("DS5100");
        c1.setCourseDesc("General dental surgery techniques");
        c1.setCourseName("General dental Surgery");
        c1.setCourseType("lecture");

        Course c2 = d1.getCourseCatalog().addCourse();
        c2.setCourseCredit(4);
        c2.setCourseCrn("DS2345");
        c2.setCourseDesc("Dental Surgery design");
        c2.setCourseName("Dental Surgery");
        c2.setCourseType("lecture");

        Course c3 = d1.getCourseCatalog().addCourse();
        c3.setCourseCredit(4);
        c3.setCourseCrn("DS6543");
        c3.setCourseDesc("best practices for dental surgery");
        c3.setCourseName("Dental Surgery Methods");
        c3.setCourseType("lecture");

        Course c4 = d1.getCourseCatalog().addCourse();
        c4.setCourseCredit(2);
        c4.setCourseCrn("GS4532");
        c4.setCourseDesc("Dentures design");
        c4.setCourseName("Denture tool design");
        c4.setCourseType("lecture");

        Course c6 = d1.getCourseCatalog().addCourse();
        c6.setCourseCredit(3);
        c6.setCourseCrn("DS6790");
        c6.setCourseDesc("Facial surgery");
        c6.setCourseName("Facial systems");
        c6.setCourseType("lecture");

        Course c7 = d2.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c7.setCourseCredit(4);
        c7.setCourseCrn("GD6100");
        c7.setCourseDesc("Diagnosing a dental irregularity");
        c7.setCourseName("Dental Diagnostics");
        c7.setCourseType("lecture");

        Course c8 = d2.getCourseCatalog().addCourse();
        c8.setCourseCredit(4);
        c8.setCourseCrn("GD6200");
        c8.setCourseDesc("communicable Oral diseases");
        c8.setCourseName("Oral Disease");
        c8.setCourseType("lecture");

        Course c9 = d2.getCourseCatalog().addCourse();
        c9.setCourseCredit(4);
        c9.setCourseCrn("GD7100");
        c9.setCourseDesc("The concept of braces");
        c9.setCourseName("Braces");
        c9.setCourseType("lecture");

        Course c10 = d2.getCourseCatalog().addCourse();
        c10.setCourseCredit(2);
        c10.setCourseCrn("GD7600");
        c10.setCourseDesc("Viral and Bacterial Diseases in the mouth and teeth");
        c10.setCourseName("Oral V&B disease");
        c10.setCourseType("lecture");

        Course c11 = d2.getCourseCatalog().addCourse();
        c11.setCourseCredit(1);
        c11.setCourseCrn("GD8150");
        c11.setCourseDesc("Anathesia");
        c11.setCourseName("Dental anathesia");
        c11.setCourseType("Lecture");


        Course c12 = d3.getCourseCatalog().addCourse();
        c12.setCourseCredit(3);
        c12.setCourseCrn("PD6790");
        c12.setCourseDesc("Basics of the pediatric dentisty");
        c12.setCourseName("PD 101");
        c12.setCourseType("lecture");

        Course c5 = d3.getCourseCatalog().addCourse();
        c5.setCourseCredit(1);
        c5.setCourseCrn("PD5150");
        c5.setCourseDesc("Pediatric Dental surgery fundamentals");
        c5.setCourseName("PD surgery");
        c5.setCourseType("Lab");
        
        Course c13 = d3.getCourseCatalog().addCourse();
        c13.setCourseCredit(3);
        c13.setCourseCrn("PD7790");
        c13.setCourseDesc("intro to Pediatric Dentures");
        c13.setCourseName("Baby Dentures");
        c13.setCourseType("lecture");
        
        Course c14 = d3.getCourseCatalog().addCourse();
        c14.setCourseCredit(3);
        c14.setCourseCrn("PD8890");
        c14.setCourseDesc("Pediatric dental reconstruction");
        c14.setCourseName("PD plastics");
        c14.setCourseType("lecture");
        
        Course c15 = d3.getCourseCatalog().addCourse();
        c15.setCourseCredit(3);
        c15.setCourseCrn("PD6790");
        c15.setCourseDesc("Pediatric Root canal and other methods");
        c15.setCourseName("Daily Pediatric Dentistry");
        c15.setCourseType("lab");
        
        Degree degree1 = d1.addDegreeToDepartment();
        degree1.setDegreeLength(4);
        degree1.setDegreeType("B.D.S");
        degree1.addRequiredCourse(c1);
        degree1.addElectiveCourse(c2);
        degree1.addElectiveCourse(c3);
        degree1.setMajor("Dental Surgery");

        Degree degree2 = d1.addDegreeToDepartment();
        degree2.setDegreeLength(3);
        degree2.setDegreeType("D.D.S");
        degree2.addRequiredCourse(c1);
        degree2.addElectiveCourse(c4);
        degree2.addElectiveCourse(c3);
        degree2.setMajor("Dental Surgery");

        Degree degree3 = d1.addDegreeToDepartment();
        degree3.setDegreeLength(1);
        degree3.setDegreeType("D.M.D");
        degree3.addRequiredCourse(c1);
        degree3.addElectiveCourse(c4);
        degree3.addElectiveCourse(c6);
        degree3.setMajor("Dental Surgery");
        

        Degree degree12 = d2.addDegreeToDepartment();
        degree12.setDegreeLength(4);
        degree12.setDegreeType("M.D.S");
        degree12.addRequiredCourse(c1);
        degree12.addElectiveCourse(c8);
        degree12.addElectiveCourse(c9);
        degree12.setMajor("General Dentistry");
        

        Degree degree22 = d2.addDegreeToDepartment();
        degree22.setDegreeLength(3);
        degree22.setDegreeType("B.D.S");
        degree22.addRequiredCourse(c1);
        degree22.addElectiveCourse(c10);
        degree22.addElectiveCourse(c9);
        degree22.setMajor("General Dentistry");

        Degree degree32 = d2.addDegreeToDepartment();
        degree32.setDegreeLength(1);
        degree32.setDegreeType("D.M.D");
        degree32.addRequiredCourse(c1);
        degree32.addElectiveCourse(c9);
        degree32.addElectiveCourse(c10);
        degree32.setMajor("General Dentistry");
        
        Degree degree4 = d3.addDegreeToDepartment();
        degree4.setDegreeLength(3);
        degree4.setDegreeType("B.D.S");
        degree4.addRequiredCourse(c1);
        degree4.addElectiveCourse(c13);
        degree4.addElectiveCourse(c5);
        degree4.setMajor("Pediatric Dentistry");
        
        Degree degree5 = d3.addDegreeToDepartment();
        degree5.setDegreeLength(1);
        degree5.setDegreeType("D.M.D");
        degree5.addRequiredCourse(c1);
        degree5.addElectiveCourse(c5);
        degree5.addElectiveCourse(c15);
        degree5.setMajor("Pediatric Dentistry");

        Degree degree6 = d3.addDegreeToDepartment();
        degree6.setDegreeLength(4);
        degree6.setDegreeType("M.D.S");
        degree6.addRequiredCourse(c1);
        degree6.addElectiveCourse(c13);
        degree6.addElectiveCourse(c12);
        degree6.setMajor("Pediatric Dentistry");
        
        Semester s1 = d1.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1.setSemType("fall");
        s1.setSemNumber(1);
        s1.setSemYear(2016);
        CourseOffering co1 = s1.addCourseToSemester(c1, s1);
        co1.setDay("thursday");
        co1.setLectureEndTime("12:00");
        co1.setLectureStartTime("08:00");
        co1.assignClassRoom("Stiker hall", 543, d1.getFacultyDirectory());

        CourseOffering co4 = s1.addCourseToSemester(c4, s1);
        co4.setDay("frday");
        co4.setLectureEndTime("13:00");
        co4.setLectureStartTime("10:00");
        co4.assignClassRoom("presidents hall", 765, d1.getFacultyDirectory());

        Semester s2 = d1.getCourseSchedule().addSemesterToSchedule();
        s2.setSemNumber(2);
        s2.setSemType("spring");
        s2.setSemYear(2017);
        CourseOffering co2 = s2.addCourseToSemester(c1, s2);
        co2.setDay("thursday");
        co2.setLectureEndTime("11:00");
        co2.setLectureStartTime("08:00");
        co2.assignClassRoom("Trafford", 200, d1.getFacultyDirectory());



        Semester s3 = d1.getCourseSchedule().addSemesterToSchedule();
        s3.setSemNumber(3);
        s3.setSemType("fall");
        s3.setSemYear(2017);
        CourseOffering co3 = s3.addCourseToSemester(c3, s3);
        co3.setDay("wednesday");
        co3.setLectureEndTime("14:00");
        co3.setLectureStartTime("11:00");
        co3.assignClassRoom("Dr.House hall", 302, d1.getFacultyDirectory());

        CourseOffering co6 = s3.addCourseToSemester(c6, s3);
        co6.setDay("saturday");
        co6.setLectureEndTime("11:00");
        co6.setLectureStartTime("08:00");
        co6.assignClassRoom("Doctor hall", 126, d1.getFacultyDirectory());

        Semester s1d2 = d2.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1d2.setSemType("fall");
        s1d2.setSemNumber(1);
        s1d2.setSemYear(2016);
        CourseOffering co12 = s1d2.addCourseToSemester(c1, s1d2);
        co12.setDay("tuesday");
        co12.setLectureEndTime("10:00");
        co12.setLectureStartTime("08:00");
        co12.assignClassRoom("blackman hall", 543, d2.getFacultyDirectory());

        CourseOffering co42 = s1d2.addCourseToSemester(c8, s1d2);
        co42.setDay("tuesday");
        co42.setLectureEndTime("11:00");
        co42.setLectureStartTime("08:00");
        co42.assignClassRoom("presidents hall", 765, d2.getFacultyDirectory());

        Semester s2d2 = d2.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s2d2.setSemNumber(2);
        s2d2.setSemType("spring");
        s2d2.setSemYear(2017);
        CourseOffering co22 = s2d2.addCourseToSemester(c9, s2d2);
        co22.setDay("friday");
        co22.setLectureEndTime("10:00");
        co22.setLectureStartTime("08:00");
        co22.assignClassRoom("snell", 200, d2.getFacultyDirectory());

        CourseOffering co52 = s2d2.addCourseToSemester(c10, s2d2);
        co52.setDay("wednesday");
        co52.setLectureEndTime("11:00");
        co52.setLectureStartTime("08:00");
        co52.assignClassRoom("independance hall", 121, d2.getFacultyDirectory());

        Semester s3d2 = d2.getCourseSchedule().addSemesterToSchedule();
        s3d2.setSemNumber(3);
        s3d2.setSemType("fall");
        s3d2.setSemYear(2017);
        CourseOffering co32 = s3d2.addCourseToSemester(c11, s3d2);
        co32.setDay("friday");
        co32.setLectureEndTime("11:00");
        co32.setLectureStartTime("08:00");
        co32.assignClassRoom("Cuddy hall", 302, d2.getFacultyDirectory());


        Semester s1d3 = d3.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1d3.setSemType("fall");
        s1d3.setSemNumber(1);
        s1d3.setSemYear(2016);
        CourseOffering co13 = s1d3.addCourseToSemester(c1, s1d3);
        co13.setDay("monday");
        co13.setLectureEndTime("10:00");
        co13.setLectureStartTime("08:00");
        co13.assignClassRoom("Foreman hall", 543, d3.getFacultyDirectory());

        CourseOffering co23 = s1d3.addCourseToSemester(c5, s1d3);
        co23.setDay("tuesday");
        co23.setLectureEndTime("11:00");
        co23.setLectureStartTime("07:00");
        co23.assignClassRoom("Chase hall", 765, d3.getFacultyDirectory());

        Semester s2d3 = d3.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s2d3.setSemNumber(2);
        s2d3.setSemType("spring");
        s2d3.setSemYear(2017);
        CourseOffering co33 = s2d3.addCourseToSemester(c13, s2d3);
        co33.setDay("wednesday");
        co33.setLectureEndTime("11:00");
        co33.setLectureStartTime("08:00");
        co33.assignClassRoom("snell", 200, d3.getFacultyDirectory());

        CourseOffering co43 = s2d3.addCourseToSemester(c14, s2d3);
        co43.setDay("wednesday");
        co43.setLectureEndTime("11:00");
        co43.setLectureStartTime("08:00");
        co43.assignClassRoom("independance hall", 121, d3.getFacultyDirectory());

        Semester s3d3 = d3.getCourseSchedule().addSemesterToSchedule();
        s3d3.setSemNumber(3);
        s3d3.setSemType("fall");
        s3d3.setSemYear(2017);
        CourseOffering co53 = s3d3.addCourseToSemester(c15, s3d3);
        co53.setDay("friday");
        co53.setLectureEndTime("11:00");
        co53.setLectureStartTime("08:00");
        co53.assignClassRoom("Dr.House hall", 302, d3.getFacultyDirectory());


  
        StudentDirectory studentDirectory = new StudentDirectory();
        Student student = studentDirectory.addStudent();
        student.setFirstName("Saravan");
        student.setLastName("Vadivel");
        student.setEmail("saravan.deepak@gmail.com");
        student.setNuid(1010);
        student.setNationality("UAE");
        student.setDepartmentName(d1.getDepartmentName());


        student = studentDirectory.addStudent();
        student.setFirstName("Vaishak");
        student.setLastName("Dinesh");
        student.setEmail("vaishak.dinesh@gmail.com");
        student.setNuid(1020);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());


        student = studentDirectory.addStudent();
        student.setFirstName("Nithin");
        student.setLastName("Kartha");
        student.setEmail("nithin.katha@gmail.com");
        student.setNuid(1030);
        student.setNationality("Russia");
        student.setDepartmentName(d1.getDepartmentName());


        student = studentDirectory.addStudent();
        student.setFirstName("Darren");
        student.setLastName("Fletcher");
        student.setEmail("darren.fletch@gmail.com");
        student.setNuid(6530);
        student.setNationality("Scotland");
        student.setDepartmentName(d1.getDepartmentName());
        d1.setDeptStudentDirectory(studentDirectory);

        StudentDirectory studentDirectory2 = new StudentDirectory();
        Student student2 = studentDirectory2.addStudent();
        student2.setFirstName("Wayne");
        student2.setLastName("Rooney");
        student2.setEmail("WR10@gmail.com");
        student2.setNuid(8010);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());


        student2 = studentDirectory2.addStudent();
        student2.setFirstName("Michael");
        student2.setLastName("Owen");
        student2.setEmail("CR16@gmail.com");
        student2.setNuid(8020);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());

        

        student2 = studentDirectory2.addStudent();
        student2.setFirstName("David");
        student2.setLastName("Beckham");
        student2.setEmail("DB7a@gmail.com");
        student2.setNuid(8030);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());

        
        student2 = studentDirectory2.addStudent();
        student2.setFirstName("Cristiano");
        student2.setLastName("Ronaldo");
        student2.setEmail("cr7@gmail.com");
        student2.setNuid(9030);
        student2.setNationality("Portugal");
        student2.setDepartmentName(d2.getDepartmentName());
        d2.setDeptStudentDirectory(studentDirectory2);
        
        
        StudentDirectory studentDirectory3 = new StudentDirectory();
        Student student3 = studentDirectory3.addStudent();
        student3.setFirstName("Chris");
        student3.setLastName("Smalling");
        student3.setEmail("cs@gmail.com");
        student3.setNuid(1201);
        student3.setNationality("England");
        student3.setDepartmentName(d3.getDepartmentName());


        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Ryan");
        student3.setLastName("Giggs");
        student3.setEmail("gig@gmail.com");
        student3.setNuid(1202);
        student3.setNationality("Wales");
        student3.setDepartmentName(d3.getDepartmentName());
    

        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Zlatan");
        student3.setLastName("ibrahivomic");
        student3.setEmail("god@gmail.com");
        student3.setNuid(1203);
        student3.setNationality("Sweden");
        student3.setDepartmentName(d3.getDepartmentName());
        
        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Anthony");
        student3.setLastName("Martial");
        student3.setEmail("am@gmail.com");
        student3.setNuid(1207);
        student3.setNationality("France");
        student3.setDepartmentName(d3.getDepartmentName());

        d3.setDeptStudentDirectory(studentDirectory3);


        ArrayList<Student> studentList1= new ArrayList<>();
        ArrayList<Student> studentList2= new ArrayList<>();
        for(int i=0; i<2;i++){
            studentList1.add(d1.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for(int i=2; i<d1.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList2.add(d1.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        
        co1.addSeats(1500, d1.getDeptStudentDirectory().getStudentDirectory());
        co1.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co1.getSeatList().get(1).addMarks(80, 80, 90, 86, 76, 90, 80, 95);
        co1.getSeatList().get(2).addMarks(90, 95, 99, 80, 71, 93, 85, 100);
        co1.getSeatList().get(3).addMarks(99, 93, 90, 80, 75, 90, 85, 100);
        
        co2.addSeats(1100, studentList1);
        co2.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co2.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 93, 80, 95);
        

        co3.addSeats(1100, studentList2);
        co3.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co3.getSeatList().get(1).addMarks(80, 80, 92, 85, 77, 94, 82, 95);
        

        co4.addSeats(1100, studentList1);
        co4.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co4.getSeatList().get(1).addMarks(74, 86, 93, 82, 75, 90, 80, 91);
        


        co6.addSeats(1100, studentList2);
        co6.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co6.getSeatList().get(1).addMarks(88, 82, 90, 89, 89, 100, 70, 95);
        
        
        
        ArrayList<Student> studentList3= new ArrayList<>();
        ArrayList<Student> studentList4= new ArrayList<>();
        for(int i=0; i<2;i++){
            studentList3.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for(int i=2; i<d2.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList4.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        
        co12.addSeats(1500, d2.getDeptStudentDirectory().getStudentDirectory());
        co12.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co12.getSeatList().get(1).addMarks(80, 86, 90, 82, 75, 90, 86, 93);
        co12.getSeatList().get(2).addMarks(90, 99, 99, 84, 71, 90, 82, 100);
        co12.getSeatList().get(3).addMarks(94, 95, 85, 80, 73, 69, 85, 99);
        
        co22.addSeats(1100, studentList3);
        co22.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co22.getSeatList().get(1).addMarks(89, 83, 90, 68, 75, 91, 80, 95);
        

        co32.addSeats(1100, studentList4);
        co32.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co32.getSeatList().get(1).addMarks(89, 89, 99, 89, 79, 99, 89, 95);
        
        co42.addSeats(1100, studentList3);
        co42.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co42.getSeatList().get(1).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        
        co52.addSeats(1100, studentList4);
        co52.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co52.getSeatList().get(1).addMarks(60, 81, 90, 82, 73, 90, 80, 95);
        
        ArrayList<Student> studentList5= new ArrayList<>();
        ArrayList<Student> studentList6= new ArrayList<>();
        for(int i=0; i<2;i++){
            studentList5.add(d3.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for(int i=2; i<d3.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList6.add(d3.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
                
        
        
        
        co13.addSeats(1100, d3.getDeptStudentDirectory().getStudentDirectory());
        co13.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co13.getSeatList().get(1).addMarks(88, 81, 90, 89, 72, 98, 80, 95);
        co13.getSeatList().get(2).addMarks(90, 97, 93, 78, 72, 92, 85, 100);
        co13.getSeatList().get(3).addMarks(97, 95, 90, 87, 78, 89, 88, 100);

        co23.addSeats(1100, studentList5);
        co23.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co23.getSeatList().get(1).addMarks(60, 100, 90, 82, 75, 90, 100, 95);
        
        
        co33.addSeats(1100, studentList6);
        co33.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co33.getSeatList().get(1).addMarks(88, 82, 100, 89, 75, 100, 80, 95);
        

        co53.addSeats(1100, studentList5);
        co53.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co53.getSeatList().get(1).addMarks(60, 81, 100, 82, 75, 90, 80, 100);
        
        
        co43.addSeats(1100, studentList6);
        co43.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co43.getSeatList().get(1).addMarks(88, 82, 100, 89, 75, 100, 80, 100);
        
        EmployedStudents es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Nithin");
        es.setLastName("Kartha");
        es.setNuid(222);
        es.setEmail("ndk@gmail.com");
        es.setNationality("Indian");
        es.setEmployerName("Appolo Dental Hospitals");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("Doctor");
        es.setSalary(100000);

        es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Reshma");
        es.setLastName("Mohan");
        es.setNuid(243);
        es.setEmail("yench@gmail.com");
        es.setNationality("Chinese");
        es.setEmployerName("John Hopkins Dental Hospital");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("House Surgeon");
        es.setSalary(110000);
        
        es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Nick");
        es.setLastName("Bateman");
        es.setNuid(205);
        es.setEmail("nickfur@gmail.com");
        es.setNationality("Spain");
        es.setEmployerName("John Hopkins Dental Hospital");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("House Surgeon");
        es.setSalary(90000);
        
        es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Jack");
        es.setLastName("Joseph");
        es.setNuid(201);
        es.setEmail("kit@gmail.com");
        es.setNationality("Singapore");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("John Hopkins Dental Hospital");
        es.setEmploymentDescription("Doctor");
        es.setSalary(80000);



        es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Amy");
        es.setLastName("Jensetler");
        es.setNuid(210);
        es.setEmail("amyjen@gmail.com");
        es.setNationality("American");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("John Hopkins Dental Hospital");
        es.setEmploymentDescription("Diagnostician");
        es.setSalary(70000);

        es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Sweta");
        es.setLastName("Joseph");
        es.setNuid(217);
        es.setEmail("swae@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("John Hopkins Dental Hospital");
        es.setEmploymentDescription("Dental Diagnostician");
        es.setSalary(90000);

        es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Sruthy");
        es.setLastName("Kunjumon");
        es.setNuid(201);
        es.setEmail("sk@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("John Hopkins Dental Hospital");
        es.setEmploymentDescription("Dental Surgeon Lead");
        es.setSalary(90000);

        es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("packman");
        es.setLastName("paul");
        es.setNuid(210);
        es.setEmail("antp@gmail.com");
        es.setNationality("American");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("United States Government");
        es.setEmploymentDescription("Dental Surgeon General");
        es.setSalary(75400);

        es = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Arun");
        es.setLastName("Mathew");
        es.setNuid(217);
        es.setEmail("Arm@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("John Hopkins Dental Hospital");
        es.setEmploymentDescription("HOD Dental Surgery");
        es.setSalary(90000);
        
        UnemployedStudents ue = coll2.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Jacob");
        ue.setLastName("John");
        ue.setNuid(300);
        ue.setEmail("jacjon@gmail.com");
        ue.setNationality("American");
        ue.setDepartmentName(d1.getDepartmentName());
        ue.setReasonForUnemp("Low Grades");

        ue = coll2.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Russel");
        ue.setLastName("crowe");
        ue.setNuid(330);
        ue.setEmail("j@gmail.com");
        ue.setDepartmentName(d2.getDepartmentName());
        ue.setNationality("Georgia");
        ue.setReasonForUnemp("visa");

        
        ue = coll2.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Shrikanth");
        ue.setLastName("Menon");
        ue.setNuid(330);
        ue.setEmail("mm@gmail.com");
        ue.setDepartmentName(d3.getDepartmentName());
        ue.setNationality("Ukraine");
        ue.setReasonForUnemp("visa");
        
        HigherStudiesStudents hs = coll2.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("louis");
        hs.setLastName("van gaal");
        hs.setNuid(321);
        hs.setEmail("rgv@gmail.com");
        hs.setDepartmentName(d2.getDepartmentName());
        hs.setNationality("Mexican");
        hs.setMajorName("MDS");
        hs.setUniversityName("Tuft Univeristy");

        hs = coll2.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Bruce");
        hs.setLastName("Wayne");
        hs.setNuid(777);
        hs.setEmail("bat@gmail.com");
        hs.setNationality("chinki");
        hs.setDepartmentName(d1.getDepartmentName());
        hs.setMajorName("MDS");
        hs.setUniversityName("Tuft Univeristy");

        hs = coll2.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Jose");
        hs.setLastName("Mourinho");
        hs.setNuid(321);
        hs.setEmail("anu@gmail.com");
        hs.setNationality("Indian");
        hs.setDepartmentName(d3.getDepartmentName());
        hs.setMajorName("MDS");
        hs.setUniversityName("Tuft Univeristy");
    }
    
    public void initializeData() {

        University uni1;
        uni1 = eco.addUniversity();
        uni1.setUniversityName("NorthEastern University");

        College coll1 = uni1.addCollege();
        coll1.setCollegeName("College of Engineering");
        Department d1 = coll1.addDepartment();
        d1.setDepartmentName("EEE");
        Department d2 = coll1.addDepartment();
        d2.setDepartmentName("Information System");
        Department d3 = coll1.addDepartment();
        d3.setDepartmentName("Mech");

        Role r1 = d1.getJobPosition().addRole();
        r1.setRoleDescription("teaching staff");
        r1.setRoleName("proffesor");
        r1.setSalary(1000);
        r1.addPerson("Kal", "Bugrara", "360 snell engineering", "kb@gmail.com", 850230879, 2200, r1);
        d1.getFacultyDirectory().addFaculty(r1.getPerson());

        Role r3 = d1.getJobPosition().addRole();
        r3.setRoleDescription("teaching staff");
        r3.setRoleName("Asst. proffesor");
        r3.setSalary(1000);
        r3.addPerson("vishal", "chawla", "360 snell engineering", "vc@gmail.com", 989539928, 2400, r3);
        d1.getFacultyDirectory().addFaculty(r3.getPerson());

        Role r4 = d1.getJobPosition().addRole();
        r4.setRoleDescription("teaching staff");
        r4.setRoleName("Assist. proffesor");
        r4.setSalary(1000);
        r4.addPerson("richard", "sherman", "360 snell engineering", "rs@gmail.com", 987652896, 2500, r4);
        d1.getFacultyDirectory().addFaculty(r4.getPerson());

        Role r7 = d1.getJobPosition().addRole();
        r7.setRoleDescription("non teaching staff");
        r7.setRoleName("office Assist");
        r7.setSalary(500);
        r7.addPerson("todd", "logan", "360 snell engineering", "tl@gmail.com", 98134296, 500, r7);
        d1.getStaffDirectory().addStaff(r7.getPerson());

        Role r8 = d1.getJobPosition().addRole();
        r8.setRoleDescription("non teaching staff");
        r8.setRoleName("office Assist");
        r8.setSalary(500);
        r8.addPerson("Amanda", "ziets", "360 snell engineering", "az@gmail.com", 912314553, 500, r8);
        d1.getStaffDirectory().addStaff(r8.getPerson());

        Role r5 = d2.getJobPosition().addRole();
        r5.setRoleDescription("teaching staff");
        r5.setRoleName("proffesor");
        r5.setSalary(1000);
        r5.addPerson("alex", "ferguson", "old trafford", "saf@gmail.com", 980021321, 100000, r5);
        d2.getFacultyDirectory().addFaculty(r5.getPerson());

        Role r6 = d2.getJobPosition().addRole();
        r6.setRoleDescription("teaching staff");
        r6.setRoleName("proffesor");
        r6.setSalary(1000);
        r6.addPerson("Charles", "Xavier", "360 snell engineering", "xman@gmail.com", 9898765, 2250, r6);
        d2.getFacultyDirectory().addFaculty(r6.getPerson());

        Role r9 = d2.getJobPosition().addRole();
        r9.setRoleDescription("non teaching staff");
        r9.setRoleName("Assist. clerk");
        r9.setSalary(500);
        r9.addPerson("jim", "klod", "360 snell engineering", "jk@gmail.com", 98134296, 500, r9);
        d2.getStaffDirectory().addStaff(r9.getPerson());

        Role r10 = d2.getJobPosition().addRole();
        r10.setRoleDescription("non teaching staff");
        r10.setRoleName("office Assist");
        r10.setSalary(500);
        r10.addPerson("Alex", "Grestel", "360 snell engineering", "ag@gmail.com", 98634496, 500, r10);
        d2.getStaffDirectory().addStaff(r10.getPerson());

        Role r2 = d2.getJobPosition().addRole();
        r2.setRoleDescription("teaching staff");
        r2.setRoleName("proffesor");
        r2.setSalary(1000);
        r2.addPerson("Yusuf", "Ozbek", "360 snell engineering", "yo@gmail.com", 999539977, 2300, r2);
        d2.getFacultyDirectory().addFaculty(r2.getPerson());

        Role r11 = d3.getJobPosition().addRole();
        r11.setRoleDescription("teaching staff");
        r11.setRoleName("proffesor");
        r11.setSalary(1000);
        r11.addPerson("patrick", "shan", "360 snell engineering", "pa@gmail.com", 850230879, 2200, r11);
        d3.getFacultyDirectory().addFaculty(r11.getPerson());

        Role r12 = d3.getJobPosition().addRole();
        r12.setRoleDescription("teaching staff");
        r12.setRoleName("Asst. proffesor");
        r12.setSalary(1000);
        r12.addPerson("juhi", "chawla", "360 snell engineering", "jc@gmail.com", 989539928, 2400, r12);
        d3.getFacultyDirectory().addFaculty(r12.getPerson());

        Role r13 = d3.getJobPosition().addRole();
        r13.setRoleDescription("teaching staff");
        r13.setRoleName("Assist. proffesor");
        r13.setSalary(1000);
        r13.addPerson("sharukh", "sherman", "360 snell engineering", "ss@gmail.com", 987652896, 2500, r13);
        d3.getFacultyDirectory().addFaculty(r13.getPerson());

        Role r14 = d3.getJobPosition().addRole();
        r14.setRoleDescription("non teaching staff");
        r14.setRoleName("office Assist");
        r14.setSalary(500);
        r14.addPerson("wolfee", "logan", "360 snell engineering", "rwl@gmail.com", 98134296, 500, r14);
        d3.getStaffDirectory().addStaff(r14.getPerson());

        Role r15 = d3.getJobPosition().addRole();
        r15.setRoleDescription("non teaching staff");
        r15.setRoleName("office Assist");
        r15.setSalary(500);
        r15.addPerson("todd", "klod", "360 snell engineering", "tk@gmail.com", 98134296, 500, r15);
        d3.getStaffDirectory().addStaff(r15.getPerson());

        Course c1 = d1.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c1.setCourseCredit(4);
        c1.setCourseCrn("EE5100");
        c1.setCourseDesc("cicuit design");
        c1.setCourseName("EE");
        c1.setCourseType("lecture");

        Course c2 = d1.getCourseCatalog().addCourse();
        c2.setCourseCredit(4);
        c2.setCourseCrn("EE2345");
        c2.setCourseDesc("powersystem design");
        c2.setCourseName("Powersystem");
        c2.setCourseType("lecture");

        Course c3 = d1.getCourseCatalog().addCourse();
        c3.setCourseCredit(4);
        c3.setCourseCrn("EE6543");
        c3.setCourseDesc("MC & MP");
        c3.setCourseName("MC & MP");
        c3.setCourseType("lecture");

        Course c4 = d1.getCourseCatalog().addCourse();
        c4.setCourseCredit(2);
        c4.setCourseCrn("EE4532");
        c4.setCourseDesc("electrical machine design");
        c4.setCourseName("Machine design");
        c4.setCourseType("lecture");

        Course c6 = d1.getCourseCatalog().addCourse();
        c6.setCourseCredit(3);
        c6.setCourseCrn("EE6790");
        c6.setCourseDesc("Electrical Transmission lines");
        c6.setCourseName("Transmission systems");
        c6.setCourseType("lecture");

        Course c7 = d2.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c7.setCourseCredit(4);
        c7.setCourseCrn("info6100");
        c7.setCourseDesc("app designing sol");
        c7.setCourseName("OO design");
        c7.setCourseType("lecture");

        Course c8 = d2.getCourseCatalog().addCourse();
        c8.setCourseCredit(4);
        c8.setCourseCrn("info6200");
        c8.setCourseDesc("UI and UX");
        c8.setCourseName("UX");
        c8.setCourseType("lecture");

        Course c9 = d2.getCourseCatalog().addCourse();
        c9.setCourseCredit(4);
        c9.setCourseCrn("info7100");
        c9.setCourseDesc("databases and no sql");
        c9.setCourseName("NOSQL");
        c9.setCourseType("lecture");

        Course c10 = d2.getCourseCatalog().addCourse();
        c10.setCourseCredit(2);
        c10.setCourseCrn("info7600");
        c10.setCourseDesc("data analysis and BI");
        c10.setCourseName("BI and DWH");
        c10.setCourseType("lecture");

        Course c11 = d2.getCourseCatalog().addCourse();
        c11.setCourseCredit(1);
        c11.setCourseCrn("info8150");
        c11.setCourseDesc("big data");
        c11.setCourseName("big data");
        c11.setCourseType("Lecture");

        Course c12 = d3.getCourseCatalog().addCourse();
        c12.setCourseCredit(3);
        c12.setCourseCrn("mech6790");
        c12.setCourseDesc("manufacturing");
        c12.setCourseName("manufacture");
        c12.setCourseType("lecture");

        Course c5 = d3.getCourseCatalog().addCourse();
        c5.setCourseCredit(1);
        c5.setCourseCrn("mech5150");
        c5.setCourseDesc("thermodynamics");
        c5.setCourseName("thermo Lab");
        c5.setCourseType("Lab");

        Course c13 = d3.getCourseCatalog().addCourse();
        c13.setCourseCredit(3);
        c13.setCourseCrn("mech7790");
        c13.setCourseDesc("engine design");
        c13.setCourseName("design");
        c13.setCourseType("lecture");

        Course c14 = d3.getCourseCatalog().addCourse();
        c14.setCourseCredit(3);
        c14.setCourseCrn("mech8890");
        c14.setCourseDesc("drills");
        c14.setCourseName("drilling");
        c14.setCourseType("lecture");

        Course c15 = d3.getCourseCatalog().addCourse();
        c15.setCourseCredit(3);
        c15.setCourseCrn("mech6790");
        c15.setCourseDesc("aerodynamics");
        c15.setCourseName("dynamics");
        c15.setCourseType("lab");

        Degree degree1 = d1.addDegreeToDepartment();
        degree1.setDegreeLength(4);
        degree1.setDegreeType("B.E");
        degree1.setMajor("BE in Circuit Design");
        degree1.addRequiredCourse(c1);
        degree1.addElectiveCourse(c2);
        degree1.addElectiveCourse(c3);
        degree1.addElectiveCourse(c4);
        degree1.addElectiveCourse(c6);

        Degree degree2 = d1.addDegreeToDepartment();
        degree2.setDegreeLength(3);
        degree2.setDegreeType("B.S");
        degree2.setMajor("BS in EEE");
        degree2.addRequiredCourse(c6);
        degree2.addElectiveCourse(c3);
        degree2.addElectiveCourse(c1);

        Degree degree3 = d1.addDegreeToDepartment();
        degree3.setDegreeLength(1);
        degree3.setDegreeType("certification");
        degree3.setMajor("Certification in EEE");
        degree3.addRequiredCourse(c2);
        degree3.addElectiveCourse(c4);
        degree3.addElectiveCourse(c6);

        Degree degree12 = d2.addDegreeToDepartment();
        degree12.setDegreeLength(4);
        degree12.setDegreeType("B.E");
        degree12.setMajor("BE in IS");
        degree12.addRequiredCourse(c7);
        degree12.addElectiveCourse(c8);
        degree12.addElectiveCourse(c9);
        degree12.addElectiveCourse(c10);
        degree12.addElectiveCourse(c11);

        Degree degree22 = d2.addDegreeToDepartment();
        degree22.setDegreeLength(3);
        degree22.setDegreeType("B.S");
        degree22.setMajor("BS in Database");
        degree22.addRequiredCourse(c11);
        degree22.addElectiveCourse(c9);
        degree22.addElectiveCourse(c8);
        degree22.addElectiveCourse(c7);

        Degree degree32 = d2.addDegreeToDepartment();
        degree32.setDegreeLength(1);
        degree32.setDegreeType("certification");
        degree32.setMajor("Certification in Datascience");
        degree32.addRequiredCourse(c8);
        degree32.addElectiveCourse(c9);
        degree32.addElectiveCourse(c10);

        Degree degree4 = d3.addDegreeToDepartment();
        degree4.setDegreeLength(3);
        degree4.setDegreeType("B.S");
        degree4.setMajor("BS in Manufacturing");
        degree4.addRequiredCourse(c12);
        degree4.addRequiredCourse(c13);
        degree4.addRequiredCourse(c5);
        degree4.addElectiveCourse(c14);
        degree4.addElectiveCourse(c15);

        Degree degree5 = d3.addDegreeToDepartment();
        degree5.setDegreeLength(1);
        degree5.setDegreeType("certification");
        degree5.setMajor("Certification in AeroDynamics");
        degree5.addRequiredCourse(c12);
        degree5.addRequiredCourse(c5);
        degree5.addRequiredCourse(c15);
        degree5.addRequiredCourse(c13);

        Degree degree6 = d3.addDegreeToDepartment();
        degree6.setDegreeLength(4);
        degree6.setDegreeType("B.E");
        degree6.setMajor("BE in Drilling");
        degree6.addRequiredCourse(c5);
        degree6.addRequiredCourse(c13);
        degree6.addRequiredCourse(c12);
        degree6.addElectiveCourse(c14);
        degree6.addElectiveCourse(c15);

        Semester s1 = d1.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1.setSemType("fall");
        s1.setSemNumber(1);
        s1.setSemYear(2016);
        CourseOffering co1 = s1.addCourseToSemester(c1, s1);
        co1.setDay("monday");
        co1.setLectureEndTime("11:00");
        co1.setLectureStartTime("08:00");
        co1.assignClassRoom("blackman hall", 543, d1.getFacultyDirectory());

        CourseOffering co4 = s1.addCourseToSemester(c4, s1);
        co4.setDay("tuesday");
        co4.setLectureEndTime("11:00");
        co4.setLectureStartTime("08:00");
        co4.assignClassRoom("presidents hall", 765, d1.getFacultyDirectory());

        Semester s2 = d1.getCourseSchedule().addSemesterToSchedule();
        s2.setSemNumber(2);
        s2.setSemType("spring");
        s2.setSemYear(2017);
        CourseOffering co2 = s2.addCourseToSemester(c2, s2);
        co2.setDay("wednesday");
        co2.setLectureEndTime("11:00");
        co2.setLectureStartTime("08:00");
        co2.assignClassRoom("snell", 200, d1.getFacultyDirectory());

        Semester s3 = d1.getCourseSchedule().addSemesterToSchedule();
        s3.setSemNumber(3);
        s3.setSemType("fall");
        s3.setSemYear(2017);
        CourseOffering co3 = s3.addCourseToSemester(c3, s3);
        co3.setDay("friday");
        co3.setLectureEndTime("11:00");
        co3.setLectureStartTime("08:00");
        co3.assignClassRoom("shillman hall", 302, d1.getFacultyDirectory());

        CourseOffering co6 = s3.addCourseToSemester(c6, s3);
        co6.setDay("sunday");
        co6.setLectureEndTime("11:00");
        co6.setLectureStartTime("08:00");
        co6.assignClassRoom("Eng hall", 126, d1.getFacultyDirectory());

        Semester s1d2 = d2.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1d2.setSemType("fall");
        s1d2.setSemNumber(1);
        s1d2.setSemYear(2016);
        CourseOffering co12 = s1d2.addCourseToSemester(c7, s1d2);
        co12.setDay("monday");
        co12.setLectureEndTime("11:00");
        co12.setLectureStartTime("08:00");
        co12.assignClassRoom("blackman hall", 543, d2.getFacultyDirectory());

        CourseOffering co42 = s1d2.addCourseToSemester(c8, s1d2);
        co42.setDay("tuesday");
        co42.setLectureEndTime("11:00");
        co42.setLectureStartTime("08:00");
        co42.assignClassRoom("presidents hall", 765, d2.getFacultyDirectory());

        Semester s2d2 = d2.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s2d2.setSemNumber(2);
        s2d2.setSemType("spring");
        s2d2.setSemYear(2017);
        CourseOffering co22 = s2d2.addCourseToSemester(c9, s2d2);
        co22.setDay("wednesday");
        co22.setLectureEndTime("11:00");
        co22.setLectureStartTime("08:00");
        co22.assignClassRoom("snell", 200, d2.getFacultyDirectory());

        CourseOffering co52 = s2d2.addCourseToSemester(c10, s2d2);
        co52.setDay("wednesday");
        co52.setLectureEndTime("11:00");
        co52.setLectureStartTime("08:00");
        co52.assignClassRoom("independance hall", 121, d2.getFacultyDirectory());

        Semester s3d2 = d2.getCourseSchedule().addSemesterToSchedule();
        s3d2.setSemNumber(3);
        s3d2.setSemType("fall");
        s3d2.setSemYear(2017);
        CourseOffering co32 = s3d2.addCourseToSemester(c11, s3d2);
        co32.setDay("friday");
        co32.setLectureEndTime("11:00");
        co32.setLectureStartTime("08:00");
        co32.assignClassRoom("shillman hall", 302, d2.getFacultyDirectory());

        Semester s1d3 = d3.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1d3.setSemType("fall");
        s1d3.setSemNumber(1);
        s1d3.setSemYear(2016);
        CourseOffering co13 = s1d3.addCourseToSemester(c12, s1d3);
        co13.setDay("monday");
        co13.setLectureEndTime("11:00");
        co13.setLectureStartTime("08:00");
        co13.assignClassRoom("blackman hall", 543, d3.getFacultyDirectory());

        CourseOffering co23 = s1d3.addCourseToSemester(c5, s1d3);
        co23.setDay("tuesday");
        co23.setLectureEndTime("11:00");
        co23.setLectureStartTime("08:00");
        co23.assignClassRoom("presidents hall", 765, d3.getFacultyDirectory());

        Semester s2d3 = d3.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s2d3.setSemNumber(2);
        s2d3.setSemType("spring");
        s2d3.setSemYear(2017);
        CourseOffering co33 = s2d3.addCourseToSemester(c13, s2d3);
        co33.setDay("wednesday");
        co33.setLectureEndTime("11:00");
        co33.setLectureStartTime("08:00");
        co33.assignClassRoom("snell", 200, d3.getFacultyDirectory());

        CourseOffering co43 = s2d3.addCourseToSemester(c14, s2d3);
        co43.setDay("wednesday");
        co43.setLectureEndTime("11:00");
        co43.setLectureStartTime("08:00");
        co43.assignClassRoom("independance hall", 121, d3.getFacultyDirectory());

        Semester s3d3 = d3.getCourseSchedule().addSemesterToSchedule();
        s3d3.setSemNumber(3);
        s3d3.setSemType("fall");
        s3d3.setSemYear(2017);
        CourseOffering co53 = s3d3.addCourseToSemester(c15, s3d3);
        co53.setDay("friday");
        co53.setLectureEndTime("11:00");
        co53.setLectureStartTime("08:00");
        co53.assignClassRoom("shillman hall", 302, d3.getFacultyDirectory());

        StudentDirectory studentDirectory = new StudentDirectory();
        Student student = studentDirectory.addStudent();
        student.setFirstName("Saravan");
        student.setLastName("Vadivel");
        student.setEmail("saravan.deepak@gmail.com");
        student.setNuid(101);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());

        student = studentDirectory.addStudent();
        student.setFirstName("Vaishak");
        student.setLastName("Dinesh");
        student.setEmail("vaishak.dinesh@gmail.com");
        student.setNuid(102);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());

        student = studentDirectory.addStudent();
        student.setFirstName("Nithin");
        student.setLastName("Kartha");
        student.setEmail("nithin.katha@gmail.com");
        student.setNuid(103);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());

        student = studentDirectory.addStudent();
        student.setFirstName("Ashwin");
        student.setLastName("Kartha");
        student.setEmail("ashwin.katha@gmail.com");
        student.setNuid(653);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());

        d1.setDeptStudentDirectory(studentDirectory);

        StudentDirectory studentDirectory2 = new StudentDirectory();
        Student student2 = studentDirectory2.addStudent();
        student2.setFirstName("Wayne");
        student2.setLastName("Rooney");
        student2.setEmail("WR10@gmail.com");
        student2.setNuid(801);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());

        student2 = studentDirectory2.addStudent();
        student2.setFirstName("Michael");
        student2.setLastName("Carrick");
        student2.setEmail("CR16@gmail.com");
        student2.setNuid(802);
        student2.setNationality("England");

        student2.setDepartmentName(d2.getDepartmentName());

        student2 = studentDirectory2.addStudent();
        student2.setFirstName("David");
        student2.setLastName("Beckham");
        student2.setEmail("DB7a@gmail.com");
        student2.setNuid(803);
        student2.setNationality("England");

        student2.setDepartmentName(d2.getDepartmentName());

        student2 = studentDirectory2.addStudent();
        student2.setFirstName("Cris");
        student2.setLastName("Ronaldo");
        student2.setEmail("cr7@gmail.com");
        student2.setNuid(903);
        student2.setNationality("Portugal");

        student2.setDepartmentName(d2.getDepartmentName());

        d2.setDeptStudentDirectory(studentDirectory2);

        StudentDirectory studentDirectory3 = new StudentDirectory();
        Student student3 = studentDirectory3.addStudent();
        student3.setFirstName("Rio");
        student3.setLastName("Ferdi");
        student3.setEmail("rf3@gmail.com");
        student3.setNuid(1801);
        student3.setNationality("England");
        student3.setDepartmentName(d3.getDepartmentName());

        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Man");
        student3.setLastName("Giggs");
        student3.setEmail("gig@gmail.com");
        student3.setNuid(1802);
        student3.setNationality("England");

        student3.setDepartmentName(d3.getDepartmentName());


        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Zlatan");
        student3.setLastName("ibra");
        student3.setEmail("god@gmail.com");
        student3.setNuid(1803);
        student3.setNationality("Sweden");
        
        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Jaison");
        student3.setLastName("Titus");
        student3.setEmail("jt@gmail.com");
        student3.setNuid(1803);
        student3.setNationality("American");

        student3.setDepartmentName(d3.getDepartmentName());

        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Tom");
        student3.setLastName("Jerry");
        student3.setEmail("tj@gmail.com");
        student3.setNuid(1803);
        student3.setNationality("Sweden");

        student3.setDepartmentName(d3.getDepartmentName());

        d3.setDeptStudentDirectory(studentDirectory3);

        ArrayList<Student> studentList1 = new ArrayList<>();
        ArrayList<Student> studentList2 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            studentList1.add(d1.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for (int i = 2; i < d1.getDeptStudentDirectory().getStudentDirectory().size(); i++) {
            studentList2.add(d1.getDeptStudentDirectory().getStudentDirectory().get(i));
        }

        co1.addSeats(1500, d1.getDeptStudentDirectory().getStudentDirectory());
        co1.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co1.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 90, 80, 95);
        co1.getSeatList().get(2).addMarks(90, 95, 90, 80, 70, 90, 85, 100);
        co1.getSeatList().get(3).addMarks(99, 93, 90, 80, 75, 90, 85, 100);

        co2.addSeats(1100, studentList1);
        co2.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co2.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 90, 80, 95);

        co3.addSeats(1100, studentList2);
        co3.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co3.getSeatList().get(1).addMarks(80, 80, 92, 80, 75, 90, 80, 95);

        co4.addSeats(1100, studentList1);
        co4.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co4.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 90, 80, 91);

        co6.addSeats(1100, studentList2);
        co6.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co6.getSeatList().get(1).addMarks(88, 82, 90, 89, 75, 99, 80, 95);

        ArrayList<Student> studentList3 = new ArrayList<>();
        ArrayList<Student> studentList4 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            studentList3.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }

        for(int i=2; i<d2.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList4.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        

        for (int i = 2; i < d2.getDeptStudentDirectory().getStudentDirectory().size(); i++) {
            studentList4.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }

        co12.addSeats(1500, d2.getDeptStudentDirectory().getStudentDirectory());
        co12.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co12.getSeatList().get(1).addMarks(80, 86, 90, 80, 75, 90, 80, 95);
        co12.getSeatList().get(2).addMarks(90, 95, 90, 80, 73, 90, 85, 100);
        co12.getSeatList().get(3).addMarks(94, 95, 88, 80, 73, 69, 85, 99);

        co22.addSeats(1100, studentList3);
        co22.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co22.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 91, 80, 95);

        co32.addSeats(1100, studentList4);
        co32.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co32.getSeatList().get(1).addMarks(80, 80, 94, 80, 75, 90, 80, 95);

        
        co42.addSeats(1100, studentList3);
        co42.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co42.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 94, 80, 91);
        
        co52.addSeats(1100, studentList4);
        co52.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co52.getSeatList().get(1).addMarks(60, 81, 90, 82, 73, 90, 80, 95);
        
        ArrayList<Student> studentList5= new ArrayList<>();
        ArrayList<Student> studentList6= new ArrayList<>();
        for(int i=0; i<2;i++){
            studentList5.add(d3.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for (int i = 2; i < d3.getDeptStudentDirectory().getStudentDirectory().size(); i++) {

            studentList6.add(d3.getDeptStudentDirectory().getStudentDirectory().get(i));
        }


        co42.addSeats(1100, studentList3);
        co42.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co42.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 94, 80, 91);

        co52.addSeats(1100, studentList4);
        co52.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co52.getSeatList().get(1).addMarks(60, 81, 90, 82, 73, 90, 80, 95);

        co13.addSeats(1100, d3.getDeptStudentDirectory().getStudentDirectory());
        co13.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co13.getSeatList().get(1).addMarks(88, 82, 90, 89, 75, 99, 80, 95);
        co13.getSeatList().get(2).addMarks(90, 95, 90, 78, 70, 92, 85, 100);
        co13.getSeatList().get(3).addMarks(97, 95, 90, 87, 78, 82, 85, 100);

        co23.addSeats(1100, studentList5);
        co23.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co23.getSeatList().get(1).addMarks(60, 81, 90, 82, 75, 90, 80, 95);

        co33.addSeats(1100, studentList6);
        co33.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co33.getSeatList().get(1).addMarks(88, 82, 90, 89, 75, 99, 80, 95);

        co53.addSeats(1100, studentList5);
        co53.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co53.getSeatList().get(1).addMarks(60, 81, 90, 82, 75, 90, 80, 95);

        co43.addSeats(1100, studentList6);
        co43.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co43.getSeatList().get(1).addMarks(88, 82, 90, 89, 75, 99, 80, 95);

        EmployedStudents es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Nithin");
        es.setLastName("Kartha");
        es.setNuid(222);
        es.setEmail("ndk@gmail.com");
        es.setNationality("Indian");
        es.setEmployerName("Accenture");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("SE");
        es.setSalary(100000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Yenchu");
        es.setLastName("kovoski");
        es.setNuid(243);
        es.setEmail("yench@gmail.com");
        es.setNationality("Chinese");
        es.setEmployerName("Google");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("TL");
        es.setSalary(110000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Nick");
        es.setLastName("Fury");
        es.setNuid(205);
        es.setEmail("nickfur@gmail.com");
        es.setNationality("Spain");
        es.setEmployerName("MathWorks");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("Web dev");
        es.setSalary(90000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Kitchu");
        es.setLastName("Joseph");
        es.setNuid(201);
        es.setEmail("kit@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("Dell");
        es.setEmploymentDescription("SSE");
        es.setSalary(80000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Amy");
        es.setLastName("Jen");
        es.setNuid(210);
        es.setEmail("amyjen@gmail.com");
        es.setNationality("American");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("Dell");
        es.setEmploymentDescription("DB dev");
        es.setSalary(70000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Reshmi");
        es.setLastName("Joseph");
        es.setNuid(217);
        es.setEmail("resh@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("Apple");
        es.setEmploymentDescription("Tester");
        es.setSalary(90000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Jeethu");
        es.setLastName("Joseph");
        es.setNuid(201);
        es.setEmail("jee@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("Dell");
        es.setEmploymentDescription("TL");
        es.setSalary(90000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Antony");
        es.setLastName("paul");
        es.setNuid(210);
        es.setEmail("antp@gmail.com");
        es.setNationality("American");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("Dell");
        es.setEmploymentDescription("DB dev");
        es.setSalary(75400);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Arun");
        es.setLastName("Antony");
        es.setNuid(217);
        es.setEmail("Ara@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d3.getDepartmentName());
        es.setEmployerName("Apple");
        es.setEmploymentDescription("Manager");
        es.setSalary(90000);

        UnemployedStudents ue = coll1.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Jacob");
        ue.setLastName("John");
        ue.setNuid(300);
        ue.setEmail("jacjon@gmail.com");
        ue.setNationality("American");
        ue.setDepartmentName(d1.getDepartmentName());
        ue.setReasonForUnemp("Low Grades");

        ue = coll1.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Russel");
        ue.setLastName("Moore");
        ue.setNuid(330);
        ue.setEmail("j@gmail.com");
        ue.setDepartmentName(d2.getDepartmentName());
        ue.setNationality("Georgia");
        ue.setReasonForUnemp("H2b visa");

        ue = coll1.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Monu");
        ue.setLastName("Menon");
        ue.setNuid(330);
        ue.setEmail("mm@gmail.com");
        ue.setDepartmentName(d3.getDepartmentName());
        ue.setNationality("Texas");
        ue.setReasonForUnemp("H2b visa");

        HigherStudiesStudents hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Raghu");
        hs.setLastName("Ram");
        hs.setNuid(321);
        hs.setEmail("rgv@gmail.com");
        hs.setDepartmentName(d2.getDepartmentName());
        hs.setNationality("Mexican");
        hs.setMajorName("MIS");
        hs.setUniversityName("NEU");

        hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Batman");
        hs.setLastName("Robin");
        hs.setNuid(777);
        hs.setEmail("bat@gmail.com");
        hs.setNationality("chinki");
        hs.setDepartmentName(d1.getDepartmentName());
        hs.setMajorName("CSE");
        hs.setUniversityName("MIT");

        hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Anu");
        hs.setLastName("Priya");
        hs.setNuid(321);
        hs.setEmail("anu@gmail.com");
        hs.setNationality("Indian");
        hs.setDepartmentName(d3.getDepartmentName());
        hs.setMajorName("CSE");
        hs.setUniversityName("UIC");

        
        addData();
    


        College coll2 = uni1.addCollege();
        coll2.setCollegeName("College of Law");
        Department d4 = coll2.addDepartment();
        d4.setDepartmentName("Criminal Law");
        Department d5 = coll2.addDepartment();
        d5.setDepartmentName("Civil Law");

        Role r21 = d4.getJobPosition().addRole();
        r21.setRoleDescription("teaching staff");
        r21.setRoleName("proffesor");
        r21.setSalary(1000);
        r21.addPerson("Kal", "Bugrara", "60 shillman law", "kb@gmail.com", 850230879, 2200, r21);
        d4.getFacultyDirectory().addFaculty(r21.getPerson());

        Role r22 = d4.getJobPosition().addRole();
        r22.setRoleDescription("teaching staff");
        r22.setRoleName("Asst. proffesor");
        r22.setSalary(1000);
        r22.addPerson("vishal", "chawla", "60 shillman law", "vc@gmail.com", 989539928, 2400, r22);
        d4.getFacultyDirectory().addFaculty(r22.getPerson());

        Role r23 = d4.getJobPosition().addRole();
        r23.setRoleDescription("teaching staff");
        r23.setRoleName("Assist. proffesor");
        r23.setSalary(1000);
        r23.addPerson("richard", "sherman", "60 shillman law", "rs@gmail.com", 987652896, 2500, r23);
        d4.getFacultyDirectory().addFaculty(r23.getPerson());

        Role r24 = d4.getJobPosition().addRole();
        r24.setRoleDescription("non teaching staff");
        r24.setRoleName("pune");
        r24.setSalary(500);
        r24.addPerson("todd", "logan", "60 shillman law", "tl@gmail.com", 98134296, 500, r24);
        d4.getStaffDirectory().addStaff(r24.getPerson());

        Role r25 = d4.getJobPosition().addRole();
        r25.setRoleDescription("non teaching staff");
        r25.setRoleName("office Assist");
        r25.setSalary(500);
        r25.addPerson("Amanda", "ziets", "60 shillman law", "az@gmail.com", 912314553, 500, r25);
        d4.getStaffDirectory().addStaff(r25.getPerson());

        Role r26 = d5.getJobPosition().addRole();
        r26.setRoleDescription("teaching staff");
        r26.setRoleName("proffesor");
        r26.setSalary(1000);
        r26.addPerson("alex", "ferguson", "old trafford", "saf@gmail.com", 980021321, 100000, r26);
        d5.getFacultyDirectory().addFaculty(r26.getPerson());

        Role r27 = d5.getJobPosition().addRole();
        r27.setRoleDescription("teaching staff");
        r27.setRoleName("proffesor");
        r27.setSalary(1000);
        r27.addPerson("Charles", "Xavier", "360 snell engineering", "xman@gmail.com", 9898765, 2250, r27);
        d5.getFacultyDirectory().addFaculty(r27.getPerson());

        Role r28 = d5.getJobPosition().addRole();
        r28.setRoleDescription("non teaching staff");
        r28.setRoleName("clerk");
        r28.setSalary(500);
        r28.addPerson("jim", "klod", "360 snell engineering", "jk@gmail.com", 98134296, 500, r28);
        d5.getStaffDirectory().addStaff(r28.getPerson());

        Role r29 = d5.getJobPosition().addRole();
        r29.setRoleDescription("non teaching staff");
        r29.setRoleName("Assist. crek");
        r29.setSalary(500);
        r29.addPerson("Alex", "Grestel", "360 snell engineering", "ag@gmail.com", 98634496, 500, r29);
        d5.getStaffDirectory().addStaff(r29.getPerson());

        Role r30 = d5.getJobPosition().addRole();
        r30.setRoleDescription("teaching staff");
        r30.setRoleName("proffesor");
        r30.setSalary(1000);
        r30.addPerson("Yusuf", "Ozbek", "360 snell engineering", "yo@gmail.com", 999539977, 2300, r30);
        d5.getFacultyDirectory().addFaculty(r30.getPerson());

        Role r31 = d5.getJobPosition().addRole();
        r31.setRoleDescription("teaching staff");
        r31.setRoleName("proffesor");
        r31.setSalary(1000);
        r31.addPerson("patrick", "shan", "360 snell engineering", "pa@gmail.com", 850230879, 2200, r31);
        d5.getFacultyDirectory().addFaculty(r31.getPerson());

        Course c21 = d4.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c21.setCourseCredit(4);
        c21.setCourseCrn("CR5100");
        c21.setCourseDesc("Fedral Law");
        c21.setCourseName("Fedral criminal law");
        c21.setCourseType("lecture");

        Course c22 = d4.getCourseCatalog().addCourse();
        c22.setCourseCredit(4);
        c22.setCourseCrn("CR2345");
        c22.setCourseDesc("State Law");
        c22.setCourseName("State criminal law");
        c22.setCourseType("lecture");

        Course c23 = d4.getCourseCatalog().addCourse();
        c23.setCourseCredit(4);
        c23.setCourseCrn("CR6543");
        c23.setCourseDesc("human rights");
        c23.setCourseName("Child Exploitation and Human Trafficking");
        c23.setCourseType("lecture");

        Course c24 = d4.getCourseCatalog().addCourse();
        c24.setCourseCredit(2);
        c24.setCourseCrn("CR4532");
        c24.setCourseDesc("Current Issues");
        c24.setCourseName("Current Issues in Criminal and National Security Law");
        c24.setCourseType("lecture");

        Course c25 = d4.getCourseCatalog().addCourse();
        c25.setCourseCredit(3);
        c25.setCourseCrn("CR6790");
        c25.setCourseDesc("Crime and investigation");
        c25.setCourseName("Hate Crime ");
        c25.setCourseType("lecture");

        Course c26 = d5.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c26.setCourseCredit(4);
        c26.setCourseCrn("civ6100");
        c26.setCourseDesc("Fedral Law");
        c26.setCourseName("Fedral Civil Law");
        c26.setCourseType("lecture");

        Course c27 = d5.getCourseCatalog().addCourse();
        c27.setCourseCredit(4);
        c27.setCourseCrn("civ6200");
        c27.setCourseDesc("State Law");
        c27.setCourseName("State criminal law");
        c27.setCourseType("lecture");

        Course c28 = d5.getCourseCatalog().addCourse();
        c28.setCourseCredit(4);
        c28.setCourseCrn("civ7100");
        c28.setCourseDesc("Labor law");
        c28.setCourseName("Labor law");
        c28.setCourseType("lecture");

        Course c29 = d5.getCourseCatalog().addCourse();
        c29.setCourseCredit(2);
        c29.setCourseCrn("civ7600");
        c29.setCourseDesc("Malpractice");
        c29.setCourseName("Malpractice");
        c29.setCourseType("lecture");

        Course c30 = d5.getCourseCatalog().addCourse();
        c30.setCourseCredit(1);
        c30.setCourseCrn("civ8150");
        c30.setCourseDesc("Real estate");
        c30.setCourseName("Real estate law");
        c30.setCourseType("Lecture");

        Degree degree41 = d4.addDegreeToDepartment();
        degree41.setDegreeLength(4);
        degree41.setDegreeType("LLB");
        degree41.setMajor("LLB in Criminal Law");
        degree41.addRequiredCourse(c21);
        degree41.addElectiveCourse(c22);
        degree41.addElectiveCourse(c23);
        degree41.addElectiveCourse(c24);
        degree41.addElectiveCourse(c25);

        Degree degree42 = d4.addDegreeToDepartment();
        degree42.setDegreeLength(3);
        degree42.setDegreeType("LLM");
        degree42.setMajor("LLM in Criminal Law");
        degree42.addRequiredCourse(c25);
        degree42.addElectiveCourse(c21);
        degree42.addElectiveCourse(c23);
        degree42.addElectiveCourse(c22);
        degree42.addElectiveCourse(c24);

        Degree degree43 = d4.addDegreeToDepartment();
        degree43.setDegreeLength(1);
        degree43.setDegreeType("certification");
        degree43.setMajor("Certification in Criminal Law");
        degree43.addRequiredCourse(c22);
        degree43.addRequiredCourse(c24);
        degree43.addRequiredCourse(c25);

        Degree degree44 = d5.addDegreeToDepartment();
        degree44.setDegreeLength(4);
        degree44.setDegreeType("LLB");
        degree44.setMajor("LLB in Civil Law");
        degree44.addRequiredCourse(c29);
        degree44.addElectiveCourse(c27);
        degree44.addElectiveCourse(c28);
        degree44.addElectiveCourse(c30);
        degree44.addElectiveCourse(c26);

        Degree degree45 = d5.addDegreeToDepartment();
        degree45.setDegreeLength(3);
        degree45.setDegreeType("LLM");
        degree45.setMajor("LLM in Civil Law");
        degree45.addRequiredCourse(c30);
        degree45.addElectiveCourse(c29);
        degree45.addElectiveCourse(c28);
        degree45.addElectiveCourse(c27);
        degree45.addElectiveCourse(c26);

        Degree degree46 = d5.addDegreeToDepartment();
        degree46.setDegreeLength(1);
        degree46.setDegreeType("certification");
        degree46.setMajor("Certification in Civil Law");
        degree46.addRequiredCourse(c27);
        degree46.addElectiveCourse(c28);
        degree46.addElectiveCourse(c29);

        Semester s1d4 = d4.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1d4.setSemType("fall");
        s1d4.setSemNumber(1);
        s1d4.setSemYear(2016);
        CourseOffering co41 = s1d4.addCourseToSemester(c21, s1d4);
        co41.setDay("monday");
        co41.setLectureEndTime("11:00");
        co41.setLectureStartTime("08:00");
        co41.assignClassRoom("blackman hall", 543, d4.getFacultyDirectory());

        CourseOffering co042 = s1d4.addCourseToSemester(c24, s1d4);
        co042.setDay("tuesday");
        co042.setLectureEndTime("11:00");
        co042.setLectureStartTime("08:00");
        co042.assignClassRoom("presidents hall", 765, d4.getFacultyDirectory());

        Semester s2d4 = d4.getCourseSchedule().addSemesterToSchedule();
        s2d4.setSemNumber(2);
        s2d4.setSemType("spring");
        s2d4.setSemYear(2017);
        CourseOffering co052 = s2d4.addCourseToSemester(c22, s2d4);
        co052.setDay("wednesday");
        co052.setLectureEndTime("11:00");
        co052.setLectureStartTime("08:00");
        co052.assignClassRoom("snell", 200, d4.getFacultyDirectory());

        Semester s3d4 = d4.getCourseSchedule().addSemesterToSchedule();
        s3d4.setSemNumber(3);
        s3d4.setSemType("fall");
        s3d4.setSemYear(2017);
        CourseOffering co03 = s3d4.addCourseToSemester(c23, s3d4);
        co03.setDay("friday");
        co03.setLectureEndTime("11:00");
        co03.setLectureStartTime("08:00");
        co03.assignClassRoom("shillman hall", 302, d4.getFacultyDirectory());

        CourseOffering co06 = s3d4.addCourseToSemester(c25, s3d4);
        co06.setDay("sunday");
        co06.setLectureEndTime("11:00");
        co06.setLectureStartTime("08:00");
        co06.assignClassRoom("Eng hall", 126, d4.getFacultyDirectory());

        Semester s1d5 = d5.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s1d5.setSemType("fall");
        s1d5.setSemNumber(1);
        s1d5.setSemYear(2016);
        CourseOffering co62 = s1d5.addCourseToSemester(c26, s1d5);
        co62.setDay("monday");
        co62.setLectureEndTime("11:00");
        co62.setLectureStartTime("08:00");
        co62.assignClassRoom("blackman hall", 543, d5.getFacultyDirectory());

        CourseOffering co63 = s1d5.addCourseToSemester(c27, s1d5);
        co63.setDay("tuesday");
        co63.setLectureEndTime("11:00");
        co63.setLectureStartTime("08:00");
        co63.assignClassRoom("presidents hall", 765, d5.getFacultyDirectory());

        Semester s2d5 = d5.getCourseSchedule().addSemesterToSchedule();//it.cSchedule.addSemesterToSchedule();
        s2d5.setSemNumber(2);
        s2d5.setSemType("spring");
        s2d5.setSemYear(2017);
        CourseOffering co64 = s2d5.addCourseToSemester(c28, s2d5);
        co64.setDay("wednesday");
        co64.setLectureEndTime("11:00");
        co64.setLectureStartTime("08:00");
        co64.assignClassRoom("snell", 200, d5.getFacultyDirectory());

        CourseOffering co65 = s2d5.addCourseToSemester(c29, s2d5);
        co65.setDay("wednesday");
        co65.setLectureEndTime("11:00");
        co65.setLectureStartTime("08:00");
        co65.assignClassRoom("independance hall", 121, d5.getFacultyDirectory());

        Semester s3d5 = d5.getCourseSchedule().addSemesterToSchedule();
        s3d5.setSemNumber(3);
        s3d5.setSemType("fall");
        s3d5.setSemYear(2017);
        CourseOffering co66 = s3d5.addCourseToSemester(c30, s3d5);
        co66.setDay("friday");
        co66.setLectureEndTime("11:00");
        co66.setLectureStartTime("08:00");
        co66.assignClassRoom("shillman hall", 302, d5.getFacultyDirectory());

        StudentDirectory studentDirectory4 = new StudentDirectory();
        Student student4 = studentDirectory4.addStudent();
        student4.setFirstName("Aaron");
        student4.setLastName("Vadivel");
        student4.setEmail("saravan.deepak@gmail.com");
        student4.setNuid(123);
        student4.setNationality("India");
        student4.setDepartmentName(d4.getDepartmentName());

        student4 = studentDirectory4.addStudent();
        student4.setFirstName("Rohit");
        student4.setLastName("Dinesh");
        student4.setEmail("vaishak.dinesh@gmail.com");
        student4.setNuid(345);
        student4.setNationality("India");
        student4.setDepartmentName(d4.getDepartmentName());

        student4 = studentDirectory4.addStudent();
        student4.setFirstName("Swathi");
        student4.setLastName("Kartha");
        student4.setEmail("nithin.katha@gmail.com");
        student4.setNuid(987);
        student4.setNationality("India");
        student4.setDepartmentName(d4.getDepartmentName());

        student4 = studentDirectory4.addStudent();
        student4.setFirstName("sami");
        student4.setLastName("kar");
        student4.setEmail("ashwin.katha@gmail.com");
        student4.setNuid(642);
        student4.setNationality("India");
        student4.setDepartmentName(d4.getDepartmentName());

        d4.setDeptStudentDirectory(studentDirectory4);

        StudentDirectory studentDirectory5 = new StudentDirectory();
        Student student5 = studentDirectory5.addStudent();
        student5.setFirstName("Wayne");
        student5.setLastName("ronaldo");
        student5.setEmail("WR10@gmail.com");
        student5.setNuid(777);
        student5.setNationality("England");
        student5.setDepartmentName(d5.getDepartmentName());

        student5 = studentDirectory5.addStudent();
        student5.setFirstName("Michael");
        student5.setLastName("beven");
        student5.setEmail("CR16@gmail.com");
        student5.setNuid(987);
        student5.setNationality("England");

        student5.setDepartmentName(d5.getDepartmentName());

        student5 = studentDirectory5.addStudent();
        student5.setFirstName("David");
        student5.setLastName("hussy");
        student5.setEmail("DB7a@gmail.com");
        student5.setNuid(524);
        student5.setNationality("England");

        student5.setDepartmentName(d5.getDepartmentName());

        student5 = studentDirectory5.addStudent();
        student5.setFirstName("Ron");
        student5.setLastName("Ronaldo");
        student5.setEmail("cr7@gmail.com");
        student5.setNuid(728);
        student5.setNationality("Portugal");

        student5.setDepartmentName(d5.getDepartmentName());

        d5.setDeptStudentDirectory(studentDirectory5);

        ArrayList<Student> studentList7 = new ArrayList<>();
        ArrayList<Student> studentList8 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            studentList7.add(d4.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for (int i = 2; i < d4.getDeptStudentDirectory().getStudentDirectory().size(); i++) {
            studentList8.add(d4.getDeptStudentDirectory().getStudentDirectory().get(i));
        }

        co41.addSeats(1500, d4.getDeptStudentDirectory().getStudentDirectory());
        co41.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co41.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 90, 80, 95);
        co41.getSeatList().get(2).addMarks(90, 95, 90, 80, 70, 90, 85, 100);
        co41.getSeatList().get(3).addMarks(99, 93, 90, 80, 75, 90, 85, 100);

        co052.addSeats(1100, studentList7);
        co052.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co052.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 90, 80, 95);

        co03.addSeats(1100, studentList8);
        co03.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co03.getSeatList().get(1).addMarks(80, 80, 92, 80, 75, 90, 80, 95);

        co042.addSeats(1100, studentList7);
        co042.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co042.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 90, 80, 91);

        co06.addSeats(1100, studentList8);
        co06.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co06.getSeatList().get(1).addMarks(88, 82, 90, 89, 75, 99, 80, 95);

        ArrayList<Student> studentList9 = new ArrayList<>();
        ArrayList<Student> studentList10 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            studentList9.add(d5.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        for (int i = 2; i < d5.getDeptStudentDirectory().getStudentDirectory().size(); i++) {
            studentList10.add(d5.getDeptStudentDirectory().getStudentDirectory().get(i));
        }


        co62.addSeats(1500, d5.getDeptStudentDirectory().getStudentDirectory());
        co62.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co62.getSeatList().get(1).addMarks(80, 86, 90, 80, 75, 90, 80, 95);
        co62.getSeatList().get(2).addMarks(90, 95, 90, 80, 73, 90, 85, 100);
        co62.getSeatList().get(3).addMarks(94, 95, 88, 80, 73, 69, 85, 99);

        co64.addSeats(1100, studentList9);
        co64.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co64.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 91, 80, 95);

        co66.addSeats(1100, studentList10);
        co66.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co66.getSeatList().get(1).addMarks(80, 80, 94, 80, 75, 90, 80, 95);

        co63.addSeats(1100, studentList9);
        co63.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co63.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 94, 80, 91);

        co65.addSeats(1100, studentList10);
        co65.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co65.getSeatList().get(1).addMarks(60, 81, 90, 82, 73, 90, 80, 95);

        EmployedStudents es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Nithin");
        es1.setLastName("Kartha");
        es1.setNuid(222);
        es1.setEmail("ndk@gmail.com");
        es1.setNationality("Indian");
        es1.setEmployerName("Accenture");
        es1.setDepartmentName(d4.getDepartmentName());
        es1.setEmploymentDescription("SE");
        es1.setSalary(100000);

        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Yenchu");
        es1.setLastName("kovoski");
        es1.setNuid(243);
        es1.setEmail("yench@gmail.com");
        es1.setNationality("Chinese");
        es1.setEmployerName("Google");
        es1.setDepartmentName(d4.getDepartmentName());
        es1.setEmploymentDescription("TL");
        es1.setSalary(110000);

        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Nick");
        es1.setLastName("Fury");
        es1.setNuid(205);
        es1.setEmail("nickfur@gmail.com");
        es1.setNationality("Spain");
        es1.setEmployerName("MathWorks");
        es1.setDepartmentName(d4.getDepartmentName());
        es1.setEmploymentDescription("Web dev");
        es1.setSalary(90000);

        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Kitchu");
        es1.setLastName("Joseph");
        es1.setNuid(201);
        es1.setEmail("kit@gmail.com");
        es1.setNationality("Indian");
        es1.setDepartmentName(d5.getDepartmentName());
        es1.setEmployerName("Dell");
        es1.setEmploymentDescription("SSE");
        es1.setSalary(80000);

        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Amy");
        es1.setLastName("Jen");
        es1.setNuid(210);
        es1.setEmail("amyjen@gmail.com");
        es1.setNationality("American");
        es1.setDepartmentName(d5.getDepartmentName());
        es1.setEmployerName("Dell");
        es1.setEmploymentDescription("DB dev");
        es1.setSalary(70000);

        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Reshmi");
        es1.setLastName("Joseph");
        es1.setNuid(217);
        es1.setEmail("resh@gmail.com");
        es1.setNationality("Indian");
        es1.setDepartmentName(d5.getDepartmentName());
        es1.setEmployerName("Apple");
        es1.setEmploymentDescription("Tester");
        es1.setSalary(90000);

        UnemployedStudents ue1 = coll2.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue1.setFirstName("Jacob");
        ue1.setLastName("John");
        ue1.setNuid(300);
        ue1.setEmail("jacjon@gmail.com");
        ue1.setNationality("American");
        ue1.setDepartmentName(d4.getDepartmentName());
        ue1.setReasonForUnemp("Low Grades");

        ue1 = coll2.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue1.setFirstName("Russel");
        ue1.setLastName("Moore");
        ue1.setNuid(330);
        ue1.setEmail("j@gmail.com");
        ue1.setDepartmentName(d5.getDepartmentName());
        ue1.setNationality("Georgia");
        ue1.setReasonForUnemp("H2b visa");

        HigherStudiesStudents hs1 = coll2.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs1.setFirstName("Raghu");
        hs1.setLastName("Ram");
        hs1.setNuid(321);
        hs1.setEmail("rgv@gmail.com");
        hs1.setDepartmentName(d5.getDepartmentName());
        hs1.setNationality("Mexican");
        hs1.setMajorName("MIS");
        hs1.setUniversityName("NEU");

        hs1 = coll2.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs1.setFirstName("Batman");
        hs1.setLastName("Robin");
        hs1.setNuid(777);
        hs1.setEmail("bat@gmail.com");
        hs1.setNationality("chinki");
        hs1.setDepartmentName(d4.getDepartmentName());
        hs1.setMajorName("CSE");
        hs1.setUniversityName("MIT");

    }
    
    public void initializeData1(){
        
        University uni;
        uni = eco.addUniversity();
        uni.setUniversityName("Boston University");
        
        College coll1 = uni.addCollege();
        coll1.setCollegeName("BU College of Engineering");
        Department d1 = coll1.addDepartment();
        d1.setDepartmentName("CSE");
        Department d2 = coll1.addDepartment();
        d2.setDepartmentName("EEE");
        Department d3 = coll1.addDepartment();
        d3.setDepartmentName("Information System");
        College coll2 = uni.addCollege();
        coll2.setCollegeName("BU College of Business");
        Department d4 = coll2.addDepartment();
        d4.setDepartmentName("Media Science");
        Department d5 = coll2.addDepartment();
        d5.setDepartmentName("Business Admin");
        
        
        
        
        Role r1 = d1.getJobPosition().addRole();
        r1.setRoleDescription("Teaching staff");
        r1.setRoleName("Professor");
        r1.setSalary(1500);
        r1.addPerson("Cami", "Hippler", "Hillman hall", "cami@gmail.com", 850230879, 2200, r1);
        d1.getFacultyDirectory().addFaculty(r1.getPerson());
        
        
        Role r2 = d1.getJobPosition().addRole();
        r2.setRoleDescription("Teaching staff");
        r2.setRoleName("Asst. Professor");
        r2.setSalary(1000);
        r2.addPerson("Donna", "Hermes", "16 hunt ave", "donna@gmail.com",999539977, 2300, r2);
        d1.getFacultyDirectory().addFaculty(r2.getPerson());
        
        Role r3 = d1.getJobPosition().addRole();
        r3.setRoleDescription("teaching staff");
        r3.setRoleName("Asst. proffesor");
        r3.setSalary(1000);
        r3.addPerson("Kay" ,"Korth", "360 antt engineering", "vc@gmail.com", 989539928, 2400, r3);
        d1.getFacultyDirectory().addFaculty(r3.getPerson());
        
        Role r4 = d2.getJobPosition().addRole();
        r4.setRoleDescription("Teaching staff");
        r4.setRoleName("Assist. proffesor");
        r4.setSalary(1000);
        r4.addPerson("Richard", "George", "360 antt engineering", "rs@gmail.com", 987652896, 2500, r4);
        d2.getFacultyDirectory().addFaculty(r4.getPerson());
        
        Role r5 = d2.getJobPosition().addRole();
        r5.setRoleDescription("Teaching staff");
        r5.setRoleName("Professor");
        r5.setSalary(1000);
        r5.addPerson("Nick", "Fury", "old trafford", "nf@gmail.com", 980021321, 100000, r5);
        d2.getFacultyDirectory().addFaculty(r5.getPerson());
        
        Role r6 = d2.getJobPosition().addRole();
        r6.setRoleDescription("teaching staff");
        r6.setRoleName("Professor");
        r6.setSalary(1500);
        r6.addPerson("Charles", "Xavier", "360 snell engineering", "xman@gmail.com", 9898765, 2250, r6);
        d2.getFacultyDirectory().addFaculty(r6.getPerson());
        
        Role r7 = d3.getJobPosition().addRole();
        r7.setRoleDescription("Teaching staff");
        r7.setRoleName("Professor");
        r7.setSalary(1500);
        r7.addPerson("alex", "ferguson", "old trafford", "saf@gmail.com", 980021321, 100000, r7);
        d3.getFacultyDirectory().addFaculty(r7.getPerson());
        
        Role r8 = d3.getJobPosition().addRole();
        r8.setRoleDescription("Teaching staff");
        r8.setRoleName("Professor");
        r8.setSalary(1500);
        r8.addPerson("Alex", "Jay", "Crem hall", "alex@gmail.com", 980021321, 100000, r8);
        d3.getFacultyDirectory().addFaculty(r8.getPerson());
        
        Role r9 = d3.getJobPosition().addRole();
        r9.setRoleDescription("Teaching staff");
        r9.setRoleName("Professor");
        r9.setSalary(1500);
        r9.addPerson("Mary", "Kom", "111 shill hall", "mary@gmail.com", 980021321, 100000, r9);
        d3.getFacultyDirectory().addFaculty(r9.getPerson());
        
        Role r10 = d4.getJobPosition().addRole();
        r10.setRoleDescription("Teaching staff");
        r10.setRoleName("Asst. Professor");
        r10.setSalary(1000);
        r10.addPerson("Richa", "Joshi", "Cayamn hall", "richa@gmail.com", 980021321, 100000, r10);
        d4.getFacultyDirectory().addFaculty(r10.getPerson());
        
        Role r11 = d4.getJobPosition().addRole();
        r11.setRoleDescription("Teaching staff");
        r11.setRoleName("Professor");
        r11.setSalary(1500);
        r11.addPerson("Cami", "Hippler", "Hillman hall", "cami@gmail.com", 850230879, 2200, r11);
        d4.getFacultyDirectory().addFaculty(r11.getPerson());
        
        
        Role r12 = d4.getJobPosition().addRole();
        r12.setRoleDescription("Teaching staff");
        r12.setRoleName("Asst. Professor");
        r12.setSalary(1000);
        r12.addPerson("Donna", "Hermes", "16 hunt ave", "donna@gmail.com",999539977, 2300, r12);
        d4.getFacultyDirectory().addFaculty(r12.getPerson());
        
        Role r13 = d5.getJobPosition().addRole();
        r13.setRoleDescription("teaching staff");
        r13.setRoleName("Asst. proffesor");
        r13.setSalary(1000);
        r13.addPerson("Kay" ,"Korth", "360 antt engineering", "vc@gmail.com", 989539928, 2400, r13);
        d5.getFacultyDirectory().addFaculty(r13.getPerson());
        
        Role r14 = d5.getJobPosition().addRole();
        r14.setRoleDescription("Teaching staff");
        r14.setRoleName("Assist. proffesor");
        r14.setSalary(1000);
        r14.addPerson("Richard", "George", "360 antt engineering", "rs@gmail.com", 987652896, 2500, r14);
        d5.getFacultyDirectory().addFaculty(r14.getPerson());
        
        Role r15 = d5.getJobPosition().addRole();
        r15.setRoleDescription("Teaching staff");
        r15.setRoleName("Professor");
        r15.setSalary(1000);
        r15.addPerson("Nick", "Fury", "old trafford", "nf@gmail.com", 980021321, 100000, r15);
        d5.getFacultyDirectory().addFaculty(r15.getPerson());
        
        Role r16 = d1.getJobPosition().addRole();
        r16.setRoleDescription("Office Desk");
        r16.setRoleName("Clerk");
        r16.setSalary(500);
        r16.addPerson("Rick", "Rimper", "Hillman hall", "cami@gmail.com", 850230879, 2200, r16);
        d1.getStaffDirectory().addStaff(r16.getPerson());
        
        
        Role r17 = d2.getJobPosition().addRole();
        r17.setRoleDescription("Cafeteria");
        r17.setRoleName("Cafeteria Manager");
        r17.setSalary(400);
        r17.addPerson("Donna", "Hermes", "16 hunt ave", "donna@gmail.com",999539977, 2300, r17);
        d2.getStaffDirectory().addStaff(r17.getPerson());
        
        Role r18 = d3.getJobPosition().addRole();
        r18.setRoleDescription("Office");
        r18.setRoleName("Office Assistant");
        r18.setSalary(700);
        r18.addPerson("Kai" ,"Roxburg", "360 antt engineering", "vc@gmail.com", 989539928, 2400, r18);
        d3.getStaffDirectory().addStaff(r18.getPerson());
        
        Role r19 = d4.getJobPosition().addRole();
        r19.setRoleDescription("Director of Accounts");
        r19.setRoleName("Accounts Director");
        r19.setSalary(2000);
        r19.addPerson("Morgan", "Freeman", "360 antt engineering", "rs@gmail.com", 987652896, 2500, r19);
        d4.getStaffDirectory().addStaff(r19.getPerson());
        
        Role r20 = d5.getJobPosition().addRole();
        r20.setRoleDescription("Technical Assistant");
        r20.setRoleName("Technical Assistant");
        r20.setSalary(500);
        r20.addPerson("Nick", "Fury", "old trafford", "nf@gmail.com", 980021321, 100000, r20);
        d5.getStaffDirectory().addStaff(r20.getPerson());
        
        Role r21 = d1.getJobPosition().addRole();
        r21.setRoleDescription("Office Desk");
        r21.setRoleName("Clerk");
        r21.setSalary(500);
        r21.addPerson("Tina", "Joy", "Hillman hall", "cami@gmail.com", 850230879, 2200, r21);
        d1.getStaffDirectory().addStaff(r21.getPerson());
        
        
        Role r22 = d2.getJobPosition().addRole();
        r22.setRoleDescription("Technical Assistant");
        r22.setRoleName("Technical Assistant");
        r22.setSalary(400);
        r22.addPerson("Aladin", "Tames", "16 hunt ave", "donna@gmail.com",999539977, 2300, r22);
        d2.getStaffDirectory().addStaff(r22.getPerson());
        
        Role r23 = d3.getJobPosition().addRole();
        r23.setRoleDescription("Office");
        r23.setRoleName("Office Assistant");
        r23.setSalary(700);
        r23.addPerson("Cary" ,"May", "360 antt engineering", "vc@gmail.com", 989539928, 2400, r23);
        d3.getStaffDirectory().addStaff(r23.getPerson());
        
        Role r24 = d4.getJobPosition().addRole();
        r24.setRoleDescription("Director of Accounts");
        r24.setRoleName("Accounts Director");
        r24.setSalary(2000);
        r24.addPerson("Morgan", "Nicker", "360 antt engineering", "rs@gmail.com", 987652896, 2500, r24);
        d4.getStaffDirectory().addStaff(r24.getPerson());
        
        Role r25 = d5.getJobPosition().addRole();
        r25.setRoleDescription("Technical Assistant");
        r25.setRoleName("Technical Assistant");
        r25.setSalary(500);
        r25.addPerson("Das", "Gupta", "old trafford", "nf@gmail.com", 980021321, 100000, r25);
        d5.getStaffDirectory().addStaff(r25.getPerson());
        
        Course c1 = d1.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c1.setCourseCredit(4);
        c1.setCourseCrn("AD5100");
        c1.setCourseDesc("App Development");
        c1.setCourseName("App Dev");
        c1.setCourseType("lecture");
        
        Course c2 = d1.getCourseCatalog().addCourse();
        c2.setCourseCredit(4);
        c2.setCourseCrn("CSE2345");
        c2.setCourseDesc("DataBase");
        c2.setCourseName("DB");
        c2.setCourseType("lecture");
        
        Course c3 = d1.getCourseCatalog().addCourse();
        c3.setCourseCredit(4);
        c3.setCourseCrn("DA6543");
        c3.setCourseDesc("Electronics");
        c3.setCourseName("Web");
        c3.setCourseType("lecture");
        
        Course c4 = d1.getCourseCatalog().addCourse();
        c4.setCourseCredit(3);
        c4.setCourseCrn("info8150");
        c4.setCourseDesc("big data");
        c4.setCourseName("big data");
        c4.setCourseType("Lecture");
        
        Course c5 = d2.getCourseCatalog().addCourse();
        c5.setCourseCredit(4);
        c5.setCourseCrn("EE5150");
        c5.setCourseDesc("cicuit design Lab");
        c5.setCourseName("EE Circuits");
        c5.setCourseType("Lab");
        
        Course c6 = d2.getCourseCatalog().addCourse();
        c6.setCourseCredit(2);
        c6.setCourseCrn("BD4532");
        c6.setCourseDesc("Electrical machine design");
        c6.setCourseName("Machine design");
        c6.setCourseType("lecture");
        
        Course c7 = d2.getCourseCatalog().addCourse();
        c7.setCourseCredit(1);
        c7.setCourseCrn("EE5150");
        c7.setCourseDesc("cicuit design Lab");
        c7.setCourseName("EE Lab");
        c7.setCourseType("Lab");
        
        Course c8 = d2.getCourseCatalog().addCourse();
        c8.setCourseCredit(3);
        c8.setCourseCrn("EE6790");
        c8.setCourseDesc("Electrical Transmission lines");
        c8.setCourseName("Transmission systems");
        c8.setCourseType("lecture");
        
        Course c9 = d3.getCourseCatalog().addCourse();
        c9.setCourseCredit(4);
        c9.setCourseCrn("info7100");
        c9.setCourseDesc("databases and no sql");
        c9.setCourseName("NOSQL");
        c9.setCourseType("lecture");
        
        Course c10 = d3.getCourseCatalog().addCourse();
        c10.setCourseCredit(2);
        c10.setCourseCrn("info7600");
        c10.setCourseDesc("data analysis and BI");
        c10.setCourseName("BI and DWH");
        c10.setCourseType("lecture");
        
        Course c11 = d3.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c11.setCourseCredit(4);
        c11.setCourseCrn("info6100");
        c11.setCourseDesc("app designing sol");
        c11.setCourseName("OO design");
        c11.setCourseType("lecture");
        
        Course c12 = d3.getCourseCatalog().addCourse();
        c12.setCourseCredit(3);
        c12.setCourseCrn("info6790");
        c12.setCourseDesc("cloud computing");
        c12.setCourseName("Cloud");
        c12.setCourseType("lecture");
        
        Course c13 = d4.getCourseCatalog().addCourse();
        c13.setCourseCredit(3);
        c13.setCourseCrn("Comm1917");
        c13.setCourseDesc("Media Comm");
        c13.setCourseName("Media Communications");
        c13.setCourseType("lecture");
        
        Course c14 = d4.getCourseCatalog().addCourse();
        c14.setCourseCredit(4);
        c14.setCourseCrn("med7100");
        c14.setCourseDesc("Multimedia");
        c14.setCourseName("MultiMedia");
        c14.setCourseType("lecture");
        
        Course c15 = d4.getCourseCatalog().addCourse();
        c15.setCourseCredit(2);
        c15.setCourseCrn("info7600");
        c15.setCourseDesc("data analysis and BI");
        c15.setCourseName("BI and DWH");
        c15.setCourseType("lecture");
        
        Course c16 = d4.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c16.setCourseCredit(4);
        c16.setCourseCrn("aas6100");
        c16.setCourseDesc("Music");
        c16.setCourseName("Music");
        c16.setCourseType("lecture");
        
        Course c17 = d5.getCourseCatalog().addCourse();
        c17.setCourseCredit(3);
        c17.setCourseCrn("BBA6790");
        c17.setCourseDesc("Accounts");
        c17.setCourseName("Accounts");
        c17.setCourseType("lecture");
        
        Course c18 = d5.getCourseCatalog().addCourse();
        c18.setCourseCredit(2);
        c18.setCourseCrn("ma7600");
        c18.setCourseDesc("Marketing");
        c18.setCourseName("Marketing");
        c18.setCourseType("lecture");
        
        Course c19 = d5.getCourseCatalog().addCourse();//it.cLog.addCourse();
        c19.setCourseCredit(4);
        c19.setCourseCrn("MB6100");
        c19.setCourseDesc("Finance");
        c19.setCourseName("Finance");
        c19.setCourseType("lecture");
        
        Course c20 = d5.getCourseCatalog().addCourse();
        c20.setCourseCredit(3);
        c20.setCourseCrn("op6790");
        c20.setCourseDesc("Operations");
        c20.setCourseName("Operations");
        c20.setCourseType("lecture");
        
        
        
        Degree degree1 = d1.addDegreeToDepartment();
        degree1.setDegreeLength(4);
        degree1.setDegreeType("B.E ");
        degree1.setMajor("CSE");
        degree1.addRequiredCourse(c1);
        degree1.addElectiveCourse(c2);
        degree1.addElectiveCourse(c3);
        degree1.addElectiveCourse(c4);
        
        
        
        Degree degree2 = d1.addDegreeToDepartment();
        degree2.setDegreeLength(3);
        degree2.setDegreeType("DB Certificate");
        degree2.setMajor("Data Scientist");
        degree2.addRequiredCourse(c1);
        degree2.addElectiveCourse(c2);
        degree2.addElectiveCourse(c4);
        
        Degree degree3 = d2.addDegreeToDepartment();
        degree3.setDegreeLength(4);
        degree3.setDegreeType("B.E ");
        degree3.setMajor("EEE");
        degree3.addRequiredCourse(c5);
        degree3.addElectiveCourse(c6);
        degree3.addElectiveCourse(c7);
        degree3.addElectiveCourse(c8);
              
        Degree degree4 = d2.addDegreeToDepartment();
        degree4.setDegreeLength(2);
        degree4.setDegreeType("Circuit Certificate");
        degree4.setMajor("Circuits Advanced");
        degree4.addRequiredCourse(c5);
        degree4.addElectiveCourse(c7);
        
        Degree degree5 = d3.addDegreeToDepartment();
        degree5.setDegreeLength(4);
        degree5.setDegreeType("M.S ");
        degree5.setMajor("IS");
        degree5.addRequiredCourse(c9);
        degree5.addElectiveCourse(c10);
        degree5.addElectiveCourse(c11);
        degree5.addElectiveCourse(c12);
        
        
        
        Degree degree6 = d3.addDegreeToDepartment();
        degree6.setDegreeLength(3);
        degree6.setDegreeType("Gordon Certificate");
        degree6.setMajor("Gordon Leadership");
        degree6.addRequiredCourse(c9);
        degree6.addElectiveCourse(c10);
        
        Degree degree7 = d4.addDegreeToDepartment();
        degree7.setDegreeLength(4);
        degree7.setDegreeType("B.Com ");
        degree7.setMajor("Media and Communications");
        degree7.addRequiredCourse(c13);
        degree7.addElectiveCourse(c14);
        degree7.addElectiveCourse(c15);
        degree7.addElectiveCourse(c16);
           
        Degree degree8 = d4.addDegreeToDepartment();
        degree8.setDegreeLength(3);
        degree8.setDegreeType("Media Certificate");
        degree8.setMajor("Media Scientist");
        degree8.addRequiredCourse(c13);
        degree8.addElectiveCourse(c14);
               
        Degree degree9 = d5.addDegreeToDepartment();
        degree9.setDegreeLength(4);
        degree9.setDegreeType("MBA");
        degree9.setMajor("Finance");
        degree9.addRequiredCourse(c17);    
        degree9.addElectiveCourse(c19);
        degree9.addElectiveCourse(c20);
                
        Degree degree10 = d5.addDegreeToDepartment();
        degree10.setDegreeLength(3);
        degree10.setDegreeType("MBA");
        degree10.setMajor("Marketing");
        degree10.addRequiredCourse(c17);
        degree10.addElectiveCourse(c18);
        degree10.addElectiveCourse(c20);
        
        
        Semester s1 = d1.getCourseSchedule().addSemesterToSchedule();
        s1.setSemType("fall");
        s1.setSemNumber(1);
        s1.setSemYear(2016);
        CourseOffering co1 = s1.addCourseToSemester(c1,s1);
        co1.setDay("monday");
        co1.setLectureEndTime("11:00");
        co1.setLectureStartTime("08:00");
        co1.assignClassRoom("blackman hall", 543,d1.getFacultyDirectory());
        
        CourseOffering co4 = s1.addCourseToSemester(c4,s1);
        co4.setDay("tuesday");
        co4.setLectureEndTime("11:00");
        co4.setLectureStartTime("08:00");
        co4.assignClassRoom("presidents hall", 765,d1.getFacultyDirectory());
        
        Semester s2 = d1.getCourseSchedule().addSemesterToSchedule();
        s2.setSemNumber(2);
        s2.setSemType("spring");
        s2.setSemYear(2017);
        CourseOffering co2 = s2.addCourseToSemester(c2,s2);
        co2.setDay("wednesday");
        co2.setLectureEndTime("11:00");
        co2.setLectureStartTime("08:00");
        co2.assignClassRoom("snell", 200,d1.getFacultyDirectory());
 
        
        Semester s3 = d1.getCourseSchedule().addSemesterToSchedule();
        s3.setSemNumber(3);
        s3.setSemType("fall");
        s3.setSemYear(2017);
        CourseOffering co3 = s3.addCourseToSemester(c3,s3);
        co3.setDay("friday");
        co3.setLectureEndTime("11:00");
        co3.setLectureStartTime("08:00");
        co3.assignClassRoom("shillman hall", 302,d1.getFacultyDirectory());
        
        Semester s4 = d2.getCourseSchedule().addSemesterToSchedule();
        s4.setSemType("fall");
        s4.setSemNumber(1);
        s4.setSemYear(2016);
        CourseOffering co5 = s4.addCourseToSemester(c5,s4);
        co5.setDay("monday");
        co5.setLectureEndTime("11:00");
        co5.setLectureStartTime("08:00");
        co5.assignClassRoom("blackman hall", 533,d2.getFacultyDirectory());
        
        
        
        Semester s5 = d2.getCourseSchedule().addSemesterToSchedule();
        s5.setSemNumber(2);
        s5.setSemType("spring");
        s5.setSemYear(2017);
        CourseOffering co6 = s5.addCourseToSemester(c6,s5);
        co6.setDay("wednesday");
        co6.setLectureEndTime("11:00");
        co6.setLectureStartTime("08:00");
        co6.assignClassRoom("snell", 200,d2.getFacultyDirectory());
        
        CourseOffering co7 = s5.addCourseToSemester(c7,s5);
        co7.setDay("tuesday");
        co7.setLectureEndTime("11:00");
        co7.setLectureStartTime("08:00");
        co7.assignClassRoom("presidents hall", 765,d2.getFacultyDirectory());
 
        
        Semester s6 = d2.getCourseSchedule().addSemesterToSchedule();
        s6.setSemNumber(3);
        s6.setSemType("fall");
        s6.setSemYear(2017);
        CourseOffering co8 = s6.addCourseToSemester(c8,s6);
        co8.setDay("friday");
        co8.setLectureEndTime("11:00");
        co8.setLectureStartTime("08:00");
        co8.assignClassRoom("shillman hall", 302,d2.getFacultyDirectory());
        
        Semester s7 = d3.getCourseSchedule().addSemesterToSchedule();
        s7.setSemType("fall");
        s7.setSemNumber(1);
        s7.setSemYear(2016);
        CourseOffering co9 = s7.addCourseToSemester(c9,s7);
        co9.setDay("monday");
        co9.setLectureEndTime("11:00");
        co9.setLectureStartTime("08:00");
        co9.assignClassRoom("blackman hall", 543,d3.getFacultyDirectory());
        
        
        Semester s8 = d3.getCourseSchedule().addSemesterToSchedule();
        s8.setSemNumber(2);
        s8.setSemType("spring");
        s8.setSemYear(2017);
        CourseOffering co11 = s8.addCourseToSemester(c11,s8);
        co11.setDay("wednesday");
        co11.setLectureEndTime("11:00");
        co11.setLectureStartTime("08:00");
        co11.assignClassRoom("snell", 200,d3.getFacultyDirectory());
 
        
        Semester s9 = d3.getCourseSchedule().addSemesterToSchedule();
        s9.setSemNumber(3);
        s9.setSemType("fall");
        s9.setSemYear(2017);
        CourseOffering co12 = s9.addCourseToSemester(c12,s9);
        co12.setDay("friday");
        co12.setLectureEndTime("11:00");
        co12.setLectureStartTime("08:00");
        co12.assignClassRoom("shillman hall", 302,d3.getFacultyDirectory());
        
        CourseOffering co10 = s9.addCourseToSemester(c10,s9);
        co10.setDay("tuesday");
        co10.setLectureEndTime("11:00");
        co10.setLectureStartTime("08:00");
        co10.assignClassRoom("presidents hall", 765,d1.getFacultyDirectory());
        
        
         Semester s10 = d4.getCourseSchedule().addSemesterToSchedule();
        s10.setSemType("fall");
        s10.setSemNumber(1);
        s10.setSemYear(2016);
        CourseOffering co13 = s10.addCourseToSemester(c13,s10);
        co13.setDay("monday");
        co13.setLectureEndTime("11:00");
        co13.setLectureStartTime("08:00");
        co13.assignClassRoom("blackman hall", 533,d4.getFacultyDirectory());
        
        
        
        Semester s11 = d4.getCourseSchedule().addSemesterToSchedule();
        s11.setSemNumber(2);
        s11.setSemType("spring");
        s11.setSemYear(2017);
        CourseOffering co14 = s11.addCourseToSemester(c14,s11);
        co14.setDay("wednesday");
        co14.setLectureEndTime("11:00");
        co14.setLectureStartTime("08:00");
        co14.assignClassRoom("snell", 200,d4.getFacultyDirectory());
        
        CourseOffering co15 = s11.addCourseToSemester(c15,s11);
        co15.setDay("tuesday");
        co15.setLectureEndTime("11:00");
        co15.setLectureStartTime("08:00");
        co15.assignClassRoom("presidents hall", 765,d4.getFacultyDirectory());
 
        
        Semester s12 = d4.getCourseSchedule().addSemesterToSchedule();
        s12.setSemNumber(3);
        s12.setSemType("fall");
        s12.setSemYear(2017);
        CourseOffering co16 = s12.addCourseToSemester(c16,s12);
        co16.setDay("friday");
        co16.setLectureEndTime("11:00");
        co16.setLectureStartTime("08:00");
        co16.assignClassRoom("shillman hall", 302,d4.getFacultyDirectory());
        
        Semester s13 = d5.getCourseSchedule().addSemesterToSchedule();
        s13.setSemType("fall");
        s13.setSemNumber(1);
        s13.setSemYear(2016);
        CourseOffering co17 = s13.addCourseToSemester(c17,s13);
        co17.setDay("monday");
        co17.setLectureEndTime("11:00");
        co17.setLectureStartTime("08:00");
        co17.assignClassRoom("blackman hall", 543,d5.getFacultyDirectory());
        
        
        Semester s14 = d5.getCourseSchedule().addSemesterToSchedule();
        s14.setSemNumber(2);
        s14.setSemType("spring");
        s14.setSemYear(2017);
        CourseOffering co18 = s14.addCourseToSemester(c18,s14);
        co18.setDay("wednesday");
        co18.setLectureEndTime("11:00");
        co18.setLectureStartTime("08:00");
        co18.assignClassRoom("snell", 200,d5.getFacultyDirectory());
 
        
        Semester s15 = d5.getCourseSchedule().addSemesterToSchedule();
        s15.setSemNumber(3);
        s15.setSemType("fall");
        s15.setSemYear(2017);
        CourseOffering co19 = s15.addCourseToSemester(c19,s15);
        co19.setDay("friday");
        co19.setLectureEndTime("11:00");
        co19.setLectureStartTime("08:00");
        co19.assignClassRoom("shillman hall", 302,d5.getFacultyDirectory());
        
        CourseOffering co20 = s1.addCourseToSemester(c20,s15);
        co20.setDay("tuesday");
        co20.setLectureEndTime("11:00");
        co20.setLectureStartTime("08:00");
        co20.assignClassRoom("presidents hall", 765,d5.getFacultyDirectory());
        
        
        
        StudentDirectory studentDirectory = new StudentDirectory();
        Student student = studentDirectory.addStudent();
        student.setFirstName("Saravan");
        student.setLastName("Vadivel");
        student.setEmail("saravan.deepak@gmail.com");
        student.setNuid(101);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());

        
        student = studentDirectory.addStudent();
        student.setFirstName("Vaishak");
        student.setLastName("Dinesh");
        student.setEmail("vaishak.dinesh@gmail.com");
        student.setNuid(102);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());

        
        student = studentDirectory.addStudent();
        student.setFirstName("Nithin");
        student.setLastName("Kartha");
        student.setEmail("nithin.katha@gmail.com");
        student.setNuid(103);
        student.setNationality("India");
        student.setDepartmentName(d1.getDepartmentName());
        
        student = studentDirectory.addStudent();
        student.setFirstName("Jessia");
        student.setLastName("Carlberg");
        student.setEmail("jessia@gmail.com");
        student.setNuid(104);
        student.setNationality("USA");
        student.setDepartmentName(d1.getDepartmentName());

        
        d1.setDeptStudentDirectory(studentDirectory);
        
        StudentDirectory studentDirectory2 = new StudentDirectory();
        Student student2 = studentDirectory2.addStudent();
        student2.setFirstName("Wayne");
        student2.setLastName("Rooney");
        student2.setEmail("WR10@gmail.com");
        student2.setNuid(105);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());

        
        student2 = studentDirectory2.addStudent();
        student2.setFirstName("Michael");
        student2.setLastName("Carrick");
        student2.setEmail("CR16@gmail.com");
        student2.setNuid(106);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());

        
        student2 = studentDirectory2.addStudent();
        student2.setFirstName("David");
        student2.setLastName("Beckham");
        student2.setEmail("DB7a@gmail.com");
        student2.setNuid(107);
        student2.setNationality("England");
        student2.setDepartmentName(d2.getDepartmentName());
        
        student2 = studentDirectory2.addStudent();
        student2.setFirstName("Lionel");
        student2.setLastName("Messi");
        student2.setEmail("messigod@gmail.com");
        student2.setNuid(108);
        student2.setNationality("Argentina"); 
        student2.setDepartmentName(d2.getDepartmentName());
        
        d2.setDeptStudentDirectory(studentDirectory2);
        
        StudentDirectory studentDirectory3 = new StudentDirectory();
        Student student3 = studentDirectory3.addStudent();
        student3.setFirstName("Cristiano");
        student3.setLastName("Ronaldo");
        student3.setEmail("cr7@gmail.com");
        student3.setNuid(109);
        student3.setNationality("Portugal");
        student3.setDepartmentName(d3.getDepartmentName());

        
        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Stacia");
        student3.setLastName("Eisele");
        student3.setEmail("stacia@gmail.com");
        student3.setNuid(110);
        student3.setNationality("USA");
        student3.setDepartmentName(d3.getDepartmentName());

        
        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Pavithra");
        student3.setLastName("Snah");
        student3.setEmail("pavi@gmail.com");
        student3.setNuid(111);
        student3.setNationality("India");
        student3.setDepartmentName(d3.getDepartmentName());
        
        student3 = studentDirectory3.addStudent();
        student3.setFirstName("Ram");
        student3.setLastName("Visnhu");
        student3.setEmail("ram@gmail.com");
        student3.setNuid(112);
        student3.setNationality("India");
        student3.setDepartmentName(d3.getDepartmentName());
        
        d3.setDeptStudentDirectory(studentDirectory3);
        
        StudentDirectory studentDirectory4 = new StudentDirectory();
        Student student4 = studentDirectory4.addStudent();
        student4.setFirstName("Anto");
        student4.setLastName("Clinton");
        student4.setEmail("ac@gmail.com");
        student4.setNuid(113);
        student4.setNationality("India");
        student4.setDepartmentName(d4.getDepartmentName());

        
        student4 = studentDirectory4.addStudent();
        student4.setFirstName("Jason");
        student4.setLastName("Titus");
        student4.setEmail("stacia@gmail.com");
        student4.setNuid(114);
        student4.setNationality("USA");
        student4.setDepartmentName(d4.getDepartmentName());
        

        
        student4 = studentDirectory4.addStudent();
        student4.setFirstName("Kori");
        student4.setLastName("Dishon");
        student4.setEmail("kori@gmail.com");
        student4.setNuid(115);
        student4.setNationality("Spain");
        student4.setDepartmentName(d4.getDepartmentName());
              
        student4 = studentDirectory4.addStudent();
        student4.setFirstName("Morgan");
        student4.setLastName("Hy");
        student4.setEmail("morgan@gmail.com");
        student4.setNuid(116);
        student4.setNationality("USA");
        student4.setDepartmentName(d4.getDepartmentName());

        d4.setDeptStudentDirectory(studentDirectory4);
        
        StudentDirectory studentDirectory5 = new StudentDirectory();
        Student student5 = studentDirectory5.addStudent();
        student5.setFirstName("Catrice");
        student5.setLastName("Yeatman");
        student5.setEmail("catrice@gmail.com");
        student5.setNuid(117);
        student5.setNationality("USA");
        student5.setDepartmentName(d5.getDepartmentName());

        
        student5 = studentDirectory5.addStudent();
        student5.setFirstName("Rueben");
        student5.setLastName("Mohan");
        student5.setEmail("rueben@gmail.com");
        student5.setNuid(118);
        student5.setNationality("USA");
        student5.setDepartmentName(d5.getDepartmentName());
        

        
        student5 = studentDirectory5.addStudent();
        student5.setFirstName("Ron");
        student5.setLastName("Kennelly");
        student5.setEmail("ron@gmail.com");
        student5.setNuid(119);
        student5.setNationality("USA");
        student5.setDepartmentName(d5.getDepartmentName());
              
        student5 = studentDirectory5.addStudent();
        student5.setFirstName("Kay");
        student5.setLastName("Korth");
        student5.setEmail("morgan@gmail.com");
        student5.setNuid(120);
        student5.setNationality("Spain");
        student5.setDepartmentName(d5.getDepartmentName());

        d5.setDeptStudentDirectory(studentDirectory5);
        
        ArrayList<Student> studentList1 = new ArrayList<Student>();
        for(int i = 0; i<2;i++){
            studentList1.add(d1.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        ArrayList<Student> studentList2 = new ArrayList<Student>();
        for(int i = 2; i<d1.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList2.add(d1.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        
        co1.addSeats(1500, d1.getDeptStudentDirectory().getStudentDirectory());
        co1.getSeatList().get(0).addMarks(100, 90, 95, 100, 100, 95, 100, 100);
        co1.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 90, 80, 95);
        co1.getSeatList().get(2).addMarks(90, 95, 90, 80, 70, 90, 85, 100);
        co1.getSeatList().get(3).addMarks(70, 95, 70, 80, 70, 90, 85, 90);
        
        
        co2.addSeats(1300, studentList1);
        co2.getSeatList().get(0).addMarks(90, 95, 99, 85, 70, 90, 85, 100);
        co2.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 90, 80, 95);
        
        
        co3.addSeats(1200, studentList2);
        co3.getSeatList().get(0).addMarks(90, 95, 90, 80, 70, 90, 85, 100);
        co3.getSeatList().get(1).addMarks(80, 80, 92, 80, 75, 90, 80, 95);
        
        
        co4.addSeats(1400, d1.getDeptStudentDirectory().getStudentDirectory());
        co4.getSeatList().get(0).addMarks(99, 100, 98, 100, 100, 100, 95, 100);
        co4.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 90, 80, 91);
        co4.getSeatList().get(2).addMarks(80, 80, 90, 80, 75, 90, 80, 95);
        co4.getSeatList().get(3).addMarks(90, 95, 90, 80, 70, 90, 85, 100);
        
        ArrayList<Student> studentList3 = new ArrayList<Student>();
        for(int i = 0; i<2;i++){
            studentList3.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        ArrayList<Student> studentList4 = new ArrayList<Student>();
        for(int i = 2; i<d2.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList4.add(d2.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        
        co5.addSeats(1400, d2.getDeptStudentDirectory().getStudentDirectory());
        co5.getSeatList().get(0).addMarks(80, 100, 100, 100, 75, 100, 100, 90);
        co5.getSeatList().get(1).addMarks(60, 81, 90, 82, 75, 90, 80, 95);
        co5.getSeatList().get(2).addMarks(90, 95, 90, 88, 70, 92, 85, 100);
        co5.getSeatList().get(3).addMarks(80, 86, 90, 80, 75, 90, 80, 95);
        
        
        co6.addSeats(1100, studentList3);   
        co6.getSeatList().get(0).addMarks(88, 82, 90, 89, 75, 99, 80, 95);
        co6.getSeatList().get(1).addMarks(90, 95, 90, 88, 70, 92, 85, 100);
        
        co7.addSeats(1500, studentList4);
        co7.getSeatList().get(0).addMarks(90, 95, 90, 80, 73, 90, 85, 100);
        co7.getSeatList().get(1).addMarks(80, 86, 90, 80, 75, 90, 80, 95);
                
        co8.addSeats(1000, d2.getDeptStudentDirectory().getStudentDirectory());
        co8.getSeatList().get(0).addMarks(90, 95, 99, 85, 72, 90, 85, 100);
        co8.getSeatList().get(1).addMarks(80, 80, 90, 80, 75, 91, 80, 95);
        co8.getSeatList().get(2).addMarks(70, 80, 90, 80, 75, 90, 80, 91);
        co8.getSeatList().get(3).addMarks(80, 80, 90, 80, 75, 90, 80, 95);
        
        ArrayList<Student> studentList5 = new ArrayList<Student>();
        for(int i = 0; i<2;i++){
            studentList5.add(d3.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        ArrayList<Student> studentList6 = new ArrayList<Student>();
        for(int i = 2; i<d3.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList6.add(d3.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        co9.addSeats(1000, d3.getDeptStudentDirectory().getStudentDirectory());
        co9.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co9.getSeatList().get(1).addMarks(80, 80, 94, 80, 75, 90, 80, 95);
        co9.getSeatList().get(2).addMarks(70, 80, 90, 80, 75, 90, 80, 91);
        co9.getSeatList().get(3).addMarks(90, 95, 90, 80, 70, 90, 85, 100);
        
        co10.addSeats(1600, studentList5);
        co10.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co10.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 94, 80, 91);
        
        
        co11.addSeats(1200, studentList6);
        co11.getSeatList().get(0).addMarks(60, 81, 90, 82, 73, 90, 80, 95);
        co11.getSeatList().get(1).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        
        co12.addSeats(1300, d3.getDeptStudentDirectory().getStudentDirectory());
        co12.getSeatList().get(0).addMarks(100, 100, 100, 100, 100, 100, 100, 100);
        co12.getSeatList().get(1).addMarks(88, 82, 90, 89, 75, 99, 80, 95);
        co12.getSeatList().get(2).addMarks(90, 95, 90, 78, 70, 92, 85, 100);
        co12.getSeatList().get(3).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        
        ArrayList<Student> studentList7 = new ArrayList<Student>();
        for(int i = 0; i<2;i++){
            studentList7.add(d4.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        ArrayList<Student> studentList8 = new ArrayList<Student>();
        for(int i = 2; i<d4.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList8.add(d4.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        co13.addSeats(1200, d4.getDeptStudentDirectory().getStudentDirectory());
        co13.getSeatList().get(0).addMarks(90, 95, 90, 80, 70, 90, 85, 100);
        co13.getSeatList().get(1).addMarks(80, 80, 94, 80, 75, 90, 80, 95);
        co13.getSeatList().get(2).addMarks(70, 80, 90, 80, 75, 90, 80, 91);
        co13.getSeatList().get(3).addMarks(70, 80, 90, 80, 75, 94, 80, 91);
        
        co14.addSeats(1600, studentList7);
        co14.getSeatList().get(0).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        co14.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 94, 80, 91);
        
        
        co15.addSeats(1200, studentList8);
        co15.getSeatList().get(0).addMarks(60, 81, 90, 82, 73, 90, 80, 95);
        co15.getSeatList().get(1).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        
        co16.addSeats(1300, d4.getDeptStudentDirectory().getStudentDirectory());
        co16.getSeatList().get(0).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        co16.getSeatList().get(1).addMarks(88, 82, 90, 89, 75, 99, 80, 95);
        co16.getSeatList().get(2).addMarks(60, 81, 90, 82, 73, 90, 80, 95);
        co16.getSeatList().get(3).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        
        ArrayList<Student> studentList9 = new ArrayList<Student>();
        for(int i = 0; i<2;i++){
            studentList9.add(d5.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        ArrayList<Student> studentList10 = new ArrayList<Student>();
        for(int i = 2; i<d5.getDeptStudentDirectory().getStudentDirectory().size();i++){
            studentList10.add(d5.getDeptStudentDirectory().getStudentDirectory().get(i));
        }
        co17.addSeats(1200, d5.getDeptStudentDirectory().getStudentDirectory());
        co17.getSeatList().get(0).addMarks(90, 95, 90, 80, 70, 90, 85, 100);
        co17.getSeatList().get(1).addMarks(80, 80, 94, 80, 75, 90, 80, 95);
        co17.getSeatList().get(2).addMarks(70, 80, 90, 80, 75, 90, 80, 91);
        co17.getSeatList().get(3).addMarks(70, 80, 90, 80, 75, 94, 80, 91);
        
        co18.addSeats(1600, studentList9);
        co18.getSeatList().get(0).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        co18.getSeatList().get(1).addMarks(70, 80, 90, 80, 75, 94, 80, 91);
        
        
        co19.addSeats(1200, studentList10);
        co19.getSeatList().get(0).addMarks(60, 81, 90, 82, 73, 90, 80, 95);
        co19.getSeatList().get(1).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        
        co20.addSeats(1300, d5.getDeptStudentDirectory().getStudentDirectory());
        co20.getSeatList().get(0).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        co20.getSeatList().get(1).addMarks(88, 82, 90, 89, 75, 99, 80, 95);
        co20.getSeatList().get(2).addMarks(60, 81, 90, 82, 73, 90, 80, 95);
        co20.getSeatList().get(3).addMarks(90, 92, 80, 68, 70, 90, 85, 100);
        
        
        
        
        EmployedStudents es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Nithin");
        es.setLastName("Guru");
        es.setNuid(222);
        es.setEmail("ndg@gmail.com");
        es.setNationality("Indian");
        es.setEmployerName("Accenture");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("SE");
        es.setSalary(100000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Kitchu");
        es.setLastName("Joseph");
        es.setNuid(201);
        es.setEmail("kit@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("Dell");
        es.setEmploymentDescription("SSE");
        es.setSalary(80000);
        
        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Nick");
        es.setLastName("Fury");
        es.setNuid(205);
        es.setEmail("nickfur@gmail.com");
        es.setNationality("Spain");
        es.setEmployerName("MathWorks");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("Web dev");
        es.setSalary(90000);
        
        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Amy");
        es.setLastName("Jen");
        es.setNuid(210);
        es.setEmail("amyjen@gmail.com");
        es.setNationality("American");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("Dell");
        es.setEmploymentDescription("DB dev");
        es.setSalary(70000);

        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Yenchu");
        es.setLastName("kovoski");
        es.setNuid(243);
        es.setEmail("yench@gmail.com");
        es.setNationality("Chinese");
        es.setEmployerName("Google");
        es.setDepartmentName(d1.getDepartmentName());
        es.setEmploymentDescription("TL");
        es.setSalary(110000);
        
        es = coll1.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es.setFirstName("Reshmi");
        es.setLastName("Joseph");
        es.setNuid(217);
        es.setEmail("resh@gmail.com");
        es.setNationality("Indian");
        es.setDepartmentName(d2.getDepartmentName());
        es.setEmployerName("Apple");
        es.setEmploymentDescription("Tester");
        es.setSalary(90000);

        UnemployedStudents ue = coll1.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Jacob");
        ue.setLastName("John");
        ue.setNuid(300);
        ue.setEmail("jacjon@gmail.com");
        ue.setNationality("American");
        es.setDepartmentName(d1.getDepartmentName());
        ue.setReasonForUnemp("Low Grades");
        
        ue = coll1.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue.setFirstName("Russel");
        ue.setLastName("Moore");
        ue.setNuid(330);
        ue.setEmail("j@gmail.com");
        es.setDepartmentName(d2.getDepartmentName());
        ue.setNationality("Georgia");
        ue.setReasonForUnemp("H2b visa");

        HigherStudiesStudents hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Raghu");
        hs.setLastName("Ram");
        hs.setNuid(321);
        hs.setEmail("rgv@gmail.com");
        es.setDepartmentName(d2.getDepartmentName());
        hs.setNationality("Mexican");
        hs.setMajorName("MIS");
        hs.setUniversityName("NEU");

        hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Batman");
        hs.setLastName("Robin");
        hs.setNuid(777);
        hs.setEmail("bat@gmail.com");
        hs.setNationality("chinki");
        es.setDepartmentName(d1.getDepartmentName());
        hs.setMajorName("CSE");
        hs.setUniversityName("MIT");
        
        hs = coll1.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs.setFirstName("Anu");
        hs.setLastName("Priya");
        hs.setNuid(321);
        hs.setEmail("anu@gmail.com");
        hs.setNationality("Indian");
        es.setDepartmentName(d1.getDepartmentName());
        hs.setMajorName("CSE");
        hs.setUniversityName("UIC");
        
        EmployedStudents es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Nithin");
        es1.setLastName("Guru");
        es1.setNuid(222);
        es1.setEmail("ndg@gmail.com");
        es1.setNationality("Indian");
        es1.setEmployerName("Accenture");
        es1.setDepartmentName(d1.getDepartmentName());
        es1.setEmploymentDescription("SE");
        es1.setSalary(100000);

        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Kitchu");
        es1.setLastName("Joseph");
        es1.setNuid(201);
        es1.setEmail("kit@gmail.com");
        es1.setNationality("Indian");
        es1.setDepartmentName(d2.getDepartmentName());
        es1.setEmployerName("Dell");
        es1.setEmploymentDescription("SSE");
        es1.setSalary(80000);
        
        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Nick");
        es1.setLastName("Fury");
        es1.setNuid(205);
        es1.setEmail("nickfur@gmail.com");
        es1.setNationality("Spain");
        es1.setEmployerName("MathWorks");
        es1.setDepartmentName(d1.getDepartmentName());
        es1.setEmploymentDescription("Web dev");
        es1.setSalary(90000);
        
        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Amy");
        es1.setLastName("Jen");
        es1.setNuid(210);
        es1.setEmail("amyjen@gmail.com");
        es1.setNationality("American");
        es1.setDepartmentName(d2.getDepartmentName());
        es1.setEmployerName("Dell");
        es1.setEmploymentDescription("DB dev");
        es1.setSalary(70000);

        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Yenchu");
        es1.setLastName("kovoski");
        es1.setNuid(243);
        es1.setEmail("yench@gmail.com");
        es1.setNationality("Chinese");
        es1.setEmployerName("Google");
        es1.setDepartmentName(d1.getDepartmentName());
        es1.setEmploymentDescription("TL");
        es1.setSalary(110000);
        
        es1 = coll2.getGraduatedStudents().getEmployedDirectory().addEmployed();
        es1.setFirstName("Reshmi");
        es1.setLastName("Joseph");
        es1.setNuid(217);
        es1.setEmail("resh@gmail.com");
        es1.setNationality("Indian");
        es1.setDepartmentName(d2.getDepartmentName());
        es1.setEmployerName("Apple");
        es1.setEmploymentDescription("Tester");
        es1.setSalary(90000);

        UnemployedStudents ue1 = coll2.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue1.setFirstName("Jacob");
        ue1.setLastName("John");
        ue1.setNuid(300);
        ue1.setEmail("jacjon@gmail.com");
        ue1.setNationality("American");
        es1.setDepartmentName(d1.getDepartmentName());
        ue1.setReasonForUnemp("Low Grades");
        
        ue1 = coll2.getGraduatedStudents().getUnemployedDirectory().addUnemployed();
        ue1.setFirstName("Russel");
        ue1.setLastName("Moore");
        ue1.setNuid(330);
        ue1.setEmail("j@gmail.com");
        es1.setDepartmentName(d2.getDepartmentName());
        ue1.setNationality("Georgia");
        ue1.setReasonForUnemp("H2b visa");

        HigherStudiesStudents hs1 = coll2.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs1.setFirstName("Raghu");
        hs1.setLastName("Ram");
        hs1.setNuid(321);
        hs1.setEmail("rgv@gmail.com");
        es1.setDepartmentName(d2.getDepartmentName());
        hs1.setNationality("Mexican");
        hs1.setMajorName("MIS");
        hs1.setUniversityName("NEU");

        hs1 = coll2.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs1.setFirstName("Batman");
        hs1.setLastName("Robin");
        hs1.setNuid(777);
        hs1.setEmail("bat@gmail.com");
        hs1.setNationality("chinki");
        es1.setDepartmentName(d1.getDepartmentName());
        hs1.setMajorName("CSE");
        hs1.setUniversityName("MIT");
        
        hs1 = coll2.getGraduatedStudents().getHigherStudiesDirectory().addHigherStudies();
        hs1.setFirstName("Anu");
        hs1.setLastName("Priya");
        hs1.setNuid(321);
        hs1.setEmail("anu@gmail.com");
        hs1.setNationality("Indian");
        es1.setDepartmentName(d1.getDepartmentName());
        hs1.setMajorName("CSE");
        hs1.setUniversityName("UIC");
        
        for(University u: eco.getUniversityList()){
            for(College c: u.getCollegeList()){
                c.getAllStudents();
            }
        }
        
        for(University u: eco.getUniversityList()){
            u.getAllUniversityStudents();
        }
        
        
    }

    }
