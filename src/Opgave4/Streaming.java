package Opgave4;

import java.util.ArrayList;
import java.util.List;

public class Streaming {

    private List<Media> mediaList;

    public Streaming() {
        this.mediaList = new ArrayList<>();
    }


    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public Movie getMovie(String title) {
        for (Media media : mediaList) {
            if (media instanceof Movie && media.getTitle().equals(title)) {
                return (Movie) media;
            }
        }
        return null;
    }

    public Episode getEpisode(String seriesTitle, int seasonNumber, int episodeNumber) {
        for (Media media : mediaList) {
            if (media instanceof Series && media.getTitle().equals(seriesTitle)) {
                return ((Series) media).getEpisode(seasonNumber, episodeNumber);
            }
        }
        return null;
    }

    public void playMovie(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equals(title) && media instanceof Movie) {
                ((Movie) media).play();
                return;
            }
        }
    }

    public void playEpisode(String seriesTitle, int seasonNumber, int episodeNumber) {
        for (Media media : mediaList) {
            if (media instanceof Series && media.getTitle().equals(seriesTitle)) {
                Episode episode = ((Series) media).getEpisode(seasonNumber, episodeNumber);
                if (episode != null) {
                    episode.play();
                }
            }
        }
    }
}
