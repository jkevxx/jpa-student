package com.mycompany.jpatest.logic;

import com.mycompany.jpatest.persistence.PersistenceController;
import java.util.ArrayList;

public class Controller {

    PersistenceController persisControl = new PersistenceController();
    
    //------------------------- Student -------------------------
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
    
    //------------------------- Career -------------------------
    public void createCareer(Career career) {
        persisControl.createCareer(career);
    }
    
    public void deleteCareer(int id) {
        persisControl.deleteCareer(id);
    }
    
    public void editCareer(Career career) {
        persisControl.editCareer(career);
    }
    
    public Career getCareer(int id) {
        return persisControl.getCareer(id);
    }
    
    public ArrayList<Career> getAllCareers() {
        return persisControl.getAllCareers();
    }
    
    public void editCareerById(int id, Career career) {
        persisControl.editCareerById(id, career);
    }
    
    //------------------------- Subject -------------------------
    public void createSubject(Subject subject) {
        persisControl.createSubject(subject);
    }
    
    public void deleteSubject(int id) {
        persisControl.deleteSubject(id);
    }
    
    public void editSubject(Subject subject) {
        persisControl.editSubject(subject);
    }
    
    public Subject getSubject(int id) {
        return persisControl.getSubject(id);
    }
    
    public ArrayList<Subject> getAllSubjects() {
        return persisControl.getAllSubjects();
    }
    
}
