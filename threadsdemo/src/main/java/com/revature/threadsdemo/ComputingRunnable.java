package com.revature.threadsdemo;

public class ComputingRunnable implements Runnable {
	
	ComputingObject myComputingObject;
	
	public ComputingRunnable(ComputingObject objectToCompute) {
		this.myComputingObject = objectToCompute;
	}
	
	@Override
	public void run() {
		this.myComputingObject.expensiveCompute();
	}

}
