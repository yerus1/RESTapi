package com.neo.strider.service;

import com.neo.strider.model.product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class productService {


    List<product> productList = Arrays.asList(
             new product(100,"Nothing phone1",1001)
            ,new product(101,"Nothing charger",1002)
            ,new product(102,"Nothing earphones",1003));

    public List<product> getproducts(){
        return productList;
    }
}
