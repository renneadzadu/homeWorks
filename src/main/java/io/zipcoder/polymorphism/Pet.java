package io.zipcoder.polymorphism;

public abstract class Pet {
    private String name;
    private String speak;

    public void setSpeak() {
        System.out.println("animal sound");
        this.speak =speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
