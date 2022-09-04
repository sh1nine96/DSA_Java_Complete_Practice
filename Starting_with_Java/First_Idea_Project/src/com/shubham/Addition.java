package com.shubham;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number1: ");
        int num1 = input.nextInt();
        System.out.print("Please enter number2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Your sum is: " + sum);
    }
}
