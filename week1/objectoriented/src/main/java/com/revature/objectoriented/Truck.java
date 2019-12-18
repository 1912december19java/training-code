package com.revature.objectoriented;

public class Truck extends Vehicle {

	Integer towingPower;
	Integer bedCapacity;

	public Truck(Double fuel, Integer topSpeed, String color, String model,
			Integer towingPower, Integer bedCapacity) {
		super(fuel, topSpeed, color, model);
		this.towingPower = towingPower;
		this.bedCapacity = bedCapacity;
	}
	
	public void tow(Integer weight) throws OutOfFuelException, InsufficientTowingPowerException {
		if(weight <= this.towingPower) {
			this.drive();
		} else {
			throw new InsufficientTowingPowerException();
		}
	}

}
