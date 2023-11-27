package com.example.yum_heehee.controller;
import com.example.yum_heehee.model.OrderDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.example.yum_heehee.services.OrderDetailsService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class orderDetailController {
    @Autowired
    OrderDetailsService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/orderDetail")
    public Iterable<OrderDetails> getAllOrderDetails(){
        return service.getAllOrderDetails();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addOrderDetail")
    public String addOrderDetails(@RequestBody OrderDetails orderDetails) {
        return service.createOrderDetails(orderDetails);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/getOrderDetail/{id}")
    public OrderDetails findOrderDetails(@PathVariable Integer id){
       return service.findOrderDetails(id);
    }
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/deleteOrderDetails/{id}")
    public String deleteOrderDetails(@PathVariable Integer id){
       return service.deleteOrderDetails(id);
    }

    @ResponseStatus(HttpStatus.RESET_CONTENT)
    @PutMapping("/updateOrderDetails")
    public OrderDetails updateProduct(@RequestBody OrderDetails orderDetails){
       return service.updateOrderDetails(orderDetails);
    }
}
