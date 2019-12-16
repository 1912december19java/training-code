package com.revature.adventure;

import java.util.Scanner;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Boolean hasGivenValidInput = false;
		
		while(!hasGivenValidInput) {
			
			System.out.println("You find yourself in a brightly lit hallway.  There are doors to the NORTH and the SOUTH.");
			String userString = sc.nextLine();
			
			if (userString.equalsIgnoreCase("south")) {
				System.out.println("This room is under construction.  Your adventure is over.");
				hasGivenValidInput = true;
			} else if (userString.equalsIgnoreCase("north")) {
				System.out.println("This room is full of spiders." +
						"Do you want to leave the adventure?");
				String leaveAdventureConfirmation = sc.nextLine();
				while(!leaveAdventureConfirmation.equalsIgnoreCase("yes")) {
					System.out.println("There are really a lot of spiders, are you sure?");
					leaveAdventureConfirmation = sc.nextLine();
				}
				hasGivenValidInput = true;
			} else {
				System.out.println("Invalid input");
			}
		}
	}

}
