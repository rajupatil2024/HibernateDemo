package com.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductConfig {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("product.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		
		Product p=new Product();
		p.setPid(3);
		p.setName("Charger");
		p.setPrice(3499.50);
		session.save(p);
		tc.commit();
	}
}
