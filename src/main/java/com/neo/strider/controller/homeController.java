package com.neo.strider.controller;

import com.neo.strider.model.product;
import com.neo.strider.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class homeController {

    @Autowired
    productService productservice;

//    @GetMapping("/")
//    public String hello(){
//        return "Hello World!";
//    }

    @GetMapping("/products")
    public List<product> getpro(){
        return productservice.getproducts();
    }
}
