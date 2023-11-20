package com.valtech.assignment.springassignmentemployee.service;

import java.util.List;

import com.valtech.assignment.springassignmentemployee.entites.Employee;
import com.valtech.assignment.springassignmentemployee.model.EmployeeModel;

public interface EmployeeService {
	
	Employee createEmployee(Employee emp);
	
	Employee updateEmployee(Employee emp);
	
	
	List<Employee> getAllEmployee();

	Employee getEmployee(Long eid);

	List<EmployeeModel> getEmployeesByDepartment(Long depatId);
	


	
	
	

}
