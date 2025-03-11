package com.spring.webjpa.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.mysql.cj.jdbc.Driver;
import com.spring.webjpa.dto.F1DriverDTO;
import com.spring.webjpa.entity.F1Driver;
import com.spring.webjpa.service.F1DriverService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class F1DriverController {
	
	@Autowired
	F1DriverService f1DriverService;
	
	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping("/driver")
	public List<F1DriverDTO> getAllF1Drivers(){
		List<F1Driver> drivers= f1DriverService.getAllF1Driver();
		return  drivers.stream().map(d ->modelMapper.map(d, F1DriverDTO.class )).toList();
	}
	@GetMapping("/driver/{id}")
	public F1DriverDTO getDriver(@PathVariable("id") Integer id) {
		return modelMapper.map(f1DriverService.getF1Driver(id), F1DriverDTO.class);
	}
	@PostMapping("/driver")
	public ResponseEntity<String> addF1Driver(@RequestBody F1DriverDTO f1driver){
		F1Driver f1d= modelMapper.map(f1driver,F1Driver.class);
		f1DriverService.addF1Driver(f1d);
		return new ResponseEntity<String>("Inserted/Created",HttpStatus.CREATED);
	}
	@PutMapping("/driver/{id}")
	public ResponseEntity<String> updateF1Driver(@PathVariable("id") Integer id,@RequestBody F1DriverDTO f1driver){
		f1DriverService.updateF1DriverTeam(id, modelMapper.map(f1driver, F1Driver.class));
		return new ResponseEntity<String>("updated",HttpStatus.OK);
	}
	@DeleteMapping("/driver/{id}")
	public String deleteF1Driver(@PathVariable("id")Integer id) {
		f1DriverService.deleteF1Driver(id);
		return "Successfully deleted";
	}
}
