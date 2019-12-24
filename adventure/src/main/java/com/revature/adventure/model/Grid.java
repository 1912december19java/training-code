package com.revature.adventure.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.revature.adventure.exceptions.RoomNotFound;

public class Grid {
	
	/**
	 * A Map that maps Points to Rooms
	 */
	Map<Point, Room> coordinateRegistry;
	
	public Grid() {
		this.coordinateRegistry = new HashMap<Point, Room>();
	}
	
	public Room get(int x, int y) {
		Room room = coordinateRegistry.get(new Point(x,y));
		if (room == null) {
			throw new RoomNotFound();
		} else {
			return room;
		}
	}
	
	public Room get(Point p) {
		Room room = coordinateRegistry.get(p);
		if (room == null) {
			throw new RoomNotFound();
		} else {
			return room;
		}
	}
	
	
	/**
	 * Add room to the grid, overwriting if necessary.
	 * @param room
	 * @param x
	 * @param y
	 */
	public void add(Room room, int x, int y) {
		coordinateRegistry.put(new Point(x,y), room);
	}

	
	
}
