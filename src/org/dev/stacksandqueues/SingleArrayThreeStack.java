package org.dev.stacksandqueues;

import java.util.EmptyStackException;

public class SingleArrayThreeStack {
	private int numOfStack = 3;
	private int singleStackSize;
	private int stackArray[];
	private int topOfIndividualStack[];
	
	SingleArrayThreeStack (int singleStackSize){
		stackArray = new int[singleStackSize * this.numOfStack];
		topOfIndividualStack = new int [numOfStack];
		this.singleStackSize = singleStackSize;
	}
	public void push (int stackNumber, int value) {
		int top = topOfIndividualStack[stackNumber-1];
		if (isStackFull(stackNumber)) {
			throw new StackOverflowError();
		}
		stackArray[((stackNumber-1)*this.singleStackSize) + top] = value;
		top++;
		topOfIndividualStack[stackNumber-1] = top;
	}
	public int pop(int stackNumber) {
		int top = topOfIndividualStack[stackNumber];
		int value;
		if (top < 0) {
			throw new EmptyStackException();
			
		}
		else {
			value = stackArray[((stackNumber-1) * this.singleStackSize) + top];
			top --;
			topOfIndividualStack[stackNumber] = top;
			return value;	
	 }
	}
	
	private boolean isStackFull(int stackNumber) {
		return this.topOfIndividualStack[stackNumber-1] == this.singleStackSize;
	}
	
	public void display() {
		for(int i=0; i< this.singleStackSize *3; i++) {
			System.out.println(stackArray[i]);
		}
	}
	public static void main (String args[]) {
		SingleArrayThreeStack object = new SingleArrayThreeStack(5);
		object.push(1, 1);
		object.push(1, 2);
		object.push(1, 3);
		object.push(1, 3);
		object.push(1, 3);
		object.push(1, 3);
		

	}
	

}
