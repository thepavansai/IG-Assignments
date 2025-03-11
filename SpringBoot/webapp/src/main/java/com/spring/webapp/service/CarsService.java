package com.spring.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.webapp.model.Cars;
import com.spring.webapp.repo.CarsInventory;

@Service
public class CarsService {
	
	@Autowired
	CarsInventory cars;
	public void addCar(Cars car) {
		cars.addCar(car);
	}
	public Cars getCar(Integer modelNo) {
		return cars.getCar(modelNo);
	}
	public List<Cars> getAllCars(){
		return cars.getAllCars();
	}
	public Cars updateCarDetails(Integer modelNo,Cars car) {
		return cars.updateCarDetails(modelNo, car);
	}
	
	public String removeCars(Integer modelNo) {
		return cars.removeCars(modelNo);
	}
}
