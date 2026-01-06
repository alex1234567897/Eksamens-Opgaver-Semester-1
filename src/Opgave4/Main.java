package Opgave4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Streaming streaming = new Streaming();

        List<String> movieActors = Arrays.asList("Tom Holland", "Zendaya");
        Movie movie = new Movie("Spider-Man Home Coming", movieActors, "jon Watts");

        streaming.addMedia(movie);

        List<String> seriesActors = Arrays.asList("Alejandra Reynoso", "Richard Armitage", "James Callis", "Graham Mctavish");
        Series series = new Series("Castlevania", seriesActors);

        Season season1 = new Season(1);
        Season season2 = new Season(2);
        Season season3 = new Season(3);
        Season season4 = new Season(4);

        Episode ep1 = new Episode(1, "Pilot");
        Episode ep2 = new Episode(2, "Second Episode");
        Episode ep3 = new Episode(1, "Season 2 Premiere");
        Episode ep4 = new Episode(1, "Season 3 premiere");
        Episode ep5 = new Episode(1, "Season 3 premiere");

        season1.addEpisode(ep1);
        season1.addEpisode(ep2);
        season2.addEpisode(ep3);
        season3.addEpisode(ep4);
        season4.addEpisode(ep5);

        series.addSeason(season1);
        series.addSeason(season2);
        series.addSeason(season3);
        series.addSeason(season4);

        streaming.addMedia(series);

        System.out.println("Afspiller film:");
        streaming.playMovie("Spider-Man Home Coming");

        System.out.println("\nAfspiller serien: " + series.getTitle());
        streaming.playEpisode("Castlevania", 1, 2);

        System.out.println("\nAntal seasoner i serien: " + series.getSeasons().size());
        System.out.println("Antal episoder i serien: " + series.getTotalEpisodes());
    }
}
