package com.valtech.assignment.springassignmentemployee.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.assignment.springassignmentemployee.entites.Employee;
import com.valtech.assignment.springassignmentemployee.repo.employeeRepo;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private employeeRepo employeeRepo;
	
	@PostConstruct
	public void populateEmployee() {
		employeeRepo.save(new Employee("Govind",22, 10,2, 550000));
	}
	

	@Override
	public Employee createEmployee(Employee emp) {
		System.out.println("<<<<<<<<<<<<<"+employeeRepo.getClass().getName());
		return employeeRepo.save(emp);
	}


	@Override
	public Employee updateEmployee(Employee emp) {
		return employeeRepo.save(emp);
	}


	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

}
