package Opgave2;

public class Main {
    public static void main(String[] args) {

        try {
            SaunaVillage village = new SaunaVillage();

            village.loadFromCSV("Data/Sauna.csv");

            village.printReport();

            System.out.println("\nGennemsnit Wood: " +
                    village.getAverageCost("Wood") + " kr");

            System.out.println("Gennemsnit Electric: " +
                    village.getAverageCost("Electric") + " kr");

            System.out.println("\nDyreste sauna: " +
                    village.getMostExpensive().getName());

            System.out.println("Billigste sauna: " +
                    village.getCheapest().getName());

        } catch (Exception e) {
            System.out.println("Fejl ved indlæsning af fil");
            e.printStackTrace();
        }

    }
}
