package com.capgemini.springmvcassign.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;
@Data
@Entity
@Table(name="EmployeePrimaryInfo")
public class EmployeeInfoBean implements Serializable{
	@Id
	@Column
	private int empId;
	@Column
	private String name;
	@Column
	private double salary;
	@Column
	private int departmentId;
	@Column
	private String password;
	@Column
	private Date dob;
	@Column
	private long mobileNo;
	@Column
	private int age;
	@Column
	private String bloodGroup;


}
