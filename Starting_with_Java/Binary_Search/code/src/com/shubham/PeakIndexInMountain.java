package com.shubham;

//  https://leetcode.com/problems/peak-index-in-a-mountain-array

public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 15, 30, 36, 41, 43, 47, 55, 49, 39, 20, 11, 9, 7, 5, 3};
        int ans = peakIndexInMountainArray(numbers);
        System.out.println("peak element at index number: " + ans);

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end){
//            we are finding the mid here
            int mid = start + (end -start) / 2;
//            if our middle element is less than its next element then our answer should lie in right half
//            hence our start will be the next element to mid in right half
            if(arr[mid] <  arr[mid + 1]){
                start = mid + 1;
            } else {
//             if mid > next element then answer should lie in left half hence end will be mid element
                end = mid;
            }
        }
//        in the end start = end, hence we can return any element to get the answer
    return start;
    }
}
