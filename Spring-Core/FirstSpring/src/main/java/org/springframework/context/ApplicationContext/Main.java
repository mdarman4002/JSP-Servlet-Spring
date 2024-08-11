package com.spring.auto.wired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowired/autowireconfig.xml");
	}
}
