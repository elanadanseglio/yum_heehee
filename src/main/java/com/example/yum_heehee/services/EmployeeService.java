package com.example.yum_heehee.services;

import com.example.yum_heehee.model.Employee;
import com.example.yum_heehee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees(){
        return (List<Employee>) employeeRepo.findAll();
    }

    public String createEmployee(Employee employee){
        employeeRepo.save(employee);
        return "New employee added to database.";
    }

    public Employee findEmployee(Integer id){
        return employeeRepo.findById(id).orElse(null);
    }
    
    public String deleteEmployee(Integer id){
        employeeRepo.deleteById(id);
        return "Customer has been deleted from database.";
    }

    public Employee updateEmployee(Employee employee){
        // find the current customer
        Optional<Employee> optionalEmployee = employeeRepo.findById(employee.getEmployeeId());
        // make the desired changes
         Employee oldEmployee = null;
         if(optionalEmployee.isPresent()){
             oldEmployee = optionalEmployee.get();
             oldEmployee.setEmployeeID(employee.getEmployeeId());
             oldEmployee.setName(employee.getName());
             oldEmployee.setActiveStatus(employee.getActiveStatus());
             employeeRepo.save(oldEmployee);
         }else{
             return new Employee();
         }
        return oldEmployee;
    }
}
