package com.cg.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("employee.xml");
		SBU sbu = (SBU) factory.getBean("sbu");
		System.out.println("SBU deatils");
		System.out.println("------------------------");
		System.out.println(sbu);
		System.out.println("Employee deatils");
		System.out.println("------------------------");
		
		System.out.println(sbu.getEmpList());
		
	}

}
