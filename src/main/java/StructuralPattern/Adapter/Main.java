package StructuralPattern.Adapter;

public class Main {
    public static void main(String[] args) {
        SoundPlayer ipod = new Ipod();
        playSoundPlayer(ipod, "test_music.mp3");

        VideoPlayer tv = new Television();

        // Video player를 adapter를 이용해서 sound player 객체로 바꿔야하는 상황이라고 가정하자.
        VideoAdaptor moviePlayer = new VideoAdaptor(tv);

        playSoundPlayer(moviePlayer, "Star Wars");
    }

    public static void playSoundPlayer(SoundPlayer soundPlayer, String file){
        soundPlayer.play(file);
    }
}
