package org.dev.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SyncBlock {

	static Random random = new Random();
	public static List<Integer> list1 = new ArrayList<Integer>();
	public static List<Integer> list2 = new ArrayList<Integer>();

	static Object lock1 = new Object();
	static Object lock2 = new Object();

	public static void WorkerOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(10));
		}

	}

	public synchronized static void WorkerTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(10));
		}
	}

	public static void main(String args[]) {

		long startTime = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 2000; i++) {
					WorkerOne();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 2000; i++) {
					WorkerTwo();
				}
			}
		});

		t2.start();
		t1.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Time elapsed " + (endTime - startTime) + "Size of list one " + list1.size()
				+ "Size of list2 " + list2.size());

	}

}
