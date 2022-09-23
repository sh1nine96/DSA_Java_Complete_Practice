package com.shubham;

public class RotationCount {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 8, 12, 15, 17, 0, 1,2, 3, 4};
        int ans = countRotations(numbers);
        System.out.println(ans);
    }
    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {

                return mid - 1;
            } else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
//                check if start is pivot
                if(nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
//                check if end is pivot
                if(nums[end] > nums[end - 1]){
                    return end;
                }
                end--;
            }
            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[end] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }


}

