package com.igt.shoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.igt.shoppingcart.domain.Product;


public interface ProductRepository extends MongoRepository<Product, Long> {

}
