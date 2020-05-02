package com.capgemini.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.authentication.beans.UserBean;
import com.capgemini.authentication.service.UserService;

@RestController
//@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping(path = "/addUser", 
			consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public boolean addUser(@RequestBody UserBean info) {

		boolean isAdded = service.register(info);
		if(isAdded) {
			return true;
		}else {
			return false;
		}		
	}

	@PostMapping(path = "/authenticate", 
			consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public UserBean authenticate( String email,String password) {
		UserBean info = service.authenticate(email, password);
		if(info!= null) {
			return info;
		}else {
			return null;
		}

	}


}
