package com.shubham;

public class CountNumbers {
    public static void main(String[] args) {
//        we will see how many times 7 is repeating itself in a given number

        int n = 257327977;

        int count = 0;
        while (n > 0){
            int remainder = n %10;
            if(remainder == 7){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
