package Opgave2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SaunaVillage {

    private ArrayList<Sauna> saunas;

    public SaunaVillage() {
        saunas = new ArrayList<>();
    }

    public void loadFromCSV(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        reader.readLine(); // spring header over

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");

            int degrees = Integer.parseInt(parts[1]);
            String name = parts[2];
            String type = parts[3].toLowerCase();

            Sauna sauna = findSaunaByName(name);

            if (sauna == null) {
                if (type.equals("wood")) {
                    sauna = new WoodSauna(name);
                } else if (type.equals("electric")) {
                    sauna = new ElectricSauna(name);
                }
                saunas.add(sauna);
            }

            sauna.addTemperature(degrees);
        }

        reader.close();
    }


    private Sauna findSaunaByName(String name) {
        for (Sauna sauna : saunas) {
            if (sauna.getName().equals(name)) {
                return sauna;
            }
        }
        return null;
    }

    public void printReport() {
        System.out.println("---- Døgnomkostninger ----");
        for (Sauna sauna : saunas) {
            System.out.println(
                    sauna.getName() + ": " +
                            sauna.calculateDailyCost() + " kr"
            );
        }
    }

    public double getAverageCost(String type) {
        double sum = 0;
        int count = 0;

        for (Sauna sauna : saunas) {
            if (type.equalsIgnoreCase("Wood") && sauna instanceof WoodSauna ||
                    type.equalsIgnoreCase("Electric") && sauna instanceof ElectricSauna) {

                sum += sauna.calculateDailyCost();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public Sauna getMostExpensive() {
        if (saunas.isEmpty()) return null;

        Sauna mostExpensive = saunas.get(0);

        for (Sauna sauna : saunas) {
            if (sauna.calculateDailyCost() > mostExpensive.calculateDailyCost()) {
                mostExpensive = sauna;
            }
        }
        return mostExpensive;
    }

    public Sauna getCheapest() {
        if (saunas.isEmpty()) return null;

        Sauna cheapest = saunas.get(0);

        for (Sauna sauna : saunas) {
            if (sauna.calculateDailyCost() < cheapest.calculateDailyCost()) {
                cheapest = sauna;
            }
        }
        return cheapest;
    }
}
