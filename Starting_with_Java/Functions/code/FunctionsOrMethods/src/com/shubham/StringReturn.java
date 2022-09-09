package com.shubham;

public class StringReturn {
    public static void main(String[] args) {
           String hello =  greet();
        System.out.println(hello);
    }

    static String greet(){
        String greeting = "Hello Shubham, how are you?";
        return greeting;
    }
}
