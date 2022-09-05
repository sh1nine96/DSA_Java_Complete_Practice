package com.shubham;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the char to be CaseChecked");
        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
