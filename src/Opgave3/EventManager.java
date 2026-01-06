package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<Event> events = new ArrayList<>();


    public void addEvent(Event event){
        events.add(event);
    }

    public boolean bookTicket(Event event) {
        return event.addBooking();
    }

    public void printSummary() {
        System.out.println("=== Event Overview ===\n");

        for (Event event : events) {
            System.out.println(event.getInfo());
            System.out.println();
        }

        Event mostPopular = getMostPopular();
        if (mostPopular != null) {
            System.out.println(
                    "Most popular event: " +
                            mostPopular.name +
                            " (" + mostPopular.getBookedTickets() + " bookings)"
            );
        }
    }

    public Event getMostPopular() {
        Event mostPopular = null;

        for (Event e : events) {
            if (mostPopular == null ||
                    e.getBookedTickets() > mostPopular.getBookedTickets()) {
                mostPopular = e;
            }
        }
        return mostPopular;
    }

}
