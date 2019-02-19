package io.zipcoder;

public class Sloth extends Pet{
    public Sloth(String name) {
        super(name);
    }

    public Sloth() {
        super("Sloth name");
    }

    public String speak() {
        return "Squeak!";
    }
}
