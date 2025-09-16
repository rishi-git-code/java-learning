package com.learn.abstraction;

/*
 * Interface can have 
 * unimplemented method, default with body, static method with body and constant variable
 * Interface can not be instantiated, can not create any object
 * multiple inheritance is possible
 * No constructor
 */

interface Animal {
	void sound();
	default void sleep() {
		System.out.println("Animal is Sleeping");
	}
}

class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog barks: Bhaw Bhaw...");
	}	
}

public class Interface_For_Abstraction {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound();
		dog.sleep();
		
	}
}