package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapConfig {
	
	public static void main(String[] args) {
		
		Configuration config= new Configuration();
		SessionFactory factory= config.configure("mapconfig.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc= session.beginTransaction();
		Student s1= new Student();
		s1.setSid(2);
		s1.setName("Best");
		s1.setAge(26);
		
		Department d1= new Department();
		d1.setDept_id(2);
		d1.setDept_name("CSE");
		d1.setStd(s1);
		s1.setDept(d1);
		session.persist(s1);
		tc.commit();
	}

}