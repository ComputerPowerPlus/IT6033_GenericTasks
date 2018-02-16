/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generictasks;

import java.util.ArrayList;

/**
 *
 * @author CPP_Curriculum
 */
public class GenericTasks {

    //Adding ArrayLists
    public static ArrayList<StudyCourse> courses = new ArrayList<>();
    public static ArrayList<Employee> salesEmpList = new ArrayList<>();
    public static ArrayList<Employee> marketingEmpList = new ArrayList<>();
  
    
    public static void main(String[] args) {
        
        //TASK 1: creating StudyCourse objects
        StudyCourse course1 = new StudyCourse("English", "E101", "English Course");
        StudyCourse course2 = new StudyCourse("PE", "PE102", "Physical Education");
        StudyCourse course3 = new StudyCourse("Science", "S201", "Science course");
        
        //TASK 1: adding StudyCourse objects to the courses list
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        // courses.add("mathematics");
       
        //TASK 1: printing items of courses list
        for (StudyCourse sc: courses)
            System.out.println(sc);
       
        //Creating Employee objects from Sales and Marketing department
        Employee emp1 = new Employee(1, "John Smith", "Sales", 75000.0f);
        Employee emp2 = new Employee(2, "James Smith", "Sales", 80000.0f);
        Employee emp3 = new Employee(3, "Justin Smith", "Sales", 80000.0f);
        Employee emp4 = new Employee("ANNMAR", "Anna Smith", "Marketing", 100000.0f);
        Employee emp5 = new Employee("ALEMAR", "Alexander Smith", "Marketing", 110000.0f);
        Employee emp6 = new Employee("ANDMAR", "Andrew Smith", "Marketing", 120000.0f);
       
        //adding employee objects to the appropriate lists
        salesEmpList.add(emp1);
        salesEmpList.add(emp2);
        salesEmpList.add(emp3);
        marketingEmpList.add(emp4);
        marketingEmpList.add(emp5); 
        marketingEmpList.add(emp6); 
        
        //printing out both sales and marketing employee lists
        System.out.println("Sales Department Staff:");
        for (Employee e: salesEmpList){
            System.out.println(e);
        }
        System.out.println("Marketing Department Staff:");
        for (Employee k: marketingEmpList){
            System.out.println(k);
        }
    }        
}
