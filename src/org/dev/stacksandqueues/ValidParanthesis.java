package org.dev.stacksandqueues;

import java.util.Stack;

public class ValidParanthesis {
	
	class Solution {
	    public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        // char c[] = new  char[s.length()];
	        if (s.length() %2 != 0){
	            return false;
	        }
	        for (int i =0; i< s.length(); i++){
	            char c = s.charAt(i);
	            if ( c == '('){
	                stack.push(')');
	            }
	            else if (c == '{')
	                stack.push('}');
	            else if (c == '[')
	                stack.push(']');
	            else if (stack.isEmpty() || stack.pop() != c)
	                return false;       
	        }
	        return stack.isEmpty();
	        
	    }
	}

}
