package home;

public class Question3 {
    public static String getFirstElement (String name) {
     return name;
    }

    public static void main(String[] args) {
        String[] cars = {"toyota", "honda", "tesla", "BMW", "Benz"};
        System.out.println(getFirstElement(cars[0]));
    }
}
