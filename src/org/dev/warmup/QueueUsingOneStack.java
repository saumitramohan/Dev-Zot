package org.dev.warmup;

import java.util.Stack;

public class QueueUsingOneStack {
	Stack <Integer> myStack ; 
	public QueueUsingOneStack() {
		myStack = new Stack<Integer>();
	}
	
	private void push (int x) {
		myStack.push(x);
	}
	
	private int pop() {
		return myStack.pop();
	}
	
	public void enqueue (int x){
		push (x);
	}
	
	
	public Integer dequeue () {
		
		int x, res = 0;
		if (myStack.isEmpty())
			return null;
		if (myStack.size() == 1) {
			return pop();
		}
		else {
			x = pop();
			res = dequeue();
			push(x);
			return res;
		}
}
	public static void main (String args[]) {
		QueueUsingOneStack queue = new QueueUsingOneStack();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		System.out.println(queue.dequeue());
	}
}
