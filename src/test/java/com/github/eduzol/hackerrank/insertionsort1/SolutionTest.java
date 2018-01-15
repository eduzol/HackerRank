package com.github.eduzol.hackerrank.insertionsort1;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		
		int[] testArr = new int[10];
				
		testArr[0] = 2;
		testArr[1] = 3;
		testArr[2] = 4;
		testArr[3] = 5;
		testArr[4] = 6;
		testArr[5] = 7;
		testArr[6] = 8;
		testArr[7] = 9;
		testArr[8] = 10;
		testArr[9] = 1;
	
		
		Solution.insertionSort1(10,testArr);
		
	}
}

