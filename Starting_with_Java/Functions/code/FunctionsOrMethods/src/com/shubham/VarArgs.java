package com.shubham;

import java.util.Arrays;

//here we will see variable length arguments we use it when we don't know how many args we will be taking as input
public class VarArgs {

    public static void main(String[] args) {
        funString("Shubham", "Raj", "Honey", "Aman", "Karan");// internally stored as arrays
        funInt(1, 7, 87, 65, 9, 26);
        mixedArgs(25, 18, "Karan", "Pranay", "Kushal", "Kiran");

    }

    static void funString(String ...s){
        System.out.println(Arrays.toString(s));

    }

    static void funInt(int ...i){
        System.out.println(Arrays.toString(i));
    }

//    mixed arguments
    static void mixedArgs(int a, int b, String ...k){

    }
}
