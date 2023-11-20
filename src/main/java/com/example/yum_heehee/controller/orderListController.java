package com.example.yum_heehee.controller;

import com.example.yum_heehee.model.OrderList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.example.yum_heehee.services.OrderListService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class orderListController {
    @Autowired
    OrderListService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/orderList")
    public Iterable<OrderList> getAllOrderLists(){
        return service.getAllOrderLists();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addOrderList")
    public String addOrderList(@RequestBody OrderList orderList) {
        return service.createOrderList(orderList);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/getOrderList/{id}")
    public OrderList findOrderList(@PathVariable Integer id){
       return service.findOrderList(id);
    }
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/deleteOrderList/{id}")
    public String deleteOrderList(@PathVariable Integer id){
       return service.deleteOrderList(id);
    }

    @ResponseStatus(HttpStatus.RESET_CONTENT)
    @PutMapping("/updateOrderList")
    public OrderList updateOrderList(@RequestBody OrderList orderList){
       return service.updateOrderList(orderList);
    }
}
