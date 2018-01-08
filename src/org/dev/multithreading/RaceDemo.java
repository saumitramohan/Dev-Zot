package org.dev.multithreading;

public class RaceDemo {
	public static void main(String args[]) {
		Race racer = new Race();
		Thread t = new Thread(racer,"Tortise");
		Thread h = new Thread(racer,"Hare");
		t.start();
		h.start();

	}

}
