package com.valtech.assignment.springassignmentemployee.repo;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.assignment.springassignmentemployee.entites.Department;

@Repository
public interface departRepo extends JpaRepository<Department, Long> {
	


}
