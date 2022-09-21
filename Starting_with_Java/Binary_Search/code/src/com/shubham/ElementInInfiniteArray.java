package com.shubham;

public class ElementInInfiniteArray {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 7, 9, 11, 14, 17, 19, 22, 27, 47, 58, 67, 78, 88, 95, 110, 125, 150, 169};
        int target = 14;
        int ans = findAns(numbers, target);
        System.out.println(ans);
    }

    static int findAns(int[] arr, int target){
        int start = 0;
        int end = 1;
        if(target > end){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target);
    }

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
