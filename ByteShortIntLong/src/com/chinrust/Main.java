package com.chinrust;

public class Main {

    public static void main(String[] args) {

//        int
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value: " + myMinIntValue);
        System.out.println("Integer maximum value: " + myMaxIntValue);
        System.out.println("Busted max value: " + (myMaxIntValue + 1)); // overflow occurs, min value of int is printed
        System.out.println("Busted min value: " + (myMinIntValue - 1)); // underflow occurs, max value of int is printed

        int myMaxIntTest = 2_147_483_647;
//        int myMaxIntTest = 2147483647+1; // java(intellij) automatically gives error


        System.out.println("*******************************");
//        byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + myMinByteValue);
        System.out.println("Byte maximum value: " + myMaxByteValue);


        System.out.println("*******************************");
//        short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + myMinShortValue);
        System.out.println("Short maximum value: " + myMaxShortValue);


        System.out.println("*******************************");
//        long
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value: " + myMinLongValue);
        System.out.println("Long maximum value: " + myMaxLongValue);

        long bitLongLiteralValue = 2_147_483_647_234L;
        System.out.println("bit long literal value: " + bitLongLiteralValue);


        int myTotal = myMinIntValue / 2;
//        byte myNewByteValue = myMinByteValue / 2; // incompatible types, cannot divide byte by int

//        type casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}

/*
 *  int(min, max) = (-2147483648, 2147483647)
 *  Integer - Wrapper class - ways to different perform different operations on the data type
 *  byte(min, max)= (-128, 127)
 *  short(min, max)= (-32768, 32767)
 *  long(min, max)= (-9223372036854775808, 9223372036854775807)
 *  Byte occupies 8 bits - "Byte has a width of 8"
 *  Short occupies 16 bits - "Short has a width of 16"
 *  Int occupies 32 bits - "Int has a width of 32"
 *  Long occupies 64 bits - "Long has a width of 64"
 * */