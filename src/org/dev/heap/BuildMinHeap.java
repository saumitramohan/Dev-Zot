package org.dev.heap;

import java.util.Arrays;

public class BuildMinHeap {
	private int capacity = 10;
	private int size = 0;
	int[] item = new int[capacity];

	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}

	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}

	private boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	private int getLeftChild(int index) {
		return item[getLeftChildIndex(index)];
	}

	private int getRightChild(int index) {
		return item[getRightChildIndex(index)];

	}

	private int getParent(int index) {
		return item[getParentIndex(index)];
	}

	private void swap(int index_1, int index_2) {
		int temp = item[index_1];
		item[index_1] = item[index_2];
		item[index_2] = temp;

	}

	private void ensureExtraCapacity() {
		if (size == capacity) {
			item = Arrays.copyOf(item, capacity * 2);
			capacity = capacity * 2;
		}
	}

	public int peek() {
		if (size < 0)
			throw new ArrayIndexOutOfBoundsException();
		return item[0];

	}

	public int poll() {
		if (size < 0)
			throw new ArrayIndexOutOfBoundsException();
		int value = item[0];
		item[0] = item[size - 1];
		size--;
		heapifyDown();
		return value;

	}

	public void add(int value) {
		ensureExtraCapacity();
		item[size] = value;
		size++;
		heapifyUp();
	}

	private void heapifyUp() {
		// Compare with parent
		int index = size -1;
		while (hasParent(index) && getParent(index) > item[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	private void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			if  (item[index] < item[smallerChildIndex]) {
				break;
			}
			else
				swap (smallerChildIndex , index);
			index = smallerChildIndex;
		}

	}
	public void display() {
		for (int i =0 ; i<size;i++) {
			System.out.println(item[i]);
		}
	}
	public static void main(String args[]) {
		BuildMinHeap object = new BuildMinHeap();
		object.add(1);
		object.add(12);
		object.add(10);
		object.add(17);
		object.add(11);
		object.add(0);
		System.out.println(object.poll());
		System.out.println(object.poll());
		System.out.println(object.poll());
		System.out.println(object.poll());
		//object.display();
	}
	

}
