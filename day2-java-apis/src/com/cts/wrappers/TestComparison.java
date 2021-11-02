package com.cts.wrappers;

import java.util.Scanner;

public class TestComparison {
	public static void main(String[] args) {
		// comparing two numbers like int, double
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = scan.nextInt();
		int result = Integer.compare(num1, num2);
		if(result < 0) {
			System.out.println(num1+" is lesser than "+num2);
		}
		if(result > 0) {
			System.out.println(num1+" is greater than "+num2);
		}
		if(result == 0) {
			System.out.println(num1+" is equal to "+num2);
		}
		result = Double.compare(20.0, 10.0);
		System.out.println("Result of comparing 20.0 & 10.0 = "+result);
		result = Double.compare(20.0, 20.0);
		System.out.println("Result of comparing 20.0 & 20.0 = "+result);
		scan.close();
	}
}
