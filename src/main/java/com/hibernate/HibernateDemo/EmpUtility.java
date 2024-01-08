package com.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpUtility {

	public static void main(String[] args) {
		Configuration config = new Configuration();

		SessionFactory factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setId(22);
		e1.setName("Raju");
		e1.setSalary(45000);
		session.save(e1);
		tc.commit();
	}
}
