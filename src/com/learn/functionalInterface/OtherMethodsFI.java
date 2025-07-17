package com.learn.functionalInterface;

import java.util.function.Function;

/*
 * andThen -> f1.andThen(f2).apply(...) -> first f1 then f1
 * compose -> opposite of andThen meaning first f2 then f1
 * identity -> return the value of input
 */

public class OtherMethodsFI {

	public static void main(String[] args) {

		Function<Integer, Integer> function1 = x -> 2 * x;
		Function<Integer, Integer> function2 = x -> x * x * x;

		int a = 2;
		int res = function1.andThen(function2).apply(a); //64
		int res1 = function2.andThen(function1).apply(a); //16
		int res2 = function1.compose(function2).apply(a); //16
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		
		System.out.println(Function.identity().apply("Hello"));
	}

}
