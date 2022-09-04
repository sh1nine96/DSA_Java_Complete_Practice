package com.shubham;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int num = (int) (36.67f);// we can type a float into integer like this
//        System.out.println(num); // this would print only integer

//        Automatic type promotions in expressions
//        int a = 258;
//        byte b = (byte) (a); // byte has range up to 256 only
//        System.out.println(b); // hence it would print 258 % 256 => 2

//        byte x = 50;
//        byte y = 80;
//        byte z = 100;
//        int result = x * y / z;
//        even though internally x * y will exceed byte limit i.e. 256 it will automatically promote it to be evaluated as integers
//        System.out.println("Result is: " + result);

        byte b = 40;
        char c = 'a';
        short s = 100;
        int i = 60_000; // it will be equivalent to 60,000
        float f = 6.567f;
        double d = 1.721367;
        double result = ( f * b ) + (i / c) - ( d * s );
//        float + int - double = double
        System.out.println(( f * b ) + " => promotion to float, " + (i / c) + " => promotion to int, " + ( d * s ) + " => promotion to double");
        System.out.println(result + " result in double because double is biggest hence promotion");

    }
}
