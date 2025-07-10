package com.learn.polymorphism;

//Abstract classes are not instantiated which has unimplemented and concrete method.
public abstract class Cars {
	
	abstract void body();
	
	void wheels() {
		System.out.println("All cars are having 4 wheels");
	}

}
