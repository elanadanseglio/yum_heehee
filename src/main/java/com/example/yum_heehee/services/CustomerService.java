package com.example.yum_heehee.services;

import com.example.yum_heehee.model.Customer;
import com.example.yum_heehee.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepo.findAll();
    }

    public String createCustomer(Customer customer){
        customerRepo.save(customer);
        return "New customer added to database.";
    }

    public Customer findCustomer(String id){
        return customerRepo.findById(id).orElse(null);
        //return customerRepo.findById(id);
    }

    public String deleteCustomer(String id){
        customerRepo.deleteById(id);
        return "Customer has been deleted from database.";
    }
    public Customer updateCustomer(Customer customer){
        // find the current customer
        Optional<Customer> optionalCustomer = customerRepo.findById(customer.getPhoneNo());
        // make the desired changes
         Customer oldCustomer = null;
         if(optionalCustomer.isPresent()){
             oldCustomer = optionalCustomer.get();
             oldCustomer.setPhoneNo(customer.getPhoneNo());
             oldCustomer.setName(customer.getName());
             oldCustomer.setAddress(customer.getAddress());
             oldCustomer.setZipCode(customer.getZipCode());
             customerRepo.save(oldCustomer);
         }else{
             return new Customer();
         }
        return oldCustomer;
    }

}
