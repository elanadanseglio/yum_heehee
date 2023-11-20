package com.example.yum_heehee.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.yum_heehee.model.CustomerOrder;

public interface CustomerOrderRepo extends CrudRepository<CustomerOrder, Integer>{
    
}
