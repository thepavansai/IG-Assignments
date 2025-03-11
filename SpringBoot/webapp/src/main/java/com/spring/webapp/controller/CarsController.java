package com.spring.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.webapp.model.Cars;
import com.spring.webapp.service.CarsService;

@RestController
public class CarsController {
	
	@Autowired
	CarsService carsService;
	@PostMapping("/cars")
	public String addCar(@RequestBody Cars car) {
		carsService.addCar(car);
		return "Successfull";
	}
	@GetMapping("/cars")
	public  List<Cars> getCars(){
		return carsService.getAllCars();
	}
	@GetMapping("/cars/{modelNo}")
	public Cars getCar(@PathVariable("modelNo") Integer modelNo) {
		return carsService.getCar(modelNo);	
	}
	@PutMapping("cars/{modelNo}")
	public Cars updateCars(@PathVariable("modelNo") Integer modelNo,@RequestBody Cars car) {
		return carsService.updateCarDetails(modelNo, car);
	}
	@DeleteMapping("cars/{modelNo}")
	public String removeCar(@PathVariable("modelNo") Integer modelNo) {
		return carsService.removeCars(modelNo);
	}
}
