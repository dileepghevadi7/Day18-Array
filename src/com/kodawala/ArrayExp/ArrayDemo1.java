package com.kodawala.ArrayExp;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int arr[] = {15, 32, 5, 4, 1, 47, 81};
		
		Arrays.sort(arr);
		
		System.out.println(" min elements :" + arr[0]);
		System.out.println(" max elements :" + arr[arr.length-1]);
		

	}

}

