package com.shubham;

public class Swap {

    public static void main(String[] args) {
        int a = 20; int b = 50;

//        swapping the values
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);

//        if we call the swap function here it will not swap the values bcz of scope
        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
//        in the function scope they are swapped but not outside this function
    }
}
