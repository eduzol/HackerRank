package com.github.eduzol.hackerrank.quicksort1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static int[] quickSort( int[] arr ) {
		
		int pivot = arr[0];
		
		List<Integer> left =  new ArrayList<Integer>();
		List<Integer> equal =  new ArrayList<Integer>();
		List<Integer> right =  new ArrayList<Integer>();
		
		
		for ( int i = 0 ; i < arr.length ; i ++) {
		
			Integer current  = arr[i];
			
			if ( current < pivot ) {
				left.add(current);
				continue;
			}
			
			if ( current > pivot ) {
				right.add(current);
				continue;
			}
			
			if ( current == pivot ) {
				equal.add(current);
				continue;
			}
						
		}
		
		left.forEach(  e -> System.out.print(e + " "));
		equal.forEach(  e -> System.out.print(e + " "));
		right.forEach(  e -> System.out.print(e + " "));
		
		return arr;
	}
	
	
}
