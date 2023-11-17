package com.valtech.assignment.springassignmentemployee.model;



import com.valtech.assignment.springassignmentemployee.entites.Employee;


public class EmployeeModel {

	private int eid;
	private String name;
	private int age;
	private int seniority;
	private int experience;
	private float salary;
	
	
	public EmployeeModel() {
		
	}
	
	
	
	
	public EmployeeModel(Employee emp) {
		this.eid = emp.getEid();
		this.name = emp.getName();
		this.age = emp.getAge();
		this.seniority = emp.getSeniority();
		this.experience = emp.getExperience();
		this.salary = emp.getSalary();
	}


	public Employee getEmployee() {
		return new Employee(eid, name, age, seniority, experience, salary);
	}
	


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
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
	
	
	
	
	
}
