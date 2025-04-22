package com.neo.strider.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter@Setter
@ToString

public class product {
    private int id;
    private String productName;
    private int price;
}
