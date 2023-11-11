package com.valteh.assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private int phone;
	
	@OneToMany(targetEntity = Orderss.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "customer")
	private List<Orderss> orders = new ArrayList<Orderss>();
	
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String address, int phone, List<Orderss> orders) {
	super();
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.orders = orders;
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

	public List<Orderss> getOrders() {
		return orders;
	}

	public void setOrders(List<Orderss> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", orders="
				+ orders + "]";
	}
	
	
	
	
}
