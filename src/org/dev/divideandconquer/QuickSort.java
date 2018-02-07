package org.dev.divideandconquer;

public class QuickSort {
	
	public static void main(String args[]) {
		int arr[] = {12,43,12,54,67,32,545,65};
		int start = 0;
		int end = arr.length-1;
		quickSort(arr,start,end);
		for (int i= 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void quickSort(int arr[],int start,int end) {
		if (start >= end) 
			return;
			
			int pivot = inPlacePartition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		
		
	}
	private static int inPlacePartition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = arr[end];
		int firstPointer = start;
		int lastPointer = end -1;
		while (firstPointer <= lastPointer) {
			while (firstPointer <= lastPointer && arr[firstPointer] <= pivot) {
				firstPointer++;
			}
			while(lastPointer >= firstPointer && arr[lastPointer] >= pivot) {
				lastPointer --;
			}
			if (firstPointer < lastPointer) {
				int temp = arr[firstPointer];
				arr[firstPointer] = arr[lastPointer];
				arr[lastPointer] = temp;
			}
		}
		int temp = pivot;
		arr[end] = arr[firstPointer];
		arr[firstPointer] = temp;
		return firstPointer;
	}

}
