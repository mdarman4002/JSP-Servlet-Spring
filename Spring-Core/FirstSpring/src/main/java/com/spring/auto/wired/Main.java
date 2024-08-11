package com.spring.auto.wired;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
public class Main {
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/auto/wired/autowireconfig.xml");
		Employee emp1 = (Employee)context.getBean("emp1");
		System.out.println(emp1.toString());
		System.out.println(emp1);
	}
}
