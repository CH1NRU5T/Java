package com.chinrust;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicode = '\u058D';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char myAnotherUnicode = '\u0460';
        System.out.println(myAnotherUnicode);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOver21 = true;

    }
}
/*
 * char - 2 bytes(16 bits) of memory
 * The reason it's not a single byte is that it allows you to store unicode characters
 * Unicode is an international encoding standard for use with different languages and scripts, by which each letter, digit or symbol is assigned a unique numeric value that applies across different platforms and programs
 * 65535 different types of characters
 *
 * Boolean - True or False(Yes or No, 1 or 0)
 * */