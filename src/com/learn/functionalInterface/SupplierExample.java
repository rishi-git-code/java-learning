package com.learn.functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

/*
 * Supplier is mainly used to in functional programming scenarios 
 * where you need to generate or provide values without any input. 
 * 
 */

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Integer> randomNumber = () -> new Random().nextInt(1000);

		System.out.println(randomNumber.get());

		// Lazy initialization.... this is not called when defined it's called when it
		// is called
		Supplier<String> stringSupplier = () -> {
			System.out.println("Creating a string....");
			return "Hello! Friends";
		};

		System.out.println("Before calling get()");
		System.out.println(stringSupplier.get()); // Lazy inititiation is here meaning the object is created only when
													// it's needed.

		// Lazy loading -> when object creation is costly, like creating database
		// connection()
		System.out.println("Testing lazy connection.....");
		Supplier<DatabaseConnection> connectionSupplier = () -> new DatabaseConnection();
		
		System.out.println("Database connection not created yet.");
		
		DatabaseConnection connection = connectionSupplier.get();
		connection.connect();

	}

}

class DatabaseConnection {
	public DatabaseConnection() {
		System.out.println("Creating a new database connection....");
	}

	public void connect() {
		System.out.println("Connected to the database!");
	}
}
