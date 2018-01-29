package com.github.eduzol.hackerrank.brackets;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        
    	List<Character> openingBracket = Arrays.asList( new Character[] {'(','[','{'});
    	List<Character> closingBracket =Arrays.asList( new Character[] {')',']','}'}) ;
    	
    	Deque<Character> stack = new LinkedList<Character>();
    	
    	char[] arr = expression.toCharArray();
    	
    	for ( char e : arr ) {
    		
    		boolean isOpeningBracket = openingBracket.contains(e);
    		boolean isClosingBracket = closingBracket.contains(e);
    		
    		if( isOpeningBracket) {
    			stack.push(e);
    		}
    		
    		if ( isClosingBracket) {
    			
    			if ( stack.isEmpty() ) {
    				return false;
    			}
    			
    			Character last = stack.pop();
    			boolean isOpenBracket = openingBracket.contains(last);
    			if ( isOpenBracket) {
    				
    				boolean match = closingBracket.indexOf(e) == openingBracket.indexOf(last);
    				if ( !match ) {
    					return false;
    				}
    				
    			}else {
    				//is not an opening bracket , invalid string
    				return false;
    			}
    			
    		}
    	}
    	
    	return stack.isEmpty();    	
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
