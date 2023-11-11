package com.valteh.assignment.db;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.valteh.assignment.CompanyDetails;
import com.valteh.assignment.Customer;
import com.valteh.assignment.Items;
import com.valteh.assignment.OrderSummary;
import com.valteh.assignment.Orderss;

public class Connection {
	public static void main(String[] args) {
		AnnotationConfiguration ann = new AnnotationConfiguration();
		ann.addAnnotatedClass(Items.class).addAnnotatedClass(CompanyDetails.class);
		ann.addAnnotatedClass(Customer.class).addAnnotatedClass(Orderss.class).addAnnotatedClass(OrderSummary.class);
		
		
		SessionFactory sesf = ann.buildSessionFactory();
		Session ses = sesf.openSession();
		
		Transaction tx = ses.beginTransaction();
		
		
		Items i = new Items();
		i.setItemDesc("nice");
		i.setUnitPrice(1000);
		
		Items i2 = new Items("nice", 3000, new CompanyDetails("Puma","bidar", new ArrayList<Items>()));
		
		CompanyDetails c1 = new CompanyDetails("Xyz", "Hydrabad", new ArrayList<Items>());
		
		CompanyDetails c = new CompanyDetails();
		c.setName("Nike");
		c.setAddress("jp nagar");
		c.getItem().add(i);
		
		i.setCompany(c1);
		
		i2.setCompany(c1);
		
		ses.save(i);
		ses.save(c);
		ses.save(c1);
		ses.save(i2);
		
		
		Orderss o = new Orderss("11-12-2023", new Customer("Amar","Bidar", 9353761, new ArrayList<Orderss>()));
	
		ses.save(o);
		
		OrderSummary os = new OrderSummary();
		os.setQuantity(25);
		os.setOrder(o);
		
		ses.save(os);
		
		
	
		
		
		tx.commit();
		ses.close();
		sesf.close();
		
		
	}
	
	
	
	
	

}
