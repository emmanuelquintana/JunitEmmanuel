package com.example.actividad.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.actividad.entity.ent_category;
import com.example.actividad.services.cat_service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/categories")
public class cat_controller {
    private final cat_service categoryService;
    public cat_controller(cat_service categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    public List<ent_category> getAllCategories() {
        return categoryService.getAllCategories();
    }
    @GetMapping("/{id}")
    public Optional<ent_category> getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }
    @PostMapping
    public ent_category createCategory(@RequestBody ent_category category) {
        return categoryService.createCategory(category);
    }
    @PutMapping("/{id}")
    public ent_category updateCategory(@PathVariable int id, @RequestBody ent_category category) {
        return categoryService.updateCategory(id, category);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryService.deleteCategory(id);
    }
}
