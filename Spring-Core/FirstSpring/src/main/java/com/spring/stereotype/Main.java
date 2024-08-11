package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/stereotype/stereoconfig.xml");
		Person person1 = context.getBean("person", Person.class);
		Person person2 = context.getBean("person", Person.class);
		 
		
		//singleton
		System.out.println("singleton hashcode");
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());

		//System.out.println(person);
		//System.out.println(person.getAddress());
		//System.out.println(person.getDetails());
		//System.out.println(person.getDetails().getClass().getName());
		
		//prototype object
		
		System.out.println("prototype hashcode");
		Proto proto1= context.getBean("proto", Proto.class);
		System.out.println(proto1.hashCode());
		Proto proto2= context.getBean("proto", Proto.class);
		System.out.println(proto2.hashCode());

	}

}
