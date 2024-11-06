/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.ArrayList;

import info5100.university.example.CourseCatalog.Course;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    float grade; //(Letter grade mappings: A=4.0, A-=3.7, B+=3.3, B=3.0, )
    Seat seat;
    boolean like; //true means like and false means not like
    CourseLoad courseload;
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
     
    public boolean getLike(){
        return like;
    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public int getCreditHours(){
        return seat.getCourseCredits();
       
    }
    public Seat getSeat(){
        return seat;
    }
    public CourseOffer getCourseOffer(){
        
        return seat.getCourseOffer();
    }
    public Course getAssociatedCourse(){
        
        return getCourseOffer().getSubjectCourse();
    }
    public float GetCourseStudentScore(){
        return getCreditHours()*grade;
    }

    public float getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = mapGradeToGpa(grade);
    }
    
    public float mapGradeToGpa(String grade) {
        float gpa;
 
        if (grade.equalsIgnoreCase("A")) {
            gpa = 4.0f;
        } else if (grade.equalsIgnoreCase("A-")) {
            gpa = 3.7f;
        } else if (grade.equalsIgnoreCase("B+")) {
            gpa = 3.3f;
        } else if (grade.equalsIgnoreCase("B")) {
            gpa = 3.0f;
        } else if (grade.equalsIgnoreCase("B-")) {
            gpa = 2.7f;
        } else if (grade.equalsIgnoreCase("C+")) {
            gpa = 2.3f;
        } else if (grade.equalsIgnoreCase("C")) {
            gpa = 2.0f;
        } else if (grade.equalsIgnoreCase("C-")) {
            gpa = 1.7f;
        } else if (grade.equalsIgnoreCase("D+")) {
            gpa = 1.3f;
        } else if (grade.equalsIgnoreCase("D")) {
            gpa = 1.0f;
        } else if (grade.equalsIgnoreCase("F")) {
            gpa = 0.0f;
        } else {
            System.out.println("Invalid grade entered.");
            gpa = -1.0f; // Indicates an invalid grade
        }
 
        return gpa;
    }

    
    
}
