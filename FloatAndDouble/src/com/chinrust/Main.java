package com.chinrust;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min value: " + myMinFloatValue);
        System.out.println("float max value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value: " + myMinDoubleValue);
        System.out.println("double max value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
//        float myFloatValue = 5.25; // will give error
        float myFloatValue = 5f / 3f; // or declare ar 5.25f
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("My int value: " + myIntValue); //1
        System.out.println("My float value: " + myFloatValue); //1.6666666
        System.out.println("My double value: " + myDoubleValue); //1.6666666666666667


    }
}
/*
 * Float - single precision number (32 bits) (range: (1.4E-45 to 3.4028235E+38))
 * Double - double precision number (64 bits) (range: (4.9E-324, 1.7976931348623157E+308))
 * Double is preferred to be used
 * float - upto 7 digits after decimal
 * double - upto 16 digits after decimal
 * double is faster to process in the modern computers
 * libraries are coded to function on doubles
 * when precise calculations are required, floating point numbers should not be used
 * */