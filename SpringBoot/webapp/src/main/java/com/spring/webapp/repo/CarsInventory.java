package com.spring.webapp.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.webapp.model.Cars;
@Repository
public class CarsInventory {
	static List<Cars> cars= new ArrayList<Cars>();
	
	public void addCar(Cars car) {
		cars.add(car);
	}
	
	public Cars getCar(Integer modelNo) {
		//Cars car= new Cars();
		for(Cars x: cars) {
			if(x.getModelNo().equals(modelNo)) {
				return x;
			}
		}
		return null; 
	}
	
	public List<Cars> getAllCars(){
		return cars;
	}
	
	public Cars updateCarDetails(Integer modelNo,Cars car) {
		for(Cars x:cars) {
			if(x.getModelNo().equals(modelNo)) {
				x.setPrice(car.getPrice());
				x.setCompany(car.getCompany());
				x.setName(car.getName());
				return x;
			}
		}
		return null;  
	}
	
	public String removeCars(Integer modelNo) {
		return cars.removeIf(x->x.getModelNo().equals(modelNo))? "Removed From Database" :"Car not found with modelNo"+modelNo;
	}
}
