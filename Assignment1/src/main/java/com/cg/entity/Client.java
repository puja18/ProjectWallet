package com.cg.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = (Employee) factory.getBean("Employee");
		System.out.println("Employee deatils");
		System.out.println("------------------------");
		System.out.println("employeeId :" + employee.getEmployeeId());
		System.out.println("employeeName : " + employee.getEmployeeName());
		System.out.println("salary :" + employee.getSalary());
		System.out.println("businessUnit :" + employee.getBusinessUnit());
		System.out.println("age :" + employee.getAge());
		
	}

}
