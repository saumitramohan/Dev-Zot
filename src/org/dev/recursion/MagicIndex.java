package org.dev.recursion;

public class MagicIndex {
	
	public static void main (String []args) {
		   int arr[] = {-10,-5,2,2,2,3,4,7,9,12,13};
		   int index = MagicIndex2.magicIndexDuplicates(arr);
		   System.out.println(findMagicIndex(arr));

	}
	public static int findMagicIndex(int []arr) {
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] == i) {
				return i;
			}
		}
		return -1;
	}

}
