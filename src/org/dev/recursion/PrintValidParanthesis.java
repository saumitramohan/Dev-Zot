package org.dev.recursion;

public class PrintValidParanthesis {
	
	 static void _printParenthesis(char str[], int pos, int n, int open, int close)
	    {
	        if(close == n) 
	        {
	            // print the possible combinations
	            for(int i=0;i<str.length;i++)
	                System.out.print(str[i]);
	            System.out.println();
	           // return;
	        }
	        else
	        {
	        	
	            if(open > close) {
            		System.out.println("In block 1 : "+pos);

	                str[pos] = '}';
	                _printParenthesis(str, pos+1, n, open, close+1);
	            }
	            if(open < n) {
	            		System.out.println("In block 2 : "+pos);
	                str[pos] = '{';
	                _printParenthesis(str, pos+1, n, open+1, close);
	            }
	        }
	    }
	     
	    // Wrapper over _printParenthesis()
	    static void printParenthesis(char str[], int n)
	    {
	        if(n > 0)
	        _printParenthesis(str, 0, n, 0, 0);
	        return;
	    }
	     
	    // driver program 
	    public static void main (String[] args) 
	    {
	        int n = 2;
	        char[] str = new char[100];
	        printParenthesis(str, n);
	    }

}
