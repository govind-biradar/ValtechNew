package com.valtech.assignment.springassignmentemployee.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.assignment.springassignmentemployee.entites.Department;
import com.valtech.assignment.springassignmentemployee.entites.Employee;
import com.valtech.assignment.springassignmentemployee.repo.departRepo;
import com.valtech.assignment.springassignmentemployee.repo.employeeRepo;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private departRepo departRepo;
	
	@Autowired
	private employeeRepo employeeRepo;
	
	@PostConstruct
	public void populate() {
		departRepo.save(new Department("Developer", "Training Room"));
		Department d = new Department("Backend","Training room");
		departRepo.save(d);
		employeeRepo.save(new Employee("Amar", 25, 3, 10,60000, d));
	}
	
	

	@Override
	public Department createDepartment(Department dept) {
	return departRepo.save(dept);
	}

	@Override
	public Department updateDepartment(Department dept) {
		return departRepo.save(dept);
	}







	@Override
	public List<Department> getAllDepartment() {
		
		return departRepo.findAll();
	}

}
