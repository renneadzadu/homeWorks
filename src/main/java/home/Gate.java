package home;

public class Gate{
    public static int getLastIndex(String[] names) {
        return names.length-1;

    }

    public static void main(String[] args) {
        String[] firstNames = {"Mark", "Abigial", "Ruth", "Mark", "Ben"};
        System.out.println(getLastIndex(firstNames));
    }

}
