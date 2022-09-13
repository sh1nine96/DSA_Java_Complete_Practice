package com.shubham;

public class SearchInArrays {
    public static void main(String[] args) {

        int[] arr = {9, 4, 56, 37, 86, 367, 89, 23, 92, 56, 78};
        int target = 367;
        int result = linearSearch(arr, target);
        System.out.println(result);

        int bestCase = 9; // best case time complexity = O(1)
        int bestResult = linearSearch(arr, bestCase);
        System.out.println(bestResult);

        int target2 = 55; //worst case O(n)
        int result2 = linearSearch(arr, target2);
        System.out.println(result2);

        int target3 = 78;
        int result3 = linearSearch(arr, target3);
        System.out.println(result3);

//        return the element itself, calling the linearSearch2

        int elementToFind = 86;
        int answer = linearSearch2(arr, elementToFind);
        System.out.println(answer);

        //    return true or false based on if element is found or not=> calling linearSearch3
        int element2 = 56;
        boolean yesOrNo = linearSearch3(arr, element2);
        System.out.println(yesOrNo);// will print true as 56 is there
    }




//    if we have to return the element that we are trying to find then:-
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
//            checking for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

//    if we have to return true or false based on if element is found or not then:-
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
//            checking for element at every index irf it is = target
            if (element == target) {
                return true;
            }
        }
//        when none of the above statements are able to execute
        return false;
    }

//    we are here searching the array, and returning the index if the target is found
//    otherwise if target is not found, just return the -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
//            checking for element at every index irf it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        return -1;
    }
}
