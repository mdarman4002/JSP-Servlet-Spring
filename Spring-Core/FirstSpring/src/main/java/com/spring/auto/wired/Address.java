package com.spring.auto.wired;

public class Address {
	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("setStreet set the value");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public Address() {
		super();
		System.out.println("constructor called");
		// TODO Auto-generated constructor stub
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
