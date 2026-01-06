package Opgave6;

public class Tamagotchi {


    private String name;



    private int hunger;
    private int energy;
    private int happines;
    private int coins;

    public Tamagotchi(String name) {
        this.name = name;
        this.hunger = 30;
        this.energy = 70;
        this.happines = 70;
        this.coins = 0;
    }



    public void preformActivity(String activity, int amount){
        if (activity.equals("sleep")){
            energy += amount * 2;
            hunger += amount * 4;
        }
        if (activity.equals("play")){
            energy -= amount * 2;
            happines += amount * 4;
            hunger += amount * 2;
        }
        if (activity.equals("feed")){
            hunger -= amount * 3;
            happines += amount * 2;
        }
        if (activity.equals("work")){
            coins += amount * 5;

            energy -= amount * 2;
            happines -= amount * 2;
            hunger += amount * 2;
        }
        checkValues();

    }

    private void checkValues(){
        hunger = Math.max(0, Math.min(hunger, 100));
        happines = Math.max(0, Math.min(happines, 100));
        energy = Math.max(0, Math.min(energy, 100));
    }

    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHappines() {
        return happines;
    }

    public int getCoins() {
        return coins;
    }

    public String getStatus(){
        return name +
                " | Hunger: " + hunger +
                " | Energy: " + energy +
                " | Happiness: " + happines +
                " | Coins: " + coins;
    }
}
