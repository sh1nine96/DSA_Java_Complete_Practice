package com.shubham;

public class SearchInRange {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 5, 17, 36, 25, 80, 50, 28, 98};
        int target = 36;
        int start = 1;
        int end = 6;
        int result = searchInRange(numbers, target, start, end);
        System.out.println(result);
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
