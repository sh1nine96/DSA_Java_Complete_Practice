package com.shubham;

import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        sum();
        int answer = sum2();
        System.out.println("Your sum2 is: " + answer);
    }

//    Now we will use the return type
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter num1");
        int num1 = sc.nextInt();
        System.out.println("Please enter num2");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        return result;
//        if we write anything after return it will never execute
//        System.out.println("It will never be executed");
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter num1");
        int num1 = sc.nextInt();
        System.out.println("Please enter num2");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println("Your sum is: " + result);
    }
}
