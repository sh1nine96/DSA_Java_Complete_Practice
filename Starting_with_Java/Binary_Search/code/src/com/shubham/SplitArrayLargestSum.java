package com.shubham;
// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2; // m is number of times we can divide the array
        int ans = splitArray(arr, m);
        System.out.println(ans);

    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
//            to find the max element out of nums from start to nums[i]
            start = Math.max(start, nums[i]);
//            to find end we will sum all elements
            end += nums[i];
        }

//        here we will do binary search
        while (start < end) {
//            trying for potential ans
            int mid = start + (end - start) / 2;

//            Calculate how many pieces we can divide this with max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
//                    we cannot add it in this subarray, make new one
//                    when we are adding it in new sum then => sum = num;
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end; // since start == end, hence we can return anything

    }
}


/* another way to do it
class Solution {
    int[] nums;
    public int splitArray(int[] nums, int m) {
        this.nums = nums;
        int low = 0, high = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        while(low <= high) {
            int mid = (low + high) / 2;
            if(required_no_of_chunks(mid, m)){
               min = Math.min(min, mid);
               high = mid - 1;
            }
            else low = mid + 1;
        }
        return min;
    }

    private boolean required_no_of_chunks(int mid, int m){
        int chunks = 0, i=0;
        while(i < nums.length){
            int val = 0;
            while(i < nums.length && nums[i] + val <= mid) val += nums[i++];
            chunks++;
        }
        return chunks <= m;
    }
}
 */