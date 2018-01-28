package com.github.eduzol.hackerrank.quicksort2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void quicksort( int[] arr , int start , int end ) {
		
		if ( start >= end ) {
			return;
		}
		
		int pivotIndex = partition(arr, start, end);
		quicksort(arr, start, pivotIndex-1);
		quicksort(arr, pivotIndex+1, end);
		
		printArray(arr, start, end);

	}
	
	
	public static int partition ( int arr[] , int start , int end ) {
		
		int pivot = arr[start];
		
		List<Integer> left  =  new ArrayList<>();
		List<Integer> equal = new ArrayList<>();
		List<Integer> right =  new ArrayList<>();
		
		
		for ( int i = start ; i <= end ; i++ ) {
			
			Integer current =  arr[i];
			
			if ( current > pivot ) {
				right.add(current);
				continue;
			}
			
			if( current < pivot ) {
				left.add(current);
				continue;
			}
			
			if ( current == pivot ) {
				equal.add(current);
				continue;
			}
		}
		
		writeArray(arr, left, start);
		writeArray(arr, equal, start+left.size());
		writeArray(arr, right, start+left.size()+equal.size());
		
		int pivotIndex = start  + left.size();
		return pivotIndex;
	}
	
	public static void writeArray (int[] array , List<Integer> list, int counter ) {
		
		for ( int element : list) {
			array[counter] = element;
			counter++;
		}
	}
	
	public static void printArray(int[] arr, int start , int end) {
		for ( int i = start; i <= end ; i++) {
			System.out.print( arr[i]+ " ");
		}
		System.out.println("");
	}
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	 }
}
