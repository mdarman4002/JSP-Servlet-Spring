package com.spring.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/lifecycleconfig.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/lifecycleconfig.xml");
//		Arman arman1=(Arman) context.getBean("arman1");
//		System.out.println(arman1.getRollno());
		//context.registerShutdownHook();
//		System.err.println("-----------------------------------");
//		Hotel hotel1 = (Hotel) context.getBean("hotel1");
//		System.err.println(hotel1.getBill());

		AnnotationExample subject1 = (AnnotationExample) context.getBean("sub1");
		System.out.println(subject1);
		
		
		
	}

}
