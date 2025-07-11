package com.learn.association;

public class IsAHasARelation {

	public static void main(String[] args) {

		Cars car1 = new Cars(); 
		car1.feature(); //"Vehicle moves" (car is vehicle. Is-A relation)
		car1.ignition(); //	"Car has an engine and it starts"(Has-A relation)
	}

}
