package com.valtech.assignment.springassignmentemployee.service;

import java.util.List;

import com.valtech.assignment.springassignmentemployee.entites.Department;
import com.valtech.assignment.springassignmentemployee.entites.Employee;

public interface DepartmentService {
	
	Department createDepartment(Department dept);
	
	Department updateDepartment(Department dept);

	List<Department> getAllDepartment();

;
	
	
	

}