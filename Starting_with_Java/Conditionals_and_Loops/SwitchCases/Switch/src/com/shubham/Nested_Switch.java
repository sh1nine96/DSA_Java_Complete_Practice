package com.shubham;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

//        switch (empID){
//            case 1:
//                System.out.println("Shubham Sharma");
//                break;
//            case 2:
//                System.out.println("Harish Rawat");
//                break;
//            case 3:
//                System.out.println("Employee number 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT ");
//                        break;
//                    case "Management":
//                        System.out.println("Management");
//                        break;
//                    case "HR":
//                        System.out.println("Human Resource");
//                        break;
//                    default:
//                        System.out.println("Please enter a valid department name");
//                }
//                break;
//            default:
//                System.out.println("Please enter the valid empID");
//        }

//        We can convert this to enhanced switch like below

        switch (empID) {
            case 1 -> System.out.println("Shubham Sharma");
            case 2 -> System.out.println("Harish Rawat");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT ");
                    case "Management" -> System.out.println("Management");
                    case "HR" -> System.out.println("Human Resource");
                    default -> System.out.println("Please enter a valid department name");
                }
            }
            default -> System.out.println("Please enter the valid empID");
        }
    }
}
