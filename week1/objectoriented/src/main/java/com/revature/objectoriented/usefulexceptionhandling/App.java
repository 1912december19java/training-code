package com.revature.objectoriented.usefulexceptionhandling;

import com.revature.objectoriented.InsufficientTowingPowerException;
import com.revature.objectoriented.OutOfFuelException;
import com.revature.objectoriented.Truck;

public class App {

	public static void main(String[] args) {
		Truck adamsTruck = new Truck(4.0, 370, "brown", "toyota", 300, 400);
		String towingTestResults = null;
		adamsTruck.turnOn();
		while(towingTestResults == null) {
			try {
				towingTestResults = testTowingPower(adamsTruck);
			} catch (OutOfFuelException e) {
				System.out.println("Refueling the truck");
				adamsTruck.refuel(50.0);
			}
		}
		System.out.println(towingTestResults);

	}
	
	/**
	 * This method assumes the Truck passed into it has sufficient fuel.
	 * @param truck
	 * @throws OutOfFuelException
	 */
	private static String testTowingPower(Truck truck) throws OutOfFuelException {
		for(int testValue=50;testValue<=500;testValue += 50) {
			try {
				truck.tow(testValue);
			} catch (InsufficientTowingPowerException e) {
				return "This truck failed to tow " + testValue + " units";
			}
		}
		return "This truck passed the towing test!";
	}

}
