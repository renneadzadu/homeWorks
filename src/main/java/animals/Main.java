package animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setFood("dog food");
        dog.makeNoise();
        System.out.println(dog.getFood());

        Cat cat = new Cat();
        cat.setFood("cat foo");
        cat.makeNoise();
        System.out.println(cat.getFood());

        Bird bird = new Bird();
        bird.setFood("rice");
        bird.makeNoise();
        System.out.println(bird.getFood());
    }
}
