package org.dev.multithreading;

public class RunnableThreadExample implements Runnable {
// Object of this class is a runnable object
	// Create an object of thread type passing runnable object as an argument to the constructor
	// The thread object has now runnable object that implements run method
	// The start method is invoked on the thread object created in the previous step
	
	public int count = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable thread starting");
		try {
			while (count < 5) {
				Thread.sleep(500);
				count ++;
			}
		}
		catch(InterruptedException exe) {
			System.out.println("Runnable thread interrupted");
		}
		System.out.println("Runnable thread terminated");
	}
	
	public static void main(String args[]) {
		RunnableThreadExample instance = new RunnableThreadExample();
		Thread thread = new Thread(instance);
		
		thread.start();
		while(instance.count!= 5) {
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException exe) {
				exe.printStackTrace();
			}
		}
	}

}
