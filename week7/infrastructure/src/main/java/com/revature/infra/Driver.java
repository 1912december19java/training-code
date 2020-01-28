package com.revature.infra;

import com.revature.infra.beans.House;
import com.revature.infra.beans.WaterTower;

public class Driver {
	
	public static void main(String[] args) {
		//Let's off with manual config in Java, NO SPRING
		WaterTower wt = new WaterTower();
		wt.setResource("water");
		House adamsHouse = new House();
		adamsHouse.setName("Adam's Hosue");
		adamsHouse.setWaterTower(wt);
		
		adamsHouse.checkStatus();
	}

}
