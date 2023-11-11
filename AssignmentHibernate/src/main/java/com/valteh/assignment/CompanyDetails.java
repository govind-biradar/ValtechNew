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
public class CompanyDetails {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private String Address;
	
	@OneToMany(targetEntity =Items.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "company")
	private List<Items> item = new ArrayList<Items>();
	
	
	

	public CompanyDetails() {
	
	}
	
	

	public CompanyDetails(List<Items> item) {
		super();
		this.item = item;
	}



	public CompanyDetails(String name, String address, List<Items> item) {
		super();
		this.name = name;
		Address = address;
		this.item = item;
	}



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<Items> getItem() {
		return item;
	}

	public void setItem(List<Items> item) {
		this.item = item;
	}



	@Override
	public String toString() {
		return "CompanyDetails [cid=" + cid + ", name=" + name + ", Address=" + Address + ", item=" + item + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
	

}
