package com.shubham;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 6, 5, 17, 36, -25, 80, 50, 28, 98};
//        int minimum = ;
        System.out.println(min(numbers));
    }

     static int min(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
//        assume first index in the minValue
        int minValue = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] < minValue){
                 minValue = arr[i];
             }

         }
         return minValue;
    }
}
