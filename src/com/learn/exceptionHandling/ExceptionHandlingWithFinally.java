package com.learn.exceptionHandling;

public class ExceptionHandlingWithFinally {

	public static void main(String[] args) {
		int result = division(49, 7);
		System.out.println(result);

		finallyWithForLoop();

	}

	private static int division(int a, int b) {
		int c = 0;
		try {
			c = a / b;
			return c;
		} catch (Exception e) {
			System.out.println("we failed to return :" + e);
		} finally {
			System.out.println("Thank you for using my method...");
		}

		return -1;
	}

	private static void finallyWithForLoop() {

		int a = 10;
		int n = 5;
		int res = 0;

		while (true) {
			try {
				res = a / n;
			} catch (Exception e) {
				break;
			}finally {
				System.out.println("value of n = "+n);
			}
			n--;
			System.out.println(res);
		}
	}
}
