package org.dev.multithreading;

public class AnonymousThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Value of i" + i);
				}
			}

		});

		t1.start();

	}

}
