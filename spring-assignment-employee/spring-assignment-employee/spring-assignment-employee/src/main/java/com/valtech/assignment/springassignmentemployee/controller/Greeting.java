package com.valtech.assignment.springassignmentemployee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greeting {
	
//	@RequestMapping(method = RequestMethod.GET,path="/greet")
	@GetMapping("/greet")
	public String hello(@RequestParam("name") String name,Model model) {
		System.out.println("Name"+name);
		model.addAttribute("name",name);
		
		return "greet";
		
	}

}
