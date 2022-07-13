package StructuralPattern.Facade;

public class Main {
    public static void main(String[] args) {
        WatchMovie watchMovie = new WatchMovie();

        watchMovie.start("Star WarZ");

        watchMovie.end();
    }
}
