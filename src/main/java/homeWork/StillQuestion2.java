package homeWork;

import java.util.Scanner;

public class StillQuestion2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Do you think the temperature is high, low Or humid? please enter you input");
        String answer = in.nextLine();
        switch (answer) {
            case "high": {
                System.out.println("Sunblock may be needed");
                break;
            }
            case "low": {
                System.out.println("A coat may be needed");
                break;
            }
            case "humid": {
                System.out.println("it's muggy!");
                break;
            }
        }
    }
}
