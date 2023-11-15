package com.valtech.training.springbootassignnment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("/hello")
	public String Hello() {
		System.out.println("hello...........");
		return "hello";
	}

}
