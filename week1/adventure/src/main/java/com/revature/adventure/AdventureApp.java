package com.revature.adventure;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.revature.adventure.controllers.RoomController;
import com.revature.adventure.model.Grid;
import com.revature.adventure.model.Room;
import com.revature.adventure.services.GridService;

public class AdventureApp {

	public static void main(String[] args) {

		String roomOnePrompt = "You find yourself in a laboratory.";
		String roomTwoPrompt = "You find yourself in a library.";
		String roomThreePrompt = "You find yourself in a forest.";

		Set<String> roomOneOptions = new HashSet<String>(Arrays.asList("NORTH", "SOUTH"));
		Set<String> roomTwoOptions = new HashSet<String>(Arrays.asList("SOUTH"));
		Set<String> roomThreeOptions = new HashSet<String>(Arrays.asList("NORTH", "SOUTH", "EAST", "WEST"));

		Room roomOne = new Room(roomOneOptions, roomOnePrompt);
		Room roomTwo = new Room(roomTwoOptions, roomTwoPrompt);
		Room roomThree = new Room(roomThreeOptions, roomThreePrompt);

		Grid adventure = new Grid();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				adventure.add(roomThree, i, j);
			}
		}

		adventure.add(roomTwo, 2, 3);
		adventure.add(roomTwo, 1, 3);
		adventure.add(roomTwo, 3, 1);

		adventure.add(roomOne, 2, 2);
		adventure.add(roomOne, 4, 4);

		RoomController roomController = new RoomController();

		GridService gs = new GridService(adventure, new Point(3, 3), roomController);

		gs.adventureLoop();

	};

}
