package com.learn.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerFI {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("Rishi", "Kshama", "Mohit");
		String str1 = "Consumer";

		Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
		Consumer<String> consumer2 = s -> System.out.println(s.length());

		Consumer<String> consumer3 = consumer1.andThen(consumer2);
		str.forEach(consumer3);

		consumer1.accept(str1);

		// multiple function or nested
		Function<String, Integer> function1 = String::length;
		Consumer<String> consumer4 = x1 -> System.out.println(x1 + " : " + function1.apply(x1));
		
		str.forEach(consumer4);
		
		Function<String, String> function2 = String::toUpperCase;
		Consumer<String> printName = System.out::println;
		
		str.stream()
		.map(function2)
		.forEach(printName);

	}

}
