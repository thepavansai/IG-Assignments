package com.spring.webapp.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RestController;

//import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@RestController
public class NController {
//	@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping("/")
	public String show() {
		return "<h1>Index</h1>";
	}
//	@RequestMapping(value="/add",method = RequestMethod.POST)
	@PostMapping("/add")
	public String Post() {
		return "POST Mapping";
	}
	@PutMapping("/update")
//	@RequestMapping(value = "/update",method = RequestMethod.PUT)
	public String put() {
		return "update or put";
	}
	@DeleteMapping("/del/{id}")
//	@RequestMapping(value = "/del",method = RequestMethod.DELETE)
	public String delete() {
		
		return"delete method";
	}
	
}
