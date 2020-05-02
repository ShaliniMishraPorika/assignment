package com.capgemini.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.authentication.beans.UserBean;
import com.capgemini.authentication.dao.UserDAO;

@Service
public class UserServiceImplement implements UserService{
	
	@Autowired
	private UserDAO dao;

	@Override
	public boolean register(UserBean info) {
		
		return dao.register(info);
	}

	@Override
	public UserBean authenticate(String email,String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(email, password);
	}

}
