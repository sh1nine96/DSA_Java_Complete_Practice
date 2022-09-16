package com.shubham;

public class BinarySearch {
    public static void main(String[] args) {
        int [] numbers = {-19, -15, -5 , 0, 3, 5, 8, 11, 15, 20, 23, 40, 57, 70};
        int target = 15;
        int answer = binarySearch(numbers, target);
        System.out.println("index of "+ target + " is " + answer);
    }

//    return the index
//    return the -1 if target doesn't exist

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end){
//      find the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
