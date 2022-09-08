package com.linkedin.advanced;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.currentThread().getName());
//		FirstThread thread1 = new FirstThread(); // Class extending Thread
		// calling the run method directly would take this from being a thread to being a normal class
//		thread1.start();
		// to illustrate how this is multi-threaded, we can place the creation and call to start into a for...loop  
		
		
		// first example - creating threads
//		for(int count = 1; count <= 5; count++) {
//			FirstThread thread = new FirstThread(count);
//			thread.start();
//			System.out.println("From thread " + thread.getNumber());
//		}

//		MyRunnable runnable1 = new MyRunnable(); // Class implementing Runnable
//		Thread thread = new Thread(runnable1);
		
		// Third chapter - sleep example
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("Main thread is printing " + i);
//			if (i == 5) {
//				System.out.println("Main thread is pausing for 2 seconds ");
//				Thread.sleep(2000);
//			}
//		}
		
		// Interrupting a thread
//		Thread taskThread = new Thread(new MyRunnable());
//		taskThread.start();
//		//Thread.sleep(3000);
//		taskThread.interrupt();
//		Thread.sleep(3000); // moving to give some time to the task thread before it is interrupted.
//		System.out.println(taskThread.isInterrupted());
		
		
		// Join method 
		/*
		 * If two threads are sharing resources, you can use the join method
		 * to have the second thread wait while the first completes the initial use 
		 * (e.g., changing a variable from null to containing a value)
		 * When you do not specify when you want later threads to join, they will be ran in a random order and the 
		 * output may not be what you intended.
		 */
		
		//running two threads
		
		int[] marks = new int[10];
		Thread marksThread = new Thread(new Marks(marks));
		Thread averageThread = new Thread(new Average(marks));
		marksThread.start();
		marksThread.join();
		averageThread.start();
		
	}

}
