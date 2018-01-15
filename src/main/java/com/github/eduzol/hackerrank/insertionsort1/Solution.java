package com.github.eduzol.hackerrank.insertionsort1;

public class Solution {

	
	public static void insertionSort1( int n , int[] arr ) {
		
		int element = arr[n-1];
		int i = n-2;
		boolean breakIt = false;
		while(i >= 0) {
		
			int current = arr[i];
			if (current > element ) {
				arr[i+1] = current;
			}
			
			if ( current < element  ) {
				arr[i+1] = element;
				breakIt = true;
			}
			
		
			printArray( arr);
			i--;
			if (breakIt) {
				break;
			}
		}
		
		i++;
		
		if (i == 0 && arr[i] > element) {
			arr[i] = element;
			breakIt = true;
			printArray( arr);
		}
		
	}
	
	public static void printArray(  int[] arr) {
		int i = 0;
		
		while ( i < arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.print("\n");
	}
}
