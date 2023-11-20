package com.example.yum_heehee.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.yum_heehee.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
    
}
