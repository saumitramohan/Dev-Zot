package org.dev.dp;

public class EditDIstance {

	    public int minDistance(String word1, String word2) {
	        int dp[][] = new int[word1.length()+1][word2.length()+1];
	        
	        return editDistance(word1,word2,word1.length(), word2.length(), dp);
	        
	    }
	    public static int editDistance(String word1, String word2, int length1, int length2, int dp[][]){
	        if (dp[length1][length2]!=0){
	            return dp[length1][length2];
	        }
	        if (length1 == 0){
	            dp [length1][length2] = length2;
	            return length2;
	        }
	        if (length2 == 0){
	             dp [length1][length2] = length1;
	            return length1;
	        }
	        if (word1.charAt(length1-1) == word2.charAt(length2-1)){
	            dp [length1][length2] = editDistance(word1,word2,length1-1,length2-1,dp);
	            return dp [length1][length2];
	        }
	        else{
	            dp[length1][length2] = 1 + Math.min(Math.min(editDistance(word1,word2,length1,length2-1,dp), editDistance(word1,word2,length1-1,length2,dp)),editDistance(word1,word2,length1-1,length2-1,dp));
	            return dp[length1][length2];
	        }
	    }
	}

