package com.capgemini.springcore_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore_assignment.beans.MessageBean;

public class TestXml {
	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	MessageBean message = (MessageBean)context.getBean("msg");
	MessageBean message2 = (MessageBean)context.getBean("msg");
	
	//message.print();
	
 System.out.println("message is " + message.getMessage());
 message2.setMessage("it is a revision class");
 
 System.out.println("message is " + message.getMessage());
 System.out.println(message2.getMessage());
	
	
}//End of main
	
}//End of Testxml
