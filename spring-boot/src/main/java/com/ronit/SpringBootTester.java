package com.ronit;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ronit.beans.MySingleton;
import com.ronit.beans.Product;
import com.ronit.beans.ProductsRepository;

@SpringBootApplication //@Configuration + @ComponentScan
public class SpringBootTester {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTester.class);
		System.out.println(context.getBean(MySingleton.class));
		System.out.println(context.getBean(MySingleton.class));
		ProductsRepository repository = context.getBean(ProductsRepository.class);
		System.out.println(repository.getById(4));
		Product product = new Product(0, "", 0);
		repository.save(product);

	}
	
	

}
