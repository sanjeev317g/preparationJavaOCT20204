package com.Min;

public class Encapsulation {
	
	private String name = "Donal";
	private int age = 65;
	
	public String getName() {
		return name;
	}
	
	public int getAe() {
		return age;
	}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	public int setAge(int age) {
		this.age = age;
		return age;
	}

}
