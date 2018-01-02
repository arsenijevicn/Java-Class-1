package com.javaclass.first.exercises;

class Food {

    public Food(String name) {
        this.name = name;
    }

    String name;
}

class Salad{
    public Salad(String type) {
        this.type = type;
    }

    String type;
}

public class PassByReferenceExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating pass by reference: ");
        Food food1 = new Food("Bacon");
        Food food2 = new Food("Ham");
        Food food3 = food2;
        Food food4 = food2;
        Food food5 = food2;
        System.out.println("Food 1 = " + food1.name);
        System.out.println("Food 2 = " + food2.name);
        System.out.println("Food 3 = " + food3.name);
        System.out.println("Food 4 = " + food4.name);
        System.out.println("----------------------");
        food3.name = "Sausage";
        System.out.println("Food 1 = " + food1.name);
        System.out.println("Food 2 = " + food2.name);
        System.out.println("Food 3 = " + food3.name);
        System.out.println("Food 4 = " + food4.name);
        System.out.println("----------------------");
        food4 = new Food("Steak");
        System.out.println("Food 1 = " + food1.name);
        System.out.println("Food 2 = " + food2.name);
        System.out.println("Food 3 = " + food3.name);
        System.out.println("Food 4 = " + food4.name);
        System.out.println("----------------------");
        food3 = food4;
        System.out.println("Food 1 = " + food1.name);
        System.out.println("Food 2 = " + food2.name);
        System.out.println("Food 3 = " + food3.name);
        System.out.println("Food 4 = " + food4.name);
        System.out.println("----------------------");
        food4 = new Food("Burger");
        System.out.println("Food 1 = " + food1.name);
        System.out.println("Food 2 = " + food2.name);
        System.out.println("Food 3 = " + food3.name);
        System.out.println("Food 4 = " + food4.name);
        System.out.println("Food 5 = " + food5.name);
        System.out.println("----------------------");
        Salad salad1 = new Salad("Green salad");
        salad1.type=food5.name;
        System.out.println("Food 1 = " + food1.name);
        System.out.println("Food 2 = " + food2.name);
        System.out.println("Food 3 = " + food3.name);
        System.out.println("Food 4 = " + food4.name);
        System.out.println("Food 5 = " + food5.name);
        System.out.println("Salad 1 = " + salad1.type);//food 5 is defined first
        System.out.println("----------------------");

    }
}

