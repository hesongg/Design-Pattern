package StructuralPattern.Adapter;

public class Television implements VideoPlayer{

    @Override
    public void playVideo(String movie) {
        System.out.println("playing movie... : " + movie);
    }
}
