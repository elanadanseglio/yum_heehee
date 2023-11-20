package com.example.yum_heehee.services;

import com.example.yum_heehee.model.Product;
import com.example.yum_heehee.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts(){
        return (List<Product>) productRepo.findAll();
    }

    public String createProduct(Product Product){
        productRepo.save(Product);
        return "New Product added to database.";
    }

    public Product findProduct(Integer id){
        return productRepo.findById(id).orElse(null);
    }

    public String deleteProduct(Integer id){
        productRepo.deleteById(id);
        return "Product has been deleted from database.";
    }
    public Product updateProduct(Product product){
        // find the current customer
        Optional<Product> optionalProduct = productRepo.findById(product.getProductId());
        // make the desired changes
         Product oldProduct = null;
         if(optionalProduct.isPresent()){
             oldProduct = optionalProduct.get();
             oldProduct.setProductId(product.getProductId());
             oldProduct.setName(product.getName());
             oldProduct.setPrice(product.getPrice());
             productRepo.save(oldProduct);
         }else{
             return new Product();
         }
        return oldProduct;     
    }
    
}
