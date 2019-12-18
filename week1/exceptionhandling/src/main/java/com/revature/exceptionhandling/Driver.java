package com.revature.exceptionhandling;

import java.io.IOException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Driver {
	
	// single line comment
	
	/*
	 * multi 
	 * line comments
	 */

	/**
	 * This is a javadoc
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Files.createDirectory(Paths.get("thisUriWillFail"));
		} catch (FileSystemLoopException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This always* runs");
		}

	}

}
