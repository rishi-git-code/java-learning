package com.learn.exceptionHandling;

public class HandleException {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		int c = 0;
		String str = "Class";
		int arr[] = {1,2,3,4};
		try {
			c = a/b;
			System.out.println("Array value :"+arr[5]);
			System.out.println("String length :"+str.length());
			System.out.println("calculation done..");
		} catch(NullPointerException e) {
			System.out.println("Please check data somewhere getting NULL value....");
		} catch(ArithmeticException e) {
			System.out.println("Some mathematical error....");
		} catch(Exception e) {
			System.out.println("Something failed..."+e);
		}
		
		System.out.println("Result :" + c);
		System.out.println("Execution completed...");
	}

}
