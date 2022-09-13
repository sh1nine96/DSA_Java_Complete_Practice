package com.shubham;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Shubham Sharma";
        char c = 'b';
        boolean letter = search(name, c );
        System.out.println(letter);

        char ch = 'u';
        boolean letter2 = search2(name, ch);
        System.out.println(letter2);

    }

//    let's do this using for each loop

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (char element: str.toCharArray()) {
            if(element == target){
                return true;
            }
        }
        return false;
    }

//    using for loop
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
