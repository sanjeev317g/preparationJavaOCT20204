package com.Min;

public class Aimal {
	
	Aimal(){
		System.out.println("Parent class constructor will get called on creating Child class Object ");
	}
	
	protected void eat() {
		System.out.println("Eats meat");
	}
	
	protected void swim() {
		System.out.println("Canmot swim");
	}

}
