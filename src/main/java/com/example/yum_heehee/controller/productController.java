package com.example.yum_heehee.controller;

import com.example.yum_heehee.model.Product;
import com.example.yum_heehee.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class productController {
    @Autowired
    ProductService productService;

    //End point to get all the customers
   @ResponseStatus(HttpStatus.OK)
    @GetMapping("/products")
    public  Iterable<Product> getAllProducts(){
      return productService.getAllProducts();
    }

    // EndPoint to add a new customer
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
       return productService.createProduct(product);
    }

    @ResponseStatus(HttpStatus.RESET_CONTENT)
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
       return productService.updateProduct(product);
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/product/{id}")
    public Product findProduct(@PathVariable int id){
        return productService.findProduct(id);
    }
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
       return productService.deleteProduct(id);
    }

}
