package com.example.actividad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.actividad.entity.ent_product;


public interface repo_product extends JpaRepository<ent_product, Integer> {


    
}
