package com.capgemini.springmvcassign.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvcassign.beans.EmployeeInfoBean;

@Controller
public class EmployeeController {
	@Autowired
	 private com.capgemini.springmvcassign.service.EmployeeService service;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor=new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}
	

	
	@GetMapping("/getEmployeeForm")
	public String getEmployeeForm() {
		return "searchEmployee";
		
	}
	public String addEmployeeForm() {
		return "/WEB-INF/views/addEmployee.jsp";
		
	}
	
	@GetMapping("/add")
	public String getForm() {
		return "addEmployee";
	}
	
	@PostMapping("/added")
	public String submitForm(EmployeeInfoBean info,ModelMap map) {
		boolean added=
		service.addEmployeeInfoBean(info);
		if(added) {
			return "hello";
		} else {
			return "addEmployee";
		}
	
	}
}
	


