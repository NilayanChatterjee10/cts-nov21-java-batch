package com.cts.encapsulation.inheritance.polymorphism;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		super(); // Object()
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void display() {
		System.out.println("Person displays name = "+getName()+", age = "+getAge()+", gender = "+getGender());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
