package com.revature.adventure.controllers;

import java.util.Scanner;

import com.revature.adventure.model.Room;

/**
 * Responsible for user input and output on the console for a given room.
 * @author Revature
 *
 */
public class RoomController {
	
	private static Scanner sc = new Scanner(System.in);
	
	private Room room;
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void enter() {
		System.out.println(room.getPrompt());
		System.out.println("Options: " + room.getOptions());
	}
	
	/**
	 * Accepts user input with retry logic
	 * @return
	 */
	public String acceptOptionFromUser() {
		Boolean valid = false;
		String userInput = null;
		while(!valid) {
			userInput = sc.nextLine();
			valid = this.room.isValidOption(userInput);
			if(!valid) {
				System.out.println("Invalid option");
			}
		}
		return userInput.toUpperCase();
	}

}
