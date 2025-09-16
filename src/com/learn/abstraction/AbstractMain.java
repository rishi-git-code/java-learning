package com.learn.abstraction;

/*
 * Abstract class can have Abstract method and Concrete method
 * Subclass must have to implement the abstract method
 * *****Abstract class can not be instantiated***** 
 */

abstract class Mobile {
	abstract void camera();
	
	void call() {
		System.out.println("This phone is having calling feature");
	}
}

class Samsung extends Mobile {

	@Override
	void camera() {
		System.out.println("Samsung phone is having 100MP camera");
	}
	
}

public class AbstractMain {

	public static void main(String []args) {
		Samsung s = new Samsung();
		s.call();
		s.camera();
	}
}