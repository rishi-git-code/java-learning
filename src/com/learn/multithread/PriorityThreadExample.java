package com.learn.multithread;

public class PriorityThreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		PriorityThread low = new PriorityThread("Low Priority");
		PriorityThread medium = new PriorityThread("Medium Priority");
		PriorityThread high = new PriorityThread("High Priority");
		
		low.setPriority(Thread.MIN_PRIORITY);
		medium.setPriority(Thread.NORM_PRIORITY);
		high.setPriority(Thread.MAX_PRIORITY);
		
		low.start();
		medium.start();
		high.start();
		
		Thread.sleep(100);
		
		low.stopThread();
		medium.stopThread();
		high.stopThread();
		
		low.join();
		medium.join();
		high.join();
		
		System.out.println("\n----Execution completed----");
	}

}

class PriorityThread extends Thread {
	private long count = 0;
	private volatile boolean running = true;

	public PriorityThread(String name) {
		super(name);
	}

	public void run() {
		while (running) {
			count++;
		}

		System.out.println(getName() + " Finished Count = " + count);
	}
	public void stopThread() {
		running = false;
	}
}
