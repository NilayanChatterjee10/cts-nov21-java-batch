package com.cts.encapsulation.inheritance.polymorphism;


public class Employee extends Person {
	private int id;
	private double salary;
	private String desig;
	
	public Employee(int id, String name, int age, String gender, double salary, String desig) {
		super(name, age, gender);
		this.id = id;
		this.salary = salary;
		this.desig = desig;
	}

	public void display() {
		System.out.println("display in Employee name = "+getName()
		+", id = "+getId()+", gender = "+getGender()+", salary = "+getSalary()+", desig = "+getDesig());
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	
}
