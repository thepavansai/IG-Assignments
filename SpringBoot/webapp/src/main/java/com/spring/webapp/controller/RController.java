package com.spring.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {
	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome Chief..";
	}
	@GetMapping("/supra")
	public String getSupra() {
		return "<center><h1>RATATATATA!!!!!</h1></center>";
	}
}
