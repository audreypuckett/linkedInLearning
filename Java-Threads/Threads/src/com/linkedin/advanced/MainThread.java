package com.linkedin.advanced;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		FirstThread thread1 = new FirstThread(5); // Class extending Thread
		/*
		 * calling the run method directly would take this from being a thread to being a normal class
		 */
		thread1.start();
		/*
		 * to illustrate how this is multi-threaded, 
		 * we can place the creation and call to start into a for...loop  
		 */
		
		
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
		
		// interrupt(), interrupted(), and isInterrupted()
//		Thread taskThread = new Thread(new MyRunnable());
//		taskThread.start();
//		//Thread.sleep(3000);
//		taskThread.interrupt();
//		Thread.sleep(3000); // moving to give some time to the task thread before it is interrupted.
//		System.out.println(taskThread.isInterrupted());
		
		
		// join()
		/*
		 * If two threads are sharing resources, you can use the join method
		 * to have the second thread wait while the first completes the initial use 
		 * (e.g., changing a variable from null to containing a value)
		 * When you do not specify when you want later threads to join, they will be ran in a random order and the 
		 * output may not be what you intended.
		 */
		
		//example of join
		
//		int[] marks = new int[10];
//		Thread marksThread = new Thread(new Marks(marks));
//		Thread averageThread = new Thread(new Average(marks));
//		marksThread.start();
//		marksThread.join();
//		averageThread.start();
		
		// getId()
		
		/*
		 * Finds the unique identifier of a thread
		 * public long getId()
		 * Returns a positive number
		 * ID is generated at the time of thread creation
		 * ID can be used by another thread after the current thread using it is terminated.
		 */
		
		// getName()
		/*
		 * Returns the name of the thread on with it's invoked
		 */
		
		// getPriority()
		
		/*
		 * Thread gets a priority at creation time
		 * MIN_PRIORITY -1 and MAX_PRIORITY - 10
		 * getPriority() gives the priority of a thread
		 * Returns an int value between 1 and 10
		 */
		
		// getState()
		/*
		 * returns the status
		 *  -- New, Runnable, Blocked, Terminated, Timed_Waiting, Waiting
		 *  Return value is an enum constant defined in the enum class Thread.State
		 */
	
	}

}
