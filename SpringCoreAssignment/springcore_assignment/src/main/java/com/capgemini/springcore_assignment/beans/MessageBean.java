package com.capgemini.springcore_assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class MessageBean {

	private String message;
	
	@Autowired(required = false)
	@Qualifier("user2")
	private UserBean user;
	

	public void setMessage(String message) {
		this.message = message;
	}
	

	public String getMessage() {
		return message;
	}


	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public void print() {
		
		user.display();
		System.out.println("message is " + message);
		
	}
	
	
}//End of message bean
