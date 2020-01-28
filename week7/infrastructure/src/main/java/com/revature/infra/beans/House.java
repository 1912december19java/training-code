package com.revature.infra.beans;

public class House extends Residence {
	
	private WaterTower waterTower;

	public WaterTower getWaterTower() {
		return waterTower;
	}

	public void setWaterTower(WaterTower waterTower) {
		this.waterTower = waterTower;
	}
	
	public void checkStatus() {
		System.out.println("Here's the state of things in " + this.getName());
		if(this.waterTower == null) {
			System.out.println("No water tower is associated with this House");
		} else if(this.waterTower.hasResource()) {
			System.out.println("This house is receiving " + this.waterTower.getResource());
		} else {
			System.out.println("A water tower exists but doesn't contain water");
		}
	}

}
