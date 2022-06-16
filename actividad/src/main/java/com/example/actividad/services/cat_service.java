package com.example.actividad.services;

import java.util.List;
import java.util.Optional;

import com.example.actividad.entity.ent_category;

public interface cat_service {
    public List<ent_category> getAllCategories();
    public Optional<ent_category> getCategoryById(int id);
    public ent_category createCategory(ent_category category);
    public ent_category updateCategory(int id, ent_category category);
    public void deleteCategory(int id);
    
}
