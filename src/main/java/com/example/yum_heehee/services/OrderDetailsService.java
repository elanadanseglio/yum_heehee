package com.example.yum_heehee.services;

import com.example.yum_heehee.model.OrderDetails;
import com.example.yum_heehee.repository.OrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailsService {
    @Autowired
    private OrderDetailRepo orderDetailsRepo;

    public List<OrderDetails> getAllOrderDetails(){
        return (List<OrderDetails>) orderDetailsRepo.findAll();
    }

    public String createOrderDetails(OrderDetails OrderDetails){
        orderDetailsRepo.save(OrderDetails);
        return "The order's details have been added to database.";
    }

    public OrderDetails findOrderDetails(Integer id){
        return orderDetailsRepo.findById(id).orElse(null);
    }

    public String deleteOrderDetails(Integer id){
        orderDetailsRepo.deleteById(id);
        return "The order's details have been deleted from database.";
    }   
    
    public OrderDetails updateOrderDetails(OrderDetails orderDetails){

        Optional<OrderDetails> optionalDetails = orderDetailsRepo.findById(orderDetails.getOrderNumber());
        // make the desired changes
         OrderDetails oldDetails = null;
         if(optionalDetails.isPresent()){
            oldDetails = optionalDetails.get();
            oldDetails.setOrderNumber(orderDetails.getOrderNumber());
            oldDetails.setCustomerOrder(orderDetails.getCustomerOrder());
            oldDetails.setTotalPrice(orderDetails.getTotalPrice());
            orderDetailsRepo.save(oldDetails);
         }else{
             return new OrderDetails();
         }
        return oldDetails;
    }
    
}
