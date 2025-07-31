package com.learn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {

	public static void main(String[] args) {

		//Create a file
		/*
		File file = new File("test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Unable create file...");
			e.printStackTrace();
		}
	
		//Write to a file
		try {
			FileWriter fileWriter = new FileWriter("test.txt");
			fileWriter.write("I'm learning Java...");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//Read a file
		File readFile = new File("test.txt");
		try {
			Scanner sc = new Scanner(readFile);
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		File deleteFile = new File("test.txt");
		if(deleteFile.delete()) {
			System.out.println("File has been deleted : "+deleteFile.getName());
		} else {
			System.out.println("Error occured while deleting file");
		}
	}

}
