package com.shubham;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {9, 55, 43, 88, 77, 23};
        System.out.println(getMax(arr));
        System.out.println(maxRange(arr, 0, 2));
    }
//work on edge cases done
     static int maxRange(int[] arr, int start, int end) {
        if(end < start){
            return -1;
        }
        if (arr == null){
            return -1;
        }
         int maxValue = start;
         for (int i = start; i < end; i++) {
             if(arr[i] > maxValue){
                 maxValue = arr[i];
             }
         }
         return maxValue;
    }

    static int getMax(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int maxValue = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] > maxValue){
                 maxValue = arr[i];
             }
         }
         return maxValue;
     }
}
