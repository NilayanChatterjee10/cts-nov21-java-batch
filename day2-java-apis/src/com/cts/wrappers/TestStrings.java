package com.cts.wrappers;

public class TestStrings {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1.concat("123");
		String s3 = s1.concat("456");
		System.out.println(s1+", "+s2+", "+s3);
		StringBuffer sb1 = new StringBuffer("Name = Alex");
		StringBuffer sb2 = sb1.append(", Age = 35");
		StringBuffer sb3 = sb1.append(", Salary = 30000");
		System.out.println(sb1+", "+sb2+", "+sb3);
		System.out.println("------------------------");
		String str1 = "hello";
		String str2 = "welcome";
		int result = str1.compareTo(str2);
		if(result == 0) 
			System.out.println(str1+" is same as "+str2);
		if(result < 0) 
			System.out.println(str1+" comes before "+str2);
		if(result > 0) 
			System.out.println(str1+" comes after "+str2);
	}
}
