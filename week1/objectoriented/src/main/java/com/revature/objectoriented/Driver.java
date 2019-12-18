package com.revature.objectoriented;

public class Driver {

	public static void main(String[] args) {
		demoVehicle();
		demoTruck();
		Driver objectDriver = new Driver();
		objectDriver.demoScope();

	}
	
	private static void demoVehicle() {
		Vehicle adamsVehicle = new Vehicle(15.0, 90, "tan", "mitsubishi");
		Vehicle coreysVehicle = new Vehicle(15.0, 120, "black", "mazda");
		Vehicle jessesVehicle = new Vehicle(15.0, 100, "white", "honda");
		
		adamsVehicle = jessesVehicle;

		int topSpeed = jessesVehicle.topSpeed;
		int i = 3;
		long el = 3L;
		
		System.out.println(adamsVehicle);
		
		adamsVehicle.turnOn();
		adamsVehicle.drive();
		adamsVehicle.refuel(5.0);
		
		System.out.println(adamsVehicle);
	}
	
	public static void demoTruck() {
		Truck adamsTruck = new Truck(4.0, 370, "brown", "toyota", 300, 400);
		
		adamsTruck.turnOn();
		
		adamsTruck.tow(200);
		adamsTruck.tow(400);
		adamsTruck.tow(300);
		adamsTruck.tow(200);
		adamsTruck.tow(200);
		adamsTruck.tow(200);
		
	}
	
	void demoScope() {
		Vehicle jessesVehicle = new Vehicle(15.0, 100, "white", "honda");
		
		int v = Vehicle.NUMBER_OF_WHEELS;
		//dont do this, use the class:
		//int otherWayToGetWheels = jessesVehicle.NUMBER_OF_WHEELS;
		int topSpeed = jessesVehicle.topSpeed;
		System.out.println("number of wheels in static scope, vehicle class: " + v);
		System.out.println("top speed of jesse's vehicle in object scope, " +
				"instance of Vehicle class: " + topSpeed);
		
	}
	
	

}
