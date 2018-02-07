package com.github.eduzol.hackerrank.isbinarysearch;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

	
	boolean checkBST(Node root) {
	
		Deque<Node> stack  =  new LinkedList<>();
		
		Integer tempValue  = Integer.MIN_VALUE;
		Node current = root;
		
		while( !stack.isEmpty() || current != null) {
			
			while ( current != null ) {
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			
			if ( current.data <= tempValue) {
				return false;
			}
			
			tempValue = current.data;
			current = current.right;
		}
		
		return true;
    }
	
	
	public class Node {
        int data;
        Node left;
        Node right;
     }
}
