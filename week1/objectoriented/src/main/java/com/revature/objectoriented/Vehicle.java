package com.revature.objectoriented;

public class Vehicle {
	
	Double fuel;
	Boolean running;
	Integer topSpeed;
	String color;
	String model;
	
	//This is the same as the default constructor
	Vehicle() {
		super();
	}
	
	//This is another constructor (overloading)
	Vehicle(Double fuel, Integer topSpeed, String color, String model) {
		super();
		this.fuel = fuel;
		this.running = false;
		this.topSpeed = topSpeed;
		this.color = color;
		this.model = model;
	}
	
	//This is a wacky case for example
	Vehicle(String wackyNameForColor) {
		super();
		this.model = wackyNameForColor;
		this.color = "Blue";
		this.topSpeed = wackyNameForColor.length();
	}
	
	void drive() {
		if (this.fuel > 0 && this.running) {
			System.out.println("Vroom.");
			this.fuel -= 1.0; //this.fuel = this.fuel - 1.0;
		} else {
			System.out.println("Failed to drive");
		}
	}
	
	void turnOn() {
		this.running = true;
	}
	
	void turnOff() {
		this.running = false;
	}
	
	void refuel(Double amount) {
		if (amount > 0.0) {
			this.fuel += amount;
		} else {
			System.out.println("Failed to refuel");
		}
	}

	@Override
	public String toString() {
		return "Vehicle [fuel=" + fuel + ", running=" + running + ", topSpeed=" + topSpeed + ", color=" + color
				+ ", model=" + model + "]";
	}
	
	

}
