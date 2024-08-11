package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		System.out.println("AnnotationExample setSubject called");
	}

	

	public AnnotationExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}

	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
}
