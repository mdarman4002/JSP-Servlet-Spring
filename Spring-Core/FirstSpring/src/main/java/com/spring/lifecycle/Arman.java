package com.spring.lifecycle;

public class Arman {
	int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.err.println("set rollno");
	}

	@Override
	public String toString() {
		return "Arman [rollno=" + rollno + "]";
	}
	public void init() {
		System.err.println("Arman init called ");
	}
	public void destroy() {
		System.err.println("Arman destroy called");
	}


}