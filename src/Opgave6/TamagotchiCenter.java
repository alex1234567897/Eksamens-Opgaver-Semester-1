package Opgave6;

import java.util.ArrayList;
import java.util.List;

public class TamagotchiCenter {



    private List<Tamagotchi> pets;

    public TamagotchiCenter() {
        pets = new ArrayList<>();
    }

    public void addPet(Tamagotchi pet){
        if(getPet(pet.getName()) == null){
            pets.add(pet);

        } else {
            System.out.println("A tamagotchi with that name Already exists");
        }
    }

    public void removePet(String name){
        Tamagotchi pet = getPet(name);

        if (pet != null){
            pets.remove(pet);
            System.out.println("Pet with name: " + name + " has been Killed of. :/");
        } else {
            System.out.println("Pet not found.");
        }

    }

    public Tamagotchi getPet(String name){
        for(Tamagotchi pet : pets){
            if (pet.getName().equalsIgnoreCase(name)){
                return pet;
            }
        }
        return null;
    }

    public void performActivityOnPet(String name, String activity, int amount) {
        Tamagotchi pet = getPet(name);

        if (pet != null) {
            pet.preformActivity(activity, amount);
            System.out.println(name + " has performed " + activity + " for " + amount + " unit(s).");
        } else {
            System.out.println("Tamagotchi not found: " + name);
        }
    }

    public void printStatusReport(){
        if(pets.isEmpty()){
            System.out.println("No Tamagotchis available.");
            return;
        }

        System.out.println("=== Tamagotchi Status Report ===");
        for (Tamagotchi pet : pets){
            System.out.println(pet.getStatus());
        }
        System.out.println("===============================");

    }

    public Tamagotchi getHappiestPet(){
        if(pets.isEmpty()){
            return null;
        }

        Tamagotchi happiest = pets.get(0);

        for (Tamagotchi pet : pets){
            if ( pet.getHappines() > happiest.getHappines()){
                happiest = pet;
            }
        }

        return happiest;

    }

    public Tamagotchi getMostHungryPet(){
        if(pets.isEmpty()){
            return null;
        }

        Tamagotchi hungryst = pets.get(0);

        for (Tamagotchi pet : pets){
            if ( pet.getHunger() > hungryst.getHappines()){
                hungryst = pet;
            }
        }

        return hungryst;

    }

    public double getAverageHappiness() {
        if (pets.isEmpty()) {
            return 0.0;
        }

        int totalHappiness = 0;

        for (Tamagotchi pet : pets){
            totalHappiness += pet.getHappines();
        }

        return (double) totalHappiness / pets.size();


    }
}
