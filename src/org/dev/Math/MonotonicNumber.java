package org.dev.Math;

public class MonotonicNumber {
	public int monotoneIncreasingDigits(int N) {
        StringBuilder sb = new StringBuilder();
        int digitArray[] = new int[9];
        int index = 0;
        boolean flag = false;
        while (N > 0){
            digitArray[index] = N % 10;
            N = N/10;
            index++;
        }
        for (int i = index -1 ; i >= 1; i--){
            if((digitArray [i] > digitArray[i-1])){
                digitArray[i] = digitArray[i] -1;
                for (int k = 0; k <=i-1; k++){
                    digitArray[k] = 9;
                    flag = true;
                }
            }
        }
        for (int i = index-1; i >=0; i--){
            sb.append(Integer.toString(digitArray[i]));
    }
        if(flag)
            return monotoneIncreasingDigits(Integer.parseInt(sb.toString()));
        else
            return Integer.parseInt(sb.toString());
}

}
