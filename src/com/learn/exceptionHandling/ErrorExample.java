package com.learn.exceptionHandling;

/*
 * OutOfMemoryError -> jvm run out of memory (infinite loop) ->runtime error
 * logical error -> runtime error
 * , stackoverflow, NoClassDefFoundError
 */
public class ErrorExample {

	public static void main(String[] args) {
		int a = 7;
		int b = 17;
		String[] largeArray = new String[Integer.MAX_VALUE];
		int large = getLargest(a, b);
		System.out.println("Largest number :" + large);
	}

	private static int getLargest(int a, int b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

}
