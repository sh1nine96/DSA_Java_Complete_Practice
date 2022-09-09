package com.shubham;

public class NameChange {

    public static void main(String[] args) {
        String name = "Shubham";

        changeName(name);
        System.out.println(name);
//        we cant even print (naam) bcz of scope only
//        System.out.println(naam); this will simply result in error
//it will not change the name to Ajay as the scope of naam is limited to changeName function and in function when we
//        are saying naam = Ajay that means we are actually creating a new object as Strings are immutable
//        and name and naam have no relevance we can use any name
    }

    static void changeName(String naam) {
        naam = "Ajay";
    }

}
