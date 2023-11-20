package com.example.yum_heehee.controller;
import com.example.yum_heehee.model.CustomerOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.example.yum_heehee.services.CustomerOrderService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class customerOrderController {
    @Autowired
    CustomerOrderService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/customerOrder")
    public Iterable<CustomerOrder> getAllCustomerOrders(){
        return service.getAllCustomerOrders();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addCustomerOrder")
    public String addCustomerOrder(@RequestBody CustomerOrder customerOrder) {
        return service.createCustomerOrder(customerOrder);
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/getCustomerOrder/{id}")
    public CustomerOrder findCustomerOrder(@PathVariable Integer id){
       return service.findCustomerOrder(id);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/deleteCustomerOrder/{id}")
    public String deleteCustomerOrder(@PathVariable Integer id){
       return service.deleteCustomerOrder(id);
    }

    @ResponseStatus(HttpStatus.RESET_CONTENT)
    @PutMapping("/updateCustomerOrder")
    public CustomerOrder updateCustomerOrder(@RequestBody CustomerOrder customerOrder){
       return service.updateCustomerOrder(customerOrder);
    }



}
