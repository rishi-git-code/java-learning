package com.learn.lambdaExpression;

public class LambdaMain {

	public static void main(String[] args) {
		// no param no return ->START
		NoParamNoReturn method1 = () -> {
			System.out.println("I'm with no params and no return");
		};
		NoParamNoReturn method2 = () -> System.out.println("I'm with no params and no return without {}");
		method1.noParamNoReturn();
		method2.noParamNoReturn();
		// no param no return ->END

		// no param no return ->START
		OneParamNoReturn method3 = (int a) -> {
			System.out.println("You have entered a number " + a);
		};
		OneParamNoReturn method4 = a -> {
			System.out.println("You have entered a number " + a + " (without () and {})");
		};
		method3.oneParamNoReturn(30);
		method4.oneParamNoReturn(29);
		// no param no return ->END

		// no param no return ->START
		MultiParamsNoReturn method5 = (String a, int b) -> {
			System.out.println("My name is " + a + " with height more than " + b + " yrs");
		};
		MultiParamsNoReturn method6 = (a, b) -> {
			System.out
					.println("My name is " + a + " with height less than " + b + " yrs" + "(Without {} and datatype)");
		};
		method5.mutliParamsNoReturn("Rishi", 5);
		method6.mutliParamsNoReturn("Rishi", 6);
		// no param no return ->END

		// no param no return ->START
		ParamsWithReturn sum = (int a, int b) -> {
			return a + b;
		};
		ParamsWithReturn multiply = (a, b) ->  a * b;

		System.out.println(sum.paramsWithReturn(26, 29));
		System.out.println(multiply.paramsWithReturn(5, 8));
		
		// no param no return ->END
	}

}
