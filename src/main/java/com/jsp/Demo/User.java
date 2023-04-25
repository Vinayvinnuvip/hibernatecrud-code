package com.jsp.Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
@Id
	private int id;
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setAge(int age) {
		this.age=age;		
	}
	public int getAge() {
		return this.age;
	}
}
