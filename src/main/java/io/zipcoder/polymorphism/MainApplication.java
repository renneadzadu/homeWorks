package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("how many pet do you have?");
        String input = in.nextLine();

        System.out.println("what kind of pets are they?");
        input = in.nextLine();

        System.out.println("what are their name?");
        String name = in.nextLine();

        String list =input;
        System.out.println("you input: " + list);
    }
}
