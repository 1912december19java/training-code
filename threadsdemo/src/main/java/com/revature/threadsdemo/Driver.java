package com.revature.threadsdemo;

public class Driver {

	public static void main(String[] args) {
		//oneThreadDemo();
		//manyThreadsDemo();
		singleComputeDemo();

	}
	
	private static void singleComputeDemo() {
		ComputingObject computingObject = new ComputingObject();
		ComputingRunnable computingRunnable = new ComputingRunnable(computingObject);
		Thread thread = new Thread(computingRunnable);
		
		thread.start();
		
		ComputingRunnable secondComputingRunnable = new ComputingRunnable(computingObject);
		Thread secondThread = new Thread(secondComputingRunnable);
		
		secondThread.start();

		//we can wait for both threads to complete
		try {
			thread.join();
			secondThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("my value is: " + computingObject.getMyValue());
	}
	
	private static void manyThreadsDemo() {
		for(int i=0; i<100; i++) {
			MyPrintingRunnable mpr = new MyPrintingRunnable("Thread " + i);
			Thread thread = new Thread(mpr);
			thread.start();
		}
	}
	
	private static void oneThreadDemo() {
		MyPrintingRunnable mpr = new MyPrintingRunnable("Thread 1");
		Thread myThread = new Thread(mpr);
		
		myThread.start();
		
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<100;i++) {
			System.out.println("Main, step: " + i);
		}
	}
	


}