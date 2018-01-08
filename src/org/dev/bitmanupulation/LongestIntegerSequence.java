package org.dev.bitmanupulation;

public class LongestIntegerSequence {
	
	 public static void main(String[] args)
	    {
	        int arr[] = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1};
	        int n = arr.length;
	        System.out.println("Maximum count is"+ 
	                           maxOnesIndex(arr, n));        
	    }

	private static String maxOnesIndex(int[] arr, int n) {
		// TODO Auto-generated method stub
		int curr_pointer = 0;
		int z_pointer = -1;
		int nz_pointer = -1;
		int count = 0 ;
		int max_count = 0;
		while (curr_pointer < arr.length) {
			if (arr[curr_pointer] == 0 ) {
				z_pointer = nz_pointer ;
				nz_pointer = curr_pointer;
				if (z_pointer != -1) {
					if(count > max_count) {
						max_count = count;
					}
					count = 0;
				}
				
				
			}
			count++;
			curr_pointer++;
		}
		return Integer.toString(max_count);
	}

}
