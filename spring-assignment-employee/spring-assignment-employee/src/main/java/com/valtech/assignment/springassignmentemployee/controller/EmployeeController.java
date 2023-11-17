package com.valtech.assignment.springassignmentemployee.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.valtech.assignment.springassignmentemployee.model.EmployeeModel;
import com.valtech.assignment.springassignmentemployee.service.EmployeeService;



@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emplist")
	public String EmployeeList(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployee().stream().map(emp->new EmployeeModel(emp)).collect(Collectors.toList()));
		return "/emplist";
	}

}
//.map(o->new OrderModel(o)).collect(Collectors.toList())
