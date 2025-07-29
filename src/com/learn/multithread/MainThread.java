package com.learn.multithread;

/*
 * Main thread is created automatically by JVM and executes main method
 * we can rename, reset priority, 
 * Priority prioritize the thread for scheduler but not guarantee
 */
public class MainThread extends Thread { // here we can extend or can't extend Thread

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();

		System.out.println("Main Thread Default Name: " + mainThread.getName()); // Current Thread Name
		System.out.println("Main Thread Default Thread : " + mainThread.getPriority()); // Current Thread Priority (By
																						// Default 5)

		mainThread.setName("Rishi");
		mainThread.setPriority(MAX_PRIORITY); // MAX_PRIORITY will work only if we extend Thread
		System.out.println("New Main Thread Name : " + mainThread.getName());
		System.out.println("New Main Thread Priority: " + mainThread.getPriority());

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread....");
		}
		// Create child thread
		Thread ct1 = new Thread(new ChildThread1());

		System.out.println("Child Thread Default Priority :" + ct1.getPriority());

		ct1.setPriority(MIN_PRIORITY);
		System.out.println("Child Thread New Priority :" + ct1.getPriority());

		/*
		 * Child-1 is priority 1 but system will not guarantee sometimes it will execute ct2 first
		 * run multiple times to see the difference in output
		 */
		Thread ct2 = new Thread(new ChildThread2());
		ct2.setPriority(MAX_PRIORITY);
		ct1.start();
		ct2.start();
	}

}

class ChildThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child-1 Thread Running...");
		}
	}
}

class ChildThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child-2 Thread Running...");
		}
	}
}
