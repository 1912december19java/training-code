package com.revature.threadsdemo;

public class ComputingObject {
	
	private int myValue = 0;
	
	public synchronized void expensiveCompute() {
		for(int i=0;i<75;i++) {
			int currentValue = getMyValue();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setMyValue(currentValue + 1);
		}
	}
	
	public int getMyValue() {
		return myValue;
	}
	
	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	

}
