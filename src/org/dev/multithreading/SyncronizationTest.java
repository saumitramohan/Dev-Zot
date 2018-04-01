package org.dev.multithreading;

import java.util.concurrent.SynchronousQueue;

class PrintDemo {
	public void printCount() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Counter value - " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}

	}

}

class ThreadDemoTest implements Runnable {

	private Thread thread;
	private String name;
	PrintDemo pd;

	public ThreadDemoTest(String name, PrintDemo pd) {
		this.name = name;
		this.pd = pd;
	}

	@Override
	public void run() {
		synchronized (this.pd) {
			this.pd.printCount();
		}
		System.out.println("ThreadExicted" + this.name);

		

	}

	public void start() {
		if (this.thread == null) {
			System.out.println("Starting thread - " + this.name);
			thread = new Thread(this, this.name);
			this.thread.start();

		}
	}

}

public class SyncronizationTest {
	public static void main(String args[]) {
		PrintDemo pd = new PrintDemo();
		ThreadDemoTest objectOne = new ThreadDemoTest("Thread-One",pd);
		objectOne.start();
		ThreadDemoTest objectTwo = new ThreadDemoTest("Thread-Two",pd);
		objectTwo.start();
		
	}
	

}
