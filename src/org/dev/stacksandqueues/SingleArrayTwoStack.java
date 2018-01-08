package org.dev.stacksandqueues;

public class SingleArrayTwoStack {
	int size;
	int top1,top2;
	int []arr;
	
	SingleArrayTwoStack (int size){
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}
	public void push1 (int data) {
		if (top1 >= top2) {
			throw new StackOverflowError();
		}
		arr[++top1] = data;
	}
	public void push2 (int data) {
		if (top1 >= top2) {
			throw new StackOverflowError();
		}
		arr[--top2] = data;
	}
	public int pop1 () {
		if (top1 < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[top1--] ;
	}
	public int pop2 () {
		if (top2 < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[top2--];
	}
	public void display() {
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main (String args[]) {
		SingleArrayTwoStack object = new SingleArrayTwoStack(10);
		object.push1(1);
		object.push2(10);
		object.push1(2);
		object.push2(9);
		//object.display();
		System.out.println(object.pop1());
		System.out.println(object.pop1());

		//object.pop2();
		//object.display();
		
	}
	

}
