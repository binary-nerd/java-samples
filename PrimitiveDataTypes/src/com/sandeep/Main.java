package com.sandeep;

public class Main {

    public static void main(String[] args) {

        // int - 4 bytes
        int myMinVal = -2147483648;
        // You can use _ in between numbers to make them more readable.
        int myMaxVal = 2_14_74_83_647;

        // byte - 1 byte
        byte byteMinVal = -128;
        byte byteMaxVal = 127;

        // Short - 2 bytes
        short shortMinValue = -32768;
        short shortMaxValue = 32767;

        // long - 8 bytes
        long longMinValue = -9223372036854775808L; //Min value is -2^63
        // L in the end is mandatory when using values beyond the integer range. As by default all numbers are treated as int.
        long longMaxValue = 9223372036854775807L; // Max value is 2^63-1

        // float - 4 bytes
        float floatValue = 5.4f; //f in the end is required. Otherwise it assumes it is a double and gives a error.

        // double - 8 bytes
        double doubleValue = 5.25d;
        double doubleValue1 = 5.25; // By default the decimal values are double. Hence d in the end is not mandatory.

        // sout is the abbreviation for the system.out.println..

        // Characters - 2 bytes. Unicode characters are used.
        char mychar = '\u00A9';
        System.out.println("Mychar is " + mychar);
    }
}
