package io.zipcoder.polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    Cat cat = new Cat();
    cat.setSpeak();
    cat.setName("mark");
        System.out.println(cat.getName());

    Dog dog = new Dog();
    dog.setSpeak();
    dog.setName("blog");
        System.out.println(dog.getName());


        Bird bird = new Bird();
    bird.setSpeak();
    bird.setName("twist");
        System.out.println(bird.getName());

    }
}
