package com.learn.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Checked Exceptions: IOException, SQLException -> compile time -> must need to add throws or try-catch
 * Unchecked Exceptions: NullPointerException, ArithmeticException -> runtime -> no need to declare or add
 */ 

public class ExceptionExample {

	public static void main(String[] args) throws FileNotFoundException {

		int a  = 10;
		int b = 0;
		int unchecked = uncheckedException(a,b);
		System.out.println(unchecked);
		int checked = checkedException();
		System.out.println(checked);
	}

	private static int uncheckedException(int a, int b) {
		
		return a/b;
	}
	
	private static int checkedException() throws FileNotFoundException  {
		File file = new File("./java.xml");
		Scanner scanner = new Scanner(file);
		int result =  scanner.nextInt();
		scanner.close(); // this is used to disconnect from reading file/ release resources used by scanner object
		return result;		
	}

}
