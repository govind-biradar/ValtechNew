package com.valtech.assignment.springassignmentemployee.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deptId;
	private String deptname;
	private String location;
	
	

	public Department(long did, String deptname, String location) {
		super();
		this.deptId = did;
		this.deptname = deptname;
		this.location = location;
		
	}

	public Department(String deptname, String location) {
		super();
		this.deptname = deptname;
		this.location = location;
	
	}

	public Department() {
		
	}

	@Override
	public String toString() {
		return "Department [did=" + deptId + ", deptname=" + deptname + ", location=" + location + "]";
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long did) {
		this.deptId = did;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
	
	
	

}
