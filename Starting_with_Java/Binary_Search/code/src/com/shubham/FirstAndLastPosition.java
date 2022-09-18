package com.shubham;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 7, 8, 8, 10};
        int  target = 8;
        int[] ans = searchRange(numbers, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;

    }

    static int search(int[] numbers, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < numbers[mid]) {
                end = mid - 1;
            } else if (target > numbers[mid]) {
                start = mid + 1;

            } else {
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;

    }
}

