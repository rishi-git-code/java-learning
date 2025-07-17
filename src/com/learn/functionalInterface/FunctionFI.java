package com.learn.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Function: apply, andThen, compose, indentity

public class FunctionFI {

	public static void main(String[] args) {

		Function<String, Integer> function1 = x -> x.length();
		Function<String, String> subStr = s -> s.substring(0,3);

		Function<List<Students>, List<Students>> function2 = st -> {
			List<Students> result = new ArrayList<Students>();
			for (Students s : st) {
				if (subStr.apply(s.getName()).equalsIgnoreCase("Moh")) {
					result.add(s);
				}
			}
			return result;
		};
		
		Students s1 = new Students(1, "Rishi");
		Students s2 = new Students(2, "Mohit");
		Students s3 = new Students(3, "Kshama");
		Students s4 = new Students(4, "Mohit");
		List<Students> students = Arrays.asList(s1, s2, s3, s4);
		
		System.out.println(function1.apply("Rishi"));
		System.out.println(function2.apply(students));

	}

}
