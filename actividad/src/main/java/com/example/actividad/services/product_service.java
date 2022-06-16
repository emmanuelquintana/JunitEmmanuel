package com.example.actividad.services;
import java.util.List;
import java.util.Optional;

import com.example.actividad.entity.ent_product;


public interface product_service {
    public List<ent_product> getproducts();
    public Optional<ent_product> getproductbyid(int id);
    public ent_product createproduct(ent_product product);
    public ent_product updateproduct(int id, ent_product product);
    public void deleteproduct(int id);

}
