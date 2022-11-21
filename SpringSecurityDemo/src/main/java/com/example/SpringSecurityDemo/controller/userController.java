package com.example.SpringSecurityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class userController {

	@GetMapping("/home")
	public String getUserString() {
		return "User can access";
	}
	
	@GetMapping("/admin")
	public String getAdminString() {
		return "admin can access";
	}
}
