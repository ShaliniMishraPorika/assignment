package com.capgemini.springcore_assignment.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore_assignment.beans.MessageBean;
import com.capgemini.springcore_assignment.config.MessageConfig;

public class Controller{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean message = context.getBean(MessageBean.class);


		System.out.println(message.getMessage());	
		System.out.println(message.getUser().getId());
		System.out.println(message.getUser().getName());
	}//End of main

}//End of test annotation
