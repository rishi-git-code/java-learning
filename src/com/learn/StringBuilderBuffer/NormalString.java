package com.learn.StringBuilderBuffer;

/*
 * Immutable : once object is created, it's value can't be changed. 
 * Any modification in string creates a new String object
 * concatination can creates performance issue due to multiple object
 * Thread safe
 * Stored in String pool
 */
public class NormalString {

	public static void main(String[] args) {

		String str1 = "Hello";
		
		str1.concat("World");
		
		System.out.println(str1);
		
	}

}
