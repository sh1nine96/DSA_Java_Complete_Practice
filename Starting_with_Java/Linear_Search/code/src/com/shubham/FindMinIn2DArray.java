package com.shubham;

public class FindMinIn2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 8, 50, 45},
                {35, 79, 830, 22},
                {5, -2, 4},
                {98, 52},
        };
        System.out.println(searchMin(numbers));
    }

     static int searchMin(int[][] arr) {
        int minValue = Integer.MAX_VALUE;
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col] < minValue){
                     minValue = arr[row][col];
                 }
             }
         }
         return minValue;
    }
}
