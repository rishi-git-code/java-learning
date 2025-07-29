package com.learn.multithread;

/*
 * 1. New State
 * 2. Runnable State
 * 3. Blocked State
 * 4. Waiting State
 * 5. Timed Waiting State
 * 6. Terminated State
 */
public class ThreadLifeCycle {

	public static void main(String[] args) {

		MyThread mt1 = new MyThread();
		Thread t1 = new Thread(mt1); // New Thread created
		t1.start(); // start the thread (Move to Runnable state)

		// Main thread waits for thread to finish (Waiting state)
		try {
			t1.join(); // Waiting state: Main thread waits for `thread` to finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread terminated here...."); // thread is Terminated
	}

}

class MyThread implements Runnable {

	public void run() {
		printThread();
	}

	public void printThread() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is running......");
			try {
				Thread.sleep(500); // Timed Waiting state
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}