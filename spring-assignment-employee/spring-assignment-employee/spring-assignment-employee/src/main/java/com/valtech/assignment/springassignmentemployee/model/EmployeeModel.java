package com.valtech.assignment.springassignmentemployee.model;



import java.util.List;

import com.valtech.assignment.springassignmentemployee.entites.Department;
import com.valtech.assignment.springassignmentemployee.entites.Employee;


public class EmployeeModel {

	private long eid;
	private String name;
	private int age;
	private int seniority;
	private int experience;
	private float salary;
	private long deptId;
	private Department department;
	
	
	
	public EmployeeModel() {
		
	}
	
	
	
	
	public EmployeeModel(Employee emp) {
		this.eid = emp.getEid();
		this.name = emp.getName();
		this.age = emp.getAge();
		this.seniority = emp.getSeniority();
		this.experience = emp.getExperience();
		this.salary = emp.getSalary();
		this.department=emp.getDepartment();
	}


	public Employee getEmployee() {
		return new Employee(eid, name, age, seniority, experience, salary,department);
	}
	


	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


	
	
	
	
	
}
