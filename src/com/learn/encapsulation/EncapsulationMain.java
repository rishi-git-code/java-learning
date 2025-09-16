package com.learn.encapsulation;

/*
 * To achieve encapsulation, we have to use access modifier, setter-getter
 * 
 * 
 */

public class EncapsulationMain {

	public static void main(String[] args) {

		User user1 = new User();
		user1.setUsername("Rishi");
		user1.setAge(30);
		System.out.println(user1.getUsername() + " : " + user1.getAge());
	}

}
