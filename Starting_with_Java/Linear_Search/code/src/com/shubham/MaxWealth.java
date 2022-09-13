package com.shubham;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] input = {
                {1, 3, 4},
                {9, 5, 2},
                {1, 2, 3}
        };

        System.out.println(maximumWealth(input));
    }

    static int maximumWealth(int[][] accounts){
        //rows => person
        //columns => account
        int answer = Integer.MIN_VALUE;
//        for (int person = 0; person < accounts.length; person++) {
//        when you start a new row, take the new sum for that row
//            int sum = 0;
//            for (int account = 0; account < accounts[person].length; account++) {
//                sum = sum + accounts[person][account];
//            }
//        now we have sum of accounts of person
//        checking it with overall answer
//            if(sum > answer){
//                answer = sum;
//            }
//        }
//        enhanced for loop
        for (int[] ints : accounts) {
            int sum = 0;
            for (int account = 0; account < ints.length; account++) {
                sum = sum + ints[account];
            }
            if (sum > answer) {
                answer = sum;
            }
        }
        return answer;
    }
}
