package com.example.actividad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class ent_category {

    
  

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
  
    
    @Column(name = "category_id")
    private int id;

    @Column(name = "category_name")
    private String name;


    public ent_category() {
    }

    public ent_category(int id, String name) {
        this.id = id;
        this.name = name;
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


    
}
