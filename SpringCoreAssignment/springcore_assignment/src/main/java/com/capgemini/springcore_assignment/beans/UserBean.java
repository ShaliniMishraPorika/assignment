package com.capgemini.springcore_assignment.beans;

import lombok.Data;

@Data
public class UserBean {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		
		System.out.println("user id is " + id);
		System.out.println("user name is " + name);
	}
	
	
}//End of user bean
