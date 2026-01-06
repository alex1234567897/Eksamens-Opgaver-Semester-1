package Opgave3;

public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();

        Concert rockNight = new Concert(
                "Rock Night",
                "2025-05-15",
                450,
                2500,
                "Arctic Monkeys",
                "Rock"
        );

        Workshop javaWorkshop = new Workshop(
                "Introduction to Java",
                "2025-06-01",
                1200,
                15,
                "Sarah Johnson",
                "Programming",
                true
        );

        Concert jazzEvening = new Concert(
                "Jazz Evening",
                "2025-06-20",
                350,
                200,
                "Miles Ahead",
                "Jazz"
        );

        manager.addEvent(rockNight);
        manager.addEvent(javaWorkshop);
        manager.addEvent(jazzEvening);

        manager.bookTicket(rockNight);
        manager.bookTicket(rockNight);
        manager.bookTicket(jazzEvening);

        for (int i = 0; i < 15; i++) {
            manager.bookTicket(javaWorkshop);
        }

        manager.printSummary();
    }

}
