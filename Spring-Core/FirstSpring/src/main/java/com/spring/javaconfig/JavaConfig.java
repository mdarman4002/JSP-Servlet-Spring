package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.javaconfig")
public class JavaConfig {
	@Bean
	public Address getAddress() {
		return new Address();
	}
	@Bean(name = {"student", "studentTemp", "temp"})
	public Student getStudent() {
		Student  student = new Student(getAddress());
		return student;
	}
}