package com.mycompany.jpatest.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String type;
    
    @ManyToOne
    private Career caree;

    public Subject() {
    }

    public Subject(int id, String name, String type, Career caree) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.caree = caree;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Career getCaree() {
        return caree;
    }

    public void setCaree(Career caree) {
        this.caree = caree;
    }

}
