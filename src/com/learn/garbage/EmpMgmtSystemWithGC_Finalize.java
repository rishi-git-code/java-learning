package com.learn.garbage;

/*
 * Same problem statement from withoutGC
 */
public class EmpMgmtSystemWithGC_Finalize {

	public static void main(String[] args) {

		Employees e1 = new Employees("Rishi", 29);
		Employees e2 = new Employees("Kshama", 27);
		Employees e3 = new Employees("Mohit", 29);

		e1.show();
		e2.show();
		e3.show();

		e1.showNextId();
		e2.showNextId();
		e3.showNextId();

		// for interns
		{
			Employees e4 = new Employees("Sumesh", 22);
			Employees e5 = new Employees("Ramesh", 22);

			e4.show();
			e5.show();

			e4.showNextId();
			e5.showNextId();
			e4 = e5 = null; // This is make the object eligible for GC ->(Nullifying the reference variable
							// (obj = null))

			System.gc();   //inform JVM to initiate garbage collection
			System.runFinalization(); //This method is generally used to release resources like file handles, network connections, or database connections
		
		}

		e1.showNextId();
	}
}

class Employees {
	private int id;
	private String name;
	private int age;
	private static int nextId = 1;

	public Employees(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = nextId++;
	}

	public void show() {
		System.out.println("Id=" + id + "\nName=" + name + "\nAge=" + age);
	}

	public void showNextId() {
		System.out.println("Next Employee Id will be = " + nextId);
	}

	protected void finalize() { //This method is called just before destroying the objects
		--nextId;
		// In this case, gc will call finalize() for 2 times for 2 objects(e4 & e5).
	}
}
