package com.valtech.training.springbootassignnment.component;

public class Customer {
	
	private int id;
	private String address;
	private String name;
	private int phone;
	
	
	
	
	public Customer() {
		super();
	}
	
	
	
	public Customer(String name, String address, int phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Customer(int id, String name, String address, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	

}
