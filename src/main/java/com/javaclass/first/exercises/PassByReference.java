package com.javaclass.first.exercises;

public class PassByReference {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before calling display method number = "+ number);
        display(number);
        System.out.println("After calling display method number = "+ number);
    }

    public static void display(int num){
        System.out.println("Inside display method num = "+num);
        num = 10;
        System.out.println("Inside display method num = "+num);
    }

}


