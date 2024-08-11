package com.spring.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,Integer> feestructures;
	private Properties properties;
	public List<String> getFriends() {
		return friends;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructures=" + feestructures + ", properties=" + properties + "]";
	}
	public Map<String, Integer> getFeestructures() {
		return feestructures;
	}
	public void setFeestructures(Map<String, Integer> feestructures) {
		this.feestructures = feestructures;
	}
}
