package com.kodawala.Array1;

public class ArraySort {

	/*public static void main(String[] args) // this is demo only for practise
	{

		int[] arr = { 11, 9, 2, 37, 11, 4, 7, 8, 10 };

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
			System.out.println(min);
			System.out.println(max);

		}
	}
}*/
	public static void main(String... args) {

		int arr [ ] = { 15, 8, 9, 2, 11, 4 } ; 

		int min = arr [ 0 ]; 
		int max = arr [ 0 ] ; 

		for ( int i = 0 ; i < arr.length ; i++){
			if ( arr [ i ] > max ) {
				max = arr [ i ] ;
			}
			if ( arr [ i ] < min ){
				min  = arr [ i ];
			}
		}
		System.out.println ( " Min Element :: " + min );
		System.out.println (" Max Element :: " + max);
}
}


