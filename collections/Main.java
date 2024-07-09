package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/collectionconfig.xml");
        Employee emp1 = (Employee) context.getBean("employee1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getPhones());
    }
}
