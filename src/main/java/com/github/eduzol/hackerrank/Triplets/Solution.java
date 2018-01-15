package com.github.eduzol.hackerrank.Triplets;

public class Solution {

	
	public static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        
		// Complete this function
		int ALICE  = 0;
		int BOB = 1;
		int[] points = new int[2];
		
		if ( a0 > b0) {
			points[ALICE]++;
		}
		
		if( a0 < b0 ) {
			points[BOB]++;
		}
		
		
		if ( a1 > b1) {
			points[ALICE]++;
		}
		
		if( a1 < b1 ) {
			points[BOB]++;
		}
		
		if ( a2 > b2) {
			points[ALICE]++;
		}
		
		if( a2 < b2 ) {
			points[BOB]++;
		}
		
		return points;
		

    }
}


