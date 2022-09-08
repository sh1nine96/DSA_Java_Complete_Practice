package com.shubham;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the fruit name");
//        String fruit = input.next();

//        switch (fruit) {
//            case "Mango":
//                System.out.println("Mango is king of fruit");
//                break;
//            case "Apple":
//                System.out.println("A red color sweet fruit");
//                break;
//            case "Orange":
//                System.out.println("Fruit rich in Vitamin c");
//                break;
//            case "Grapes":
//                System.out.println("fav fruit");
//                break;
//
//            default:
//                System.out.println("Please enter the valid fruit");
//
//
//        }

//        it can be replaced with enhanced switch if we just press Alt + enter on switch

//        switch (fruit) {
//            case "Mango" -> System.out.println("Mango is king of fruit");
//            case "Apple" -> System.out.println("A red color sweet fruit");
//            case "Orange" -> System.out.println("Fruit rich in Vitamin c");
//            case "Grapes" -> System.out.println("fav fruit");
//            default -> System.out.println("Please enter the valid fruit");
//        }

        System.out.println("Please enter the number to check day");
        int day = input.nextInt();
// our days start from sunday and ends with saturday
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter a valid number for day");
//        }

//        Now we will see 1 benefit of not placing break word

//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

//        Now lets replace the above statement with enhanced switch

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
