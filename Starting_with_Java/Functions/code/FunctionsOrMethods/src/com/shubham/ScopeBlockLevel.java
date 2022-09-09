package com.shubham;

public class ScopeBlockLevel {
    public static void main(String[] args) {
        int a = 67;
        int b = 76;
        String name = "Shubham";

        {
//            we can only modify the value of a and b here we cant re-initialize them bcz this block comes under main block
            a = 55;
            b = 69; // re-assigning the value to the original variable and it will change its value
            name = "Raj";
            System.out.println(name);
            System.out.println(b); // it will print 69
// but lets say if we initialize c here then its scope will be limited to this block only we cant use it outside this block

            int c = 35;
        }
//        even if we print a and b here it will show modified value
        System.out.println(a); // will print 55
        System.out.println(b); // print 69
        System.out.println(name); // same way it will print Raj
//        System.out.println(c); we cant print it here bcz of block level scope limitation

//        lets see the scope => for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i); // we can use i only here not outside this block
            a = 3000; // we can assign new value but cant re-initialize a
        }
//        System.out.println(i); we cant print i here, bcz its scope is limited to for loop block
        System.out.println(a); // it will print its modified value i.e 3000
    }
}
