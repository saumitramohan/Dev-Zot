package org.dev.divideandconquer;

public class MergeSort {
	static int numberOfInversions = 0;
	public static void main(String args[] ) {
		int arr[] = {1, 20, 6, 4, 5};
		sort(arr,0,arr.length-1);
		for (int i =0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.print("Number of inversions: "+numberOfInversions);
	}

	private static void sort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (j > i) {
			int mid = (j + i)/2;
			sort(arr, i, mid);
			sort(arr, mid+1, j);			
			merge(arr, i, mid, j);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int length1 = mid - start + 1;
		int length2 = end - mid;
		int left[] = new int[length1];
		int right[] = new int[length2];
		for (int index =0; index < length1; index++) {
			left[index] = arr[start+index];
		}
		for (int index =0; index < length2; index++) {
			right[index] = arr[mid+index+1];
		}
		int leftIndex = 0;
		int rightIndex = 0;
		int index = start;
		while (leftIndex < length1 && rightIndex < length2) {
			if (left [leftIndex] < right[rightIndex]) {
				arr[index] = left[leftIndex];
				leftIndex ++;
			}
			else {
				arr[index] = right[rightIndex];
				rightIndex++;
				numberOfInversions += (mid - leftIndex)+1;
			}
			index++;
		}
		while (leftIndex < length1) {
			arr[index] = left[leftIndex];
			leftIndex++;
			index++;
		}
		while (rightIndex < length2) {
			arr[index] = right[rightIndex];
			rightIndex++;
			index++;
		}
			
		
	}

}
