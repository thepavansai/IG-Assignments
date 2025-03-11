package com.spring.webjpa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebjpaApplication {
	@Bean
	public ModelMapper modelMap() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(WebjpaApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
