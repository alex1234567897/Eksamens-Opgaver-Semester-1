package Opgave4;

import javax.sound.midi.Soundbank;
import java.util.List;

public class Movie extends Media implements Playable{

    private String director;


    public Movie(String title, List<String> actors, String director) {
        super(title, actors);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void play() {
        System.out.println("Playing Movie: " + title);
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " | Director: " + director;
    }
}
