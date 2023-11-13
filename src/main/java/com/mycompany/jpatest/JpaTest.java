package com.mycompany.jpatest;

import com.mycompany.jpatest.logic.Controller;
import com.mycompany.jpatest.logic.Student;
import java.util.ArrayList;
import java.util.Date;

public class JpaTest {
    
    public static void main(String[] args) {
        
        Controller control = new Controller();

        // Create User
//        Student stuTest = new Student(22, "Jonh", "Smith", new Date());
//        control.createStudent(stuTest);

//        control.deleteStudent(16);

//        stuTest.setLastName("Park");
//        control.editStudent(stuTest);
        
        // Print Users
//        Student stu = control.getStudent(15);
//        System.out.println("-----------------Individual search-----------");
//        System.out.println(stu.toString());
//        System.out.println("-----------------Group search-----------");
//        ArrayList<Student> students = control.getAllStudents();
//        for (Student student : students) {
//            System.out.println("Student" + student.toString());
//        }
//        System.out.println("-----------------------------------------");
        

        // Update user by id
        Student stuTest = new Student(22, "Jonh", "Smith", new Date());
        control.editStudenById(22, stuTest);
        
        System.out.println("-----------------Group search-----------");
        ArrayList<Student> students = control.getAllStudents();
        for (Student student : students) {
            System.out.println("Student" + student.toString());
        }
        System.out.println("-----------------------------------------");
    }
}
