package com.tcs.exceptions;

@SuppressWarnings("serial")
public class UserNotFoundException extends Exception {

	// throw new UserNotFoundException() -> propagate / use try catch to handle
	public UserNotFoundException() {
		super();
	}
	// throw new UserNotFoundException("Sorry user with an id "+value+" not found")
	public UserNotFoundException(String message) {
		super(message);
	}
	
}
