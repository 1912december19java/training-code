package com.revature.threadsdemo;

public class MyPrintingRunnable implements Runnable {
	
	private String name;
	
	public MyPrintingRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(name + ", step: " + i);
		}
	}

}
