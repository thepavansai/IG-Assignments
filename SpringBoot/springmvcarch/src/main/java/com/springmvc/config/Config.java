package com.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration
@EnableWebMvc
@ComponentScan( basePackages = {"com.springmvc"})
public class Config {
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver res= new InternalResourceViewResolver();
		res.setViewClass(JstlView.class);
		res.setPrefix("WEB-INF/views/");
		res.setSuffix(".jsp");
		return res;
	}
}
