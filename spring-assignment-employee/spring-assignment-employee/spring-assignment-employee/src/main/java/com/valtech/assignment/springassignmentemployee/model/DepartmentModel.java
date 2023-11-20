package com.valtech.assignment.springassignmentemployee.model;

import java.util.List;

import com.valtech.assignment.springassignmentemployee.entites.Department;


public class DepartmentModel {
	
	private long deptId;
	private String deptname;
	private String location;

	
	
	public DepartmentModel() {
	
	}
	
	public DepartmentModel(Department depart) {
		this.deptId=depart.getDeptId();
		this.deptname=depart.getDeptname();
		this.location=depart.getLocation();
	
	}
	
	public Department getDepartment() {
		return new Department(deptname, location);
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
