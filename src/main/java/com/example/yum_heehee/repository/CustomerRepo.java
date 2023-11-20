package com.example.yum_heehee.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.yum_heehee.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, String>{
    
}
