package com.learn.exceptionHandling;

public class CustomException extends Exception{
	
	public CustomException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return "Fail Error :"+getMessage();
	}

}
