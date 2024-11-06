/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import java.util.ArrayList;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    
    /* 1) Create Department make sure to pass the name of the department
       2) Use the person directory to create persons some will play students role, some will play faculty role, etc
       3) Use the Course Catalog to creat some courses
       4) Create a course schedule for a semester (ex: spring 2025
       5) Use the course schedule to create some classes (course offer)
       6) Search for a person by ssn and assign as faculty (faculty profile)
       7) Search for person and assign as student (student profile)
       8) Register student for scheduled classes
    
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Department department = new Department("Information Systems");
        // we need the persondirectory to create persons for the different roles
        
        PersonDirectory persondirectory = department.getPersonDirectory();
        
        //      Create course and keep it in the course catalog
        
        CourseCatalog coursecatalog = department.getCourseCatalog();        
        Course course = coursecatalog.newCourse("algorithms", "info 6205", 4);
        Course course2 = coursecatalog.newCourse("App Engineering", "info 5100", 4);
        Course newCourse3=coursecatalog.newCourse("User experience", "INFO3100", 6);
        Course newCourse4=coursecatalog.newCourse("DataBase Management", "INFO4100", 1);
        Course newCourse5=coursecatalog.newCourse("User Experience", "INFO5100", 2);
        Course newCourse6=coursecatalog.newCourse("Program Management", "INFO7100", 7);
        Course newCourse7=coursecatalog.newCourse("Artificial Intelligence", "INFO8100", 9);
        Course newCourse8=coursecatalog.newCourse("machine Learning", "INFO9100", 23);
        Course newCourse9=coursecatalog.newCourse("Carrer Management", "INFO12100", 56);
        Course newCourse10=coursecatalog.newCourse("Computer Networks", "INFO113100", 78);

        Degree d = new Degree("Master in Science");

        d.addCoreCourse(course);

        d.addElectiveCourse(course2);
        d.addElectiveCourse(newCourse3);
        d.addElectiveCourse(newCourse3);
        d.addElectiveCourse(newCourse4);
        d.addElectiveCourse(newCourse5);
        d.addElectiveCourse(newCourse6);
        d.addElectiveCourse(newCourse7);

//      now lets schedule class to run for spring 2024        
        CourseSchedule courseschedule = department.newCourseSchedule("Spring 2024");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 6205");
        if (courseoffer==null)return;
        courseoffer.generatSeats(10);
        CourseOffer courseoffer2 = courseschedule.newCourseOffer("info 5100");
        if (courseoffer2==null)return;
        courseoffer2.generatSeats(10);

        CourseOffer newcourseoffer3 = courseschedule.newCourseOffer("INFO3100");
        if (newcourseoffer3==null)return;
        newcourseoffer3.generatSeats(10);
        CourseOffer newcourseoffer4 = courseschedule.newCourseOffer("INFO4100");
        if (newcourseoffer4==null)return;
        newcourseoffer4.generatSeats(10);
        CourseOffer newcourseoffer5 = courseschedule.newCourseOffer("INFO5100");
        if (newcourseoffer5==null)return;
        newcourseoffer5.generatSeats(10);
        CourseOffer newcourseoffer6= courseschedule.newCourseOffer("INFO7100");
        if (newcourseoffer6==null)return;
        newcourseoffer6.generatSeats(10);
        CourseOffer newcourseoffer8 = courseschedule.newCourseOffer("INFO8100");
        if (newcourseoffer8==null)return;
        newcourseoffer8.generatSeats(10);
        CourseOffer newcourseoffer9 = courseschedule.newCourseOffer("INFO9100");
        if (newcourseoffer9==null)return;
        newcourseoffer9.generatSeats(10);
        CourseOffer newcourseoffer12 = courseschedule.newCourseOffer("INFO12100");
        if (newcourseoffer12==null)return;
        newcourseoffer12.generatSeats(10);
        CourseOffer newcourseoffer13 = courseschedule.newCourseOffer("INFO113100");
        if (newcourseoffer13==null)return;
        newcourseoffer13.generatSeats(10);        

        //Create teacher for class

        Person person1 = persondirectory.newPerson("01123022"); //person for teacher role                  
        Person person2 = persondirectory.newPerson("011230222"); 

        Person person3 = persondirectory.newPerson("3");
        Person person4 = persondirectory.newPerson("4");
        Person person5 = persondirectory.newPerson("5");
        Person person6 = persondirectory.newPerson("6");
        Person person7 = persondirectory.newPerson("7");
        Person person8 = persondirectory.newPerson("8");
        Person person9 = persondirectory.newPerson("9");
        Person person10 = persondirectory.newPerson("10");
        Person person11 = persondirectory.newPerson("11");
        Person person12 = persondirectory.newPerson("12");
        Person person13 = persondirectory.newPerson("13");
        Person person14 = persondirectory.newPerson("14");
        Person person15 = persondirectory.newPerson("15");
        Person person16 = persondirectory.newPerson("16");
        Person person17 = persondirectory.newPerson("17");
        Person person18 = persondirectory.newPerson("18");
        Person person19 = persondirectory.newPerson("19");
        Person person20 = persondirectory.newPerson("20");
        Person person21 = persondirectory.newPerson("21");
        Person person22 = persondirectory.newPerson("0112303");  
        Person person24 = persondirectory.newPerson("01123034");

        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person3); 
        StudentProfile student2 = sd.newStudentProfile(person4);
        StudentProfile student3 = sd.newStudentProfile(person22); 
        StudentProfile student4 = sd.newStudentProfile(person4);
        StudentProfile student5 = sd.newStudentProfile(person5);
        StudentProfile student6 = sd.newStudentProfile(person6);
        StudentProfile student7 = sd.newStudentProfile(person7);
        StudentProfile student8 = sd.newStudentProfile(person8);
        StudentProfile student9 = sd.newStudentProfile(person9);
        StudentProfile student10 = sd.newStudentProfile(person10);
        StudentProfile student11 = sd.newStudentProfile(person11);
        StudentProfile student12 = sd.newStudentProfile(person12);
        StudentProfile student13 = sd.newStudentProfile(person13);
        StudentProfile student14 = sd.newStudentProfile(person14);
        StudentProfile student15 = sd.newStudentProfile(person15);
        

        FacultyDirectory facultydirectory = department.getFacultyDirectory();
        FacultyProfile teacher = facultydirectory.newFacultyProfile(person1);
        FacultyProfile teacher2 = facultydirectory.newFacultyProfile(person2);  
        
        FacultyProfile teacher3 = facultydirectory.newFacultyProfile(person16); 
        FacultyProfile teacher4 = facultydirectory.newFacultyProfile(person17); 
        FacultyProfile teacher5 = facultydirectory.newFacultyProfile(person18); 
        FacultyProfile teacher6 = facultydirectory.newFacultyProfile(person19); 
        FacultyProfile teacher7 = facultydirectory.newFacultyProfile(person20); 
        FacultyProfile teacher8 = facultydirectory.newFacultyProfile(person21); 
       
        courseoffer.AssignAsTeacher(teacher);//  teacher.AssignAsTeacher(courseoffer); // OR  both work
        courseoffer.AssignAsTeacher(teacher2);//  teacher.AssignAsTeacher(courseoffer); // OR  both work

        teacher3.AssignAsTeacher(newcourseoffer3);
        teacher4.AssignAsTeacher(newcourseoffer4);
        teacher5.AssignAsTeacher(newcourseoffer6);
        teacher6.AssignAsTeacher(newcourseoffer8);
        teacher7.AssignAsTeacher(newcourseoffer9);
        teacher8.AssignAsTeacher(newcourseoffer13);


        
    //  Register student in class for the load of the spring semester     
        CourseLoad courseload = student.newCourseLoad("Spring 2024"); 
        CourseLoad courseload2 = student2.newCourseLoad("Spring 2024");        
        courseload.registerStudentInClass(courseoffer, "A"); //register student in class Info 6205
        courseload.registerStudentInClass(courseoffer2,"B");//same student signed up for 2 classes
        courseload2.registerStudentInClass(courseoffer2,"C");

        CourseLoad courseLoad3 = student3.newCourseLoad("Spring 2024");
        courseLoad3.registerStudentInClass(courseoffer, "A");
        courseLoad3.registerStudentInClass(newcourseoffer4,"D");

        CourseLoad courseLoad4 = student4.newCourseLoad("Spring 2024");
        courseLoad4.registerStudentInClass(courseoffer,"E");
        courseLoad4.registerStudentInClass(newcourseoffer6, "A");
        courseLoad4.registerStudentInClass(newcourseoffer5,"A");


        CourseLoad courseLoad5 = student5.newCourseLoad("Spring 2024");
        courseLoad5.registerStudentInClass(courseoffer,"D");
        courseLoad5.registerStudentInClass(newcourseoffer9,"A");
        courseLoad5.registerStudentInClass(newcourseoffer4,"B");

        CourseLoad courseLoad6 = student6.newCourseLoad("Spring 2024");
        courseLoad6.registerStudentInClass(courseoffer,"A");
        courseLoad6.registerStudentInClass(newcourseoffer5,"A");

        CourseLoad courseLoad7 = student7.newCourseLoad("Spring 2024");
        courseLoad7.registerStudentInClass(courseoffer,"D");
        courseLoad7.registerStudentInClass(newcourseoffer8,"A");

        CourseLoad courseLoad8 = student8.newCourseLoad("Spring 2024");
        courseLoad8.registerStudentInClass(courseoffer,"B");
        courseLoad8.registerStudentInClass(newcourseoffer4,"A");
        courseLoad8.registerStudentInClass(newcourseoffer9,"B");

        CourseLoad courseLoad9 = student9.newCourseLoad("Spring 2024");
        courseLoad9.registerStudentInClass(courseoffer,"A");
        courseLoad9.registerStudentInClass(newcourseoffer9,"A");


        CourseLoad courseLoad10 = student10.newCourseLoad("Spring 2024");
        courseLoad10.registerStudentInClass(courseoffer,"A");
        courseLoad10.registerStudentInClass(newcourseoffer3,"B");
        courseLoad10.registerStudentInClass(newcourseoffer4,"A");

        CourseLoad courseLoad11 = student11.newCourseLoad("Spring 2024");
        courseLoad11.registerStudentInClass(courseoffer,"B");
        courseLoad11.registerStudentInClass(newcourseoffer9,"A");
        courseLoad11.registerStudentInClass(newcourseoffer6,"B");

        CourseLoad courseLoad12 = student12.newCourseLoad("Spring 2024");
        courseLoad12.registerStudentInClass(courseoffer,"B");
        courseLoad12.registerStudentInClass(newcourseoffer8,"A");
        courseLoad12.registerStudentInClass(newcourseoffer9,"D");

        CourseLoad courseLoad13 = student13.newCourseLoad("Spring 2024");
        courseLoad13.registerStudentInClass(courseoffer,"D");
        courseLoad13.registerStudentInClass(newcourseoffer8,"A");
        courseLoad13.registerStudentInClass(newcourseoffer5,"A");

        CourseLoad courseLoad14 = student14.newCourseLoad("Spring 2024");
        courseLoad14.registerStudentInClass(courseoffer,"A");
        courseLoad14.registerStudentInClass(newcourseoffer4,"B");
        courseLoad14.registerStudentInClass(newcourseoffer3,"B");
        
        int total = department.calculateRevenuesBySemester("Spring 2024");
        System.out.print("Total:  " + total+"    ");

        System.out.println("Courses are:");
        for (int i=0;i<coursecatalog.getCourseList().size();i++){
            Course c = coursecatalog.getCourseList().get(i);
            System.out.println(c.getCOurseNumber()+" ("+c.getCOurseNumber()+"), credits="+c.getCredits()+", price/credit="+c.getCoursePrice());
        }


        for (StudentProfile sp : department.getStudentDirectory().getAllStudents()){
            ArrayList<SeatAssignment> seatassignments = sp.getCurrentCourseLoad().getSeatAssignment();
            for (SeatAssignment sa : seatassignments){
                System.out.println(sp.getID() + " " + sa.getAssociatedCourse().getName() + " " + sa.getGrade() 
                        + " " + sa.GetCourseStudentScore() / sa.getCreditHours() 
                        + " " + sa.getAssociatedCourse().getCoursePrice());
            }
        }
 
        
        

    }

}
