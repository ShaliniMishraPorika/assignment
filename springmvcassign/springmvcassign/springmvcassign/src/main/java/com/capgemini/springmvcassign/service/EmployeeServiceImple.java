package com.capgemini.springmvcassign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.capgemini.springmvcassign.beans.EmployeeInfoBean;
import com.capgemini.springmvcassign.dao.EmployeeDAO;
@Controller
public class EmployeeServiceImple implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmployee(empId);
	}

	@Override
	public boolean addEmployeeInfoBean(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.addEmployeeInfoBean(employeeInfoBean);
	}

}
