package com.capgemini.authentication.service;

import com.capgemini.authentication.beans.UserBean;

public interface UserService {
	public boolean register(UserBean info);
	public UserBean authenticate(String email,String password); 
}
