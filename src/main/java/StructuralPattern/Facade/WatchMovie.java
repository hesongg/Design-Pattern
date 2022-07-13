package StructuralPattern.Facade;

public class WatchMovie {
    private final Light light;
    private final Popcorn popcorn;
    private final Movie movie;
    private final TV tv;

    public WatchMovie() {
        this.light = new Light();
        this.popcorn = new Popcorn();
        this.movie = new Movie();
        this.tv = new TV();
    }

    void start(String movieName){
        System.out.println("::::: Watch Movie :::::");

        popcorn.pop();
        tv.turnOn();
        light.lightOff();
        movie.playMovie(movieName);

        System.out.println();
    }

    void end(){
        System.out.println("::::: End Movie :::::");

        tv.turnOff();
        light.lightOn();

        System.out.println();
    }
}
