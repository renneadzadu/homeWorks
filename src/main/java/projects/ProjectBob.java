package projects;

import java.util.Scanner;

public class ProjectBob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("whats your name?");
        String answer = in.nextLine();

        if(answer.equalsIgnoreCase("Bob")|| answer.equalsIgnoreCase("Alice")){
            System.out.println("Hello" + " " + answer + " " + "Welcome");
        } else {
            System.out.println("whats your name?");

        }

    }
}