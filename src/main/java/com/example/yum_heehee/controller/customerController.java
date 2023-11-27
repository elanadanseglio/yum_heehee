package com.example.yum_heehee.controller;

import com.example.yum_heehee.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.example.yum_heehee.services.CustomerService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class customerController {
    @Autowired
    CustomerService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/customers")
    public Iterable<Customer> getAllCustomers(){
        return service.getAllCustomers();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer customer) {
        return service.createCustomer(customer);
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/getCustomer/{id}")
    public Customer findCustomer(@PathVariable String id){
        return service.findCustomer(id); 
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable String id){
       return service.deleteCustomer(id);
    }

    @ResponseStatus(HttpStatus.RESET_CONTENT)
    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer){
       return service.updateCustomer(customer);
    }

}
