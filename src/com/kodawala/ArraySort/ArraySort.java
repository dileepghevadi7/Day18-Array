package com.kodawala.ArraySort;

// Arrays Elements  printing to 3 ways 
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5, 8, 4, 10};
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] +" ");
		}
		for(int x : arr) {
			System.out.println(x +" ");
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}

}
