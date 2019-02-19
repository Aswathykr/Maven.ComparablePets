package io.zipcoder;

import java.util.ArrayList;

public class Pets {
    ArrayList<Pet> pets;
    public Pets(){
        pets = new ArrayList<Pet>();
    }
    public void add(Pet pet) {
        pets.add(pet);
    }

    public int getNumberOfPets() {

        return pets.size();
    }

    public String[] getNamesOfPets() {
        String[] names = new String[pets.size()];
        int count = 0;
        for (Pet pet : pets) {
            names[count] = pet.getName();
            count ++;
        }
        return names;
    }
}
