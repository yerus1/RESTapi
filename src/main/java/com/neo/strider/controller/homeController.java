package com.neo.strider.controller;

import com.neo.strider.model.product;
import com.neo.strider.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class homeController {

    @Autowired
    productService productservice;

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/products")
    public List<product> getpro(){
        return productservice.getproducts();
    }

    @GetMapping("products/{prodIt}")
    public product getprodID(@PathVariable int prodIt){
      return productservice.getprobyID(prodIt);
    }

    @PostMapping("/products/addproduct")
    public product addproduct(@RequestBody product prod){
        return productservice.addproduct(prod);
    }

    @PutMapping("/products")
    public product updateproduct(@RequestBody product prod){
        return productservice.updateproduct(prod);
    }

    @DeleteMapping("products/{prodIt}")
    public void deleteById(@PathVariable int prodIt){
        productservice.deleteById(prodIt);
    }
}
