package com.revature.adventure;

import java.util.Scanner;

public class AdventureApp {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Integer userNumber = sc.nextInt();
		System.out.println("Here's your number: " + userNumber);
	}

}
