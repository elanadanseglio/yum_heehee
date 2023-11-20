package com.example.yum_heehee.services;

import com.example.yum_heehee.model.OrderList;
import com.example.yum_heehee.repository.OrderListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderListService {
    @Autowired
    private OrderListRepo orderListRepo;

    public List<OrderList> getAllOrderLists(){
        return (List<OrderList>) orderListRepo.findAll();
    }

    public String createOrderList(OrderList orderList){
        orderListRepo.save(orderList);
        return "New orderList added to database.";
    }

    public OrderList findOrderList(Integer id){
        return orderListRepo.findById(id).orElse(null);
    }

    public String deleteOrderList(Integer id){
        orderListRepo.deleteById(id);
        return "orderList has been deleted from database.";
    }
    public OrderList updateOrderList(OrderList orderList){
        // find the current orderlist
        Optional<OrderList> optionalOrderList = orderListRepo.findById(orderList.getProductId());
        // make the desired changes
        OrderList oldOrderList = null;
        if(optionalOrderList.isPresent()){
             oldOrderList = optionalOrderList.get();
             oldOrderList.setOrderIndex(orderList.getOrderIndex());
             oldOrderList.setOrderNumber(orderList.getOrderNumber());
             oldOrderList.setProductID(orderList.getProductId());
             oldOrderList.setQuantity(orderList.getQuantity());
             orderListRepo.save(oldOrderList);
        }else{
             return new OrderList();
        }
        return oldOrderList;     
    }
}
