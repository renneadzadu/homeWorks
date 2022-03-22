
package homeWork;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
String[] temperature = {"high", "humid", "low"};
        Scanner in = new Scanner(System.in);
        System.out.println("Do you think the temperature is high, low Or humid? please enter you input");
        String answer = in.nextLine();
        if (answer.equals("high")) {

            System.out.println( "Sunblock may be needed");
        }else if (answer.equals("low")) {

                System.out.println("A coat may be needed");
            }else if ( answer.equals("humid"));{
            System.out.println("its muggy!");
        }
        }
    }

