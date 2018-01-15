package com.github.eduzol.hackerrank.plusminus;

public class Solution {

	public static void plusMinus(int[] arr) {
		
		float positive = 0;
		float negative = 0;
		float zeroes = 0;
		int length = arr.length;
		
		int  i = 0 ;
		while ( i < arr.length ) {
			
			if ( arr[i] >  0 ) {
				positive++;
			}
			
			if ( arr[i] < 0) {
				negative++;
			}
			
			if ( arr[i] == 0) {
				zeroes++;
			}
			i++;
		} 
		
		//print positive, negative ,zeroes
		System.out.printf("%6f\n", positive/length);
		System.out.printf("%6f\n",negative/length);
		System.out.printf("%6f\n",zeroes/length);
	
	}
	
	
}
