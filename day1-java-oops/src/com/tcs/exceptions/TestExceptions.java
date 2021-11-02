package com.tcs.exceptions;

import java.util.Scanner;

public class TestExceptions {
	// searchUser() would search user but generates usernotfoundexception if id is not found
	// usernotfoundexception needs to be handled by the caller
	public static void searchUser(int id) throws UserNotFoundException {
		if(id >= 1 && id <= 100) {
			System.out.println("User with an id: "+id+" found & return the id or user object");
		} else {
			throw new UserNotFoundException("Sorry user with an id: "+id+" not found!");
		}
	}
	// assuming the caller is main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an id:");
		int id = scan.nextInt();
		try {
			searchUser(id);
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			// just print the exception object
			System.err.println(e);
			// just print hte exception object message using e.getMessage()
			System.err.println("Error: "+e.getMessage());
		}
		scan.close();
	}
}
