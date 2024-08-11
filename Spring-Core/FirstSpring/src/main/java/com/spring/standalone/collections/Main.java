package com.spring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standalone/collections/aloneconfig.xml");
		Person person1 = context.getBean("person1", Person.class);
		System.out.println(person1);
	}

}
