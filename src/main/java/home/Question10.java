package home;

public class Question10 {
    public static boolean contains(String[] names, String element) {
        for(int x = 0; x < names.length; x++){
            if (names[x].equals(element)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        String[] list ={"Alise","maggie", "ruth", "Esther"};
        System.out.println(contains(list,"Esther"));
    }
}

