package Opgave2;

import java.util.ArrayList;

public class WoodSauna implements Sauna{

    String name;
    ArrayList<Integer> temperatures;

    public WoodSauna(String name) {
        this.name = name;
        this.temperatures = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addTemperature(int degrees) {
        temperatures.add(degrees);

    }

    @Override
    public double calculateDailyCost() {
        double cost = 0;

        for (int temp : temperatures) {
            if (temp > 50) {
                cost += 12;
            }
        }
        return cost;
    }
}
