package com.learn.multithread;

/*
 * Threads object cannot be shared
 * Object of Runnable interface can be shared
 */

public class BasicExample extends Thread {

	public static void main(String[] args) {

		Ram o1 = new Ram();
		Shyam o2 = new Shyam();
		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(o2);
		t1.start();
		t2.start();

	}

}

class Ram implements Runnable {
	public void run() {
		sayHi();
	}

	void sayHi() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Shyam extends Thread {
	public void run() {
		sayHello();

	}

	void sayHello() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}