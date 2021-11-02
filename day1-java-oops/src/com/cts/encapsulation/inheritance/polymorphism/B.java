package com.cts.encapsulation.inheritance.polymorphism;

public class B extends A {
	int y;
	public B() {
		super(200); 
		System.out.println("B() constructor");
	}
	public B(int x) {
		super(x);
		System.out.println("B(int) constructor");
	}
	public B(int x, int y) {
		super(x);
		this.y = y;
		System.out.println("B(int, int) constructor");
	}
}
