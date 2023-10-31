package com.mycompany.jpatest.logic;

import com.mycompany.jpatest.persistence.PersistenceController;

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
}
