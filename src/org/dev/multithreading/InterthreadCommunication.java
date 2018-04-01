package org.dev.multithreading;

class Chat {

	boolean flag = false;

	public synchronized void Question(String msg) {
		if (flag) {
			try {
				System.out.println("Waiting!!");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag = true;
		notify();
	}

	public synchronized void Answer(String msg) {
		if (!flag) {
			try {
				System.out.println("Waiting -- 2!!");

				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag = false;
		notify();
	}
}

class T1 implements Runnable {

	private Thread thread;
	private String name;
	Chat c;

	public T1(String name, Chat c) {
		this.name = name;
		this.c = c;
		this.start();
	}

	@Override
	public void run() {
		String question[] = { "Hi", "How are you ??", "I am doing well too" };
		for (String s : question) {
			c.Question(s);

		}

	}

	public void start() {
		if (this.thread == null) {
			thread = new Thread(this, this.name);
			thread.start();

		}
	}
}

class T2 implements Runnable {

	private Thread thread;
	private String name;
	Chat c;

	public T2(String name, Chat c) {
		this.name = name;
		this.c = c;
		this.start();
	}

	@Override
	public void run() {
		String question[] = { "Hi", "I am doing well,How about you ??", "Great" };
		for (String s : question) {
			c.Answer(s);
		}

	}

	public void start() {
		if (this.thread == null) {
			thread = new Thread(this, this.name);
			thread.start();
		}
	}
}

public class InterthreadCommunication {
	public static void main(String srgs[]) {
		Chat c = new Chat();
		T1 objectOne = new T1("Person one",c);
		T2 objectTwo = new T2("Person two",c);

	}

}
