/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generictasks;

/**
 *
 * @author CPP_Curriculum
 */
public class StudyCourse {
    
    private String courseName;
    private String courseCode;
    private String courseDescription;
    
    //TASK 1: constructor that sets all the study course fields
    public StudyCourse(String courseName, String courseCode, String courseDescription){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;  
    }
    
    //TASK 1: method that prints our study course details in a user-firendly manner
    public String toString(){
        return "Course Information:\nCode: " + courseCode + "\nName: " + courseName + "\nDescription: " + courseDescription + "\n";
    }
}
