package com.spring.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ref/refconfig.xml");
		A atemp = (A)context.getBean("aref");
		System.out.println("getx"+atemp.getX());
		System.out.println("gety"+atemp.getObj().getY());
		System.out.println("atemp"+ atemp);
	}

}
