package com.example.actividad;

import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.actividad.entity.ent_product;
import com.example.actividad.services.product_service;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)

public class test_category {

    @Autowired
    private product_service productService;

    @Test
    @Rollback(false)
    
    public void testCreateProduct() {
        ent_product product = new ent_product(10550,"ProductoTest", "DescripcionTest",10.50, 10, 1);
        productService.createproduct(product);
        assertNotNull(product);

    }
    @Test
    @Rollback(false)
    public void testUpdateProduct() {
        ent_product product = new ent_product(10550, "ProductoTest", "DescripcionTest", 10.50, 10,1);
        productService.updateproduct(10550, product);
        assertNotNull(product);
    }
    @Test
    @Rollback(false)
    public void testDeleteProduct() {
        ent_product product = new ent_product(10550, "ProductoTest", "DescripcionTest",10.5,10, 1);
        productService.deleteproduct(10550);
        assertNotNull(product);
    }
    @Test
    @Rollback(false)
    public void testGetProductById() {
        ent_product product = new ent_product(10550,"ProductoTest", "DescripcionTest",10.50, 10,1);
        productService.getproductbyid(10550);
        assertNotNull(product);
    }
    
}
