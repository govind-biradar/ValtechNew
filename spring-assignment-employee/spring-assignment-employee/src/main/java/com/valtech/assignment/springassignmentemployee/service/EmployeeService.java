package com.valtech.assignment.springassignmentemployee.service;

import java.util.List;

import com.valtech.assignment.springassignmentemployee.entites.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee emp);
	
	Employee updateEmployee(Employee emp);
	
	List<Employee> getAllEmployee();
	
	

}
