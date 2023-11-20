package com.example.yum_heehee.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.yum_heehee.model.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{
    
}
