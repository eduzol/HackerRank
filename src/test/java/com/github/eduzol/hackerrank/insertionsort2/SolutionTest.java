package com.github.eduzol.hackerrank.insertionsort2;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		
		
		int arr[] = new int[6];
		
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 6;
		arr[5] = 2;
		
		Solution.insertionSort2(6, arr);
		
	}
}
