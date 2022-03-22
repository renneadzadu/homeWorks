package home;

public class Question2  {
    public static int getSecondToLastIndex(String[] names) {
        return names.length-2;
    }

    public static void main(String[] args) {
        String[] cars = {"toyota", "honda", "tesla", "BMW", "Benz"};
        System.out.println(getSecondToLastIndex(cars));


    }
}
