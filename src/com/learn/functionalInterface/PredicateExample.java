package com.learn.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<String> predicate = str -> str.length() > 4;
		Predicate<String> strOddEven = str -> str.length() % 2 == 0;

		System.out.println(predicate.test("Rishi"));
		System.out.println(predicate.test("Kshama"));
		System.out.println(predicate.test("Mohit"));

		// Odd or even
		Predicate<Integer> predicateOddEven = n -> n % 2 == 0;

		System.out.println(predicateOddEven.test((5)));

		List<String> name = Arrays.asList("Rishik", "Mohit", "Kshama");
		List<String> output = name.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(output);
		//Combining predicates
		List<String> output1 = name.stream().filter(predicate.and(strOddEven)).collect(Collectors.toList());
		System.out.println(output1);

	}

}
