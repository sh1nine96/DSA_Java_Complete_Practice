package com.shubham;

import java.util.Collections;
import java.util.Scanner;

public class ArgumentsPass {
    public static void main(String[] args) {
        int answer = sum(15, 30);
        System.out.println("Your sum is " +answer);

//        String hello = sayHello("Shubham Sharma");
//        System.out.println(hello);
//        We can also take input from the user for the same

        Scanner input = new Scanner(System.in);
        System.out.println("enter your name please");
        String name = input.next();
        String hello = sayHello(name);
        System.out.println(hello);

    }

    static String sayHello(String name) {
        String message = "Hello " + name;
        return message;
    }

    //here we are passing the arguments to the function
    static int sum(int a, int b){
       int result = a + b;
        return result;
    }


}
