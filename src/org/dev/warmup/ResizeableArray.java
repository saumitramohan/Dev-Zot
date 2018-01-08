package org.dev.warmup;

public class ResizeableArray {
	
	private int[] items = new int[8];
	private int size = 0;
	
	public int size() {
		return size;
	}
	
	public void set(int element, int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		items[index] = element;
	}
	
	public int get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return items[index];
	}
	public void append(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size++;
		
	}
	
	public void ensureExtraCapacity() {
		if(size == items.length) {
			int [] copy = new int [size*2];
			System.arraycopy(items, 0, copy, 0, size);
			items = copy;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizeableArray arr = new ResizeableArray();
		arr.append(1);
		arr.append(2);
		arr.append(3);
		arr.append(4);
		arr.append(5);
		arr.get(1);
		System.out.println("Element 0:: "+ arr.get(1));
		System.out.println("Element 1:: "+ arr.get(0));
		System.out.println("Element 2:: "+ arr.get(3));


	}

}
