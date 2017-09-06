package com.igt.shoppingcart.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;


@Document
public class Product {

	@Id
    private BigInteger id;

  
    private String name;

    
    private String description;

   
    private Integer quantity;

   
    private Double unitPrice;

    @DBRef
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();

    public Product(){

    }

    public Product(Double unitPrice, Integer quantity, String description, String name) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.description = description;
        this.name = name;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
