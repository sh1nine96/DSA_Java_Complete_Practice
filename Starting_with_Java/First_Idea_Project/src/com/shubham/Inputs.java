package com.shubham;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter some number: ");// it would print result in the same line
//        int rollNumber = input.nextInt();
//        System.out.println("Your roll number is: " + rollNumber);
//
//        System.out.print("Please enter ur first name: ");
//        String name = input.next(); // it will only return 1st word
//        System.out.println("Your name is: " + name);

//        if we want full line to be returned after taking input we use .nextLine()

//        System.out.print("Please enter your full name: ");
//        String fullName = input.nextLine();
//        System.out.println("Your full name is: " + fullName);

        System.out.println("Please enter number in decimal: ");
        float marks = input.nextFloat();
        System.out.println("Your marks are: " + marks);
    }
}
