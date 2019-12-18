package com.revature.objectoriented;

public class Truck extends Vehicle {

	Integer towingPower;
	Integer bedCapacity;

	Truck(Double fuel, Integer topSpeed, String color, String model,
			Integer towingPower, Integer bedCapacity) {
		super(fuel, topSpeed, color, model);
		this.towingPower = towingPower;
		this.bedCapacity = bedCapacity;
	}
	
	void tow(Integer weight) {
		if(weight <= this.towingPower) {
			this.drive();
		} else {
			System.out.println("Failed to tow");
		}
	}

}
