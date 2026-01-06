package Opgave3;

public abstract class Event {

    protected String name;
    protected String date;
    protected double price;
    protected int maxCapacity;
    protected int bookedTickets;

    public Event(String name, String date, double price, int maxCapacity) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.maxCapacity = maxCapacity;
        this.bookedTickets = 0;
    }

    public boolean addBooking() {
        if (isSoldOut()) {
            return false;
        }
        bookedTickets++;
        return true;
    }

    public boolean isSoldOut() {
        return bookedTickets >= maxCapacity;
    }

    public int getBookedTickets() {
        return bookedTickets;
    }

    public abstract String getInfo();
}
