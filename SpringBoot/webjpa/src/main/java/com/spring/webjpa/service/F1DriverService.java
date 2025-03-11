package com.spring.webjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.webjpa.entity.F1Driver;
import com.spring.webjpa.repository.F1DriverRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class F1DriverService {
	@Autowired
	F1DriverRepo f1DriverRepo;
	
	public void addF1Driver(F1Driver f1driver) {
		f1DriverRepo.save(f1driver);
	}
	
	public List<F1Driver> getAllF1Driver(){
		return (List<F1Driver>) f1DriverRepo.findAll();
	}
	
	public F1Driver getF1Driver(Integer id) {
		return f1DriverRepo.findById(id).get();
	}
	
	public void updateF1DriverTeam(Integer id, F1Driver f1driver) {
		F1Driver f1d=f1DriverRepo.findById(id).get();
		f1d.setTeam(f1driver.getTeam());
	}
	public void deleteF1Driver(Integer id) {
		f1DriverRepo.deleteById(id);
	}
	
	
	

}
