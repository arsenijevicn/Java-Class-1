package com.javaclass.first.exercises.bookExercise.PrimitiveDataTypes;

public class IntegerTypes {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("First int = " + a);

        int b = 452186;
        System.out.println("Second int = " + b);

        int c = 4660;
        System.out.println("Third int = " + c);
        System.out.println("Third int in binary = " + Integer.toBinaryString(c));
        System.out.println("Third int in hexadecimal = " + Integer.toHexString(c) + ", actually: 0x1234");
        System.out.println("Third int in octal = " + Integer.toOctalString(c));

        long d = 2134L;
        System.out.println("Long int = " + d);

        byte b1 = 127, b2 = 1;
        byte sum = (byte)(b1 + b2);
        System.out.println("Wrap around in byte: " +sum);
    }


}
