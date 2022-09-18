package com.shubham;

public class SmallestLetterCeil {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char[] letters2 = {'c', 'f', 'j'};
        char target = 'c';
        char ans = nextGreatestLetter(letters2, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];

    }
}
