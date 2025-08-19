package com.learn.garbage;

import java.util.ArrayList;
import java.util.List;

/*
 * Memory Leakage:
 * Objects which are no longer required but present in heap and GC not able to remove them.
 * 
 * Reason of memory Leak:
 * 1. Static reference
 * 2. Unclosed Resources -> Database, file, network
 * 3. Inner class reference -> Non-static inner class holds reference to their outer class
 * 4. Thread local -> if you forget to call ThreadLocal.remove()
 * 5. Excessive session object
 * 6. Poorly written custom DS
 * 
 * Prevention:
 * 1. Don't create unnecessary object
 * 2. Avoid String concatination
 * 3. timeout the session when not needed
 * 4. Avoid using static object, if needed set static object to null after use
 * 5. always close the session
 * 
 * 
 * Note: To see memory uses
 * jdk -> bin -> open jvisualvm.exe
 */

public class MemoryLeakage {
	
//	public static List<Double> list = new ArrayList<>(); //Static is one of Reason for memory leak

	public List<Double> list = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Checkpoint-1");
		new MemoryLeakage().populateList();
		System.out.println("Checkpoint-3");

	}

	private void populateList() {

		for (int i = 0; i < 10000000; i++) {
			list.add(Math.random());
		}
		System.out.println("Checkpoint-2");
	}

}
