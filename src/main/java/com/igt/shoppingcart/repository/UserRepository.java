package com.igt.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.igt.shoppingcart.domain.User;


public interface UserRepository extends CrudRepository<User, Long> {
}
