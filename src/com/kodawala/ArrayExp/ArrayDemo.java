package com.kodawala.ArrayExp;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int arr[] = {15, 32, 5, 4, 1, 47, 81};
		System.out.println(" Array Before starting ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println(" Array After starting ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}

}
