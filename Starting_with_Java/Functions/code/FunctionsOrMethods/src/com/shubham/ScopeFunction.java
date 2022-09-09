package com.shubham;

public class ScopeFunction {
    public static void main(String[] args) {
//        Function Scope
        int a = 5;
        int b = 16;// we cant print these a and b inside check scope bcz their scope is limited to main only
//        we can print them here only
        System.out.println(a);
        System.out.println(b);
//        we cant print argument of checkScope i.e marks or variable num here bcz of function scope limitation
//        System.out.println(marks);
//        System.out.println(num);



    }
    static void checkScope(int marks){
        int num = 50;
        marks = 97;

//        System.out.println(a);
//        System.out.println(b); we cant print them here bcz of scope
//        similarly we can only print num or marks here but not outside this function
        System.out.println(num);
        System.out.println(marks);
    }
}
