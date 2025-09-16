package com.learn.StringBuilderBuffer;

public class PerformanceTest {

	public static void main(String[] args) {

		long startTime, endTime;

		// String time
		startTime = System.currentTimeMillis();
		String str = "Java";
		for (int i = 0; i < 10; i++) {
			str += str + " Programming";
		}
		endTime = System.currentTimeMillis();
		System.out.println("String Time : " + (endTime - startTime) + "ms");

		// String builder time
		startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder(10000);
		sb.append("Java");
		for (int i = 0; i < 1000; i++) {
			sb.append(" Programming");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder time : " + (endTime - startTime) + "ms");

		// String buffer time
		startTime = System.currentTimeMillis();
		StringBuffer sf = new StringBuffer(10000);
		sf.append("Java");
		for (int i = 0; i < 1000; i++) {
			sf.append(" Programming");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer Time : " + (endTime - startTime) + "ms");
	}

}
