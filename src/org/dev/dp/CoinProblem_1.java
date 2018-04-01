package org.dev.dp;

import java.util.HashMap;

class CoinProblem_1 {
    static HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
    public int change(int amount, int[] coins) {
        return numberOfCombinations(amount,coins,coins.length);
        
    }
    public static int numberOfCombinations(int amount, int[] coins, int index){
        if(map.containsKey(index))
            return map.get(index);
        if (amount == 0){
            return 1;
        }
        if (amount < 0){
            return 0;
        }
        if ((amount  > 0 && index <= 0))
            return 0;
        int count = numberOfCombinations(amount-coins[index-1], coins, index) + 
            numberOfCombinations(amount, coins, index-1);
        map.put(index, count);
        return map.get(index);
    }
     
}