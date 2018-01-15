package com.github.eduzol.hackerrank.diagonaldifference;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		
		int[][] matrix = new int[3][3];
		
		matrix[0][0] = 11;
		matrix[1][0] = 2;
		matrix[2][0] = 4;
		
		matrix[0][1] = 4;
		matrix[1][1] = 5;
		matrix[2][1] = 6;
		
		matrix[0][2] = 10;
		matrix[1][2] = 8;
		matrix[2][2] = -12;
		
		int diff = Solution.diagonalDifference(matrix);
		System.out.println("Difference " + diff );
	}
}
