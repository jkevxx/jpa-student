package com.mycompany.jpatest.logic;

import com.mycompany.jpatest.persistence.PersistenceController;
import java.util.ArrayList;

public class Controller {

    PersistenceController persisControl = new PersistenceController();

    public void createStudent(Student student) {
        persisControl.createStudent(student);
    }

    public void deleteStudent(int id) {
        persisControl.deleteStudent(id);
    }
    
    public void editStudent(Student stu) {
        persisControl.editStudent(stu);
    }
    
    public Student getStudent(int id) {
        return persisControl.getStudent(id);
    }
    
    public ArrayList<Student> getAllStudents() {
        return persisControl.getAllStudents();
    }
    
    public void editStudenById(int id, Student student) {
        persisControl.editStudenById(id, student);
    }
}
