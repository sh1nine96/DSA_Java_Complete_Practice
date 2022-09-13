package com.shubham;

public class EvenDigits {
    public static void main(String[] args) {
        int[] numbers = { 2, 65, 399, 40, 2424, 219, 5};
        System.out.println(findNumbers(numbers));
        int digits = countDigits(-45256);
        System.out.println(digits);
        int digit2 = countDigits2(18514698);
        System.out.println(digit2);

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

//    function to check if a numbers contains even digits or not
     static boolean even(int num) {
        int numberOfDigits = countDigits(num);
         return numberOfDigits % 2 == 0;
     }

    static int countDigits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    static int countDigits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num /= 10; // num = num / 10
        }
        return count;
    }
}
