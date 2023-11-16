
package com.mycompany.jpatest.logic;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Career implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String name;
    
    @OneToMany (mappedBy = "caree")
    private LinkedList<Subject> subjectList;
    
    public Career(){
    }

    public Career(int id, String name, LinkedList<Subject> subjectList) {
        this.id = id;
        this.name = name;
        this.subjectList = subjectList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(LinkedList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
    
}
