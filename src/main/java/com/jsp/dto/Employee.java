package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	private String emp_name;
	@Id
	private int emp_id;
	private double emp_salary;
	private byte[] image;
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getName() {
		return emp_name;
	}
	public void setName(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getId() {
		return emp_id;
	}
	public void setId(int id) {
		this.emp_id = id;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	
	

}
