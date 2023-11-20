package com.valtech.assignment.springassignmentemployee.entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eid;
	private String name;
	private int age;
	private int seniority;
	private int experience;
	private float salary;
	
	@ManyToOne
	@JoinColumn(name = "Department_id",referencedColumnName = "deptId")
	private Department department;
	
	
	
	
	public Employee() {
		
	}
	

	
	
	public Employee(long eid, String name, int age, int seniority, int experience, float salary,
			Department department) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.seniority = seniority;
		this.experience = experience;
		this.salary = salary;
		this.department = department;
	}






	public Employee(String name, int age, int seniority, int experience, float salary, Department department) {
		super();
		this.name = name;
		this.age = age;
		this.seniority = seniority;
		this.experience = experience;
		this.salary = salary;
		this.department = department;
	}



	public long getEid() {
		return eid;
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


	public void setEid(long eid) {
		this.eid = eid;
	}






	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", seniority=" + seniority + ", experience="
				+ experience + ", salary=" + salary + ", department=" + department + "]";
	}




	
	
	
	
	
	

}
