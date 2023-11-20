package com.example.yum_heehee.services;

import com.example.yum_heehee.model.CustomerOrder;
import com.example.yum_heehee.repository.CustomerOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerOrderService {
    @Autowired
    private CustomerOrderRepo customerOrderRepo;

    public List<CustomerOrder> getAllCustomerOrders(){
        return (List<CustomerOrder>) customerOrderRepo.findAll();
    }

    public String createCustomerOrder(CustomerOrder customerOrder){
        customerOrderRepo.save(customerOrder);
        return "New customer order added to database.";
    }

    public CustomerOrder findCustomerOrder(Integer id){
        return customerOrderRepo.findById(id).orElse(null);
    }

    public String deleteCustomerOrder(Integer id){
        customerOrderRepo.deleteById(id);
        return "Customer Order has been deleted from database.";
    }

    public CustomerOrder updateCustomerOrder(CustomerOrder customerOrder){
        // find the current customer
        Optional<CustomerOrder> optionalOrder = customerOrderRepo.findById(customerOrder.getCustomerOrder());
        // make the desired changes
        CustomerOrder oldOrder = null;
        if(optionalOrder.isPresent()){
            oldOrder = optionalOrder.get();
            oldOrder.setPhoneNo(customerOrder.getPhoneNo());
            oldOrder.setEmployeeId(customerOrder.getEmployeeId());
            customerOrderRepo.save(oldOrder);
        }else{
            return new CustomerOrder();
        }
        return oldOrder;
    }       
}
