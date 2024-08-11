package com.spring.auto.wired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/auto/wired/annotation/autowireannoconfig.xml");
        Employee emp1 = context.getBean("emp1", Employee.class);
        System.out.println(emp1);
    }
}
