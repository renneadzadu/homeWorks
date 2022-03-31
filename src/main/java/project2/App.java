package project2;

public class App {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Dog();

        Interrogator.convinceToTalk(dog); //prints "Woof!"
        Interrogator.convinceToTalk(cat); //prints "Meow!"
        Interrogator.convinceToTalk(animal); //prints "Woof!"
    }
}
