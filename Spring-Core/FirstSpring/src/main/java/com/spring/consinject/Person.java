package com.spring.consinject;

public class Person {
	private String name;
	private int personId;
	private Address address;
	
	public Person(String name, int personId, Address address) {
		this.name= name;
		this.personId = personId;
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " +this.personId + "{"+ this.address + "}";
	}
	
}
