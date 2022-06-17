package StructuralPattern.Adapter;

public class Ipod implements SoundPlayer{
    @Override
    public void play(String file) {
        System.out.println("playing sound... : " + file);
    }
}
