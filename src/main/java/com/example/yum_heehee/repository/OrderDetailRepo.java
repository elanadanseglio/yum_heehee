package com.example.yum_heehee.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.yum_heehee.model.OrderDetails;

public interface OrderDetailRepo extends CrudRepository<OrderDetails, Integer>{
    
}
