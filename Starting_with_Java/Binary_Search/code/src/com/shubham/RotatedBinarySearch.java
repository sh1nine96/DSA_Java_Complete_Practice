package com.shubham;

public class RotatedBinarySearch {
    public static void main(String[] args) {
//        int[] numbers = { 5, 7, 8, 12, 15, 0, 1, 3, 4};

//        System.out.println(findPivot(numbers));
        int[] arr = {7, 8, 1, 2, 3, 4, 5, 6};
        System.out.println(findPivot(arr));
        int target = 2;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
//    if we do not find pivot or it returns-1, it means array is not rotated, and we can do normal binary search
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
//      find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
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
