package com.github.eduzol.hackerrank.countingsort1;

public class Solution {

	public static int[] countingSort(int[] arr) {
        // Complete this function
		
		int[] results =  new int[100];
		
		for ( int i = 0; i < arr.length ; i++) {
			results[arr[i]]++;
		}
		return results;
        
        
    }

}
