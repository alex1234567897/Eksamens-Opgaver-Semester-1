package Opgave2;

import java.util.ArrayList;

public class ElectricSauna implements Sauna {

    String name;
    ArrayList<Integer>temperatures;

    public ElectricSauna(String name) {
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
                cost += 8;
                if (temp > 70) {
                    cost += (temp - 70) * 2;
                }
            }
        }
        return cost;
    }
}
