package com.revature.objectoriented;

public class Driver {

	public static void main(String[] args) {
		//demoVehicle();
		demoTruck();
	}
	
	private static void demoVehicle() {
		Vehicle adamsVehicle = new Vehicle(15.0, 90, "tan", "mitsubishi");
		Vehicle coreysVehicle = new Vehicle(15.0, 120, "black", "mazda");
		Vehicle jessesVehicle = new Vehicle(15.0, 100, "white", "honda");
		int i = 3;
		long el = 3L;
		
		System.out.println(adamsVehicle);
		
		adamsVehicle.turnOn();
		adamsVehicle.drive();
		adamsVehicle.refuel(5.0);
		
		System.out.println(adamsVehicle);
	}
	
	private static void demoTruck() {
		Truck adamsTruck = new Truck(4.0, 370, "brown", "toyota", 300, 400);
		
		adamsTruck.turnOn();
		
		adamsTruck.tow(200);
		adamsTruck.tow(400);
		adamsTruck.tow(300);
		adamsTruck.tow(200);
		adamsTruck.tow(200);
		adamsTruck.tow(200);
		
		
	}
	
	

}
