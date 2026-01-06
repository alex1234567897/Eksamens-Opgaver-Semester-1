package Opgave4;

public class Episode implements Playable {

    private int episodeNumber;
    private String title;

    public Episode(int episodeNumber, String title) {
        this.episodeNumber = episodeNumber;
        this.title = title;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing episode " + episodeNumber + ": " + title);
    }
}
