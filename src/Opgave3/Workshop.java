package Opgave3;

public class Workshop extends Event{


    private String instructor;
    private String topic;
    private boolean materials;

    public Workshop(String name, String date, double price, int maxCapacity, String instructor, String topic, boolean materials) {
        super(name, date, price, maxCapacity);
        this.instructor = instructor;
        this.topic = topic;
        this.materials = materials;
    }

    @Override
    public String getInfo() {
        return "Workshop: \"" + name + "\" by " + instructor + "\n" +
                "[" + topic + "]\n" +
                "Date: " + date + "\n" +
                "Price: " + price + " kr\n" +
                "Booked: " + bookedTickets + " / " + maxCapacity + " tickets\n" +
                "Materials included: " + (materials ? "Yes" : "No") + "\n" +
                "Status: " + (isSoldOut() ? "SOLD OUT" : "Available");
    }

}
