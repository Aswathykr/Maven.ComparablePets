package io.zipcoder;

public class Pet implements Comparable<Pet>{

    private String name;
    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        this("");
    }

    public String speak() {
        return "RANDOMANIMALSOUND!";
    }

    public String getName() {
        return name;
    }

    public void setName(String expected) {
        name = expected;
    }

    public int compareTo(Pet p2) {
        return this.getName().compareTo(p2.getName());
    }
}
