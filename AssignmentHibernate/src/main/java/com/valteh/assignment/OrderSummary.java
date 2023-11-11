package com.valteh.assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderSummary {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderSum_id;
	private int quantity;
	
	@OneToOne(targetEntity = Orderss.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Orderss order;
	
	@ManyToMany(targetEntity = Items.class,cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	private List<Items> itemss =new ArrayList<Items>();

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Orderss getOrder() {
		return order;
	}

	public void setOrder(Orderss order) {
		this.order = order;
	}

	
	
	@Override
	public String toString() {
		return "OrderSummary [orderSum_id=" + orderSum_id + ", quantity=" + quantity + ", order=" + order + ", itemss="
				+ itemss + "]";
	}

	public OrderSummary(int orderSum_id, int quantity, Orderss order) {
		super();
		this.orderSum_id = orderSum_id;
		this.quantity = quantity;
		this.order = order;
	}

	public int getOrderSum_id() {
		return orderSum_id;
	}

	public void setOrderSum_id(int orderSum_id) {
		this.orderSum_id = orderSum_id;
	}

	public OrderSummary() {
		
	}

	public List<Items> getItemss() {
		return itemss;
	}

	public void setItemss(List<Items> itemss) {
		this.itemss = itemss;
	}

	public OrderSummary(int orderSum_id, int quantity, Orderss order, List<Items> itemss) {
		super();
		this.orderSum_id = orderSum_id;
		this.quantity = quantity;
		this.order = order;
		this.itemss = itemss;
	}

	
	
	
	

}
