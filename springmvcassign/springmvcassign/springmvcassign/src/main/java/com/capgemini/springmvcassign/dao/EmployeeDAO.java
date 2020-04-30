package com.capgemini.springmvcassign.dao;

import com.capgemini.springmvcassign.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public EmployeeInfoBean getEmployee(int empId);
	public boolean addEmployeeInfoBean(EmployeeInfoBean employeeInfoBean);
	

}
