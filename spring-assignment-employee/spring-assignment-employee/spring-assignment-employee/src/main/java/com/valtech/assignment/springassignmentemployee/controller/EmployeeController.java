package com.valtech.assignment.springassignmentemployee.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.assignment.springassignmentemployee.model.DepartmentModel;
import com.valtech.assignment.springassignmentemployee.model.EmployeeModel;
import com.valtech.assignment.springassignmentemployee.service.DepartmentService;
import com.valtech.assignment.springassignmentemployee.service.EmployeeService;




@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("/emplist")
	public String EmployeeList(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployee().stream().map(emp->new EmployeeModel(emp)).collect(Collectors.toList()));
		return "/emplist";
	}
	
	
	@PostMapping(path = "/save",params = "submit")
	public String createEmployee(@ModelAttribute EmployeeModel employeeModel ,@RequestParam("submit") String submit,Model model) {
		if(submit.equals("create")) {
			employeeService.createEmployee(employeeModel.getEmployee());
		}
		model.addAttribute("employees",employeeService.getAllEmployee().stream().map(emp->new EmployeeModel(emp)).collect(Collectors.toList()));
		
		return "/emplist";
		
	}
	
	@GetMapping("/newEmployee")
	public String EmployeeDetails() {
		return "/newEmployee";
		
	}
	
	@GetMapping("/departlist")
	public String DepartmentDetails(Model model) {
		model.addAttribute("departments",departmentService.getAllDepartment().stream().map(dep->new DepartmentModel(dep)).collect(Collectors.toList()));
		System.out.println("........"+departmentService.getAllDepartment().stream().map(dep->new DepartmentModel(dep)).collect(Collectors.toList()));
		return "/departlist";
	}
	
	@GetMapping("/departEmpl")
	public String departmentEmployee(@RequestParam("deptId") long deptId,Model model) {
		model.addAttribute("employees",employeeService.getEmployeesByDepartment(deptId));
		return "/departEmpl";
		
	}
	


}

