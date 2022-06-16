package com.example.actividad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.actividad.entity.ent_category;



@Repository
public interface repo_category extends JpaRepository<ent_category, Integer>{
    
}
