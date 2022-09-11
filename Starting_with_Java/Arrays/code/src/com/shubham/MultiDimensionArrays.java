package com.shubham;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

//        int [][] arr = new int[3][]; //mentioning size of rows is mandatory, column is options
//        int[][] arr2D = {
//                {1, 2, 3}, //0th index
//                {4, 5}, //individual arrays can be of different size hence defining size of column is optional
//                {6, 7, 8, 9}// 2nd index -> arr2D[2] => {6, 7, 8, 9}
//        };
//        System.out.println(Arrays.deepToString(arr2D));

//        Lets take input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the digits for array");
        int [][] arr = new int[3][3];
//        System.out.println(arr.length);// length of row only

        for (int row = 0; row < arr.length; row++) {
//            for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }

        }

//        for (int row = 0; row < arr.length; row++) {
////            for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // for print new line after every successful loop
//        }
//we can print the above as follows too
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        enhanced for loop of the above
        for(int[] i: arr){
            System.out.println(Arrays.toString(i));
        }
    }
}
