package com.shubham;

import java.util.Arrays;

public class OverloadingWithVarArgs {
    public static void main(String[] args) {

        func(3, 6, 8, 15);
        func("Hari", "Shubham", "Luvy");
//        if we call func and keep it empty func() => it will throw an error bcz it will not be able to decide which one to run at compile time

    }

    static void func(int ...v){
        System.out.println(Arrays.toString(v));

    } static void func(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
