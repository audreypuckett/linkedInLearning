package com.linkedin.advanced;

public class FirstThread extends Thread{
	
	private int number;
	
	public FirstThread(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}

	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			// Going to call the static interrupted method
			if(Thread.interrupted()) {
				break; // the class received a request to interrupt its task.
			}
		}
	}
}
