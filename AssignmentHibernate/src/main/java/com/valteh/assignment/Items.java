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
import javax.persistence.ManyToOne;
import com.valteh.assignment.CompanyDetails;


@Entity
public class Items {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String itemDesc;
	private float unitPrice;
	@ManyToOne(targetEntity = CompanyDetails.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private CompanyDetails company;
	
	@ManyToMany(targetEntity = OrderSummary.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "itemss")
	private List<OrderSummary> orderSummary = new ArrayList<OrderSummary>();
	
	
	





	public Items(String itemDesc, float unitPrice, CompanyDetails company, List<OrderSummary> orderSummary) {
		super();
		this.itemDesc = itemDesc;
		this.unitPrice = unitPrice;
		this.company = company;
		this.orderSummary = orderSummary;
	}





	public List<OrderSummary> getOrderSummary() {
		return orderSummary;
	}





	public void setOrderSummary(List<OrderSummary> orderSummary) {
		this.orderSummary = orderSummary;
	}





	public Items() {
		
	}
	
	
	


	public Items(CompanyDetails company) {
		super();
		this.company = company;
	}





	public Items(String itemDesc, float unitPrice, CompanyDetails company) {
		super();
		this.itemDesc = itemDesc;
		this.unitPrice = unitPrice;
		this.company = company;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public CompanyDetails getCompany() {
		return company;
	}
	public void setCompany(CompanyDetails company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemDesc=" + itemDesc + ", unitPrice=" + unitPrice + ", company="
				+ company + "]";
	}
	
	
	
	
	
	
	
	
	

}
