package com.mycompany.jpatest;

import com.mycompany.jpatest.logic.Controller;
import com.mycompany.jpatest.logic.Student;
import java.util.Date;

public class JpaTest {
    
    public static void main(String[] args) {
        
        Controller control = new Controller();

        Student stu = new Student(16, "Jihyo", "Parker", new Date());
        control.createStudent(stu);
//        control.deleteStudent(16);
        stu.setLastName("Park");
        control.editStudent(stu);
    }
}
