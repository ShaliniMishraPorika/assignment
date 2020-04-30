package com.capgemini.springmvcassign.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.springmvcassign.beans.EmployeeInfoBean;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class EmployeeDAOHibernateImple implements EmployeeDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeepersistenceunit");

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		EntityManager manager = factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		
		return employeeInfoBean;
	}

	@Override
	public boolean addEmployeeInfoBean(EmployeeInfoBean employeeInfoBean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		boolean isAdded=false;
		try {
			transaction.begin();
			manager.persist(employeeInfoBean);
			transaction.commit();
			isAdded=true;
			System.out.println("Added");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
		
	}
	

}
