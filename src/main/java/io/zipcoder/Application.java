package io.zipcoder;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Pets pets = new Pets();
        PetsIOConsole ioConsole = new PetsIOConsole();
        int noOfPets = ioConsole.GetNumberOfPets(); // get the no of pets from io console
        for (int i = 0; i < noOfPets; i++) {
            PetType petType = ioConsole.getPetType();
            Pet pet = ioConsole.GetPet(petType);
            pets.add(pet);
        }
        pets.sort();
        for(Pet pet : pets.getPets()){
            System.out.println(pet.getName() + " speaks "+ pet.speak());
        }
   }
}
enum PetType{Dog, Cat, Sloth};
class PetsIOConsole{
    private Scanner scanner;
    public PetsIOConsole(){
        scanner = new Scanner(System.in);
    }

    public int GetNumberOfPets(){
        int numberOfPets = 0;
        System.out.print("Enter the number of Pets you have  : ");
        try {
            numberOfPets = scanner.nextInt();
            String str1 = scanner.nextLine();
        }catch(Exception e) {
            scanner = new Scanner(System.in);
        }
        return numberOfPets;
    }
    public PetType getPetType(){
        String typeOfPet = "";
        PetType petType = PetType.Cat;
        System.out.print("Enter the type of Pet Dog/Cat/Sloth  : ");
        try {
            typeOfPet = scanner.nextLine();
        }catch(Exception e) {
            scanner = new Scanner(System.in);
        }
        typeOfPet.toLowerCase();

        switch(typeOfPet){
            case "cat":
                petType = PetType.Cat;
                break;
            case "dog":
                petType = PetType.Dog;
                break;
            case "sloth":
                petType = PetType.Sloth;
                break;

        }
        return petType;
    }

    public Pet GetPet(PetType petType){
        String nameOfPet = "";
        Pet pet = null;
        System.out.print("Enter the name of "+ petType + "  : ");
        try {
            nameOfPet = scanner.nextLine();
        }catch(Exception e) {
            scanner = new Scanner(System.in);
        }

        switch(petType){
            case Cat:
                pet = new Cat(nameOfPet);
                break;
            case Dog:
                pet = new Dog(nameOfPet);
                break;
            case Sloth:
                pet = new Sloth(nameOfPet);
                break;

        }
        return pet;

    }
}