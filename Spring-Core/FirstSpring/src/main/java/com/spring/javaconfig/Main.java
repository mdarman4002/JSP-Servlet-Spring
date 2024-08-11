package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	Student student1 = context.getBean("studentTemp", Student.class);
    	System.out.println(student1);
    	student1.study();
    	
    	//context.close();
	}

}
// cntrl + shift + T