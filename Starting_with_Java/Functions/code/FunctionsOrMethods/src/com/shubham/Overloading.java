package com.shubham;

public class Overloading {

    public static void main(String[] args) {

//        at compile time programme will decide which function to run
        fun(45);
        fun("Shubham");

//        int ans = sum(7, 8);
//        System.out.println(ans); // will print 15
        int ans = sum(3, 9, 8);
        System.out.println(ans); // will print 20

    }
//    we can create multiple functions with the same name if they have different arguments
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String s){
        System.out.println(s);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
