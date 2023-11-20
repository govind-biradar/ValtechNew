package com.valtech.assignment.springassignmentemployee.repo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.assignment.springassignmentemployee.entites.Employee;

@Repository
public interface employeeRepo extends JpaRepository<Employee, Long>{
	
	List<Employee> findAllByEid(int eid);

	List<Employee> findByDepartment(Long deptId);
	
	


}

