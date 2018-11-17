package com.cg.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = (Employee) factory.getBean("Employee");
		SBU sbu = (SBU) factory.getBean("sbu");
		System.out.println("Employee deatils");
		System.out.println("------------------------");
		System.out.println(employee);
		employee.setBusinessUnit(sbu);
		System.out.println(employee.getBusinessUnit());
	}

}
