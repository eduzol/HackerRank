package com.github.eduzol.hackerrank.insertionsort2;

public class Solution {

	public static void insertionSort2(int n, int[] arr) {
		
     	for(int i=0; i <n-1 ;i++) {
            
     		int j = i+1;
            
            while(j>0){
              if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
              }else{
              	break;
              }
            }
            
            printArray(arr);
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
