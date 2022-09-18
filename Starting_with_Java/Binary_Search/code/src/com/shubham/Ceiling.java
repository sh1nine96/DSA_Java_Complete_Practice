package com.shubham;

public class Ceiling {
    //    ceiling => the smallest number greater than target
    public static void main(String[] args) {
        int[] numbers = {-19, -15, -5, 0, 3, 5, 8, 11, 15, 20, 23, 40, 57, 70};
        int target = -1;
        int answer = searchCeiling(numbers, target);
        System.out.println(answer);
    }

    static int searchCeiling(int[] arr, int target) {
//        if target is the greater than the greatest number in an array
        if(target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}
