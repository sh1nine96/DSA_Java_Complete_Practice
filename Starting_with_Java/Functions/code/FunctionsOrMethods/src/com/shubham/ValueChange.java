package com.shubham;

import java.util.Arrays;

public class ValueChange {

    public static void main(String[] args) {
        int [] arr = {1, 6, 10, 57, 46};
        changeArr(arr);
//        here its going to change the value bcz we are changing the actual object
        System.out.println(Arrays.toString(arr));
    }

    static void changeArr(int [] array){
        array[0] = 18; // if u make change to the object via this reference variable, same object will be changed
    }
}
