package com.shubham;

import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 78, 59, 97};
        System.out.println(Arrays.toString(arr));
//        reversing the array
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        swap(arr, 3, 5);
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }
}
