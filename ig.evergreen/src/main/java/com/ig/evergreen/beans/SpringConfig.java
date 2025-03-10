package com.ig.evergreen.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	@Bean
	@Scope("prototype") 
	//making non singleton i.e different address
	public Customer customer() {
		//return new Customer();
		/* return new Customer("joker","why so serious"); */
		Customer c= new Customer();
		c.setEmail("phantom");
		c.setName("darkknight");
		return c;
	}
	@Bean
	//@Scope("prototype")
	public Order order() {
		return new Order(1,909.99);
	}
}
