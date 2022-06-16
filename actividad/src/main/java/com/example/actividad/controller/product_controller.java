package com.example.actividad.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.actividad.entity.ent_product;
import com.example.actividad.services.product_service;





@RestController
@RequestMapping("/products")
public class product_controller {

    private final product_service productService;


    public product_controller(product_service productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<ent_product> getAllProducts() {
        return productService.getproducts();
    }

    @GetMapping("/{id}")
    public Optional<ent_product> getProductById(@PathVariable int id) {
        return productService.getproductbyid(id);
    }
    @PostMapping
    public ent_product createProduct(@RequestBody ent_product product) {
        return productService.createproduct(product);
    }
    @PutMapping("/{id}")
    public ent_product updateProduct(@PathVariable int id, @RequestBody ent_product product) {
        return productService.updateproduct(id, product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteproduct(id);
    }



}
