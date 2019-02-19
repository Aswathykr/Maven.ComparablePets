package io.zipcoder;

public class Pet {

    private String name;
    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        this("No Name");
    }

    public String speak() {
        return null;
    }

    public String getName() {
        return name;
    }
}
