package com.spring.consinject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String args[]) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/spring/consinject/consinjectconfig.xml");
		Person person= (Person)context.getBean("person");
		System.out.println(person);
		
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	}
}
