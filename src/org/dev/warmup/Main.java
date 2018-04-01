package org.dev.warmup;

import java.util.Arrays;
import java.util.Comparator;

class BinaryComparator implements Comparator<Integer>{
    
    public int getNumberOfBitsSet(Integer num){
        int count = 0;
        while (num > 0)
        {
            num &= (num - 1) ;
            count++;
        }
        return count;
    }
    
    public int compare(Integer o1, Integer o2){
        int diff = getNumberOfBitsSet(o2) - getNumberOfBitsSet(o1);
        if(diff == 0){
            return o2-o1;
        }
        return diff;
    }
}

public class Main {
    
    public static void sortBinary(Integer[] arr){
        Arrays.sort(arr, new BinaryComparator());
    }
    
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        sortBinary(arr);
        for(Integer value: arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}