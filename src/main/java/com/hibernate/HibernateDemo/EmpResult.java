package com.hibernate.HibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernateDemo.Employee;

public class EmpResult {

	public static void main(String[] args) {
		Configuration config = new Configuration();

		SessionFactory factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		String sqlQuery = "SELECT * FROM employee";

		List<Object[]> resultList = session.createNativeQuery(sqlQuery).getResultList();

		for (Object[] row : resultList) {
		    int id = (int) row[0];
		    double salary = (double) row[1];
		    String name = (String) row[2];
		
		    System.out.println("ID: " + id);    
		    System.out.println("Salary: " + salary);
		    System.out.println("Name: " + name);  
		}
		session.close();
	}

}
