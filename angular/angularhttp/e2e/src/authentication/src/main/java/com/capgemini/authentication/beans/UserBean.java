package com.capgemini.authentication.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="userbean")
public class UserBean implements Serializable{
	@Column
	private int id;
	@Column
	private String name;
	@Id
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String role;

}
