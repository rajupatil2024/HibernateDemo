package com.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	
	@Id
	int dept_id;
	String dept_name;
	@OneToOne
	Student std;
	
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_it) {
		this.dept_id = dept_it;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
}