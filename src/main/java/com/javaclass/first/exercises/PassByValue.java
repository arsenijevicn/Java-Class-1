package com.javaclass.first.exercises;

public class PassByValue {

    public static void main(String[] args) {
        System.out.println("Demonstrating pass by value: ");
        String str1 = "Car";
        String str2 = "Plane";
        String str3 = str2;
        String str4 = str2;
        String str5;
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("-----------------");
        str3 ="Bicycle";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("-----------------");
        str3 ="Skate board"; // first defined
        str4=str3;
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("-----------------");
        str5=str3;          // first assigned
        str3 ="Tricycle";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("String 5: " + str5);
        System.out.println("-----------------");
    }
}
