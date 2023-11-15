package com.valtech.training.springbootassignnment.component;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private DataSource dataSource;

	@Override
	public void createCustomer(Customer cus) {
		String createQry = "INSERT INTO CUSTOMER(ADDRESS,NAME,PHONE) VALUES(?,?,?)";
		new JdbcTemplate(dataSource).update(createQry, cus.getAddress(), cus.getName(), cus.getPhone());

	}

	@Override
	public void updateCustomer(Customer cus) {
		String updateQry = "UPDATE EMPLOYEE SET ADDRESS=?,NAME=?,PHONE=? WHERE ID=?";
		new JdbcTemplate(dataSource).update(updateQry, cus.getAddress(), cus.getName(), cus.getPhone());
			
	}

	
	}

//	public static void main(String[] args) {
//		CustomerDAO c = new CustomerDAOImpl();
//		c.createCustomer(new Customer("Amar", "bidarrrr", 93537));
//	}

