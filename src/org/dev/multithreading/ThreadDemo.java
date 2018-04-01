package org.dev.multithreading;

public class ThreadDemo implements Runnable {

	private Thread thread;
	private String name;
	
	public ThreadDemo (String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i =4; i > 0; i-- ) {
				System.out.println("Running thread in run method ::"+this.name);
				System.out.println("Value of i"+i);
				thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Thread interrupted :: "+this.name);
		}
		System.out.println("Completed Execution of Thread ::" + this.name);
	}
	
	public void start() {
		System.out.println("Starting thread ::"+ this.name);
		if (thread == null) {
			thread = new Thread(this, this.name);
			thread.start();
		}
		
	}
	
	public static void main (String args[]) {
		 ThreadDemo demo = new ThreadDemo("Thread-one");
		 demo.start();
		 ThreadDemo demo2 = new ThreadDemo("Thread-two");
		 demo2.start();

}
}

