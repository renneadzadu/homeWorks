package homeWork;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your password");
        String input = in.nextLine();
        String password = "Mark.M";
        if (input.equals(password)) {
            System.out.println("logged in");
        }
        else {
            System.out.println("password invalid");
            //please re-enter password");
           // input = in.nextLine();
           // for(in)
        }
    }
}