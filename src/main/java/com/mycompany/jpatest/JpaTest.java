package com.mycompany.jpatest;

import com.mycompany.jpatest.logic.Career;
import com.mycompany.jpatest.logic.Controller;
import com.mycompany.jpatest.logic.Student;
import com.mycompany.jpatest.logic.Subject;
import java.util.Date;
import java.util.LinkedList;

public class JpaTest {
    
    public static void main(String[] args) {
        
        Controller control = new Controller();
        
        // Create list of subjects 
        LinkedList<Subject> subjectList = new LinkedList<>();
        
        // creation of career with list of subject
        Career career1 = new Career(10, "Information Technology", subjectList);
        // save career in DB
        control.createCareer(career1);
        
        // Create Subject
        Subject sub1 = new Subject(10, "Programming I", "semester", career1);
        Subject sub2 = new Subject(11, "Programming II", "semester", career1);
        // Save subjects in DB
        control.createSubject(sub1);
        control.createSubject(sub2);
        
        // save in the list of subject
        subjectList.add(sub1);
        subjectList.add(sub2);
        
        career1.setSubjectList(subjectList);
        control.editCareer(career1);
        
        // create student
        Student student1 = new Student(8, "Keitaro", "Shirogane", new Date(), career1);
        // save student in DB
        control.createStudent(student1);
        
        System.out.println("---------------------------------------------");
        System.out.println("----------------- Student Data --------------");
        Student stu = control.getStudent(8);
        System.out.println("Student" + stu.getName() + " " + stu.getLastName());
        System.out.println("is studying the career of: " + stu.getCareer().getName());
        

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
//        Student stuTest = new Student(22, "Jonh", "Smith", new Date(), careerTest);
//        control.editStudenById(22, stuTest);
//        
//        System.out.println("-----------------Group search-----------");
//        ArrayList<Student> students = control.getAllStudents();
//        for (Student student : students) {
//            System.out.println("Student" + student.toString());
//        }
//        System.out.println("-----------------------------------------");
    }
}
