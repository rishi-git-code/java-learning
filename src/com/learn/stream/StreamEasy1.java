package com.learn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEasy1 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
	            new Person("Alice", 25),
	            new Person("Bob", 30),
	            new Person("Charlie", 22),
	            new Person("Diana", 28),
	            new Person("Ethan", 16),
	            new Person("Fiona", 27),
	            new Person("George", 10),
	            new Person("Hannah", 24),
	            new Person("Ian", 8),
	            new Person("Julia", 29)
	        );
		List<Person> personList = people.stream().filter(p->p.getAge()>16).collect(Collectors.toList());
		
		System.out.println(personList);
		
	}
}

class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
