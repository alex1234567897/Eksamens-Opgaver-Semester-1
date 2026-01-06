package Opgave4;

import java.util.List;

public abstract class Media {

    protected String title;
    protected List<String> actors;

    public Media(String title, List<String> actors) {
        this.title = title;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getActors() {
        return actors;
    }

    public String getInfo() {
        return title + " - Actors: " + actors;
    }
}
