package com.capgemini.springmvcassign.service;

import com.capgemini.springmvcassign.beans.EmployeeInfoBean;

public interface EmployeeService {
	public EmployeeInfoBean getEmployee(int empId);
	public boolean addEmployeeInfoBean(EmployeeInfoBean employeeInfoBean);
	
	

}
