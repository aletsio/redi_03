package com.redi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age + ".");

        System.out.println("Type in a word.");
        String word = scanner.next();
        System.out.println("The word you typed contains " + word.length() + " characters.");

        Student anyone = new Student("Pedro",27);
        System.out.println(anyone.name.toString() + ", " + anyone.age);

        System.out.println("Type anything you want and I'll change something.");
        String input = scanner.next();
        String newInput = input.replace('a','e');
        System.out.println(newInput);

        Human being = new Human("Genoveffo","scratcher");
        System.out.println(being.name.toString() + " is a " + being.occupation.toString() +  ".");

    }
}
