package com.igt.shoppingcart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.igt.shoppingcart.ShoppingCartApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShoppingCartApplication.class)
@WebAppConfiguration
public class ShoppingCartApplicationTests {

	@Test
	public void contextLoads() {
	}

}
