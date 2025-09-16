package com.learn.StringBuilderBuffer;

/*
 * Mutable, method chaining
 * Not Thread safe
 */
public class StrBuilder {

	public static void main(String[] args) throws InterruptedException {

		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		sb.append(" World");
		System.out.println(sb);
		
		//Thread test....
		StringBuilder sBuilder = new StringBuilder();
		
		Task1 t1 = new Task1(sBuilder);
		Task1 t2 = new Task1(sBuilder);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final length :" + sBuilder.length()); //It should give exactly 2000 but it gives random 
																// output because sometimes both thread may run together
	}
}

//example: Not a thread safe
	class Task1 extends Thread {
		
		private StringBuilder sb;
			
		public Task1(StringBuilder sb) {
			this.sb = sb;
		}

		@Override
		public void run() {
			for (int i = 0; i<1000; i++) {
				sb.append("a");
			}
		}
	}

