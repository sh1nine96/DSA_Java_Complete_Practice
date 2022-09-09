package com.shubham;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        boolean ans = isArmstrong(num);
//        System.out.println(ans);

//        we can also print how many armstrong numbers for 3 digits
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }

        }

    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n >0){
           int  remainder = n % 10;
           n = n/10;
           sum += remainder * remainder *remainder;
        }
    return sum == original;
    }
}
