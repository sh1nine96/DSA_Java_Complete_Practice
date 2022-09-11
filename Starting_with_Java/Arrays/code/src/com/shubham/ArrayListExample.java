package com.shubham;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(34);
        list.add(100);
        System.out.println(list);

//        update the list
        list.set(0, 31);
        list.set(5, 99);
        System.out.println(list);

//        remove element from list
        list.remove(2); // will remove 3 from list
        System.out.println(list);
    }
}
