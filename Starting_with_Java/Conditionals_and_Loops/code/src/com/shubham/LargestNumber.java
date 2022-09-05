package com.shubham;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please the numbers to be compared");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        /*
        int max = a;
        if(max < b){
            max = b;
        }
        if (max < c){
            max = c;
        } */
//        we can do it using Math.max class as well
        int max = Math.max(a, Math.max(b, c));
        System.out.println("ur max number is=> " + max);
    }
}
