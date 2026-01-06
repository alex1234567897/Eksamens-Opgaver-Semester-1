package Opgave3;

public class Concert extends Event {

    private String artist;
    private String genre;

    public Concert(String name, String date, double price, int maxCapacity, String artist, String genre) {
        super(name, date, price, maxCapacity);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String getInfo() {
        return "Concert: \"" + name + "\" with " + artist + " [" + genre + "]\n" +
                "Date: " + date + "\n" +
                "Price: " + price + " kr\n" +
                "Booked: " + bookedTickets + " / " + maxCapacity + " tickets\n" +
                "Status: " + (isSoldOut() ? "SOLD OUT" : "Available");
    }

}
