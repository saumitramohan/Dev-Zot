package org.dev.multithreading;

class Demo {
	private static int counter = 0;
	public synchronized static void increment() {
		counter++;
	}
	public static void printCounter() {
		System.out.println(counter);
	}
}

public class SyncDemo {

	public static void main(String args[]) {
		Thread s1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100000; i++) {
					Demo.increment();
				}
			}
		});
		Thread s2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100000; i++) {
					Demo.increment();
				}
			}
		});
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		} catch (Exception e) {
			System.out.println("Exception occured");
		}

		Demo.printCounter();

	}
}
