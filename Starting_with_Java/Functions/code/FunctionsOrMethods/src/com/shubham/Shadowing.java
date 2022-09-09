package com.shubham;

public class Shadowing {
    static int x = 85; // we have to make it static to use it inside static method

    public static void main(String[] args) {
        System.out.println(x); //will print 50
        int x; // the class variable at line 4 has been shadowed/ overridden by this local variable
//        System.out.println(x);// it will throw error as we haven't initialized x yet here, scope begins at initialization not at declaration
        x =50;
        System.out.println(x); // it will print 50
        fun();// this will print 85 again
    }

    static void fun(){
        System.out.println(x);
    }
}
