package com.learn.polymorphism;

/*
 * 1. Compile time ploymorphism -> overloading 
 * 2. Runtime polymorphism -> overriding
 */

public class PolymorphismMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.makeSound();
		Animal animal = new Animal();
		animal.makeSound();
		System.out.println(animal.add(38.9, 98.7));
		
		//Abstract class
		Cars car = new HondaCity();  //Can use all methods of Cars class and overriden methods of Hondacity class
		//HondaCity car = new HondaCity();  //Can have full access of all class.
		car.body();
		car.wheels();
		
	}

}
