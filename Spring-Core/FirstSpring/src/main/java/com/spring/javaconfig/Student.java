package com.spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	public Address getAddress() {
		return address;
	}
	public Student(Address address) {
		super();
		this.address = address;
		// TODO Auto-generated constructor stub
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Address address;
	//@Value("Arman")
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	private String student;
	public void study() {
		this.address.display();
		System.out.println("students are studying");
	}
}
