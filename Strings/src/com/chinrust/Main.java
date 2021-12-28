package com.chinrust;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is my String";
        System.out.println("myString = " + myString);
        myString += "Hello";
        System.out.println(myString);


        String numberString = "250.55";

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
/*
 * String is a sequence of characters
 * Strings in java are immutable, that means you can't change a string after its created. If you try, instead what happens, is that a new string is created
 * The code e used to append strings was inefficient
 * */