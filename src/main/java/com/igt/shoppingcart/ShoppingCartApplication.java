package com.igt.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.igt.shoppingcart.service.ProductService;
import com.igt.shoppingcart.service.UserService;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ShoppingCartApplication.class, args);

		ProductService productService = applicationContext.getBean(ProductService.class);
		productService.saveInitialBatch();

		UserService userService = applicationContext.getBean(UserService.class);
		userService.saveInitialBatch();


	}
}
