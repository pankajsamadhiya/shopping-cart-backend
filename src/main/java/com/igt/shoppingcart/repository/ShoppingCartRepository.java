package com.igt.shoppingcart.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.igt.shoppingcart.domain.ShoppingCart;

import java.util.List;


public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByStatus(String status);
}
