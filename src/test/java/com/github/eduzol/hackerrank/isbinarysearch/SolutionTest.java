package com.github.eduzol.hackerrank.isbinarysearch;

import org.junit.Assert;
import org.junit.Test;

import com.github.eduzol.hackerrank.isbinarysearch.Solution.Node;

public class SolutionTest {

	
	@Test
	public void test() {
		
		Solution sol = new Solution();
		
		Node root = sol.new Node();
		root.data = 20;
		
		Node left = sol.new Node();
		left.data = 5;
		
		Node right = sol.new Node();
		right.data  = 40;
		
		root.left = left;
		root.right = right;
		
		boolean isBinarySearchTree = sol.checkBST(root);
		Assert.assertTrue(isBinarySearchTree);
		
		
	}
}
