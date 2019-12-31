package com.revature.adventure.services;

import java.awt.Point;

import javax.net.ssl.SSLEngineResult.Status;

import com.revature.adventure.controllers.RoomController;
import com.revature.adventure.model.Grid;

/**
 * @author Revature
 *
 */
public class GridService {
	
	private Grid grid;
	private Point currentCoordinates;
	private RoomController roomController;
	
	public GridService(Grid grid, Point startingCoordinates, RoomController rc) {
		this.grid = grid;
		this.currentCoordinates = startingCoordinates;
		this.roomController = rc;
		this.roomController.setRoom(this.grid.get(currentCoordinates));
	}
	
	public void adventureLoop() {
		while(true) {
			roomController.enter();
			//Working with a Grid in gridservice so we know it'll be a direction
			String direction = roomController.acceptOptionFromUser();
			
			switch (direction) {
			case "NORTH":
				currentCoordinates.translate(0, 1);
				break;
			case "SOUTH":
				currentCoordinates.translate(0, -1);
				break;
			case "EAST":
				currentCoordinates.translate(1, 0);
				break;
			case "WEST":
				currentCoordinates.translate(-1, 0);
				break;
			default:
				throw new RuntimeException("Direction not recognized");
			}
			
			roomController.setRoom(grid.get(currentCoordinates));
		}
	}
	
}
