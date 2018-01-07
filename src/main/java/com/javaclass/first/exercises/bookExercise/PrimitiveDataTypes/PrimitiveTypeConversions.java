package com.javaclass.first.exercises.bookExercise.PrimitiveDataTypes;

public class PrimitiveTypeConversions {
    public static void main(String[] args) {
        int a = 15;
        byte b = (byte) a;
        System.out.println("Int to byte = " + b);

        double c = 123.45;
        int d = (int) c;
        System.out.println("Double to int = " + d);

        float e = 1354.56f;
        byte f = (byte) e;
        System.out.println("Float to byte = " + e);
    }
}
