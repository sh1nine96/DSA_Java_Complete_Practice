package com.shubham;

import java.util.Scanner;

// find the nth fibonacci number
public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number for fibonacci sum to be calculated");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("Your "+ n +"th fibonacci sum is: " + b);

    }
}
