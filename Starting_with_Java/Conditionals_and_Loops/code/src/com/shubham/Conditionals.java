package com.shubham;

public class Conditionals {
    public static void main(String[] args) {
        /*
        syntax of if else statements
        if(boolean expression True  or False) {
                    //body
            } else {
              // do this
            }
         */

        int salary = 22_500;
//        if(salary >= 10_000){
//            salary += 2000;
//        }else {
//            salary += 1000;
//        }

//        Multiple if-else conditions
        if(salary > 10_000 && salary < 20_000){
            salary += 2000;
        } else if(salary >20_000){
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println("salary =>" + salary);
    }
}
