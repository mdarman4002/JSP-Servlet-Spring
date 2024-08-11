package com.spring.ref;

public class A {
	private int x;
	private B obj;
	
	public int getX() {
		return x;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObj() {
		return obj;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + ", getX()=" + getX() + ", getObj()=" + getObj() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
}
