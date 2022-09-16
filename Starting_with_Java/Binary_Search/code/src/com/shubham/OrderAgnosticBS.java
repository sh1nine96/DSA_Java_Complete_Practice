package com.shubham;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] ascArray = {-19, -15, -5, 0, 3, 5, 8, 11, 15, 20, 23, 40, 57, 70};
        int[] descArray = {80, 65, 58, 45, 20, 15, 9, 5, 1, 0, -5, -10, -15, -50};
        int target = 20;
        int answer = orderAgnosticBS(descArray, target);
        System.out.println(answer);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
//      find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
//          if array is ascending we will do as  follows
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
//         or if descending then as follows
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
