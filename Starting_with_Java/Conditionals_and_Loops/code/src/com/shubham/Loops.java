package com.shubham;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        syntax of for loops
        for( initialisation; condition; increment/decrement){
           //body
           }
         */

//        print numbers from 1 to 10 using for loop

//        for(int i = 1; i <= 10; i++ ){
//            System.out.println(i);
//        }

//        print values taking user input
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the number");
//        int n = input.nextInt();


//        for (int num = 1; num <= n; num++) {
//
//            System.out.print(num + " ");
//        }

//        While loop
        /*
        SYNTAX FOR WHILE LOOP
        initialisation
        while( condition ) {
           //body
           increment/decrement
           }
         */
//        now lets print from 1 to 10 using while loop
//        first we will initialise the variable
//        int num = 1;
//        while(num <= 10){
//            System.out.print(num + " ");
////            increment/decrement
//            num += 1;
//        }
//        SYNTAX for do while loop
        /* do {
             //  body
               }while(condition)
               do while loop will always execute at least once bcz first it executes the body and then check the condition
               for eg. lets say
               int num =1;
               do{
                System.out.print("Hello World");
                num++;
               while(num != 1);
               it will print "Hello World" even we have said in the condition while(num != 1)
         */

//        Now lets print numbers from 1 to 5 using do while loop

        int number =1;
        do {
            System.out.print(number + " ");
            number++;
        } while (number <= 5);

    }
}
