package com.capgemini.authentication.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.authentication.beans.UserBean;

@Repository
public class UserDAOImplement implements UserDAO{
	

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean register(UserBean info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded =  false;
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			isAdded = true;
			System.out.println("added");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public UserBean authenticate(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select u from UserBean u where u.email=:email";
		TypedQuery<UserBean> query = manager.createQuery(jpql,UserBean.class);
		query.setParameter("email",email);
		UserBean record = query.getSingleResult();
		if(record.getEmail().equals(email) && record.getPassword().equals(password)){
			return record;
		} else {
			return null;
		}
	}

}
