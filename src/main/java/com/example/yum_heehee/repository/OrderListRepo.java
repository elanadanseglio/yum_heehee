package com.example.yum_heehee.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.yum_heehee.model.OrderList;

public interface OrderListRepo extends CrudRepository<OrderList, Integer>{
    
}
