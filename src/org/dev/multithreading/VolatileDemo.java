package org.dev.multithreading;

import java.util.Scanner;

class Run extends Thread {

	private volatile boolean running = true;

	public void run() {
			while (running) {
				System.out.println("Thread is running : " + this.getName() + " -- " + this.getPriority());
			}
	}
	
	public void shutDown() {
		running = false;
	}

}

public class VolatileDemo {

	public static void main(String args[]) {
		
		Run runnable = new Run();
		System.out.println("Press Enter key to stop");
		runnable.start();
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		runnable.shutDown();
		

	}

}
