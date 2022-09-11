package com.shubham;

public class Main {
    public static void main(String[] args) {
//        store a roll no
//        int rollNo = 25;
//        store name
//        String name = "Shubham";
//        Ques=> store 500 roll No.s
//        we cant do this following above approach that's why we need array

//        Syntax
//        datatype [] variable name = new datatype[size];
//        lets say we have to store 5 rollNos
//        int[] rollNos = new int[5];
////        or we can create it directly
//        int[] rollNos2 = {1, 2, 3, 4, 5};

        int[] rollNos; // declaration of array, rollNos getting created in stack memory
        rollNos = new int[5];// initialization, actually here object is being created in memory(heap memory)
        System.out.println(rollNos[1]);// by default, it's all zero [0, 0, 0, 0, 0]

        String[] strArr = new String[4];
        System.out.println(strArr[2]);// by default its all null [null, null, null, null, null]
//      null is a special literal can be assigned to non primitives only and not to primitives

    }
}
