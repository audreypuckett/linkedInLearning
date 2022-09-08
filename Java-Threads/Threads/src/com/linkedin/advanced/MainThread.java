package com.linkedin.advanced;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.currentThread().getName());
//		FirstThread thread1 = new FirstThread(); // Class extending Thread
		// calling the run method directly would take this from being a thread to being a normal class
//		thread1.start();
		// to illustrate how this is multi-threaded, we can place the creation and call to start into a for...loop  
		
		for(int count = 1; count <= 5; count++) {
			FirstThread thread = new FirstThread(count);
			thread.start();
			System.out.println("From thread " + thread.getNumber());
		}
//		
//		MyRunnable runnable1 = new MyRunnable(); // Class implementing Runnable
//		Thread thread = new Thread(runnable1);

	}

}
