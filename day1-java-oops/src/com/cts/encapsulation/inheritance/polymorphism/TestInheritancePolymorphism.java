package com.cts.encapsulation.inheritance.polymorphism;

public class TestInheritancePolymorphism {

	public static void main(String[] args) {
		Person p = new Person("Alex", 35, "Male");
		testPolymorphism(p);
		Employee e = new Employee(100, "Bruce", 50, "Male", 35200, "Manager");
		testPolymorphism(e);
		Account account = new Account(5555, 3000);
		Customer c = new Customer(100, "Charles", 22, "Male", account);
		testPolymorphism(c);
	}
	public static void testPolymorphism(Person p) {
		p.display(); // this is polymorphic 
		System.out.println("---------------");
	}
}
