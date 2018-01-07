package com.javaclass.first.exercises.bookExercise.ExpressionsAndOperators;

public class BooleanOperators {
    public static void main(String[] args) {
        int a= 2;
        int b= 3;

        if(a <10 && b > 1)
            System.out.println("AND: true only if all are true" );
        if(a <10 || b < 1)
            System.out.println("OR: true if any is true");
        if(!false)
            System.out.println("Boolean not reverses statement or condition");


    }
}
