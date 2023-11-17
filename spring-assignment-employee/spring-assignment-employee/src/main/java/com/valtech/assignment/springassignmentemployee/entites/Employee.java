package com.valtech.assignment.springassignmentemployee.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private int age;
	private int seniority;
	private int experience;
	private float salary;
	
	
	
	
	public Employee() {
		
	}
	
	
	
	


	public Employee(int eid, String name, int age, int seniority, int experience, float salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.seniority = seniority;
		this.experience = experience;
		this.salary = salary;
	}






	public Employee(String name, int age, int seniority, int experience, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.seniority = seniority;
		this.experience = experience;
		this.salary = salary;
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		eid = eid;
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




	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", seniority=" + seniority + ", experience="
				+ experience + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
