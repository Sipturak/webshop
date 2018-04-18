package com.shop.model;

public abstract class Person {
	
	
	private String name;
	private String lastname;
	
	public Person(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}
	
	public Person() {}
	
	
	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	
	
	
	
}
