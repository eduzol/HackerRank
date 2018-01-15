package com.github.eduzol.hackerrank.diagonaldifference;

public class Solution {
	
	public static int diagonalDifference(int[][] a) {
		
		int dA = 0;
		int dB = 0;
		
		for ( int i  = 0 , j = 0 ; i < a[0].length ;  i++ , j++) {
			dA+= a[i][j];
		}
		
		for ( int i = a[0].length -1 , j = 0; i >= 0 ; i-- , j++ ) {
			dB+=a[i][j];	
		}
		
		
		int difference = Math.abs(dB-dA);
		
		return difference;
		
	}
}
