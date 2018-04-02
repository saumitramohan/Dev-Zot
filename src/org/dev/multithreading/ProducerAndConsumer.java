package org.dev.multithreading;

import java.util.LinkedList;
import java.util.Random;

public class ProducerAndConsumer{
	static LinkedList <Integer> list = new LinkedList<Integer>();
	public static int LIMIT = 10;
	static Object lock = new Object();
	
	public static void Producer () {
		while(true) {	
			synchronized (lock) {
				while (list.size() == LIMIT) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				Random rand = new Random();
				list.add(rand.nextInt(100));
				lock.notify();

			}
			
		}
	}
	
	public static void Consumer () {
		while(true) {
			synchronized (lock) {
				while (list.size() == 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.print("List size is :"+list.size());
				System.out.println("; Element removed"+list.removeFirst());
				lock.notify();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}
	
	public static void main (String args[]) {
		
		Thread t1 = new Thread (new Runnable(){
			@Override
			public void run() {	
				Producer ();
			}
		});
		Thread t2 = new Thread (new Runnable(){
			@Override
			public void run() {	
				Consumer ();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
