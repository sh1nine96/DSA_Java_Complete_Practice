package com.shubham;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        here we will take the input from user to calculate and if user press x or X programme should terminate

        Scanner input = new Scanner(System.in);

        int result = 0;
        while (true){
            System.out.println("Please enter the operator to calculate");
            char op = input.next().trim().charAt(0);

            if(op =='+' || op =='-' || op =='*' || op =='/' || op =='%'){
//                Taking input here
                System.out.println("Please enter the 2 operands for them to be calculated");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op == '+'){
                   result = num1 + num2;
                } if(op == '-'){
                   result = num1 - num2;
                } if(op == '*'){
                   result = num1 * num2;
                } if(op == '/'){
                    if (num2 !=0){
                        result = num1 / num2;
                    }
                }
                if(op == '%'){
                    result = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                    break;

            } else {
                System.out.println("Invalid expression");
            }
            System.out.println(result);
        }

    }
}
