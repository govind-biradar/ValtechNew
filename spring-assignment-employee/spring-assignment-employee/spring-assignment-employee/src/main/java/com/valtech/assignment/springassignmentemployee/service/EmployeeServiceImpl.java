package com.valtech.assignment.springassignmentemployee.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.assignment.springassignmentemployee.entites.Department;
import com.valtech.assignment.springassignmentemployee.entites.Employee;
import com.valtech.assignment.springassignmentemployee.model.EmployeeModel;
import com.valtech.assignment.springassignmentemployee.repo.employeeRepo;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private employeeRepo employeeRepo;
	
	@PostConstruct
	public void populateEmployee() {
//		employeeRepo.save(new Employee("Govind",22, 10,2, 550000);
	}
	

	@Override
	public Employee createEmployee(Employee employee) {
		System.out.println("<<<<<<<<<<<<<"+employeeRepo.getClass().getName());
		return employeeRepo.save(employee);
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}


	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}


	@Override
	public Employee getEmployee(Long eid) {
		
		return employeeRepo.getReferenceById(eid);
	}
	
	@Override
	public List<EmployeeModel> getEmployeesByDepartment(Long deptId) {
        List<Employee> employees = employeeRepo.findByDepartment(deptId);
        return employees.stream()
                .map(EmployeeModel::new)
                .collect(Collectors.toList());
    }


	

}
