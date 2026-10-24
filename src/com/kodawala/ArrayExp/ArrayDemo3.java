package com.kodawala.ArrayExp;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo3 {
    public static void main(String[] args) {

        Integer[] arr = {50, 20, 10, 40, 30};

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
