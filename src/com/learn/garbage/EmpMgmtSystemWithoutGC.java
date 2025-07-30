package com.learn.garbage;

/*
 * write a program to count the number of employees working in the company(excluding interns). 
 * To make this program, you have to use the concept of a garbage collector.
 * 
 * Write a program to create a class called Employee having the following data members. 

	1. An ID for storing unique id allocated to every employee. 
	2. Name of employee. 
	3. Age of an employee.

 * Also, provide the following methods:

    A parameterized constructor to initialize name and age. The ID should be initialized in this constructor.
    A method show() to display ID, name, and age.
    A method showNextId() to display the ID of the next employee.
 */

public class EmpMgmtSystemWithoutGC {

	public static void main(String[] args) {

		Employee e1 = new Employee("Rishi", 29);
		Employee e2 = new Employee("Kshama", 27);
		Employee e3 = new Employee("Mohit", 29);

		e1.show();
		e2.show();
		e3.show();

		e1.showNextId();
		e2.showNextId();
		e3.showNextId();

		// for Intern
		{
			Employee e4 = new Employee("Sumesh", 22);
			Employee e5 = new Employee("Ramesh", 22);

			e4.show();
			e5.show();

			e4.showNextId();
			e5.showNextId();
		} //After this, e4 and e5 will be removed and it nextId will be 4
		
		e1.showNextId(); //This should show next Id as 4 but it will give 6
	}
}

class Employee {
	private int id;
	private String name;
	private int age;
	private static int nextId = 1;

	public Employee(String name, int age) {
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
}
