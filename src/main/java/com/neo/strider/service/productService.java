package com.neo.strider.service;

import com.neo.strider.model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class productService {


    List<product> productList = new ArrayList<>(Arrays.asList(
             new product(100,"Nothing phone1",1001)
            ,new product(101,"Nothing charger",1002)
            ,new product(102,"Nothing earphones",1003)));

    public List<product> getproducts(){
        return productList;
    }

    public product getprobyID(int prodIt){
        for(product pro:productList){
            if(pro.getId()==prodIt){
                return pro;
            }
        }
        return null;
    }

    public product addproduct(product prod) {
        productList.add(prod);
        return prod;
    }


    public product updateproduct(product prod) {
        int index=0;
        for (int i=0;i<productList.size();i++){
            if(productList.get(i).getId()==prod.getId()){
                index=i;
            }
        }
        return productList.set(index,prod);
    }

    public void deleteById(int prodIt) {
        int index=0;
        for (int i=0;i<productList.size();i++){
            if(productList.get(i).getId()==prodIt){
                index=i;
            }
        }
        productList.remove(index);
    }
}
