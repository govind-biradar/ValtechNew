package com.valteh.assignment;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Orderss{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String date;
	
	@ManyToOne(targetEntity = Customer.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Customer customer;
	
	@OneToOne(targetEntity = OrderSummary.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "order")
	private OrderSummary order;
	
	

	public Orderss(int orderId, String date, Customer customer, OrderSummary order) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.customer = customer;
		this.order = order;
	}

	public OrderSummary getOrder() {
		return order;
	}

	public void setOrder(OrderSummary order) {
		this.order = order;
	}

	public Orderss() {
		
	}

	public Orderss(String date, Customer customer) {
		super();
		this.date = date;
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Orderss [orderId=" + orderId + ", date=" + date + ", customer=" + customer + "]";
	}

	
	
}
