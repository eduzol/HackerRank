package com.github.eduzol.hackerrank.quicksort1;

import org.junit.Test;
public class SolutionTest {

	@Test
	public void test() {
		
		int arr[] = new int[5];
		
		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 7;
		arr[4] = 2;
		
		Solution.quickSort(arr);
	}
}
