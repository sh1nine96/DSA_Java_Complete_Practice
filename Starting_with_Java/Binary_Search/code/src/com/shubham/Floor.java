package com.shubham;

public class Floor {
    public static void main(String[] args) {
        int[] numbers = {-19, -15, -5, 0, 3, 5, 8, 11, 15, 20, 23, 40, 57, 70};
        int target = 17;
        int answer = searchFloor(numbers, target);
        System.out.println(answer);

    }
//    Floor => the greatest number smaller than the target
//assuming array is sorted in ascending
    static int searchFloor(int[] arr, int target){
        //if target is smaller than the smallest number in an array
        if(target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return end;
    }
}
