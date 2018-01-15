package com.github.eduzol.hackerrank.triplets;

import org.junit.Test;

import com.github.eduzol.hackerrank.Triplets.Solution;

public class SolutionTest {

	@Test
	public void test() {
		int a0 = 5 ; 
		int a1 = 6 ;
		int a2 = 7;
		
		int b0 = 3;
		int b1 = 6;
		int b2 = 10;
		
		int[] result = Solution.solve(a0, a1, a2, b0, b1, b2);
		for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
		
	}
}
