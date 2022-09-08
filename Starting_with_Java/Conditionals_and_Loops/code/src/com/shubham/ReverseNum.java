package com.shubham;

public class ReverseNum {
    public static void main(String[] args) {
//        here we will reverse the given number for eg. 345897 --> 798543

        int num = 576289;

        int ans = 0;
        while (num >0){
            int remainder = num % 10;
            num = num / 10;
            ans = ans * 10 + remainder;
        }

        System.out.println(ans);


    }
}
