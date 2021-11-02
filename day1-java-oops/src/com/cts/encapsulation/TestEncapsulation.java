package com.cts.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Person p1 = new Person("Alex", 23);
		System.out.println("Name = "+p1.getName());
		System.out.println("Age = "+p1.getAge());
		// you can modify only the age
		p1.setAge(24);
		System.out.println("Name = "+p1.getName());
		System.out.println("Age = "+p1.getAge());
	}

}
