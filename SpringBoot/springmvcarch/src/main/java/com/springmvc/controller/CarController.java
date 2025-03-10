package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Car;

@Controller

public class CarController {
	@RequestMapping("/cars")
	public String handler(Model model) {
		Car cars= new Car();
		cars.setCompany("Audi");
		cars.setModel("RS6");
		cars.setYear(2017);
		model.addAttribute("cars", cars);
		return "cars";
		
	}
	
	
	
	
}
