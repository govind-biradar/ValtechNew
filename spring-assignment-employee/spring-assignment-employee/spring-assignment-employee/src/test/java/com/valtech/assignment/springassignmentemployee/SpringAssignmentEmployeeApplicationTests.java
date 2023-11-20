package com.valtech.assignment.springassignmentemployee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.assignment.springassignmentemployee.entites.Employee;
import com.valtech.assignment.springassignmentemployee.service.DepartmentService;
import com.valtech.assignment.springassignmentemployee.service.EmployeeService;

@SpringBootTest
class SpringAssignmentEmployeeApplicationTests {
	
	@Autowired
	private EmployeeService empService;
	@Autowired
	private DepartmentService departmentService;
	

	@Test
	void testEmployee() {
//		Employee e = empService.createEmployee(new Employee("Amar",29, 3, 12, 25353,1));
//		System.out.println("..........................."+departmentService.getAllDepartment().stream().map(dep->new DepartmentModel(dep)).collect(Collectors.toList())+"111");
		assertTrue(empService.getAllEmployee().size()>0);
	}
	
	@Test
	void contextLoads() {
		
	}

}
