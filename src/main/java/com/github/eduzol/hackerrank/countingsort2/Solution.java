package com.github.eduzol.hackerrank.countingsort2;

public class Solution {

	 public static int[] countingSort(int[] arr) {
		 
		  // Complete this function
	       int[] count = new int[100];
	        int[] newArr = new int[arr.length];
	        
	        for(int i = 0; i < arr.length; i++){
	            count[arr[i]]++;
	        }
	        
	        for(int i = 0; i < count.length - 1; i++){
	            count[i + 1] = count[i] + count[i + 1];
	        }
	        
	        for(int i = 0; i < arr.length; i++){
	            int index = arr[i];
	            int indexCount = --count[index];
	            newArr[indexCount] = index;
	        }
	        
	        return newArr;
		 
	 }

}
