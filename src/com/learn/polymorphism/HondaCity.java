package com.learn.polymorphism;

public class HondaCity extends Cars{

	@Override
	void body() {

		System.out.println("This car has sunroof");
	}
	
	
	void wheels() {
		System.out.println("This car is having 4 Alloy wheels");
	}
	
	void brake() {
		System.out.println("Honda city is having ABS");
	}

}
