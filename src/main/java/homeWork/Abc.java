package homeWork;

import java.util.Scanner;

public class Abc {
    /*public static void main(String[] args) {
        int days = 9;
        switch(days){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("yes its an amazing weekend");


        }
    }
    }*/
   /* public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println( "do you think the temperature is High, Low or Humid?");
        String answer = in.nextLine();
        if (answer.equals("high")){
        System.out.println(" sunblock may be needed");
        }else if (answer.equals("low")){
            System.out.println("a coat may be needed");
        }else if (answer.equals("humid")) {
            System.out.println("it's muggy!");
        }

    }
}*/
    /*question 2:Create a program that keeps asking for a password
    Make sure you are using the Scanner Class/Object
    Once the user gets the password correct
    Print out a message to the user eg: logged in */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your pasword");
        String answer = in.nextLine();
        String password = "iamgood";
        if (answer.equals(password)) {
            System.out.println("logged in:");
        } else {
            System.out.println("password invalid");
        }
    }
}