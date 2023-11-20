package com.example.yum_heehee.controller;
import com.example.yum_heehee.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.example.yum_heehee.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class employeeController {
    @Autowired
    EmployeeService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/employee")
    public Iterable<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/getEmployee/{id}")
    public Employee findEmployee(@PathVariable Integer id){
       return service.findEmployee(id);
    }
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
       return service.deleteEmployee(id);
    }

    @ResponseStatus(HttpStatus.RESET_CONTENT)
    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
       return service.updateEmployee(employee);
    }

}
