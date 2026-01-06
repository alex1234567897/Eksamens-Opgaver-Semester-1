package Opgave6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TamagotchiCenter center = new TamagotchiCenter();

        boolean running = true;

        while (running) {
            System.out.println("\n--- Tamagotchi Center ---");
            System.out.println("1. Add pet");
            System.out.println("2. Remove pet");
            System.out.println("3. Perform activity on pet");
            System.out.println("4. Print status report");
            System.out.println("5. Show happiest pet");
            System.out.println("6. Show average happiness");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter pet name: ");
                    String name = scanner.nextLine();
                    Tamagotchi newPet = new Tamagotchi(name);
                    center.addPet(newPet);
                    System.out.println(name + " added!");
                    break;

                case 2:
                    System.out.print("Enter pet name to remove: ");
                    String removeName = scanner.nextLine();
                    center.removePet(removeName);
                    break;

                case 3:
                    System.out.print("Enter pet name: ");
                    String petName = scanner.nextLine();
                    System.out.print("Enter activity (feed/play/sleep/work): ");
                    String activity = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine(); // Clear newline
                    center.performActivityOnPet(petName, activity, amount);
                    break;

                case 4:
                    center.printStatusReport();
                    break;

                case 5:
                    Tamagotchi happiest = center.getHappiestPet();
                    if (happiest != null) {
                        System.out.println("Happiest pet: " + happiest.getName() +
                                " | Happiness: " + happiest.getHappines());
                    } else {
                        System.out.println("No pets available.");
                    }
                    break;

                case 6:
                    double avgHappiness = center.getAverageHappiness();
                    System.out.println("Average happiness: " + avgHappiness);
                    break;

                case 0:
                    running = false;
                    System.out.println("Exiting Tamagotchi Center. Bye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();
    }
}
