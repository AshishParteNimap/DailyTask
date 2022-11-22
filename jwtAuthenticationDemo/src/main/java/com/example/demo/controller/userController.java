package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class userController {

	@GetMapping("/hello")
	public String getMessg() {
		return "hello guys";
	}
}
