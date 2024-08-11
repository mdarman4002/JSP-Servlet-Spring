package com.spring.consinject;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int a, int b called");
	}
	public Addition(double a, double b ) {
		this.a =(int) a;
		this.b = (int) b;
		System.out.println("double a, double b called");
	}
	public Addition(String a, String b) {
//		this.a = (int) a;
//		this.b = (int) b;
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String a, String b called");
	}
	public void doSum() {
		System.out.println("sum: "+ (this.a + this.b));
	}
}
