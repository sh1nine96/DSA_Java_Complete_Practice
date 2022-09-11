package com.shubham;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Array of primitives
//        int[] arr = new int[5];
//        arr[0] = 50;
//        arr[1] = 69;
//        arr[2] = 73;
//        arr[3] = 15;
//        arr[4] = 358;
//
//        System.out.println(arr[4]);
//        System.out.println(Arrays.toString(arr));

//        input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        enhanced for loop or for each loop
//        for (int num : arr) {// for every element in array, print the element
//            System.out.print(num + " ");//here num represents element of the array
//        }

//        System.out.println(arr[5]); // Array index is out of bounds bcz array is up to 4 only

//        Array of objects
    String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

//        modify
        str[1] = "shubham";
        System.out.println(Arrays.toString(str));
    }
}
