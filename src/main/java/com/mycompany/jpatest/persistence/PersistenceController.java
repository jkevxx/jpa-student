
package com.mycompany.jpatest.persistence;

import com.mycompany.jpatest.logic.Student;
import com.mycompany.jpatest.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenceController {
    StudentJpaController stuJpa = new StudentJpaController();

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
        
        ArrayList<Student> arrayStudent = new ArrayList<Student> (list);
        
        return arrayStudent;
    }
    
    public void editStudenById(int id, Student stuTest) {
        Student studentFound = stuJpa.findStudent(id);
        studentFound.setName(stuTest.getName());
        studentFound.setLastName(stuTest.getLastName());
        studentFound.setBirthday(stuTest.getBirthday());
        this.editStudent(studentFound);
    }
    
}
