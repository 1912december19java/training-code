package com.revature.infra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.infra.beans.Cabin;
import com.revature.infra.beans.ComponentCabin;
import com.revature.infra.beans.House;
import com.revature.infra.beans.WaterTower;

public class Driver {
	
	public static void main(String[] args) {
		//Let's off with manual config in Java, NO SPRING
		/*
		WaterTower wt = new WaterTower();
		wt.setResource("water");
		House adamsHouse = new House();
		adamsHouse.setName("Adam's Hosue");
		adamsHouse.setWaterTower(wt);
		
		adamsHouse.checkStatus();
		*/
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		WaterTower wtBean = (WaterTower) ac.getBean("waterTower");
		//another option:
		//WaterTower wtBeanOption = ac.getBean(WaterTower.class);
		
		//true because singleton scope:
		//System.out.println(wtBean == wtBeanOption);
		
		House adamsHouse = ac.getBean("house", House.class);
		
		House adamsSummerHome = ac.getBean("house", House.class);
		

		adamsHouse.setName("Adam House");
		adamsSummerHome.setName("Summer Home");
		adamsHouse.checkStatus();
		adamsSummerHome.checkStatus();
		
		Cabin adamsCabin = ac.getBean("cabin", Cabin.class);
		Cabin adamsSummerCabin = ac.getBean("cabin", Cabin.class);
		
		adamsCabin.setName("Adam Cabin");
		adamsSummerCabin.setName("Adam Summer Cabin");
		
		adamsCabin.checkStatus();
		adamsSummerCabin.getWell().setResource("Lava");
		adamsSummerCabin.checkStatus();
		
		ComponentCabin adamsComponentCabin = ac.getBean(ComponentCabin.class);
		adamsComponentCabin.setName("Adam Component Cabin");
		adamsComponentCabin.checkStatus();
		
		//to close we need to cast:
		((ConfigurableApplicationContext) ac).close();
		
	}

}
