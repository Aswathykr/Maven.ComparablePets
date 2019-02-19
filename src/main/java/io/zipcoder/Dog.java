package io.zipcoder;

public class Dog extends Pet {


    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog name");
    }

    public String speak() {
        return "Bark!";
    }
}
