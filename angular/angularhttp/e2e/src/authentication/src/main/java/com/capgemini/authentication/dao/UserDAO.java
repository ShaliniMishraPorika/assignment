package com.capgemini.authentication.dao;

import com.capgemini.authentication.beans.UserBean;

public interface UserDAO {
	public boolean register(UserBean info);
	public UserBean authenticate(String email,String password); 
}
