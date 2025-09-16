package com.learn.StringBuilderBuffer;

/*
 * mutable, thread safe
 */

public class StrBuffer {

	public static void main(String[] args) throws InterruptedException {

		StringBuffer sf = new StringBuffer("Hello");
		System.out.println(sf);
		sf.append(" World");
		System.out.println(sf);
		StringBuffer sBuffer = new StringBuffer();
		
		Task t1 = new Task(sBuffer);
		Task t2 = new Task(sBuffer);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Buffer length:: "+sBuffer.length()); //This is always giving 2000
	}

}

//For Thread safety example
class Task extends Thread {
	
	StringBuffer sf = new StringBuffer();
	public Task(StringBuffer sf) {
		this.sf = sf;
	}
	
	public void run() {
		for(int i=0;i<1000;i++) {
			sf.append("a");
		}
	}
	
}