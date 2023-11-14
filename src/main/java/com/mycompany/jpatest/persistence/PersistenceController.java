
package com.mycompany.jpatest.persistence;

import com.mycompany.jpatest.logic.Career;
import com.mycompany.jpatest.logic.Student;
import com.mycompany.jpatest.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenceController {
    StudentJpaController stuJpa = new StudentJpaController();
    CareerJpaController careerJpa = new CareerJpaController();
    
    // Student
    public void createStudent(Student student) {
        stuJpa.create(student);
    }
    
    public void deleteStudent(int idStudent) {
        try {
            stuJpa.destroy(idStudent);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editStudent(Student stu) {
        try {
            stuJpa.edit(stu);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Student getStudent(int id) {
        return stuJpa.findStudent(id);
    }
    
    public ArrayList<Student> getAllStudents() {
        List<Student> list = stuJpa.findStudentEntities();
        
        ArrayList<Student> arrayStudent = new ArrayList(list);
        
        return arrayStudent;
    }
    
    public void editStudenById(int id, Student stuTest) {
        Student studentFound = stuJpa.findStudent(id);
        
        if (studentFound != null) {
            studentFound.setName(stuTest.getName());
            studentFound.setLastName(stuTest.getLastName());
            studentFound.setBirthday(stuTest.getBirthday());
            this.editStudent(studentFound);
        } else {
            System.out.println("Student with Id " + id + "not found.");
        }
    }
    
    // Career
    public void createCareer(Career career) {
        careerJpa.create(career);
    }
    
    public void deleteCareer(int idCareer) {
        try {
            careerJpa.destroy(idCareer);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editCareer(Career career) {
        try {
            careerJpa.edit(career);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Career getCareer(int id) {
        return careerJpa.findCareer(id);
    }
    
    public ArrayList<Career> getAllCareers() {
        List<Career> list = careerJpa.findCareerEntities();
        
        ArrayList<Career> arrayCareer = new ArrayList(list);
        
        return arrayCareer;
    }
    
    public void editCareerById(int id, Career careerTest) {
        Career careerFound = careerJpa.findCareer(id);
        
        if (careerFound != null) {
            careerFound.setName(careerTest.getName());
            this.editCareer(careerFound);
        } else {
            System.out.println("Career with Id " + id + "not found.");
        }
    }
}
