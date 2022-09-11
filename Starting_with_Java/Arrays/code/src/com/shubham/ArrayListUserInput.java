package com.shubham;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        
//        input
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

//        output
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
