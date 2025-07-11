package com.learn.association;

public class Cars extends Vehicle{  //Car is a vehicle
	
	Engines engine = new Engines(); //car has a engine/ car contains engine

	public void ignition() {
		System.out.println("Ignition on");
		engine.starts();	//has-A relation
	}
	
}
