package org.dev.warmup;

import java.util.HashSet;
import java.util.Map;

public class fixed_distance {
	static int countPairsWithDiffK(int arr[], int n, int k){
		 	int count = 0;  
		    HashSet hSet = new HashSet();
		    for (int i = 0; i < arr.length; i++){
		    	hSet.add(arr[i]);
	        }
		    for (int i = 0; i < arr.length; i++){
		        if (hSet.contains(arr[i]-k) || hSet.contains(arr[i]+k))
		            count++;
//	            if(hSet.contains(arr[i]+k))
//	                count++;
		    }
		    return count;  
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3};
		int n = 5;
		int k = 2;
		 int count = countPairsWithDiffK(arr, n, k);
		 System.out.println("count:: "+count);
		 
	}
}
