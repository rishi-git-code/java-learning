package com.learn.exceptionHandling;

public class ThrowAndThrows {

	public static void main(String[] args) {

		int a = 20;
		int b = 25;
		int c = 0;
		try {
			c = devide(a, b);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c);
	}

	private static int devide(int a, int b) throws CustomException  {
		int res = 0;
		try {
			res = a / b;
			if (res == 0) {
				throw new CustomException("Denominataor is greater than numerator");
			}
			return res;
		} catch (CustomException e) {
			System.out.println(e);
		}
		return res;

	}

}
