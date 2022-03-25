package news;

public class AnimalFactory {
    public static void main(String[] args) {
        Animals dog = new Animals();
        dog.setName("jackie");
        System.out.println(dog.getName());
    }
}
